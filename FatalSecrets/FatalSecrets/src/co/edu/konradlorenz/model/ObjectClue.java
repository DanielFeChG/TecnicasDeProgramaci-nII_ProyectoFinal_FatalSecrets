package co.edu.konradlorenz.model;

import javax.swing.ImageIcon;

public class ObjectClue extends EntityGame{

	private String imagePath;

	public ObjectClue(String nombre, String descripcion) {
		super(nombre, descripcion);
		// TODO Auto-generated constructor stub
	}
	
	public ObjectClue(String nombre, String descripcion, String imagePath) {
		super(nombre, descripcion);
		this.imagePath = imagePath;
	}

	@Override
	public void interactuar(String accion) {
		// TODO Auto-generated method stub
		
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "ObjectClue [imagePath=" + imagePath + "]";
	}
	
}
