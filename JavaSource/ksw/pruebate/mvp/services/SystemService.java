package ksw.pruebate.mvp.services;

import java.util.List;

import javax.ejb.Local;

import ksw.pruebate.mvp.model.Catalog;

@Local
public interface SystemService {
	
	public List<Catalog> getHighSchools();
}
