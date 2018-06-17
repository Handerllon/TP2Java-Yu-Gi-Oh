package AlGoOh;

import AlGoOh.excepciones.JugadorSinVida;
import AreaDeJuego.AreaDeCartas;
import AreaDeJuego.Tablero;
import carta.Mano;
import carta.Mazo;
import carta.magica.CartaMagica;
import carta.monstruo.CartaMonstruo;

public class Jugador
{

    private String nombre;
    private Mazo mazo;
    private Mano cartasEnMano;
    private int puntosDeVida;
    private AreaDeCartas areaDeCartas;
    private Tablero tablero;

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

    public void definirTablero(Tablero tablero)
    {
        this.tablero = tablero;
    }

    public int getPuntosDeVida()
    {
        return this.puntosDeVida;
    }

    public void restarVida(int puntosARestar)
    {
        this.puntosDeVida -= puntosARestar;
        if (this.puntosDeVida <= 0)
            throw new JugadorSinVida();
    }

    public AreaDeCartas areaDeCartas()
    {
        return this.areaDeCartas;
    }


    public void agregarCartaAAreaDeCartas(CartaMonstruo cartaJugador)
    {
        areaDeCartas.agregarCarta(cartaJugador);
    }

    public void agregarCartaAAreaDeCartas(CartaMagica cartaJugador)
    {
        areaDeCartas.agregarCarta(cartaJugador);
        if(cartaJugador.orientacionArriba()){
            tablero.activarEfectoCartaMagica(cartaJugador);
        }
    }

    public boolean cartaEstaEnCementerio(CartaMonstruo cartaJugador)
    {
        return areaDeCartas.cartaEstaEnCementerio(cartaJugador.obtenerNombre());
    }

    public void atacar(CartaMonstruo cartaJugador, CartaMonstruo cartaOponente)
    {
        tablero.atacarOponente(cartaJugador, cartaOponente);
    }
}

