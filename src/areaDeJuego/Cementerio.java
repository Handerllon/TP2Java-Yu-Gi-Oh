package areaDeJuego;

import java.util.HashMap;

import cartas.Carta;

public class Cementerio {
	
	private HashMap <String, Carta> cartas;
	
	public Cementerio() {
		this.cartas = new HashMap <String, Carta>();
		
	}

public void colocarCarta(Carta unaCarta) {
	
	cartas.put(unaCarta.obtenerNombre(), unaCarta);
	
	}

public boolean tieneCarta(String unNombreDeCarta) {
	/*Carta carta = cartas.get(unaCarta.obtenerNombre());
	if(carta != null)
		return true;
	return false;
	*/
	
	return cartas.containsKey(unNombreDeCarta);
}


}
