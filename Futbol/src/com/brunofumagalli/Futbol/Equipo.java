package com.brunofumagalli.Futbol;

public class Equipo {
	private String equipo;
	
	public Equipo(String equipo, Jugador jugador) {
		this.equipo = equipo;
	}
	
	public void setEquipo (String equipo) {
		this.equipo = equipo;
	}
	
	public String getEquipo() {
		return this.equipo;
	}

}
