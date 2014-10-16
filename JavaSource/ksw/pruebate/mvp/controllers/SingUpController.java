package ksw.pruebate.mvp.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import ksw.pruebate.mvp.model.Catalog;
import ksw.pruebate.mvp.services.SystemService;

@ManagedBean
public class SingUpController {

	@EJB
	private SystemService systemService;
	private List<Catalog> highSchools;

	public SingUpController() {
		highSchools = new ArrayList<Catalog>();
	}

	@PostConstruct
	public void loadData() {
		highSchools = systemService.getHighSchools();
	}

	public List<Catalog> getHighSchools() {
		return highSchools;
	}

}
