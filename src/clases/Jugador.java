package clases;

import java.util.ArrayList;

import areaDeJuego.AreaDeJuego;
import cartas.Carta;
import cartas.CartaMagica;
import cartas.CartaMonstruo;
import cartas.CartaTrampa;

public class Jugador {

	private String nombre;
	private ArrayList<Carta> mazo;
	private ArrayList<Carta> cartasEnMano;
	private AreaDeJuego areaDeJuego;
	
	public Jugador (String unNombre){
		
		this.nombre = unNombre;
		
		//Pongo arrayList, cualquier cosa lo cambiamos
		this.mazo = new ArrayList<Carta>();
		this.cartasEnMano = new ArrayList<Carta>();
		this.areaDeJuego = new AreaDeJuego();
		
	}
	
	public void juegaUnaCarta (CartaMonstruo unaCartaMonstruo) {
		
		areaDeJuego.jugarUnaCarta(unaCartaMonstruo);
	}
	
	public void juegaUnaCarta (CartaMagica unaCartaMagica) {
		
		areaDeJuego.jugarUnaCarta(unaCartaMagica);
	}
	
	public void juegaUnaCarta(CartaTrampa unaCartaTrampa) {
		
		areaDeJuego.jugarUnaCarta(unaCartaTrampa);
		
	}
	
	public void ponerEnAtaque (CartaMonstruo unaCartaMonstruo) {
		
		unaCartaMonstruo.ponerEnAtaque();
	}
	
	public void ponerEnDefensa (CartaMonstruo unaCartaMonstruo) {
		
		unaCartaMonstruo.ponerEnDefensa();
	}

	public void ponerBocaAbajo(CartaMagica unaCartaMagica) {
	
		unaCartaMagica.ponerBocaAbajo();
		
	}
	
	public void ponerBocaArriba(CartaMagica unaCartaMagica) {
		
		unaCartaMagica.ponerBocaArriba();
		
	}

	public void ponerBocaAbajo(CartaTrampa unaCartaTrampa) {
	
		unaCartaTrampa.ponerBocaAbajo();
		
	}


	
	
}
