package co.edu.konradlorenz.model;
import java.util.ArrayList;

public class Case {
	
	private ArrayList<Location> ubicaciones;
	private String descripcion;
	private Murder culpable;
	private boolean resuelto;

	public Case(String descripcion, Murder culpable, boolean resuelto) {
		this.descripcion = descripcion;
		this.culpable = culpable;
		this.resuelto = resuelto;
	}

	public Case(String descripcion, Murder culpable) {
		this.descripcion = descripcion;
		this.culpable = culpable;
		this.resuelto = false;
		this.ubicaciones = new ArrayList<>();
	}
	
	public Case() {	
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Murder getCulpable() {
		return culpable;
	}

	public void setCulpable(Murder culpable) {
		this.culpable = culpable;
	}

	public boolean isResuelto() {
		return resuelto;
	}

	public void setResuelto(boolean resuelto) {
		this.resuelto = resuelto;
	}

	public ArrayList<Location> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(ArrayList<Location> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	@Override
	public String toString() {
		return "Case [ubicaciones=" + ubicaciones + ", descripcion=" + descripcion + ", culpable=" + culpable
				+ ", resuelto=" + resuelto + "]";
	}

	

}
