package areaDeJuego;

import java.util.HashMap;

import cartas.Carta;
import cartas.CartaMagica;
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

}
