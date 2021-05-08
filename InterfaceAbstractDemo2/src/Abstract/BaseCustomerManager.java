package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("saved to db: " + customer.getFirstName());		
	}

}
