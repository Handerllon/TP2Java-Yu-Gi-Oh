package AreaDeJuego;

import AlGoOh.Jugador;

public class Tablero {
	
	private AreaDeCartas areaDeCartasJugador1;
	private AreaDeCartas areaDeCartasJugador2;
	
	public Tablero (Jugador jugador, Jugador oponente){
		
		this.areaDeCartasJugador1 = new AreaDeCartas(jugador);
		this.areaDeCartasJugador2 = new AreaDeCartas(oponente);
		
	}
	
}
