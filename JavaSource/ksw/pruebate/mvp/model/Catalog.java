package ksw.pruebate.mvp.model;

public class Catalog {

	private int Id;
	private String Nemonic;
	private String Value;
	
	public Catalog(int id, String nemonic, String value) {
		Id = id;
		Nemonic = nemonic;
		Value = value;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNemonic() {
		return Nemonic;
	}
	public void setNemonic(String nemonic) {
		Nemonic = nemonic;
	}
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
}
