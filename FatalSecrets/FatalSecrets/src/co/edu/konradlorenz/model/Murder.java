package co.edu.konradlorenz.model;

public class Murder extends NPC{
	
	private String declaración;

	public Murder(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo, String declaración) {
		super(nombre, descripcion, imagen, testimonio, acertijo);
		this.declaración = declaración;
	}//Este es el del murder

	public Murder(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo) {
		super(nombre, descripcion, imagen, testimonio, acertijo);
		// TODO Auto-generated constructor stub
	}

	public Murder(String nombre, String descripcion, String imagen, String testimonio) {
		super(nombre, descripcion, imagen, testimonio);
		// TODO Auto-generated constructor stub
	}

	public Murder(String nombre, String descripcion, String imagen) {
		super(nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Murder [declaración=" + declaración + "]";
	}

	
}
