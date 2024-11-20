package co.edu.konradlorenz.model;

import java.awt.Color;

public class NPC extends EntityGame {
	
	private String testimonio;
	private Riddle acertijo;
	private Color color;
	
	public NPC(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo, Color color) {
		super(nombre, descripcion, imagen);
		this.testimonio = testimonio;
		this.acertijo = acertijo;
		this.color = color;
	}

	public NPC(String nombre, String descripcion, String imagen, String testimonio, Color color) { //NPC sin acertijo
		super(nombre, descripcion, imagen);
		this.testimonio = testimonio;
		this.color = color;
	}

	public NPC(String nombre, String descripcion, String imagen, Color color) {
		super(nombre, descripcion, imagen);
		this.color = color;
	}
	
	public String getTestimonio() {
		return testimonio;
	}

	public void setTestimonio(String testimonio) {
		this.testimonio = testimonio;
	}

	public Riddle getAcertijo() {
		return acertijo;
	}

	public void setAcertijo(Riddle acertijo) {
		this.acertijo = acertijo;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void interactuar(String accion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "NPC [testimonio=" + testimonio + ", acertijo=" + acertijo + ", color=" + color + "]";
	}
	
}
