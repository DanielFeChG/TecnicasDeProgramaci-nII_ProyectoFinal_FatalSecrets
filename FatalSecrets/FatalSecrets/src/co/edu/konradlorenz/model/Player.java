package co.edu.konradlorenz.model;

public class Player{
	
	private String nombreJugador;
	private Location ubicacionJugador;
	
	public Player(String nombreJugador, Location ubicacionJugador) {
		this.nombreJugador = nombreJugador;
		this.ubicacionJugador = ubicacionJugador;
	}

	@Override
	public String toString() {
		return "Player [nombreJugador=" + nombreJugador + ", ubicacionJugador=" + ubicacionJugador + "]";
	}
	
}
