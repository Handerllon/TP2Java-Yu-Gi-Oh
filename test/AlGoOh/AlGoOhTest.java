package AlGoOh;

import org.junit.Test;

import areaDeJuego.Cementerio;
import cartas.Carta;
import cartas.CartaMagica;
import cartas.CartaMonstruo;
import cartas.CartaTrampa;
import clases.Jugador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlGoOhTest {
	
	@Test
    public void test01SeColocaUnaCartaMonstruoEnAtaqueYLaMismaQuedaEnAtaque() {
    	
    	Jugador jugador = new Jugador("Jugador 1");
    	
    	CartaMonstruo unaCartaMonstruo = new CartaMonstruo ("Monstruo Malo", 10, 40, 20);
    	
    	jugador.ponerEnAtaque(unaCartaMonstruo);
    	
    	jugador.juegaUnaCarta(unaCartaMonstruo);
    	 	
    	
        assertTrue(unaCartaMonstruo.estaEnAtaque());
    }

    @Test
    public void test02SeColocaUnaCartaMonstruoEnDefensaYLaMismaQuedaEnDefensa() {
    	
    	Jugador jugador = new Jugador("Jugador 1");
    	
    	CartaMonstruo unaCartaMonstruo = new CartaMonstruo ("Monstruo Malo", 10, 40, 20);
    	
    	jugador.ponerEnDefensa(unaCartaMonstruo);
    	    	
    	jugador.juegaUnaCarta(unaCartaMonstruo);
    	 	
    	assertTrue(unaCartaMonstruo.estaEnDefensa());
        
    }

    @Test
    public void test03ColocarCartaMagicaEnCampoBocaAbajoNoActivaEfecto() {
    	
    	Jugador jugador = new Jugador("Jugador 1");
    	
    	CartaMagica unaCartaMagica = new CartaMagica ("Monster Reborn");
    	
      	jugador.ponerBocaAbajo(unaCartaMagica);
    	
    	jugador.juegaUnaCarta(unaCartaMagica);
      	
      		 	
    	assertTrue(unaCartaMagica.estaBocaAbajo());
 	

    }

    @Test
    public void test04ColocarCartaTrampaEnCampoBocaAbajoNoActivaEfecto() {
    	
    	Jugador jugador = new Jugador("Jugador 1");
    	
    	CartaTrampa unaCartaTrampa = new CartaTrampa ("Carta Tramposa");
    	
      	jugador.ponerBocaAbajo(unaCartaTrampa);
    	
    	jugador.juegaUnaCarta(unaCartaTrampa);
      	
      		 	
    	assertTrue(unaCartaTrampa.estaBocaAbajo());
    	
    }
    @Test
    public void test05MandarUnaCartaAlCementerioSeQuedaEnCementerio() {
    	Carta unaCarta = new Carta();
    	Cementerio cementerio = new Cementerio();
    	
    	cementerio.colocarCarta(unaCarta);
    	
        assertTrue(cementerio.tieneCarta(unaCarta));
        
    }

    @Test
    public void test06JugadorAtacaAMonstruoEnPosicionDeAtaqueConMayorAtaqueQueElDelJugador() {
    	Jugador jugador1 = new Jugador("Jugador 1");
    	Jugador jugador2 = new Jugador("Jugador 2");
    	
    	jugador1.establecerOponente(jugador2);
    	jugador2.establecerOponente(jugador1);
    	
    	CartaMonstruo unaCartaMonstruo1 = new CartaMonstruo ("Monstruo Bueno", 1, 1000, 500);
    	CartaMonstruo unaCartaMonstruo2 = new CartaMonstruo ("Monstruo Malo", 1, 2000, 800);
    	
    	jugador1.ponerEnAtaque(unaCartaMonstruo1);
    	jugador1.juegaUnaCarta(unaCartaMonstruo1);
    	
    	jugador2.ponerEnAtaque(unaCartaMonstruo2);
    	jugador2.juegaUnaCarta(unaCartaMonstruo2);
    	
    	jugador1.atacar("Monstruo Bueno", "Monstruo Malo");
    	
    	//Si se ataca a un monstruo con mayor ataque al que esta atacando, el jugador que ataco 
    	//no recibe danio a sus puntos de vida
    	int puntosDeVidaRestantesEsperadosParaJugador2 = 8000;
    	
    	assertTrue(jugador1.cartaEstaEnCementerio("Monstruo Bueno"));
    	assertEquals (puntosDeVidaRestantesEsperadosParaJugador2, jugador2.puntosDeVida());
    	
    }

    @Test
    public void test07JugadorAtacaAMonstruoEnPosicionDeAtaqueConMenorAtaqueQueElDelJugador() {
    	Jugador jugador1 = new Jugador("Jugador 1");
    	Jugador jugador2 = new Jugador("Jugador 2");
    	
    	jugador1.establecerOponente(jugador2);
    	jugador2.establecerOponente(jugador1);
    	
    	CartaMonstruo unaCartaMonstruo1 = new CartaMonstruo ("Monstruo Bueno", 1, 1000, 500);
    	CartaMonstruo unaCartaMonstruo2 = new CartaMonstruo ("Monstruo Malo", 1, 2000, 800);
    	
    	jugador1.ponerEnAtaque(unaCartaMonstruo1);
    	jugador1.juegaUnaCarta(unaCartaMonstruo1);
    	
    	jugador2.ponerEnAtaque(unaCartaMonstruo2);
    	jugador2.juegaUnaCarta(unaCartaMonstruo2);
    	
    	jugador2.atacar("Monstruo Malo", "Monstruo Bueno");
    	
    	int puntosDeVidaRestantesEsperadosParaJugador1 = 8000 - (2000-1000);
    	
    	assertTrue(jugador1.cartaEstaEnCementerio("Monstruo Bueno"));
    	assertEquals (puntosDeVidaRestantesEsperadosParaJugador1, jugador1.puntosDeVida());
    }

    @Test
    public void test08JugadorAtacaAMonstruoEnPosicionDeAtaqueConIgualAtaqueQueElDelJugador() {
    	Jugador jugador1 = new Jugador("Jugador 1");
    	Jugador jugador2 = new Jugador("Jugador 2");
    	
    	jugador1.establecerOponente(jugador2);
    	jugador2.establecerOponente(jugador1);
    	
    	CartaMonstruo unaCartaMonstruo1 = new CartaMonstruo ("Monstruo Bueno", 1, 1000, 500);
    	CartaMonstruo unaCartaMonstruo2 = new CartaMonstruo ("Monstruo Malo", 1, 1000, 800);
    	
    	jugador1.ponerEnAtaque(unaCartaMonstruo1);
    	jugador1.juegaUnaCarta(unaCartaMonstruo1);
    	
    	jugador2.ponerEnAtaque(unaCartaMonstruo2);
    	jugador2.juegaUnaCarta(unaCartaMonstruo2);
    	
    	jugador1.atacar("Monstruo Bueno", "Monstruo Malo");
    	
    	int puntosDeVidaRestantesEsperadosParaJugador1 = 8000;
    	int puntosDeVidaRestantesEsperadosParaJugador2 = 8000;
    	
    	assertTrue(jugador1.cartaEstaEnCementerio("Monstruo Bueno"));
    	assertTrue(jugador2.cartaEstaEnCementerio("Monstruo Malo"));
    	assertEquals (puntosDeVidaRestantesEsperadosParaJugador1, jugador1.puntosDeVida());
    	assertEquals (puntosDeVidaRestantesEsperadosParaJugador2, jugador2.puntosDeVida());
    }
    @Test
    public void test09JugadorAtacaMonstruoEnPosicionDeDefensaConMenorDefensaQueElAtaqueDelMismo() {
    	Jugador jugador1 = new Jugador("Jugador 1");
    	Jugador jugador2 = new Jugador("Jugador 2");
    	
    	jugador1.establecerOponente(jugador2);
    	jugador2.establecerOponente(jugador1);
    	    	
    	CartaMonstruo unaCartaMonstruo1 = new CartaMonstruo ("Monstruo Bueno", 1, 1000, 500);
    	CartaMonstruo unaCartaMonstruo2 = new CartaMonstruo ("Monstruo Malo", 1, 2000, 800);
    	
    	jugador1.ponerEnDefensa(unaCartaMonstruo1);
    	jugador1.juegaUnaCarta(unaCartaMonstruo1);
    	
    	jugador2.ponerEnAtaque(unaCartaMonstruo2);
    	jugador2.juegaUnaCarta(unaCartaMonstruo2);
    	jugador2.atacar("Monstruo Malo", "Monstruo Bueno");
    	
    	int puntosDeVidaRestantesEsperadosParaJugador1 = 8000;
    	
    	assertTrue(jugador1.cartaEstaEnCementerio("Monstruo Bueno"));
    	assertEquals (puntosDeVidaRestantesEsperadosParaJugador1, jugador1.puntosDeVida());
    	
    }
    
    @Test
    public void test10JugadorAtacaMonstruoEnPosicionDeDefensaConMayorDefensaQueElAtaqueDelMismo() {
    	Jugador jugador1 = new Jugador("Jugador 1");
    	Jugador jugador2 = new Jugador("Jugador 2");
    	
    	jugador1.establecerOponente(jugador2);
    	jugador2.establecerOponente(jugador1);
    	    	
    	CartaMonstruo unaCartaMonstruo1 = new CartaMonstruo ("Monstruo Bueno", 1, 1000, 2500);
    	CartaMonstruo unaCartaMonstruo2 = new CartaMonstruo ("Monstruo Malo", 1, 2000, 800);
    	
    	jugador1.ponerEnDefensa(unaCartaMonstruo1);
    	jugador1.juegaUnaCarta(unaCartaMonstruo1);
    	
    	jugador2.ponerEnAtaque(unaCartaMonstruo2);
    	jugador2.juegaUnaCarta(unaCartaMonstruo2);
    	jugador2.atacar("Monstruo Malo", "Monstruo Bueno");
    	
    	int puntosDeVidaRestantesEsperadosParaJugador1 = 8000;
    	
    	assertTrue(jugador2.cartaEstaEnCementerio("Monstruo Malo"));
    	assertEquals (puntosDeVidaRestantesEsperadosParaJugador1, jugador1.puntosDeVida());	
    }
    
    @Test
    public void test06() {
        assertTrue(0 == 0);
    }/*Colocar monstruos en ambos lados del campo. Colocar Agujero negro boca arriba
            (es decir, se activa el efecto). Verificar que se destruyeron todos los monstruos de
    ambos lados del campo, y que nadie recibió daño alguno.*/
    
    @Test
    public void test07() {
        assertTrue(0 == 0);
    }/*Se coloca un monstruo en el campo, se quiere colocar un monstruo de 5 o 6
    estrellas que requiere sacrificio. se verifica que se convocó al monstruo y se
    destruyó el primero.*/

    @Test
    public void test08() {
        assertTrue(0 == 0);
    }/*Se colocan 2 monstruos en el campo, se quiere colocar un monstruo de 7 o más
    estrellas que requiere 2 sacrificios. se verifica que se convocó al monstruo y se
    destruyeron los demás.*/
}