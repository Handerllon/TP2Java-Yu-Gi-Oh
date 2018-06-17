package areaDeJuego;

import carta.Carta;
import clases.Jugador;

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

    public void mandarAlCementerio(Carta carta)
    {
        this.cementerio.colocarCarta(carta);
    }

    public boolean cartaEstaEnElCementerio(String unNombreDeCarta)
    {

        return this.cementerio.contieneCarta(unNombreDeCarta);
    }

}
