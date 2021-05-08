package interfaces;

public class Main {

	public static void main(String[] args) {
		//polymorphism in interface lerle uygulanma versiyonu : 
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());//OracleCustomerDal ýn referansý eþitlenecek
		//customerManager.customerDal = new OracleCustomerDal();//ama programcý bunu vermeyi unutabilir --> kurucuya yazýcazz :D
		customerManager.add();
	}

}
