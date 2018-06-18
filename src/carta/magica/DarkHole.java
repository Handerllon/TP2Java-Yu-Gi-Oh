package carta.magica;

import AreaDeJuego.Tablero;
import carta.Efecto;

public class DarkHole extends CartaMagica implements Efecto
{
    public void efecto(Tablero tablero)
    {
        tablero.destruirMonstruosJugador();
        tablero.destruirMonstruosOponente();
    }
}
