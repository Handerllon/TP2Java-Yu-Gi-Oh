package AlGoOh;

import AreaDeJuego.Cementerio;
import AreaDeJuego.RegionCampo;
import AreaDeJuego.RegionMonstruos;
import AreaDeJuego.Tablero;
import carta.magica.CartaMagica;
import carta.magica.DarkHole;
import carta.monstruo.AlexandriteDragon;
import carta.monstruo.CartaMonstruo;
import carta.monstruo.CharcoalInpachi;
import carta.monstruo.GaiaTheFierceKnight;
import carta.trampa.CartaTrampa;
import carta.trampa.MagicCylinder;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlGoOhTest
{

    @Test
    public void test01SeColocaUnaCartaMonstruoEnAtaque()
    {
        CartaMonstruo carta = new AlexandriteDragon();
        carta.cambiarModo();

        RegionMonstruos regionMonstruos = new RegionMonstruos();
        regionMonstruos.colocarCarta(carta);
    }

    @Test
    public void test02SeColocaUnaCartaMonstruoEnDefensa()
    {
        CartaMonstruo carta = new AlexandriteDragon();

        RegionMonstruos regionMonstruos = new RegionMonstruos();
        regionMonstruos.colocarCarta(carta);

    }

    @Test
    public void test03ColocarCartaMagicaEnCampoBocaAbajoNoActivaEfecto()
    {
        CartaMagica carta = new DarkHole();
        RegionCampo regionCampo = new RegionCampo();

        regionCampo.colocarCarta(carta);

    }

    @Test
    public void test04ColocarCartaTrampaEnCampoBocaAbajoNoActivaEfecto()
    {
        CartaTrampa carta = new MagicCylinder();
        RegionCampo regionCampo = new RegionCampo();

        regionCampo.colocarCarta(carta);
    }

    @Test
    public void test05MandarUnaCartaAlCementerioSeQuedaEnCementerio()
    {
        CartaMonstruo carta = new AlexandriteDragon();

        Cementerio cementerio = new Cementerio();

        cementerio.colocarCarta(carta);

        assertTrue(cementerio.contieneCarta("Alexandrite Dragon"));

    }

    @Test
    public void test06JugadorAtacaAMonstruoOponenteEnPosicionDeAtaqueConMayorAtaqueQueElDelJugador()
    {
        Jugador jugador1 = new Jugador("J1");
        Jugador jugador2 = new Jugador("J2");

        Tablero tableroJuego = new Tablero(jugador1, jugador2);
        jugador1.agregarATablero(tableroJuego);
        jugador2.agregarATablero(tableroJuego);

        CartaMonstruo cartaJugador1 = new CharcoalInpachi();
        cartaJugador1.cambiarModo();
        jugador1.agregarAreaDeCartas(cartaJugador1);
        tableroJuego.cambiarTurno();

        CartaMonstruo cartaJugador2 = new GaiaTheFierceKnight();
        cartaJugador2.cambiarModo();
        jugador2.agregarAreaDeCartas(cartaJugador2);
        jugador2.atacar(cartaJugador2,cartaJugador1);

        assertTrue(jugador1.getPuntosDeVida() == (8000-2200));

        assertTrue(jugador1.cartaEstaEnCementerio(cartaJugador1));
        assertFalse(jugador2.cartaEstaEnCementerio(cartaJugador2));
    }

    @Test
    public void test07JugadorAtacaAMonstruoEnPosicionDeAtaqueConMenorAtaqueQueElDelJugador()
    {
        Jugador jugador1 = new Jugador("J1");
        Jugador jugador2 = new Jugador("J2");

        Tablero tableroJuego = new Tablero(jugador1, jugador2);
        jugador1.agregarATablero(tableroJuego);
        jugador2.agregarATablero(tableroJuego);

        CartaMonstruo cartaJugador1 = new GaiaTheFierceKnight();
        cartaJugador1.cambiarModo();
        jugador1.agregarAreaDeCartas(cartaJugador1);
        tableroJuego.cambiarTurno();

        CartaMonstruo cartaJugador2 = new CharcoalInpachi();
        cartaJugador2.cambiarModo();
        jugador2.agregarAreaDeCartas(cartaJugador2);
        jugador2.atacar(cartaJugador2,cartaJugador1);

        assertTrue(jugador2.getPuntosDeVida() == (8000-2200));

        assertTrue(jugador2.cartaEstaEnCementerio(cartaJugador2));
        assertFalse(jugador1.cartaEstaEnCementerio(cartaJugador1));
    }

    @Test
    public void test08JugadorAtacaAMonstruoEnPosicionDeAtaqueConIgualAtaqueQueElDelJugador()
    {
        Jugador jugador1 = new Jugador("J1");
        Jugador jugador2 = new Jugador("J2");

        Tablero tableroJuego = new Tablero(jugador1, jugador2);
        jugador1.agregarATablero(tableroJuego);
        jugador2.agregarATablero(tableroJuego);

        CartaMonstruo cartaJugador1 = new GaiaTheFierceKnight();
        cartaJugador1.cambiarModo();
        jugador1.agregarAreaDeCartas(cartaJugador1);
        tableroJuego.cambiarTurno();

        CartaMonstruo cartaJugador2 = new GaiaTheFierceKnight();
        cartaJugador2.cambiarModo();
        jugador2.agregarAreaDeCartas(cartaJugador2);
        jugador2.atacar(cartaJugador2,cartaJugador1);

        assertTrue(jugador1.getPuntosDeVida() == 8000);
        assertTrue(jugador2.getPuntosDeVida() == 8000);

        assertTrue(jugador1.cartaEstaEnCementerio(cartaJugador1));
        assertTrue(jugador2.cartaEstaEnCementerio(cartaJugador2));

    }

    @Test
    public void test09JugadorAtacaMonstruoEnPosicionDeDefensaConMenorDefensaQueElAtaqueDelMismo()
    {
        Jugador jugador1 = new Jugador("J1");
        Jugador jugador2 = new Jugador("J2");

        Tablero tableroJuego = new Tablero(jugador1, jugador2);
        jugador1.agregarATablero(tableroJuego);
        jugador2.agregarATablero(tableroJuego);

        CartaMonstruo cartaJugador1 = new CharcoalInpachi();
        jugador1.agregarAreaDeCartas(cartaJugador1);
        tableroJuego.cambiarTurno();

        CartaMonstruo cartaJugador2 = new GaiaTheFierceKnight();
        cartaJugador2.cambiarModo();
        jugador2.agregarAreaDeCartas(cartaJugador2);
        jugador2.atacar(cartaJugador2,cartaJugador1);

        assertTrue(jugador1.getPuntosDeVida() == 8000);

        assertTrue(jugador1.cartaEstaEnCementerio(cartaJugador1));
        assertFalse(jugador2.cartaEstaEnCementerio(cartaJugador2));
    }

    @Test
    public void test10JugadorAtacaMonstruoEnPosicionDeDefensaConMayorDefensaQueElAtaqueDelMismo()
    {
        Jugador jugador1 = new Jugador("J1");
        Jugador jugador2 = new Jugador("J2");

        Tablero tableroJuego = new Tablero(jugador1, jugador2);
        jugador1.agregarATablero(tableroJuego);
        jugador2.agregarATablero(tableroJuego);

        CartaMonstruo cartaJugador1 = new GaiaTheFierceKnight();
        jugador1.agregarAreaDeCartas(cartaJugador1);
        tableroJuego.cambiarTurno();

        CartaMonstruo cartaJugador2 = new CharcoalInpachi();
        cartaJugador2.cambiarModo();
        jugador2.agregarAreaDeCartas(cartaJugador2);
        jugador2.atacar(cartaJugador2,cartaJugador1);

        assertTrue(jugador1.getPuntosDeVida() == 8000);

        assertFalse(jugador1.cartaEstaEnCementerio(cartaJugador1));
        assertFalse(jugador2.cartaEstaEnCementerio(cartaJugador2));
    }

    @Test
    public void test11SeJuegaAgujeroNegroYMuerenTodosLosMonstruosDeAmbasRegionesYLosPuntosDeVidaQuedanIguales()
    {

    }/*Colocar monstruo en ambos lados del campo. Colocar Agujero negro boca arriba
            (es decir, se activa el efecto). Verificar que se destruyeron todos los monstruo de
    ambos lados del campo, y que nadie recibió daño alguno.*/

    @Test
    public void test12()
    {
        assertTrue(0 == 0);
    }/*Se coloca un monstruo en el campo, se quiere colocar un monstruo de 5 o 6
    estrellas que requiere sacrificio. se verifica que se convocó al monstruo y se
    destruyó el primero.*/

    @Test
    public void test13()
    {
        assertTrue(0 == 0);
    }/*Se colocan 2 monstruo en el campo, se quiere colocar un monstruo de 7 o más
    estrellas que requiere 2 sacrificios. se verifica que se convocó al monstruo y se
    destruyeron los demás.*/
}