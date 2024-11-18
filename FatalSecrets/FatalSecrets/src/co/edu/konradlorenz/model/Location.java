package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class Location{
	
	private String nombreLugar;
	private ArrayList<EntityGame> entidadesLugar; //Lista heterogenea
	private boolean accesible; //Si ya se puede acceder al lugar o aun no
	
	public Location(String nombreLugar, boolean accesible) {
		this.nombreLugar = nombreLugar;
		this.entidadesLugar = new ArrayList<>();
		this.accesible = accesible;
	}

	public String getNombreLugar() {
		return nombreLugar;
	}

	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}

	public ArrayList<EntityGame> getEntidadesLugar() {
		return entidadesLugar;
	}

	public void setEntidadesLugar(ArrayList<EntityGame> entidadesLugar) {
		this.entidadesLugar = entidadesLugar;
	}

	public boolean isAccesible() {
		return accesible;
	}

	public void setAccesible(boolean accesible) {
		this.accesible = accesible;
	}

	@Override
	public String toString() {
		return "Location [nombreLugar=" + nombreLugar + ", entidadesLugar=" + entidadesLugar + ", accesible=" + accesible + "]";
	}
	
}
