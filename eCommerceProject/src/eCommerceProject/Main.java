package eCommerceProject;

import java.util.Scanner;

import eCommerceProject.business.concretes.AuthManager;
import eCommerceProject.core.utils.GoogleManagerAdapter;
import eCommerceProject.dataAccess.concretes.HibernateUserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		while (true) {
			System.out.println("lutfen yapmak istediginiz islemi seciniz (register : 1, login : 2, tum kullanýcýlarý listele: 3, cýkýþ:-1) ");
			Scanner klavye = new Scanner(System.in);
			int secim = klavye.nextInt();
			
			if (secim != -1) 
			{
				switch (secim) {
				case -1:
					break;
				case 1:
					System.out.println("secilen islem \"register\", ilgili bölüme yonlendiriliyorsunuz");
					register(klavye);
					break;

				case 2:
					System.out.println("secilen islem \"login\", ilgili bölüme yonlendiriliyorsunuz");
					login(klavye);
					break;
					
				case 3:
					System.out.println("secilen islem \"listele\", ilgili bölüme yonlendiriliyorsunuz");
					getAll();
					break;
				default:
					break;
				}

			}
			
			else 
			{
				break;//donguyu kir, donguden cik
			}

		}
			
	
	}
	static HibernateUserDao userDao = new HibernateUserDao();
	static AuthManager authManager = new AuthManager(new HibernateUserDao(), new GoogleManagerAdapter());
	
	private static void getAll() {
		System.out.println("----------------------------");		
		userDao.getAll();
		System.out.println("-----------------------");
	}

	private static void login(Scanner klavye) {
		System.out.println("----------------------------");
		

		String _email;
		String _password;
		
		System.out.println("e-posta adresinizi giriniz : ");
		_email = klavye.next();
		
		System.out.println("sifrenizi giriniz : ");
		_password = klavye.next();
		
		authManager.login(_email, _password);
		System.out.println("----------------------------");
	}

	private static void register(Scanner klavye) {
		System.out.println("----------------------------");
		
		String _firstaName;
		String _lastName;
		String _email;
		String _password;
		
		System.out.print("isminizi giriniz : ");
		_firstaName = klavye.next();
		
		System.out.print("soyadýnýzý giriniz : ");
		_lastName = klavye.next();
		
		System.out.print("e-posta adresinizi giriniz : ");
		_email = klavye.next();
		
		System.out.print("sifrenizi giriniz : ");
		_password = klavye.next();
		
		User user = new User(1, _firstaName, _lastName, _email, _password);
	    System.out.println("----------------------------"); 
	    
	    
	    var sonuc = authManager.register(user);//register Result tipinde; message, success ozelliklerine sahip bir nesne donduruyor
	    System.out.println(sonuc.getMessage());//burada da o nesnenin message ozelligini ekrana yazdiriyorum   
	    
	    if(sonuc.getSuccess()) {
	    	userDao.add(user);
	    }
	    //register da ekleme yapiyoruz evet 
	    //ama AuthManagerýn referansini tuttugu List<User> farklý
	    //benim burada new'leyip kullandigim HibernateUserDao'nun (satýr 53) referansini tuttugu List<User> farkli
	    //bilgilerini giren User'i ayrica HibernateUserDao'nun referansini tuttugu List<User> users' a da ekliyorum ki 
	    //buradan (main'den) erisebileyim (mesela getAll metoduyla tum kullanicilara erisiyorum vs.. (satýr 58)
	    System.out.println("----------------------------");
	}

}
