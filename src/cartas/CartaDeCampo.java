package cartas;

import clases.Efecto;
import clases.EfectoNulo;
import clases.Orientacion;
import clases.OrientacionAbajo;

public class CartaDeCampo extends Carta {

	private Efecto efecto;
	private Orientacion orientacion;
	
	public CartaDeCampo (String unNombre){
		
		this.nombre = unNombre;
		this.efecto = new EfectoNulo();
		this.orientacion = new OrientacionAbajo();
		
	}
	
	
}
