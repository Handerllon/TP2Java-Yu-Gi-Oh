package carta;

public class Carta
{

    protected String nombre;
    protected Orientacion orientacion;

    public Carta()
    {
        this.orientacion = new OrientacionAbajo();
    }

    public String obtenerNombre()
    {

        return nombre;
    }

    public void establecerOrientacion(Orientacion orientacion)
    {
        this.orientacion = orientacion;
    }
}
