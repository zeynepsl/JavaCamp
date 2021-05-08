package abstractDemo;



public class CustomerManager {
	BaseDatabaseManager baseDatabaseManager;//startehi görevi
	//hangi veritabanı sısemini veririsen onun getData sı çalışcaak
	//BaseDatabaseManager, diğer sstemlerin refransını tutablyor

	
	public void getCustomer() {
		baseDatabaseManager.getData();
	}
}
