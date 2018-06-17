package AlGoOh;

import carta.Mano;
import carta.Mazo;

public class Jugador
{

    private String nombre;
    private Mazo mazo;
    private Mano cartasEnMano;
    private int puntosDeVida;

    public Jugador(String unNombre)
    {

        this.nombre = unNombre;

        int cantidadCartasInicialesMazo = 40;
        this.mazo = new Mazo(cantidadCartasInicialesMazo);

        int cartasATomarInicialmente = 5;
        this.cartasEnMano = new Mano(cartasATomarInicialmente);

        int puntosDeVidaIniciales = 8000;
        this.puntosDeVida = puntosDeVidaIniciales;

        for (int i = 0; i < cartasATomarInicialmente; i++)
        {
            this.cartasEnMano.agregarCarta(mazo.agarrarCarta());
        }

    }

    public int puntosDeVida()
    {

        return this.puntosDeVida;
    }


}

