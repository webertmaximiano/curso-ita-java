package Carros;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCarroSoma {
    CarroSoma c;
        @Before
        public void inicializaCarro() {
            c = new CarroSoma("teste", 10, 100);
        }
        @Test
        public void testCarroParado() {
            assertEquals(0, c.getVelocidade());
        }
        @Test
        public void testAcelerar() {
            c.acelerar();
            assertEquals(10, c.getVelocidade());
        }
        @Test
        public void testFrear() {
            c.acelerar();
            c.frear();
            assertEquals(5, c.getVelocidade());
        }
        @Test
        public void testFrearZero() {
            c.acelerar();
            c.frear();
            c.frear();
            c.frear();
            c.frear();
            assertEquals(0, c.getVelocidade());
        }
        @Test
        public void testeAcelerarAteVelocidadeMaxima() {
            for (int i=0; i<14; i++)
                c.acelerar();
            assertEquals(100, c.getVelocidade());
        }


}
