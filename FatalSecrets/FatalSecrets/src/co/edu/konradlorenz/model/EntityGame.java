package co.edu.konradlorenz.model;

public abstract class EntityGame{
	
	private String nombre;
	private String descripcion;
	
	protected EntityGame(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
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

	@Override
	public String toString() {
		return "EntityGame [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
}
