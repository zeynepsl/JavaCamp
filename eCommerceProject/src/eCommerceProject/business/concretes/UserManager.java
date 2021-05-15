package eCommerceProject.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.core.utils.GoogleService;
import eCommerceProject.core.utils.Result;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	GoogleService googleService;
	public UserManager() {
		
	}
	public UserManager(UserDao userDao, GoogleService googleService) {
		this.userDao = userDao;
		this.googleService = googleService;
	}
	@Override
	public void add(User user) {
		userDao.add(user);
		googleService.registerToSystem("google ile giris yapildi");
	}
	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("kullanici silme basarili");
	}
	@Override
	public void update(User user) {
		userDao.update(user);
		System.out.println("kullanici güncellendi");
	}
	@Override
	public User getByEmail(String email) {
		try {
			return userDao.get(email);
		} catch (Exception e) {
			return null;
		}
		
	}
	@Override
	public List<String> getAllEmails(){
		List<User> users1 = userDao.getAll();
		List<String> emails = new ArrayList<String>();
		for (User user : users1) {
			emails.add(user.getEmail());
		}
		return emails;
	}
	
	@Override
	public void getAll() {
		for (User user : userDao.getAll()) {
            System.out.println("isim: "+ user.getFirstName());
            System.out.println("soyisim: "+ user.getLastName());
            System.out.println("e-posta: "+ user.getEmail());
        }
	}
	
	@Override
	public boolean emailExists(String email) {
		return userDao.emailExist(email);
	}

	

	
	
}
