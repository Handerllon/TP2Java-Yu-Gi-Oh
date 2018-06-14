package areaDeJuego;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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


	public ArrayList<CartaMonstruo> obtenerMonstruos() {
	
		ArrayList<CartaMonstruo> listaDeMonstruos = new ArrayList<CartaMonstruo>(); 
		
		for (Map.Entry<String, CartaMonstruo> entry: cartasMonstruos.entrySet()){
			listaDeMonstruos.add(entry.getValue());
		}
		
		return listaDeMonstruos;
	}


	public void agujeroNegro() {
		
		this.cartasMonstruos.clear();
		
	}
}
