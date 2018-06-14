package clases;

import org.junit.Test;

import areaDeJuego.AreaDeJuego;
import cartas.CartaMonstruo;

import static org.junit.Assert.assertTrue;

public class JugadorTest {

    @Test
    public void test01SeColocaUnaCartaMonstruoEnAtaqueYLaMismaQuedaEnAtaque() {
    	
    	Jugador jugador = new Jugador("Jugador 1");
    	
    	CartaMonstruo unaCartaMonstruo = new CartaMonstruo ("Monstruo Malo", 10, 40, 20);
    	
    	jugador.juegaUnaCartaMonstruo (unaCartaMonstruo);
    	 	
    	
        assertTrue(0 == 0);
    }

    @Test
    public void test02SeColocaUnaCartaMonstruoEnDefensaYLaMismaQuedaEnDefensa() {
        assertTrue(0 == 0);
    }//Colocar un monstruo en posición de defensa

    @Test
    public void test03ColocarCartaMagicaEnCampoBocaAbajoNoActivaEfecto() {
        assertTrue(0 == 0);
    }//Colocar una carta mágica en el campo boca abajo (no activa ningún efecto)

    @Test
    public void test04ColocarCartaTrampaEnCampoBocaAbajoNoActivaEfecto() {
        assertTrue(0 == 0);
    }//Colocar una carta trampa en el campo boca abajo

    @Test
    public void test05MandarUnaCartaAlCementerioSeQuedaEnCementerio() {
        assertTrue(0 == 0);
    }//Mandar una carta al cementerio (sinónimo de destruir) y verificar que estén ahí.

    @Test
    public void test06() {
        assertTrue(0 == 0);
    }/*Se coloca un monstruo en el campo, se quiere colocar un monstruo de 5 o 6
    estrellas que requiere sacrificio. se verifica que se convocó al monstruo y se
    destruyó el primero.*/

    @Test
    public void test07() {
        assertTrue(0 == 0);
    }/*Se colocan 2 monstruos en el campo, se quiere colocar un monstruo de 7 o más
    estrellas que requiere 2 sacrificios. se verifica que se convocó al monstruo y se
    destruyeron los demás.*/
}