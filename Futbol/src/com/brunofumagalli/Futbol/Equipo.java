package com.brunofumagalli.Futbol;

public class Equipo {

	private Jugador jug1;
	private Jugador jug2;
	private Jugador jug3;
	private Jugador jug4;
	private Jugador jug5;

	public Equipo(Jugador jug1, Jugador jug2, Jugador jug3, Jugador jug4, Jugador jug5) {

		this.jug1 = jug1;
		this.jug2 = jug2;
		this.jug3 = jug3;
		this.jug4 = jug4;
		this.jug5 = jug5;
	}

	public Jugador getJug1() {
		return this.jug1;
	}

	public Jugador getJug2() {
		return this.jug2;
	}

	public Jugador getJug3() {
		return this.jug3;
	}

	public Jugador getJug4() {
		return this.jug4;
	}

	public Jugador getJug5() {
		return this.jug5;
	}

	public boolean tieneJugador(Jugador jug) {
	  if ((jug == jug1) || (jug == jug2) || (jug == jug3) || (jug == jug4) || (jug == jug5)) {
	    return true;
	  } else {
	    return false;
	  }
	}
}
