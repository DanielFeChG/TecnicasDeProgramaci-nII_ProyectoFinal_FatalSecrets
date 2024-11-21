package co.edu.konradlorenz.model;

import java.awt.Color;

public class Murder extends NPC{
	
	private String declaración;

	public Murder(String nombre, String descripcion, String testimonio, ObjectClue pista, Color color) {
		super(nombre, descripcion, testimonio, pista, color);
		// TODO Auto-generated constructor stub
	}

	public Murder(String nombre, String descripcion, String testimonio, Riddle acertijo, ObjectClue pista,
			Color color) {
		super(nombre, descripcion, testimonio, acertijo, pista, color);
		// TODO Auto-generated constructor stub
	}

	public Murder(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	public Murder(String nombre, String descripcion, String testimonio, Riddle acertijo, ObjectClue pista, Color color,
			String declaración) {
		super(nombre, descripcion, testimonio, acertijo, pista, color);
		this.declaración = declaración;
	}
	
	public String getDeclaración() {
		return declaración;
	}

	public void setDeclaración(String declaración) {
		this.declaración = declaración;
	}

	@Override
	public String toString() {
		return "Murder [declaración=" + declaración + "]";
	}

}
