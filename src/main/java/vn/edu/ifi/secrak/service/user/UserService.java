package vn.edu.ifi.secrak.service.user;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.edu.ifi.secrak.entity.User;

public interface UserService {

	User saveUser(User user);
	
	User updateUser(User user);
	
	void deletUser(User user);

	User getUserBId(Long id);

	User getUserByLogin(String login);

	List<User> getAllUser();
	
	void setUserLogin(User user, String login); 
	
	void setUserPassWord(User user, String password); 
	
	String getUserLogin(User user);
	
	String getUserPassWord(User user); 
}