package AlGoOh;

import areaDeJuego.AreaDeJuego;
import clases.Jugador;

public class Tablero {
	
	private AreaDeJuego areaDeJuegoJugador1;
	private AreaDeJuego areaDeJuegoJugador2;
	
	public Tablero (Jugador jugador, Jugador oponente){
		
		this.areaDeJuegoJugador1 = new AreaDeJuego (jugador);
		this.areaDeJuegoJugador2 = new AreaDeJuego (oponente);
		
	}
	
}
