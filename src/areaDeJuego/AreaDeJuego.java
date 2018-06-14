package areaDeJuego;

import java.util.ArrayList;

import cartas.Carta;
import cartas.CartaMagica;
import cartas.CartaMonstruo;
import cartas.CartaTrampa;
import clases.Jugador;

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

	public void jugarUnaCarta(CartaMagica unaCartaMagica, Jugador oponente) {
	
		regionMagicasYTrampas.colocarCarta(unaCartaMagica);
		this.efectoAgujeroNegro(oponente);
	}

	private void efectoAgujeroNegro(Jugador oponente) {
		
		if(this.regionMagicasYTrampas.contieneCarta("Agujero Negro")){
			this.agujeroNegro();
			oponente.agujeroNegro();
		}
	}

	public void agujeroNegro() {
		
		ArrayList<CartaMonstruo> cartasMonstruoADestruir = this.regionMonstruos.obtenerMonstruos();
		for (int x = 0 ; x < cartasMonstruoADestruir.size(); x++){
			this.mandarCartaAlCementerio(cartasMonstruoADestruir.get(x));
		}
		this.regionMonstruos.agujeroNegro();
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

	public boolean cartaEstaEnElCementerio (String unNombreDeCarta){
		
		return this.cementerio.tieneCarta(unNombreDeCarta);
	}
}
