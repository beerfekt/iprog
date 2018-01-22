package de.hskl.model;

import java.util.Date;

public class Notiz {
	private String inhalt;
	private Date datum;

	public Notiz(String inhalt, Date datum) {
		super();
		this.inhalt = inhalt;
		this.datum = datum;
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

}
