package nLayeredDemo.jLogger;

public class JLoggerManager {
	public void log(String message) {
		System.out.println("J logger ile loglandý" + message);
	}
	//burada bilmediðimiz bir kod yazýlmis, buna dokunamýyoruz
	//bunu sistemimize enjekte edicez
	//micro serivce mimarileri de bu mantýkla enjecte edilir
	
	//dependency injection yapamam interface i yok
	//olsa bile injection yine yapamam 
	//o dýþ servise baðýmlý olurum yine --> servis deðiþir ve abc ye gecilirse yandýk :|
}
