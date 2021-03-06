import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.GregorianCalendar;

public class Main {


	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("ZEYNEP");
		customer.setLastName("SALMAN");
		customer.setDateOfBirth(new GregorianCalendar(2002, 04 , 10).getTime());
		customer.setNationalityId("1122333");
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer);
	}

}
