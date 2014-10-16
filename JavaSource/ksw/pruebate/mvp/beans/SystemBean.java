package ksw.pruebate.mvp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import ksw.pruebate.mvp.model.Catalog;
import ksw.pruebate.mvp.services.SystemService;

@Stateless
public class SystemBean implements SystemService {

	private List<Catalog> highSchools = new ArrayList<Catalog>();
	
	public SystemBean() {
		highSchools.add(new Catalog(1, "hsc", "Colegio Nacional Eloy Alfaro"));
		highSchools.add(new Catalog(2, "hsc", "Colegio Montalvo"));
		highSchools.add(new Catalog(3, "hsc", "Colegio San Gabriel"));
		highSchools.add(new Catalog(4, "hsc", "Colegio Benalcazar"));
	}

	@Override
	public List<Catalog> getHighSchools() {
		return highSchools;
	}

}
