package interfaces;

public class Utils {
	//kendimi tekrar etmemek için :
	//message ve logger deðiþebilir
	
	//static : Class ý new lememk için
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
