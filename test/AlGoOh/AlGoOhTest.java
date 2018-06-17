package AlGoOh;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AlGoOhTest
{

    @Test
    public void test01SeColocaUnaCartaMonstruoEnAtaqueYLaMismaQuedaEnAtaque()
    {
        AlGoOh juego = new AlGoOh();
        juego.inicializarJuego("J1","J2");

        juego.obtenerJugador();

    }

    @Test
    public void test02SeColocaUnaCartaMonstruoEnDefensaYLaMismaQuedaEnDefensa()
    {

    }

    @Test
    public void test03ColocarCartaMagicaEnCampoBocaAbajoNoActivaEfecto()
    {


    }

    @Test
    public void test04ColocarCartaTrampaEnCampoBocaAbajoNoActivaEfecto()
    {

    }

    @Test
    public void test05MandarUnaCartaAlCementerioSeQuedaEnCementerio()
    {

    }

    @Test
    public void test06JugadorAtacaAMonstruoEnPosicionDeAtaqueConMayorAtaqueQueElDelJugador()
    {

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