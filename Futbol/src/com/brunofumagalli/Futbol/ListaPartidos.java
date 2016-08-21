package com.brunofumagalli.Futbol;

import java.util.ArrayList;

public class ListaPartidos {

  private ArrayList<Partido> partidos;

  public ListaPartidos() {
    this.partidos = new ArrayList<Partido>();
  }

  public void agregarPartido(Partido partido) {
    this.partidos.add(partido);
  }

  public ListaPartidos partidosSegunJugador(Jugador jug) {
    ListaPartidos nuevaLista = new ListaPartidos();
    for (int i = 0; i < partidos.size() - 1; i++) {
      if (partidos.get(i).tieneJugador(jug)) {
        nuevaLista.agregarPartido(partidos.get(i));
      }
    }
    return nuevaLista;
  }

  public int numPartidosGanados(Jugador jug) {
    int ganados = 0;
    for (Partido partido:partidos) {  //esto se llama iterador, es una forma especial de For para arrays (preguntame)
      if (partido.ganoJugador(jug)) { ganados++; }
    }
    return ganados;
  }

  public int size() {
    return partidos.size();
  }

}
