package cartas;

import clases.Orientacion;
import clases.OrientacionAbajo;

public class CartaTrampa extends Carta{
	
	private Orientacion orientacion; 
	
	public CartaTrampa (String unNombre){
		
		nombre = unNombre;
		this.orientacion = new OrientacionAbajo();
		
	}

	public void ponerBocaAbajo() {
		
		this.orientacion = new OrientacionAbajo();
		
	}
	
	public boolean estaBocaAbajo() {
		
		return this.orientacion instanceof OrientacionAbajo;
	}
}
