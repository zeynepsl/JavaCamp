package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstract.UserCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();    
	    boolean result=false;
	    
		try 
		{
			result = kpsPublicSoapProxy.TCKimlikNoDogrula
					(
					Long.parseLong(gamer.getNationalityId()) , 
					gamer.getFirstName().toUpperCase(), 
					gamer.getLastName().toUpperCase(), 
					gamer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} 
		catch (RemoteException e)
		{
			System.out.println("mernis çalýþmýyor");
		}

		return result;
	}

}
