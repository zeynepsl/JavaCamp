package eCommerceProject.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import eCommerceProject.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(String email);
	ArrayList<User> getAll();
	boolean emailExist(String email);
	List<String> getAllEmails();
}
