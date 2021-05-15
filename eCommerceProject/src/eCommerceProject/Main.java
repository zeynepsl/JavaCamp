package eCommerceProject;

import eCommerceProject.business.concretes.AuthManager;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.utils.GoogleManagerAdapter;
import eCommerceProject.dataAccess.concretes.HibernateUserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "zeynep", "salman", "zeynep@zeynep.com", "123abc");
		User user2 = new User(2, "eda", "bulut", "eda@bulut.com", "234edc");
		User user3 = new User(3, "eda", "bulut", "eda@bulut.com", "234edc");
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		
		System.out.println( userManager.getAllEmails());
		System.out.println("----------------------------");
	    userManager.getAll();
	    
		System.out.println( userManager.emailExists("zeynep@zeynep.com"));
		
		
		AuthManager authManager = new AuthManager(new UserManager());
	    authManager.login("zeynep@zeynep.com", "123abc").getMessage();
		
	}

}
