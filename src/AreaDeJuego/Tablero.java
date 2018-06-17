package AreaDeJuego;

import AlGoOh.Jugador;
import carta.monstruo.CartaMonstruo;

public class Tablero
{

    private AreaDeCartas areaDeCartasJugador;
    private AreaDeCartas areaDeCartasOponente;
    private Jugador jugador;
    private Jugador oponente;

    public Tablero(Jugador jugador, Jugador oponente)
    {

        this.areaDeCartasJugador = jugador.areaDeCartas();
        this.areaDeCartasOponente = oponente.areaDeCartas();

        this.jugador = jugador;
        this.oponente = oponente;

    }

    public void atacarOponente(CartaMonstruo cartaJugador, CartaMonstruo cartaOponente)
    {
        int puntosJugador;
        int puntosOponente;
        int diferenciaPuntos;

        puntosJugador = cartaJugador.getPuntos();
        puntosOponente = cartaOponente.getPuntos();
        diferenciaPuntos = puntosJugador - puntosOponente;

        if (cartaJugador.enAtaque() && cartaOponente.enAtaque())
        {
            if (diferenciaPuntos > 0)
            {
                // cartaOponente al cementerio.
                oponente.restarVida(Math.abs(diferenciaPuntos));
            }
            if (diferenciaPuntos < 0)
            {
                // cartaJugador al cementerio.
                jugador.restarVida(Math.abs(diferenciaPuntos));
            }
            if (diferenciaPuntos == 0)
            {
                // cartaOponente al cementerio.
                // cartaJugador al cementerio.
            }
        }

        if (cartaJugador.enAtaque() && cartaOponente.enDefensa())
        {
            if (diferenciaPuntos > 0)
            {
                // cartaOponente al cementerio.
            }
            if (diferenciaPuntos < 0)
            {
                jugador.restarVida(Math.abs(diferenciaPuntos));
            }
            if (diferenciaPuntos == 0)
            {
                // No pasa nada.
            }
        }
    }
}
