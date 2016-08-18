package com.brunofumagalli.Futbol;

public class Jugador {

	private String name;
	private Gender gender;
	private Position position;
	
	public Jugador(String name, Gender gender, Position position) {
		this.name = name;
		this.gender = gender;
		this.position = position;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender (Gender gender) {
	
		this.gender = gender;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition (Position position) {
	
		this.position = position;
	}
}

