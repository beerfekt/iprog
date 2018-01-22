package de.hskl.model;

import java.util.LinkedList;
import java.util.List;

public class NotizContainer {
	private List<Notiz> notizen;

	public List<Notiz> getNotizen() {
		return notizen;
	}

	public NotizContainer() {
		super();
		this.notizen = new LinkedList<>();
	}
}
