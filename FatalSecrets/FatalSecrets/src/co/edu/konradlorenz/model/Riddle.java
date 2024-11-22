package co.edu.konradlorenz.model;

public class Riddle implements Verifiable {
	
	private String pregunta;
	private String respuestaCorrecta;
	private boolean resuelto; //Estado resuelto
	
	public Riddle(String pregunta, String respuestaCorrecta) {
		this.pregunta = pregunta;
		this.respuestaCorrecta = respuestaCorrecta;
		this.resuelto = false;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	@Override
	public String toString() {
		return "Riddle [pregunta=" + pregunta + ", respuestaCorrecta=" + respuestaCorrecta + ", resuelto=" + resuelto + "]";
	}

	@Override
	public boolean comprobar(String respuesta) {
		resuelto = respuesta.equals(respuestaCorrecta);
		return resuelto;
	}

	@Override
	public boolean isResuelto() {
		return resuelto;
	}

}
