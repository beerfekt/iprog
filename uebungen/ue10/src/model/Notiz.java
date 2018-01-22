package model;

import java.util.Date;

public class Notiz {
	
	
	private Date datum;
	//private String titel;
	private String inhalt;
	
	
	public Notiz(Date datum, String inhalt){
		this.datum = datum;
		this.inhalt = inhalt;
	}
	
	
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	
	
	public String getInhalt() {
		return inhalt;
	}
	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}
	

}
