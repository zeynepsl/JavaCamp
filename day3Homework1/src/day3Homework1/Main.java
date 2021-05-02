package day3Homework1;

import krediManager.BaseKrediManager;
import krediManager.OgretmenKrediManager;
import krediManager.TarimKrediManager;
import logger.BaseLogger;
import logger.DatabaseLogger;
import logger.FileLogger;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();//arayüzümüz, buradan iþlemlerimizi yapýyoruz
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {
				new TarimKrediManager(),
				new OgretmenKrediManager()
		};
		
		//krediManagers daki her bir krediManager için krediHesapla metodu ile krediyi hesapla
		//polymorphism:
		for (BaseKrediManager krediManager : krediManagers) {
			krediUI.krediHesapla(krediManager);
		}
		
		
		//BaseLogger, kendisini extend eden Class larýn referansýný tutabiliyor:
		BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger()};
		//polymorphism:
		for (BaseLogger logger : loggers) {
			logger.log();
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();//hem ekleme hem loglama yapýlacak
	}

}
