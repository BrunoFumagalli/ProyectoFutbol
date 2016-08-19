package com.brunofumagalli.Futbol;

public class Partido {
	private String partido;
	private String lugar;
	private Resultado resultado;
	// falta agregar fecha y equipo//



	public Partido (String partido, String lugar, Resultado resultado) {
		this.partido = partido;
		this.lugar = lugar;
		this.resultado = resultado;
	}
	
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public String getPartido() {
		return this.partido;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public String getLugar() {
		return this.lugar;
	}
	
	public Resultado getResultado() {
		return this.resultado;
	}
	
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
}
