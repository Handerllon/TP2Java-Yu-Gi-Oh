package AlGoOh;

import AreaDeJuego.AreaDeCartas;
import carta.Mano;
import carta.Mazo;
import carta.monstruo.CartaMonstruo;

public class Jugador
{

    private String nombre;
    private Mazo mazo;
    private Mano cartasEnMano;
    private int puntosDeVida;
    private AreaDeCartas areaDeCartas;

    public Jugador(String unNombre)
    {

        this.nombre = unNombre;

        int cantidadCartasInicialesMazo = 40;
        this.mazo = new Mazo(cantidadCartasInicialesMazo);

        int cartasATomarInicialmente = 5;
        this.cartasEnMano = new Mano(cartasATomarInicialmente);

        int puntosDeVidaIniciales = 8000;
        this.puntosDeVida = puntosDeVidaIniciales;

        this.areaDeCartas = new AreaDeCartas(this);

//        for (int i = 0; i < cartasATomarInicialmente; i++)
//        {
//            this.cartasEnMano.agregarCarta(mazo.agarrarCarta());
//        }

    }

    public int puntosDeVida()
    {

        return this.puntosDeVida;
    }


    public void agregarAreaDeCartas(CartaMonstruo cartaJugador)
    {
        areaDeCartas.agregarCarta(cartaJugador);
    }

    public void atacar(CartaMonstruo cartaJugador, CartaMonstruo cartaOponente){
        // Terminar de pasar.
    }
}

