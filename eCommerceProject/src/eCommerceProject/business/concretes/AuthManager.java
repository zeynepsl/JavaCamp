package eCommerceProject.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceProject.business.abstracts.AuthService;
import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.core.utils.Result;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.dataAccess.concretes.HibernateUserDao;
import eCommerceProject.entities.concretes.User;

public class AuthManager implements AuthService{
	
	public static String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	UserService userService;
	
	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public Result login(String email, String password) {
		if(userService.emailExists(email)==true  && !email.isEmpty() && !password.isEmpty()) {
			return new Result(true, "Sisteme giris basarili");
		};
		return new Result(false, "sisteme giris basarisiz");
	}

	@Override
	public void register(User user) {

		if (userService.emailExists(user.getEmail()) == false) {
			System.out.println("bu kullanici zaten mevcut");
			return;
		}

		if (user.getFirstName() == null && user.getLastName() == null && user.getEmail() == null
				&& user.getPassword() == null) {
			System.out.println("lutfen tum bilgileriniz eksiksiz giriniz");
			return;
		}

		if (checkIfNameIsValid(user.getFirstName(), user.getLastName()) == false) {
			System.out.println("isim gecersiz");
			return;
		}

		if (checkIfPasswordIsValid(user.getPassword()) == false) {
			System.out.println("sifre gecersiz");
			return;
		}

		if (checkIfEmailIsValid(user.getEmail()) == false) {
			System.out.println("mail gecersizi");
			return;
		}
		System.out.println("dogrulama e-postasi gönderildi: " + user.getEmail());
		userService.add(user);
		System.out.println("kullanýcý sisteme basariyla kaydedildi");
		return;
			
		 
	}
	
	//Business Rules
	
	public boolean checkIfPasswordIsValid(String password) {
		if(password.length() < 6) {
			return false;		}
		return true;
	}
	
	public boolean checkIfEmailIsValid(String email) {
		return pattern.matcher(email).find();
		/*Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		return false;*/
		
	}
	
	
	public boolean checkIfEmailUsedBefore(String email) {
		List<String> emails = userService.getAllEmails();
		
		for (String eMail : emails) {
			if (eMail.equals(email)) {		
				System.out.println(" mail address used before");
				return false;
			}
		}
		return true;
	}
	
	public boolean checkIfNameIsValid(String firstName, String lastName) {
		if(firstName.length() < 2  && lastName.length() < 2) {
			return false;
		}
		return true;
	}
	
	
}
