package co.edu.konradlorenz.model;

import java.awt.Color;

public class Innocent extends NPC{

	public Innocent(String nombre, String descripcion, String testimonio, ObjectClue pista, Color color) {
		super(nombre, descripcion, testimonio, pista, color);
		// TODO Auto-generated constructor stub
	}

	public Innocent(String nombre, String descripcion, String testimonio, Riddle acertijo, ObjectClue pista, Color color) {
		super(nombre, descripcion, testimonio, acertijo, pista, color);
		// TODO Auto-generated constructor stub
	}

	public Innocent(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}
	
}
