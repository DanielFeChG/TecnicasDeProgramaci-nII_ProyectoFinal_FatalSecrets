package co.edu.konradlorenz.model;

public class NPC extends EntityGame {
	
	private String testimonio;
	private Riddle acertijo;

	public NPC(String nombre, String descripcion, String imagen) {
		super(nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
	}
	
	public NPC(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo) {
		super(nombre, descripcion, imagen);
		this.testimonio = testimonio;
		this.acertijo = acertijo;
	}

	public NPC(String nombre, String descripcion, String imagen, String testimonio) { //NPC sin acertijo
		super(nombre, descripcion, imagen);
		this.testimonio = testimonio;
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

	@Override
	public void interactuar(String accion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "NPC [testimonio=" + testimonio + ", acertijo=" + acertijo + "]";
	}
	
}
