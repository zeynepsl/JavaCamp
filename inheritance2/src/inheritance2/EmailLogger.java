package inheritance2;

//email ile ilgili loglama lar burada
public class EmailLogger extends Logger {
	//ben base deki log metodunu beðenmedim üstüne bir þeyler yazýcam
	//kendi loglama kodumu yazabilmem için Anne ve Babamdan aldýðým(base dekini) log metodunu eziyorum(override ediyorum)
	
	@Override
	public void log() {
		System.out.println("email loglama");
	}
}
