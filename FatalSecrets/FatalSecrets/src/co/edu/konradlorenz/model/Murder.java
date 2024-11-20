package co.edu.konradlorenz.model;

import java.awt.Color;

public class Murder extends NPC{
	
	private String declaración;

	public Murder(String nombre, String descripcion, String imagen, Color color) {
		super(nombre, descripcion, imagen, color);
		// TODO Auto-generated constructor stub
	}



	public Murder(String nombre, String descripcion, String imagen, String testimonio, Color color) {
		super(nombre, descripcion, imagen, testimonio, color);
		// TODO Auto-generated constructor stub
	}



	public Murder(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo, Color color) {
		super(nombre, descripcion, imagen, testimonio, acertijo, color);
		// TODO Auto-generated constructor stub
	}

	public Murder(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo, Color color,
			String declaración) {
		super(nombre, descripcion, imagen, testimonio, acertijo, color);
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
