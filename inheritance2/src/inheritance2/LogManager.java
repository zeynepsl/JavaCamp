package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("veritabanýna");
		}
		else if(logType==2) {
			System.out.println("dosyaya");
		}
		else {
			System.out.println("email gönderildi");
		}
		
		//bu: enum
		//gerçek hayattta loglama satýrlarca
		//sonra kodlar ifler iç içe geçmiþ oluyor iþin içinden çýkýlmýyor : spaggeti :F
		//hata verdirmeye yönelik durumlar
	}
}
