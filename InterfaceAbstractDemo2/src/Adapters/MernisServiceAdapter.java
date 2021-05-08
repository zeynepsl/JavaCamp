package Adapters;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;
import java.rmi.RemoteException;
import java.time.ZoneId;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer){
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();    
	    boolean result = false;
	    
		try 
		{
			result = kpsPublicSoapProxy.TCKimlikNoDogrula
					(
					Long.parseLong(customer.getNationalityId()) , 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}

		return result;
	}

}
