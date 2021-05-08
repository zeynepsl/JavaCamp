package inheritance2;

public class CustomerManager {
	//enjekte -parametre alama
	//bu LOgger refereans tutucu
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		
		//ne yollarsak onun logu çalýþýr
		logger.log();
		
		//DatabaseLogger databaseLogger = new DatabaseLogger();
		//databaseLogger.log();
		//bu þekide DataBaseLogger a baðýmlý oldum, yarýn bir gün baþka loglama sistemine geçersem ne olacak? :|
		//Bunu 100 farklý yerde yaptýn diyelim ki
		//sonra yönetim dedi ki == dosyaya da loglama yapýlacak
	}
}
