package cartas;

public class CartaMonstruo extends Carta{

	private int nivel;
	private int puntosDeAtaque;
	private int puntosDeDefensa;
	//Boca arriba o abajo, seguramente haya que cambiarlo a una entidad mas adelante
	private String estadoDeCarta;
	private String orientacionDeCarta;

	public CartaMonstruo(String unNombre, int unNivel, int cantPuntosDeAtaque, int cantPuntosDeDefensa){
		
		this.nombre = unNombre;
		this.nivel = unNivel;
		this.puntosDeAtaque = cantPuntosDeAtaque;
		this.puntosDeDefensa = cantPuntosDeDefensa;
		//Boca abajo
		this.estadoDeCarta = "BocaAbajo";
		
	}
	
	public void darVueltaCarta(){
		
		this.estadoDeCarta = "BocaArriba";
		
	}
	

	
}
