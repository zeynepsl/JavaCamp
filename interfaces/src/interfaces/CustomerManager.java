package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;//bunu tanýmlamamýzýn sebebi
	//Class ýn her yerinden eriþebilmek
	//yoksa kurucu ya gönderdiðimi ben class ýn hiçbir yerinde kullanmamam
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("müþteri eklendi " + customer.getFirstName());
		
		//this.loggers.log(customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());//objeyi serileþtirip logluyoruz
		//bellekte new
		
		//Veritabanýna loglanacak dendi(micro service mimarisi odaklý)
		//burada gelip DataBaseLogger ý new lemiyorsun
		//ve geldin 2500 yerde bunu kullandýn
		//demezler mi fileLogger a geçicez
		//tek tek tek hepsini deðiþtireceksin --> tehilikeli çok çok
		
	}
	
	
	//burada DatabaseLogger, FileLOgger vs yok 
	//interface e baðýmlýyýz
	//interface de diðerlerinin referasýnýt tutabiliyor
	//evet loglamaya baðýmlýyýz ama gevþek baðýmlýyýz
	
	public void delete(Customer customer) {
		Utils.runLoggers(loggers, customer.getFirstName());//objeyi serileþtirip logluyoruz

	}

	public void update(Customer customer) {
		Utils.runLoggers(loggers, customer.getFirstName());//objeyi serileþtirip logluyoruz

	}
}
