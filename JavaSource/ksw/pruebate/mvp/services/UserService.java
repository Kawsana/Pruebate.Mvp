package ksw.pruebate.mvp.services;

import javax.ejb.Local;

@Local
public interface UserService {

	public boolean login(String username, String password);
}
