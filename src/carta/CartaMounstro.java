package carta;

public class CartaMounstro extends Carta{

	private int nivel;
	private int ataque;
	private int defensa;
	//Boca arriba o abajo, seguramente haya que cambiarlo a una entidad mas adelante
	private String estadoDeCarta;
	private String orientacionDeCarta;

	public CartaMounstro(String unNombre, int unNivel, int unAtaque, int unaDefensa){
		
		this.nombre = unNombre;
		this.nivel = unNivel;
		this.ataque = unAtaque;
		this.defensa = unaDefensa;
		//Boca abajo
		this.estadoDeCarta = "BocaAbajo";
		
	}
	
	public void darVueltaCarta(){
		
		this.estadoDeCarta = "BocaArriba";
		
	}
	
	
}
