package eCommerceProject.business.concretes;

import java.util.regex.Pattern;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class AuthManager implements AuthService{
	
	public static String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	UserDao userDao;
	
	public AuthManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void login(String email, String password) {
		if(!email.isEmpty() && !password.isEmpty()) {
			if(userDao.emailExist(email)) {
				System.out.println("Sisteme giris basarili");
				}
			else {
				System.out.println("sisteme giris basarisiz");
			}
		};
		
	}

	@Override
	public void register(User user) {

		if (userDao.emailExist(user.getEmail()) == true) {
			System.out.println("bu kullanici zaten mevcut");
			return;
		}

		if (user.getFirstName() == null && user.getLastName() == null && user.getEmail() == null
				&& user.getPassword() == null) {
			System.out.println("lutfen tum bilgileriniz eksiksiz giriniz");
			return;
		}

		if (!checkIfNameIsValid(user.getFirstName(), user.getLastName())) {
			System.out.println("isim gecersiz");
			return;
		}

		if (!checkIfPasswordIsValid(user.getPassword())) {
			System.out.println("sifre gecersiz");
			return;
		}

		if (!checkIfEmailIsValid(user.getEmail())) {
			System.out.println("mail gecersiz");
			return;
		}
	
		System.out.println(user.getEmail() + "adresine dogrulama e-postasi gonderildi: ");
		userDao.add(user);
		System.out.println("adi: " + user.getFirstName() + " soyadý: " + user.getLastName() + " olan kullanýcý sisteme basariyla kaydedildi");
		 
	}
	
	//Business Rules
	
	public boolean checkIfPasswordIsValid(String password) {
		if(password.length() < 6) {
			return false;		}
		return true;
	}
	
	public boolean checkIfEmailIsValid(String email) {
		return pattern.matcher(email).find();
		
		//alternatif1: return Pattern.matches(regex, email);
			
		/*alternatif2: 
		 * Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		return false;*/
		
	}
	
	
	public boolean checkIfNameIsValid(String firstName, String lastName) {
		if(firstName.length() < 2  && lastName.length() < 2) {
			return false;
		}
		return true;
	}
	
	
}
