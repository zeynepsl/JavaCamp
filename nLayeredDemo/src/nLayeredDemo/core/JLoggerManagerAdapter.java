package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		
		JLoggerManager manager = new JLoggerManager();
		//bunu new lemek sýkýntý deðil 
		//enjekte de edeblirsin
		manager.log(message);
	}

}
