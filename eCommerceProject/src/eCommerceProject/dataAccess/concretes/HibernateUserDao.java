package eCommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	public ArrayList<User> users;
	
    public HibernateUserDao() {
    	users = new ArrayList<User>();
    }

	@Override
	public void add(User user) {
		users.add(user);		
	}

	@Override
	public void delete(User user) {
		User deletedUser = users.stream()
				.filter(u-> u.getId() == user.getId())
				.findFirst()
				.orElse(null);		
		users.remove(deletedUser);
	}

	@Override
	public void update(User user) {
		User updatedUser = users.stream().filter(c -> c.getEmail() == user.getEmail()).findFirst().get();       
		updatedUser.setId(user.getId());
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setEmail(user.getEmail());
		updatedUser.setPassword(user.getPassword());
		System.out.println("guncellendi : " + user.getFirstName());
	}


	@Override
	public void getAll() {
		for (User user : users) {
			System.out.println("-----------------------");
            System.out.println("isim: "+ user.getFirstName());
            System.out.println("soyisim: "+ user.getLastName());
            System.out.println("e-posta: "+ user.getEmail());
        }
	}

	//ayrýca bu sekilde users'lari donduren metot yazma sebebi
	//"kullanici sistemde mevcut mu" diye ararken tum kullanicilari tek tek dolasmak icin (satýr 73)
	public ArrayList<User> getAllUsers(){
		return users;
	}
	
	@Override
	public User get(String email) {
		User user = users.stream()
				.filter(u -> u.getEmail() == email)
				.findFirst()
				.orElse(null);
		return user;
	}
	
	@Override
	public boolean emailExist(String email) {
		for (User user : getAllUsers()) 
			if (user.getEmail() == email) {
				return true;
			}				
		return false;	
	}
	
	@Override
	public List<String> getAllEmails(){
		List<User> users1 = getAllUsers();
		List<String> emails = new ArrayList<String>();
		for (User user : users1) {
			emails.add(user.getEmail());
		}
		return emails;
	}
	
	

}
