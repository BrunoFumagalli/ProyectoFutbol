package com.brunofumagalli.Futbol;

public class Stats {

  private ListaPartidos partidos;

  public Stats(ListaPartidos partidos) {
    this.partidos = partidos;
  }

  public double winRate(Jugador jug) {
    ListaPartidos nuevaLista = partidos.partidosSegunJugador(jug);
    return (double)nuevaLista.numPartidosGanados(jug) / (double)nuevaLista.size();
  }
}
