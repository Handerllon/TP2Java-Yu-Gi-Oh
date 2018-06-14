package areaDeJuego;

import cartas.Carta;
import cartas.CartaMagica;
import cartas.CartaMonstruo;
import cartas.CartaTrampa;

public class AreaDeJuego {
	
	private RegionMonstruos regionMonstruos;
	private RegionMagicasYTrampas regionMagicasYTrampas;
	private RegionCampo regionCampo;
	private Cementerio cementerio; 
	

	public AreaDeJuego() {
	
		this.regionMonstruos = new RegionMonstruos();

		this.regionMagicasYTrampas = new RegionMagicasYTrampas();

		this.regionCampo = new RegionCampo();

		this.cementerio = new Cementerio ();
	}

	public void jugarUnaCarta(CartaMonstruo unaCartaMonstruo) {
	
		regionMonstruos.colocarCarta(unaCartaMonstruo);
	}

	public void jugarUnaCarta(CartaMagica unaCartaMagica) {
	
		regionMagicasYTrampas.colocarCarta(unaCartaMagica);
	}

	public void jugarUnaCarta(CartaTrampa unaCartaTrampa) {
	
		regionMagicasYTrampas.colocarCarta(unaCartaTrampa);
	}

	public CartaMonstruo obtenerCarta(String nombreDeMonstruo) {
		
		return (this.regionMonstruos.buscarCarta(nombreDeMonstruo));

	}

	public void mandarCartaAlCementerio(CartaMonstruo unaCarta) {
		
		this.cementerio.colocarCarta(unaCarta);
	}

	public boolean cartaEstaEnElCementerio (Carta unaCarta){
		
		return this.cementerio.tieneCarta(unaCarta);
	}
}
