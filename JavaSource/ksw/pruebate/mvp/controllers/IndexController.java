package ksw.pruebate.mvp.controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import ksw.pruebate.mvp.services.UserService;

@ManagedBean
public class IndexController {
	
	@EJB
	private UserService userService;
	private String username;
	private String password;

	public String login() {
		if(userService.login(username, password))
		{
			return "synonym";
		}
		
		return "";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
