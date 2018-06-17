package carta.monstruo;

import carta.Carta;
import carta.Modo;
import carta.ModoAtaque;
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

    public void ponerEnAtaque()
    {
        this.modo = new ModoAtaque();
    }

    public boolean estaEnAtaque()
    {

        return this.modo instanceof ModoAtaque;

    }

    public void ponerEnDefensa()
    {

        this.modo = new ModoDefensa();
    }

    public boolean estaEnDefensa()
    {

        return this.modo instanceof ModoDefensa;

    }

    public boolean muereAnte(CartaMonstruo cartaEnemiga)
    {
        if (this.estaEnAtaque())
            return (this.puntosAtaque < cartaEnemiga.obtenerPuntosDeAtaque());
        else
            return (this.puntosDefensa <= cartaEnemiga.obtenerPuntosDeAtaque());
    }

    public int obtenerPuntosDeAtaque()
    {

        return this.puntosAtaque;
    }

    public int verificarDanioAJugador(CartaMonstruo cartaEnemiga)
    {
        if (this.estaEnDefensa())
            return 0;
        else
            return (cartaEnemiga.obtenerPuntosDeAtaque() - this.puntosAtaque);
    }

    public boolean tieneMismosCantidadDePuntosQue(CartaMonstruo cartaEnemiga)
    {

        return (this.puntosAtaque == cartaEnemiga.obtenerPuntosDeAtaque());
    }


}
	


