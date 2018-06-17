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
        CartaMonstruo cartaJugador = new CharcoalInpachi();
        CartaMonstruo cartaOponente = new GaiaTheFierceKnight();

        Jugador jugador = new Jugador("J");
        Jugador oponente = new Jugador("O");

        Tablero tableroJuego = new Tablero(jugador, oponente);

        jugador.agregarATablero(tableroJuego);
        oponente.agregarATablero(tableroJuego);

        cartaJugador.cambiarModo();
        jugador.agregarAreaDeCartas(cartaJugador);

        cartaOponente.cambiarModo();
        oponente.agregarAreaDeCartas(cartaOponente);

        jugador.atacar(cartaJugador, cartaOponente);

        assertTrue(jugador.getPuntosDeVida() == (8000-2200));
    }

    @Test
    public void test07JugadorAtacaAMonstruoEnPosicionDeAtaqueConMenorAtaqueQueElDelJugador()
    {
    }

    @Test
    public void test08JugadorAtacaAMonstruoEnPosicionDeAtaqueConIgualAtaqueQueElDelJugador()
    {
    }

    @Test
    public void test09JugadorAtacaMonstruoEnPosicionDeDefensaConMenorDefensaQueElAtaqueDelMismo()
    {

    }

    @Test
    public void test10JugadorAtacaMonstruoEnPosicionDeDefensaConMayorDefensaQueElAtaqueDelMismo()
    {
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