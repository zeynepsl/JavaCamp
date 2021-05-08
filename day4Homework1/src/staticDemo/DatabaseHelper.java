package staticDemo;

public class DatabaseHelper {
	public static class Crud {
		public static void delete() {

		}

		public static void update() {

		}
	}
	
	public static class Connection {
		public static void createConnection() {

		}
	}
}

//Bunlar önerilmiyor(best Practice önermiyor)
//Solid in S harfine, clean code a ters
//Tek sorumlulk prensibi _->bir class sadece 1 iþ yapar
//Crud için ayrý , Connection için ayrý DatbaseHelper class oluþtur
