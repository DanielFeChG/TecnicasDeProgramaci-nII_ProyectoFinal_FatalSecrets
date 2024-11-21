package co.edu.konradlorenz.model;

import java.awt.Color;

public class NPC extends EntityGame {
	
	private String testimonio;
	private Riddle acertijo;
	private ObjectClue pista;
	private Color color;

	public NPC(String nombre, String descripcion, String testimonio, Riddle acertijo, ObjectClue pista, Color color) {
		super(nombre, descripcion);
		this.testimonio = testimonio;
		this.acertijo = acertijo;
		this.pista = pista;
		this.color = color;
	}
	
	public NPC(String nombre, String descripcion, String testimonio, ObjectClue pista, Color color) {
		super(nombre, descripcion);
		this.testimonio = testimonio;
		this.pista = pista;
		this.color = color;
	}
	
	public NPC(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
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

	public ObjectClue getPista() {
		return pista;
	}

	public void setPista(ObjectClue pista) {
		this.pista = pista;
	}

	@Override
	public void interactuar(String accion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "NPC [testimonio=" + testimonio + ", acertijo=" + acertijo + ", pista=" + pista + ", color=" + color
				+ "]";
	}
	
}
