package AreaDeJuego;

import AlGoOh.Jugador;
import carta.monstruo.CartaMonstruo;

public class Tablero {

	private AreaDeCartas areaDeCartasJugador;
	private AreaDeCartas areaDeCartasOponente;
	private Jugador jugador;
	private Jugador oponente;
	
	public Tablero (Jugador jugador, Jugador oponente){

		this.areaDeCartasJugador = jugador.areaDeCartas();
		this.areaDeCartasOponente = oponente.areaDeCartas();

		this.jugador = jugador;
		this.oponente = oponente;
		
	}

	public void atacarOponente(CartaMonstruo cartaJugador, CartaMonstruo cartaOponente)
	{
		

	}
}
