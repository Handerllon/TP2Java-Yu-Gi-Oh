package areaDeJuego;

import java.util.HashMap;

import cartas.CartaDeCampo;

public class RegionCampo {
	
	private HashMap <String, CartaDeCampo> cartasCampo;
	

public RegionCampo() {
	
	cartasCampo = new HashMap <String, CartaDeCampo>();

	}


public void colocarCarta(CartaDeCampo unaCartaDeCampo) {
	
	cartasCampo.put(unaCartaDeCampo.obtenerNombre(), unaCartaDeCampo);
	
	}

}
