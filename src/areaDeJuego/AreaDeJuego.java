package areaDeJuego;

import cartas.CartaMonstruo;

public class AreaDeJuego {
	
	private RegionMonstruos regionMonstruos;
	private RegionMagicas regionMagicas;
	private RegionCampo regionCampo;
	private Cementerio cementerio; 
	

public AreaDeJuego() {
	
	this.regionMonstruos = new RegionMonstruos();

	this.regionMagicas = new RegionMagicas();

	this.regionCampo = new RegionCampo();

	this.cementerio = new Cementerio ();
}

public void jugarUnaCartaMonstruo(CartaMonstruo unaCartaMonstruo) {
	
	regionMonstruos.colocarCartaMonstruo(unaCartaMonstruo);
}

}
