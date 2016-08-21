package com.brunofumagalli.Futbol;

public class Partido {

	private String lugar;
	private int resultado;
	private Equipo equipo1;
	private Equipo equipo2;

	// falta agregar fecha

	public Partido (String lugar, int resultado, Equipo equipo1, Equipo equipo2) {
		this.lugar = lugar;
		this.resultado = resultado;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getLugar() {
		return this.lugar;
	}

	public boolean tieneJugador(Jugador jug) {
	  if ( (equipo1.tieneJugador(jug)) || (equipo2.tieneJugador(jug)) ) {
	    return true;
	  } else {
	    return false;
	  }
	}

	public boolean ganoJugador(Jugador jug) {
	  if (((resultado > 0) && equipo1.tieneJugador(jug)) || ((resultado <= 0) && equipo2.tieneJugador(jug))) {
	    return true;
	  } else {
	    return false;
	  }
	}

}
