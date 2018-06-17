package carta;

import carta.monstruo.CartaMonstruo;

public class ModoDefensa extends Modo
{

    public void cambiarModo(CartaMonstruo carta)
    {
        carta.establecerModo(new ModoAtaque());
    }
}
