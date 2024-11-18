package co.edu.konradlorenz.model;

public abstract class EntityGame implements Interactable {
	
	private String nombre;
	private String descripcion;
	private String imagen;
	
	protected EntityGame(String nombre, String descripcion, String imagen) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "EntityGame [nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + "]";
	}

	
	
}
