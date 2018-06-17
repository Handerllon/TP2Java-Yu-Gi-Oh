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
        this.jugador = jugador;
        this.oponente = oponente;

        this.inicializarAreas();
    }

    private void inicializarAreas(){
        this.areaDeCartasJugador = this.jugador.areaDeCartas();
        this.areaDeCartasOponente = this.oponente.areaDeCartas();
    }

    // Esto cambia el estado del tablero. Podríamos abastaernos.
    public void cambiarTurno(){
        Jugador tempJugador = this.jugador;

        this.jugador = this.oponente;
        this.oponente = tempJugador;

        this.inicializarAreas();
    }

    public void atacarOponente(CartaMonstruo cartaJugador, CartaMonstruo cartaOponente)
    {
        int diferenciaPuntos = cartaJugador.getPuntos() - cartaOponente.getPuntos();

        // Esto capaz se puede hacer de una forma más elegante y prolija.
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
