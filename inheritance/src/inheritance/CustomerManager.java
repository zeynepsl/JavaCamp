package inheritance;

public class CustomerManager {
	//veritabanýna eriþeceðimiz iþ kurallarýný yazacaðýz
	//ekle sil güncelle listele ara vs..
	
	//Customer,  onu extend eden sýnýflarýn referanslarýný tutabiliyor
	public void add(Customer customer) {
		
	}
	
	//çoklu ekleme yapacaðýz:
	//her müþteri türü için farklý logicleri çalýþtýrmýþ olucam
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
