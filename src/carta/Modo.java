package carta;

import carta.monstruo.CartaMonstruo;

public abstract class Modo
{
    public void cambiarModo(CartaMonstruo carta){
        carta.establecerModo(new ModoAtaque());
    }
}
