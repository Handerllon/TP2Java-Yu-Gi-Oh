package cartas;

import clases.Efecto;
import clases.EfectoNulo;
import clases.Orientacion;
import clases.OrientacionAbajo;
import clases.OrientacionArriba;

public class CartaMagica extends Carta{

	private Orientacion orientacion; 
	private Efecto efecto;
	
	
	public CartaMagica (String unNombre){
		
		this.nombre = unNombre;
		
		this.orientacion = new OrientacionAbajo();
		
		this.efecto = new EfectoNulo();
	}


	public void ponerBocaAbajo() {
		
		this.orientacion = new OrientacionAbajo();
		
	}
	
	public void ponerBocaArriba() {
		
		this.orientacion = new OrientacionArriba();
		
	}


	public boolean estaBocaAbajo() {
		
		return this.orientacion instanceof OrientacionAbajo;
	}
	
}
