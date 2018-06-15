package AlGoOh;

import clases.Jugador;

public class AlGoOh {
    
	private Tablero tablero;
	private Jugador jugador1;
	private Jugador jugador2;
	private Enfrentamiento enfrentamiento;
	
	public AlGoOh(){
		
		this.enfrentamiento = new Enfrentamiento();
		
	}
	
	public void iniciarJuego (String nombreJugador, String nombreOponente){
		
		this.jugador1 = new Jugador(nombreJugador);
		this.jugador2 = new Jugador(nombreOponente);
		
		this.crearTablero(this.jugador1,this.jugador2);
	
	}
	
	private void crearTablero(Jugador jugador, Jugador oponente){
		
		this.tablero = new Tablero(jugador, oponente);
		
	}
	
	
}