package carta.monstruo;


import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CartaMonstruoTest
{
    private static final double DELTA = 1e-2;

    @Test
    public void test01CartaMonstruoTienePuntosDeAtaqueCorrectos()
    {
        CartaMonstruo carta = new GaiaTheFierceKnight();

        assertTrue(carta.getPuntos() == 2100);
    }

    @Test
    public void test01CartaMonstruoTienePuntosDeDefensaCorrectos()
    {
        CartaMonstruo carta = new GaiaTheFierceKnight();
        carta.cambiarModo();

        assertTrue(carta.getPuntos() == 2300);
    }

}