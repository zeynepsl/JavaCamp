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
		System.out.println("veritabanýna eklendi : " + user.getFirstName());
		
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
		System.out.println("güncellendi : " + user.getFirstName());
	}


	@Override
	public ArrayList<User> getAll() {
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
	
	public boolean emailExist(String email) {
		for (User user1 : users) 
			if (user1.getEmail() == email) {
				return true;
			}				
		return false;	
	}
	
	


}
