package carta;

import carta.monstruo.CartaMonstruo;

public class ModoAtaque extends Modo
{
    public void cambiarModo(CartaMonstruo carta)
    {
        carta.establecerModo(new ModoDefensa());
    }
}
