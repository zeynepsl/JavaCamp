package day3Homework1;

import logger.BaseLogger;

public class CustomerManager {
	private BaseLogger logger;//temel | base Class ile çalýþýyorum
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("müþteri eklendi");
		logger.log();
	}
}
