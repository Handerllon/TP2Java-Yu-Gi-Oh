package clases;

import java.util.ArrayList;

import areaDeJuego.AreaDeJuego;
import cartas.Carta;
import cartas.CartaMonstruo;

public class Jugador {

	private String nombre;
	private ArrayList<Carta> mazo;
	private ArrayList<Carta> cartasEnMano;
	private Jugador oponente;
	private AreaDeJuego areaDeJuego;
	
	public Jugador (String unNombre){
		
		this.nombre = unNombre;
		
		//Pongo arrayList, cualquier cosa lo cambiamos
		this.mazo = new ArrayList<Carta>();
		this.cartasEnMano = new ArrayList<Carta>();
		this.areaDeJuego = new AreaDeJuego();
		
	}
	
	public void establecerOponente (Jugador unOponente){
		
		this.oponente = unOponente;
		
	}
	
	public void juegaUnaCartaMonstruo (CartaMonstruo unaCartaMonstruo) {
		
		areaDeJuego.jugarUnaCartaMonstruo(unaCartaMonstruo);
	}
	
}
