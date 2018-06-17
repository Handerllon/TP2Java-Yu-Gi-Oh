package carta;

import java.util.ArrayList;
import java.util.Stack;

public class Mazo
{
    private Stack<Carta> cartas;
    private int cantidadCartas = 0;

    public Mazo(int cantidadCartas)
    {
        this.cantidadCartas = cantidadCartas;
        this.cartas = new Stack<Carta>();

        FabricaCartas fabricaCartas = new FabricaCartas();
        ArrayList<String> nombresMonstruosNormales = fabricaCartas.obtenerNombresMonstruosNormales();
        ArrayList<String> nombresMonstruosNoNormales = fabricaCartas.obtenerNombresMonstruosNoNormales();
        ArrayList<String> nombresMagicas = fabricaCartas.obtenerNombresMagicas();
        ArrayList<String> nombresCampo = fabricaCartas.obtenerNombresCampo();
        ArrayList<String> nombresTrampas = fabricaCartas.obtenerNombresTrampas();

        int cantidadPorAgregar = this.cantidadCartas;

        for (int i = 0; i < nombresMonstruosNoNormales.size() && cantidadPorAgregar > 0; i++)
        {
            cartas.push(fabricaCartas.obtenerCarta(nombresMonstruosNoNormales.get(i)));
            cantidadPorAgregar--;
        }
        for (int i = 0; i < nombresMagicas.size() && cantidadPorAgregar > 0; i++)
        {
            cartas.push(fabricaCartas.obtenerCarta(nombresMagicas.get(i)));
            cantidadPorAgregar--;
        }
        for (int i = 0; i < nombresCampo.size() && cantidadPorAgregar > 0; i++)
        {
            cartas.push(fabricaCartas.obtenerCarta(nombresCampo.get(i)));
            cantidadPorAgregar--;
        }
        for (int i = 0; i < nombresTrampas.size() && cantidadPorAgregar > 0; i++)
        {
            cartas.push(fabricaCartas.obtenerCarta(nombresTrampas.get(i)));
            cantidadPorAgregar--;
        }

        // Agrego todas las que se pueden repetir.
        for (int i = 0; i < cantidadPorAgregar; i++)
        {
            cartas.push(fabricaCartas.obtenerCarta(nombresMonstruosNormales.get(i)));
        }

        this.mezclar();
    }

    private void mezclar()
    {
        Stack<Carta> mazoTemporal = new Stack<Carta>();
        while (!this.cartas.isEmpty())
        {
            int loc = (int) (Math.random() * cantidadCartas);
            mazoTemporal.push(this.cartas.get(loc));
            this.cartas.remove(loc);
        }
        this.cartas = mazoTemporal;
    }

    public Carta agarrarCarta()
    {
        if (cantidadCartas > 0)
        {
            cantidadCartas--;
            Carta carta = cartas.pop();
            return carta;
        } else
            // Podría ser un evento que notifique que el jugador se quedó sin cartas en el mazo y perdió el juego.
            throw new MazoVacio();
    }
}
