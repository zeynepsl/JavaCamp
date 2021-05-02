package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		//sistem companyName girmeye izin veriyor
		//iþte sistemin izin verdiði noktada patlýyorum
		
		IndividualCustomer zeynep = new IndividualCustomer();
		zeynep.customerNumber="123";
		
		CorporateCustomer trendYol = new CorporateCustomer();
		trendYol.customerNumber="456";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		
		CustomerManager customerManager = new CustomerManager();
		
		//tekli ekleme :
		//polymorphism :
		customerManager.add(zeynep);//aslýnda zeynebin bellekteki adresini gönderdim
		customerManager.add(trendYol);
		customerManager.add(sendikaCustomer);
		
		//çoklu ekleme :
		Customer[] customers = {zeynep, trendYol, sendikaCustomer};
		customerManager.addMultiple(customers);
	}

}
