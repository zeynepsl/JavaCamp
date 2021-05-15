package eCommerceProject.business.abstracts;

import eCommerceProject.core.utils.Result;
import eCommerceProject.entities.concretes.User;

public interface AuthService {
	Result login(String email, String password);
	void register(User user);
}
