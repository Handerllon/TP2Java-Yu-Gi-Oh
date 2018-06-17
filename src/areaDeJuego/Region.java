package areaDeJuego;

import carta.Carta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Region
{
    protected HashMap<String, Carta> cartas;

    public void colocarCarta(Carta carta)
    {
        cartas.put(carta.obtenerNombre(), carta);
    }

    public Carta obtenerCarta(String nombre)
    {
        return cartas.get(nombre);
    }

    public boolean contieneCarta(String nombreDeCarta)
    {

        return cartas.containsKey(nombreDeCarta);
    }

    public Carta removerCarta(String nombre)
    {
        return this.cartas.remove(nombre);
    }

    public ArrayList<Carta> obtenerCartas()
    {

        ArrayList<Carta> listaDeCartas = new ArrayList<Carta>();

        for (Map.Entry<String, Carta> entry : cartas.entrySet())
        {
            listaDeCartas.add(entry.getValue());
        }

        return listaDeCartas;
    }
}
