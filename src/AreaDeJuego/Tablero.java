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
        int diferenciaPuntos = cartaJugador.getPuntos() - cartaOponente.getPuntos();

        if (cartaJugador.enAtaque() && cartaOponente.enAtaque())
        {
            if (diferenciaPuntos > 0)
            {
                areaDeCartasOponente.mandarAlCementerio(cartaOponente);
                oponente.restarVida(Math.abs(diferenciaPuntos));
            }
            if (diferenciaPuntos < 0)
            {
                areaDeCartasJugador.mandarAlCementerio(cartaJugador);
                jugador.restarVida(Math.abs(diferenciaPuntos));
            }
            if (diferenciaPuntos == 0)
            {
                areaDeCartasOponente.mandarAlCementerio(cartaOponente);
                areaDeCartasJugador.mandarAlCementerio(cartaJugador);
            }
        }

        if (cartaJugador.enAtaque() && cartaOponente.enDefensa())
        {
            if (diferenciaPuntos > 0)
            {
                areaDeCartasOponente.mandarAlCementerio(cartaOponente);
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
