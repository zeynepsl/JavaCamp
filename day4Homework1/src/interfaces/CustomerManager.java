package interfaces;

public class CustomerManager {
	
	//OracleCustomerDal customerDal = new OracleCustomerDal();
	//böyle yazrasak OracleCustomerDal a baðýmlýyýz :|
	
	private CustomerDal customerDal; 
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//iþ kodlarý
		customerDal.add();
	}
}
