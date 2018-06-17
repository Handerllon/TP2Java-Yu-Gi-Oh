package carta;

import carta.monstruo.CartaMonstruo;

public abstract class Modo
{
    protected int puntos;

    public void cambiarModo(CartaMonstruo carta){
        carta.establecerModo(new ModoAtaque());
    }

    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
}
