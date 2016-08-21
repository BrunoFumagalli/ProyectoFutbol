package com.brunofumagalli.Futbol;

public class FutbolMain {

	public static void main(String[] args) {
	  
	  // declaro e instancio 13 jugadores
	  Jugador jug1 = new Jugador("Bruno1", Gender.HOMBRE, Position.LIBRE);
    Jugador jug2 = new Jugador("Bruno2", Gender.HOMBRE, Position.LIBRE);
    Jugador jug3 = new Jugador("Bruno3", Gender.HOMBRE, Position.LIBRE);
    Jugador jug4 = new Jugador("Bruno4", Gender.HOMBRE, Position.LIBRE);
    Jugador jug5 = new Jugador("Bruno5", Gender.HOMBRE, Position.LIBRE);
    Jugador jug6 = new Jugador("Bruno6", Gender.HOMBRE, Position.LIBRE);
    Jugador jug7 = new Jugador("Bruno7", Gender.HOMBRE, Position.LIBRE);
    Jugador jug8 = new Jugador("Bruno8", Gender.HOMBRE, Position.LIBRE);
    Jugador jug9 = new Jugador("Bruno9", Gender.HOMBRE, Position.LIBRE);
    Jugador jug10 = new Jugador("Bruno10", Gender.HOMBRE, Position.LIBRE);
    Jugador jug11 = new Jugador("Bruno11", Gender.HOMBRE, Position.LIBRE);
    Jugador jug12 = new Jugador("Bruno12", Gender.HOMBRE, Position.LIBRE);
    Jugador jug13 = new Jugador("Bruno13", Gender.HOMBRE, Position.LIBRE);

    // declaro e instanceo una ListaPartidos vacia
    ListaPartidos partidos = new ListaPartidos();

    // declaro e instanceo dos equipos
    Equipo equipo1 = new Equipo(jug1, jug2, jug3, jug4, jug5);
    Equipo equipo2 = new Equipo(jug6, jug7, jug8, jug9, jug10);
    
    // declaro e instanceo un partido y lo agrego a la lista de partidos
    Partido partido = new Partido("Olazabal", 1, equipo1, equipo2);
    partidos.agregarPartido(partido);

    // ya no declaro equipos y partido, reutilizo la variable declarada y reinstancio
    // equipo1 = blabla, en vez de: Equipo equipo1 = blablab
    equipo1 = new Equipo(jug1, jug2, jug3, jug4, jug5);
    equipo2 = new Equipo(jug6, jug7, jug8, jug9, jug11);
    partido = new Partido("Olazabal", -1, equipo1, equipo2);
    partidos.agregarPartido(partido);

    // repito
    equipo1 = new Equipo(jug1, jug2, jug3, jug4, jug5);
    equipo2 = new Equipo(jug6, jug7, jug8, jug9, jug10);
    partido = new Partido("Olazabal", 1, equipo1, equipo2);
    partidos.agregarPartido(partido);

    equipo1 = new Equipo(jug1, jug2, jug3, jug4, jug5);
    equipo2 = new Equipo(jug6, jug7, jug8, jug12, jug13);
    partido = new Partido("Olazabal", -1, equipo1, equipo2);
    partidos.agregarPartido(partido);

    equipo1 = new Equipo(jug1, jug2, jug3, jug4, jug5);
    equipo2 = new Equipo(jug6, jug7, jug8, jug12, jug10);
    partido = new Partido("Olazabal", 1, equipo1, equipo2);
    partidos.agregarPartido(partido);

    // declaro un objeto de estadisticas
    Stats stats = new Stats(partidos);

    // construyo un mensaje para imprimirle al usuario, y lo imprimo
    String message = "Winrates:\n";
    message += jug1.getName() + ": " + stats.winRate(jug1) + "\n";
    message += jug2.getName() + ": " + stats.winRate(jug2) + "\n";
    message += jug3.getName() + ": " + stats.winRate(jug3) + "\n";
    message += jug4.getName() + ": " + stats.winRate(jug4) + "\n";
    message += jug5.getName() + ": " + stats.winRate(jug5) + "\n";
    message += jug6.getName() + ": " + stats.winRate(jug6) + "\n";
    message += jug7.getName() + ": " + stats.winRate(jug7) + "\n";
    message += jug8.getName() + ": " + stats.winRate(jug8) + "\n";
    message += jug9.getName() + ": " + stats.winRate(jug9) + "\n";
    message += jug10.getName() + ": " + stats.winRate(jug10) + "\n";
    message += jug11.getName() + ": " + stats.winRate(jug11) + "\n";
    message += jug12.getName() + ": " + stats.winRate(jug12) + "\n";
    message += jug13.getName() + ": " + stats.winRate(jug13) + "\n";
    System.out.println(message);
	}

}
