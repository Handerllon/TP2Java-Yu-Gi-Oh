package AlGoOh;

import org.junit.Test;

import areaDeJuego.Cementerio;
import cartas.Carta;
import cartas.CartaMagica;
import cartas.CartaMonstruo;
import cartas.CartaTrampa;
import clases.Jugador;

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
    public void test06OponentesSeAtacanConCartasMonstruoYSeDestruyeElDeMenor() {
    	Jugador jugador1 = new Jugador("Jugador 1");
    	Jugador jugador2 = new Jugador("Jugador 2");
    	
    	CartaMonstruo unaCartaMonstruo1 = new CartaMonstruo ("Monstruo Malo", 1, 1000, 500);
    	CartaMonstruo unaCartaMonstruo2 = new CartaMonstruo ("Monstruo Malo", 1, 2000, 800);
    	
    	jugador1.ponerEnAtaque(unaCartaMonstruo1);
    	jugador1.juegaUnaCarta(unaCartaMonstruo1);
    	
    	jugador2.ponerEnAtaque(unaCartaMonstruo2);
    	jugador2.juegaUnaCarta(unaCartaMonstruo2);
    	
    	
    	
    	
    }/*Colocar una carta de monstruo en posición de ataque, el oponente coloca otra carta
    de monstruo en posición de ataque (con mayor ataque). Atacar al primer monstruo y
    verificar que este se destruyó, y sufro daño a los puntos de vida igual a la diferencia
    de los puntos de ataque de los monstruos*/

    @Test
    public void test02() {
        assertTrue(0 == 0);
    }/*Colocar una carta de monstruo en posición de ataque, el oponente coloca otra carta
    de monstruo en posición de ataque (con menor ataque), atacar al primer monstruo,
    verificar que el monstruo atacante es destruido y el atacante recibe daño a los
    puntos de vida igual a la diferencia de ataques.*/

    @Test
    public void test03() {
        assertTrue(0 == 0);
    }/*Colocar una carta de monstruo en posición de ataque, el oponente coloca otra carta
    de monstruo en posición de ataque (con igual ataque), atacar al primer monstruo,
    verificar que ambos monstruos son destruidos y nadie recibe daño a los puntos de
    vida.*/

    @Test
    public void test04() {
        assertTrue(0 == 0);
    }/*Colocar una carta de monstruo en posición de defensa, el oponente coloca otra carta
    de monstruo en posición de ataque (con mayor ataque que la defensa del primer
            monstruo), atacar al primer monstruo y verificar que este se destruyó y no sufrió
    ningún daño vital.*/

    @Test
    public void test05() {
        assertTrue(0 == 0);
    }/*Colocar una carta de monstruo en posición de defensa, el oponente coloca otra carta
    de monstruo en posición de ataque (con menor ataque que la defensa del primer
            monstruo), atacar al primer monstruo y verificar que este no se destruyó y no sufrió
    ningún daño vital.*/

    @Test
    public void test06() {
        assertTrue(0 == 0);
    }/*Colocar monstruos en ambos lados del campo. Colocar Agujero negro boca arriba
            (es decir, se activa el efecto). Verificar que se destruyeron todos los monstruos de
    ambos lados del campo, y que nadie recibió daño alguno.*/
    
    @Test
    public void test0x() {
        assertTrue(0 == 0);
    }/*Se coloca un monstruo en el campo, se quiere colocar un monstruo de 5 o 6
    estrellas que requiere sacrificio. se verifica que se convocó al monstruo y se
    destruyó el primero.*/

    @Test
    public void test0x() {
        assertTrue(0 == 0);
    }/*Se colocan 2 monstruos en el campo, se quiere colocar un monstruo de 7 o más
    estrellas que requiere 2 sacrificios. se verifica que se convocó al monstruo y se
    destruyeron los demás.*/
}