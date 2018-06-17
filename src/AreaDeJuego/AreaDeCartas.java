package AreaDeJuego;

import AlGoOh.Jugador;
import carta.Carta;
import carta.magica.CartaMagica;
import carta.monstruo.CartaMonstruo;

import java.util.ArrayList;

public class AreaDeCartas
{

    private RegionMonstruos regionMonstruos;
    private RegionMagicasYTrampas regionMagicasYTrampas;
    private RegionCampo regionCampo;
    private Cementerio cementerio;
    private Jugador jugadorAsociado;


    public AreaDeCartas(Jugador jugador)
    {

        this.regionMonstruos = new RegionMonstruos();

        this.regionMagicasYTrampas = new RegionMagicasYTrampas();

        this.regionCampo = new RegionCampo();

        this.cementerio = new Cementerio();

        this.jugadorAsociado = jugador;
    }

    public Carta obtenerCarta(String nombreDeMonstruo)
    {
        Carta carta;
        carta = this.regionMonstruos.obtenerCarta(nombreDeMonstruo);
        return carta;

    }

    public void enviarAlCementerio(Carta carta)
    {
        this.cementerio.colocarCarta(carta);
    }

    public void enviarTodosMonstruosAlCementerio()
    {
        ArrayList<Carta> cartas = this.regionMonstruos.obtenerCartas();

        cartas.forEach(item -> this.enviarAlCementerio(item));

        this.regionMonstruos.removerTodasLasCartas();
    }

    public boolean cartaEstaEnCementerio(String unNombreDeCarta)
    {
        return this.cementerio.contieneCarta(unNombreDeCarta);
    }

    public void agregarCarta(CartaMonstruo carta)
    {
        regionMonstruos.colocarCarta(carta);
    }

    public void agregarCarta(CartaMagica cartaJugador)
    {
        regionMagicasYTrampas.colocarCarta(cartaJugador);
    }


}
