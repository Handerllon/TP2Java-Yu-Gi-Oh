package cartas;

import clases.Modo;
import clases.ModoAtaque;
import clases.ModoDefensa;

public class CartaMonstruo extends Carta{

	private int nivel;
	private int puntosDeAtaque;
	private int puntosDeDefensa;
	//Boca arriba o abajo, seguramente haya que cambiarlo a una entidad mas adelante
	private String estadoDeCarta;
	private Modo modo;

	public CartaMonstruo(String unNombre, int unNivel, int cantPuntosDeAtaque, int cantPuntosDeDefensa){
		
		this.nombre = unNombre;
		this.nivel = unNivel;
		this.puntosDeAtaque = cantPuntosDeAtaque;
		this.puntosDeDefensa = cantPuntosDeDefensa;
		this.modo = new ModoDefensa();
		
		
	}
	
	public void ponerEnAtaque() {
		
		this.modo = new ModoAtaque();
	}
	
	public boolean estaEnAtaque() {
		
		return this.modo instanceof ModoAtaque;	

	}

	public void ponerEnDefensa() {
		
		this.modo = new ModoDefensa();
	}
	
	public boolean estaEnDefensa() {
		
		return this.modo instanceof ModoDefensa;	

	}

	public boolean muereAnte(CartaMonstruo cartaEnemiga) {
		if (this.estaEnAtaque())
			return (this.puntosDeAtaque < cartaEnemiga.obtenerPuntosDeAtaque());
		else 
			return (this.puntosDeDefensa <= cartaEnemiga.obtenerPuntosDeAtaque());
	}

	public int obtenerPuntosDeAtaque() {
		
		return this.puntosDeAtaque;
	}

	public int verificarDanioAJugador(CartaMonstruo cartaEnemiga) {
		if (this.estaEnDefensa())
			return 0;
		else
			return (cartaEnemiga.obtenerPuntosDeAtaque() - this.puntosDeAtaque);
	}

	public boolean tieneMismosCantidadDePuntosQue(CartaMonstruo cartaEnemiga) {
		
		return (this.puntosDeAtaque == cartaEnemiga.obtenerPuntosDeAtaque());
	}
}
	


