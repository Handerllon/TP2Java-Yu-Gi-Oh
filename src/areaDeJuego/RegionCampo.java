package areaDeJuego;

import carta.Carta;

import java.util.HashMap;

public class RegionCampo extends Region
{
    public RegionCampo()
    {
        this.cartas = new HashMap<String, Carta>();
    }

}
