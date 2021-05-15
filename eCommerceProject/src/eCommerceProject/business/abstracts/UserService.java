package eCommerceProject.business.abstracts;

import java.util.List;

import eCommerceProject.core.utils.Result;
import eCommerceProject.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getByEmail(String email);
	List<String> getAllEmails();
	void getAll();
	boolean emailExists(String email);
}
