package model;

import java.util.LinkedList;
import java.util.List;

public class NotizContainer {

	private List<Notiz> notizen;


	public NotizContainer (){
		this.notizen = new LinkedList<>();	
	}
	
	public List<Notiz> getNotizen() {
		return notizen;
	}
	
	
}
