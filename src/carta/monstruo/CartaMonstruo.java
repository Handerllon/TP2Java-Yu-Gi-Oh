package carta.monstruo;

import carta.Carta;
import carta.Modo;
import carta.ModoDefensa;

public class CartaMonstruo extends Carta
{
    protected int puntosAtaque;
    protected int puntosDefensa;
    protected int nivel;
    protected Modo modo;

    public CartaMonstruo()
    {
        this.modo = new ModoDefensa();
    }

    public void establecerModo(Modo modoNuevo)
    {
        this.modo = modoNuevo;
    }

    public void cambiarModo()
    {
        this.modo.cambiarModo(this);
    }

    public void atacar(CartaMonstruo cartaAAtacar){

    }
}
	


