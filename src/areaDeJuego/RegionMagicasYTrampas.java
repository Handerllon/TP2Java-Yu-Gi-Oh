package areaDeJuego;

import java.util.HashMap;

import cartas.Carta;
import cartas.CartaMagica;
import cartas.CartaMonstruo;
import cartas.CartaTrampa;


public class RegionMagicasYTrampas {
	
	private HashMap <String, Carta> cartasMagicasYTrampas;
	


	public RegionMagicasYTrampas() {
		
		cartasMagicasYTrampas = new HashMap <String, Carta>();
		
		}

	public void colocarCarta(CartaMagica unaCartaMagica) {
		
		cartasMagicasYTrampas.put(unaCartaMagica.obtenerNombre(), unaCartaMagica);
		
		}

	public void colocarCarta(CartaTrampa unaCartaTrampa) {

		cartasMagicasYTrampas.put(unaCartaTrampa.obtenerNombre(), unaCartaTrampa);
		
	}
	
	public boolean contieneCarta(String nombreDeCarta) {
		
		return cartasMagicasYTrampas.containsKey(nombreDeCarta);
	}

}
