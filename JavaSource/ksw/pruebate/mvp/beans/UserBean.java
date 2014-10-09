package ksw.pruebate.mvp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import ksw.pruebate.mvp.model.User;
import ksw.pruebate.mvp.services.UserService;

@Stateless
public class UserBean implements UserService{

	private List<User> users = new ArrayList<User>();
	
	public UserBean() {
		users.add(new User(1, "david", "fernando"));
		users.add(new User(1, "liz", "ilic839"));
	}

	@Override
	public boolean login(String username, String password) {
		for (User user : users) {
			if(user.getName().equals(username) && user.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
	}	
}
