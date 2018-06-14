package areaDeJuego;

import java.util.HashMap;

import cartas.CartaMonstruo;

public class RegionMonstruos {
	
	private HashMap <String, CartaMonstruo> cartasMonstruos;
	

	public RegionMonstruos() {
	
		cartasMonstruos = new HashMap <String, CartaMonstruo>();

	}


	public void colocarCarta(CartaMonstruo unaCartaMonstruo) {
	
		cartasMonstruos.put(unaCartaMonstruo.obtenerNombre(), unaCartaMonstruo);
	
	}


	public CartaMonstruo buscarCarta(String nombreDeMonstruo) {
		
		return cartasMonstruos.get(nombreDeMonstruo);
	}
}
