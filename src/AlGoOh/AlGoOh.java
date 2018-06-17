package AlGoOh;

import AreaDeJuego.Tablero;
import Jugador;

public class AlGoOh
{

    private Tablero tablero;
    private Jugador jugador;
    private Jugador oponente;
    private Enfrentamiento enfrentamiento;

    public AlGoOh()
    {

        this.enfrentamiento = new Enfrentamiento();

    }

    public void inicializarJuego(String nombreJugador, String nombreOponente)
    {

        this.jugador = new Jugador(nombreJugador);
        this.oponente = new Jugador(nombreOponente);

        this.crearTablero(this.jugador, this.oponente);

    }

    private void crearTablero(Jugador jugador, Jugador oponente)
    {

        this.tablero = new Tablero(jugador, oponente);

    }

    public Jugador obtenerJugador(){
        return this.jugador;
    }
}