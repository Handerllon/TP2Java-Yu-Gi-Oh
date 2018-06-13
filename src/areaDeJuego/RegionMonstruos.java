package areaDeJuego;

import java.util.HashMap;

import cartas.CartaMonstruo;

public class RegionMonstruos {
	
	private HashMap <String, CartaMonstruo> cartasMonstruos;
	

public RegionMonstruos() {
	
	cartasMonstruos = new HashMap <String, CartaMonstruo>();

	}


public void colocarCartaMonstruo(CartaMonstruo unaCartaMonstruo) {
	
	cartasMonstruos.put(unaCartaMonstruo.obtenerNombreDeCarta(), unaCartaMonstruo);
	
	}

}
