package co.edu.konradlorenz.model;

import java.awt.Color;

public class Innocent extends NPC{
	
	private ObjectClue pista;
	
	public Innocent(String nombre, String descripcion, String imagen, Color color) {
		super(nombre, descripcion, imagen, color);
		// TODO Auto-generated constructor stub
	}

	public Innocent(String nombre, String descripcion, String imagen, String testimonio, Color color) {
		super(nombre, descripcion, imagen, testimonio, color);
		// TODO Auto-generated constructor stub
	}

	public Innocent(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo, Color color) {
		super(nombre, descripcion, imagen, testimonio, acertijo, color);
		// TODO Auto-generated constructor stub
	}

	public Innocent(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo, Color color, ObjectClue pista) {
		super(nombre, descripcion, imagen, testimonio, acertijo, color);
		this.pista = pista;
	}
	
	public ObjectClue getPista() {
		return pista;
	}

	public void setPista(ObjectClue pista) {
		this.pista = pista;
	}

	@Override
	public String toString() {
		return "Innocent [pista=" + pista + "]";
	}
	
}
