package eCommerceProject.business.concretes;

import java.util.regex.Pattern;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.core.utils.GoogleService;
import eCommerceProject.core.utils.Result;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class AuthManager implements AuthService{
	
	public static String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	UserDao userDao;
	GoogleService googleService;
	
	public AuthManager(UserDao userDao, GoogleService googleService) {
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void login(String email, String password) {
		if(!email.isEmpty() && !password.isEmpty()) {
			if(userDao.emailExist(email)) {
				System.out.println("Sisteme giris basarisiz");
				}
			else {
				System.out.println("sisteme giris basarili");
			}
		};
		
	}

	//void de yapýlabilir farketmez
	//maindeki kullaným icin boyle yaptým
	@Override
	public Result register(User user) {

		if (userDao.emailExist(user.getEmail()) == true) {
			return new Result(false, "bu kullanici zaten mevcut");
		}

		if (user.getFirstName() == null && user.getLastName() == null && user.getEmail() == null
				&& user.getPassword() == null) {
			return new Result(false,"lutfen tum bilgileriniz eksiksiz giriniz");
		}

		if (!checkIfNameIsValid(user.getFirstName(), user.getLastName())) {
			return new Result(false,"gecersiz isim veya soyisim");
		}

		if (!checkIfPasswordIsValid(user.getPassword())) {
			return new Result(false,"sifre en az 6 karakterden olusmali");
		}

		if (!checkIfEmailIsValid(user.getEmail())) {
			return new Result(false,"e-posta, e-posta formatýnda degil");
		}
		
		userDao.add(user);
		googleService.registerToSystem("google ile giris yapildi");
		return new Result(true, "adi: " + user.getFirstName() + " soyadý: " + user.getLastName() + " olan kullanýcý sisteme basariyla kaydedildi. " + 
				user.getEmail() + " e-posta adresine dogrulama e-postasi gonderildi");

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
		if(firstName.length() >= 2  && lastName.length() >= 2) {
			return true;
		}
		return false;
	}
	
	
}
