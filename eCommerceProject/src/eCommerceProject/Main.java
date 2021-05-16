package eCommerceProject;

import java.util.Scanner;

import eCommerceProject.business.concretes.AuthManager;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.utils.GoogleManagerAdapter;
import eCommerceProject.dataAccess.concretes.HibernateUserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		while (true) {
			System.out.println("lutfen yapmak istediginiz islemi seciniz (register : 1, login : 2, tum kullanýcýlarý listele: 3, cýkýþ:-1) ");
			Scanner klavye = new Scanner(System.in);
			int secim = klavye.nextInt();
			if (secim != -1) {
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
			else {
				break;
			}

		}
			
	
	}
	
	private static void getAll() {
		HibernateUserDao userDao = new HibernateUserDao();
		System.out.println(userDao.getAll());
		System.out.println("-----------------------");
	}

	private static void login(Scanner klavye) {
		System.out.println("----------------------------");
		AuthManager authManager = new AuthManager(new HibernateUserDao());

		String _email;
		String _password;
		
		System.out.println("e-posta adresinizi giriniz : ");
		_email = klavye.next();
		
		System.out.println("sifrenizi giriniz : ");
		_password = klavye.next();
		
		authManager.login(_email, _password);
	}

	private static void register(Scanner klavye) {
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		AuthManager authManager = new AuthManager(new HibernateUserDao());
		
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
	    authManager.register(user);
	    
	}

}
