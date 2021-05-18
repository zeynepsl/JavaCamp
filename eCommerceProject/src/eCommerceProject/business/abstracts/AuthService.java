package eCommerceProject.business.abstracts;

import eCommerceProject.core.utils.Result;
import eCommerceProject.entities.concretes.User;

public interface AuthService {
	void login(String email, String password);
	Result register(User user);
}
