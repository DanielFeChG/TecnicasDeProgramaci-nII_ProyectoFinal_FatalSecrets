package co.edu.konradlorenz.model;

public class Innocent extends NPC{
	
	private ObjectClue pista;
	private ObjectClue pruebaInoncente;
	
	public Innocent(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo,ObjectClue pista, ObjectClue pruebaInoncente) {
		super(nombre, descripcion, imagen, testimonio, acertijo);
		this.pista = pista;
		this.pruebaInoncente = pruebaInoncente;
	}//Este se usa para un inocente normal
	
	public Innocent(String nombre, String descripcion, String imagen, String testimonio, ObjectClue pista, ObjectClue pruebaInoncente) {
		super(nombre, descripcion, imagen, testimonio);
		this.pista = pista;
		this.pruebaInoncente = pruebaInoncente;
	}//Este se usa para un inocente sin acertijo
	
	public Innocent(String nombre, String descripcion, String imagen, String testimonio, Riddle acertijo) {
		super(nombre, descripcion, imagen, testimonio, acertijo);
		// TODO Auto-generated constructor stub
	}

	public Innocent(String nombre, String descripcion, String imagen, String testimonio) {
		super(nombre, descripcion, imagen, testimonio);
		// TODO Auto-generated constructor stub
	}
	public Innocent(String nombre, String descripcion, String imagen) {
		super(nombre, descripcion, imagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Innocent [pista=" + pista + ", pruebaInoncente=" + pruebaInoncente + "]";
	}
	
}
