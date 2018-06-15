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
	//private Jugador oponente;
	private int puntosDeVida;
	private Jugador oponente;
	
	public Jugador (String unNombre){
		
		this.nombre = unNombre;
		
		//Pongo arrayList, cualquier cosa lo cambiamos
		this.mazo = new ArrayList<Carta>();
		this.cartasEnMano = new ArrayList<Carta>();
		this.puntosDeVida = 8000;
		
	}
	
	public void juegaUnaCarta (CartaMonstruo unaCartaMonstruo) {
		
		areaDeJuego.jugarUnaCarta(unaCartaMonstruo);
	}
	
	public void juegaUnaCarta (CartaMagica unaCartaMagica) {
		
		areaDeJuego.jugarUnaCarta(unaCartaMagica,this.oponente);
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

	public void establecerOponente(Jugador oponente) {
		
		this.oponente = oponente;
		
	}

	public void atacar(String nombreDeMonstruoElegidoParaAtacar, String nombreDeMonstruoQueRecibeAtaque){
		
		this.oponente.recibirAtaque(this.areaDeJuego,nombreDeMonstruoElegidoParaAtacar,
				nombreDeMonstruoQueRecibeAtaque);
		
	}

	public void recibirAtaque(AreaDeJuego areaDeJuegoOponente, String nombreDeMonstruoElegidoParaAtacar,
			String nombreDeMonstruoQueRecibeAtaque) {
		
		CartaMonstruo cartaEnemiga = areaDeJuegoOponente.obtenerCarta(nombreDeMonstruoElegidoParaAtacar);
		CartaMonstruo cartaAtacada = this.areaDeJuego.obtenerCarta(nombreDeMonstruoQueRecibeAtaque);
		
		posibilidadesDelAtaque(cartaEnemiga, cartaAtacada, areaDeJuegoOponente);
		
	}

	private void posibilidadesDelAtaque(CartaMonstruo cartaEnemiga, CartaMonstruo cartaAtacada,
			AreaDeJuego areaDeJuegoOponente) {
		
		if (cartaAtacada.muereAnte(cartaEnemiga)){
			this.puntosDeVida = this.puntosDeVida - cartaAtacada.verificarDanioAJugador(cartaEnemiga);
			this.areaDeJuego.mandarCartaAlCementerio(cartaAtacada);
			this.areaDeJuego.removerMonstruoDeRegion(cartaAtacada.obtenerNombre());
		}
		
		else if(cartaAtacada.tieneMismosCantidadDePuntosQue(cartaEnemiga)){
			
			areaDeJuegoOponente.mandarCartaAlCementerio(cartaEnemiga);
			areaDeJuegoOponente.removerMonstruoDeRegion(cartaEnemiga.obtenerNombre());
			this.areaDeJuego.mandarCartaAlCementerio(cartaAtacada);
			this.areaDeJuego.removerMonstruoDeRegion(cartaAtacada.obtenerNombre());
		}
		
		else{
			areaDeJuegoOponente.mandarCartaAlCementerio(cartaEnemiga);
			areaDeJuegoOponente.removerMonstruoDeRegion(cartaEnemiga.obtenerNombre());
		}
	}

	public boolean cartaEstaEnCementerio(String unNombreDeCarta) {
		return this.areaDeJuego.cartaEstaEnElCementerio(unNombreDeCarta);
	}

	public int puntosDeVida() {

		return this.puntosDeVida;
	}

	public void agujeroNegro() {
		
		this.areaDeJuego.agujeroNegro();
		
	}
		
}

