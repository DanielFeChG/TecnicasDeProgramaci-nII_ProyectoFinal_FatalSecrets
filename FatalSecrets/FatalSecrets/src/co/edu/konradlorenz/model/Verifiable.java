package co.edu.konradlorenz.model;

public interface Verifiable {
	
	boolean comprobar(String respuesta) throws InvalidAnswerException;
	boolean isResuelto();
	
}
