package nLayeredDemo.core;

public interface LoggerService {
	//başkalarının sistemine bağımlı olmadan LoggerServis inteface'i ekledim
	void logToSystem(String message);
}
