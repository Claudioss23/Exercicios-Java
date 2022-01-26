package Mediano.Corrida.TestesCarro;

import Mediano.Corrida.Classes.CarroDeCorrida;
import Mediano.Corrida.Classes.CarroSoma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarroSoma {

    CarroDeCorrida c;

    @BeforeEach
    public void inicializaCarro() {
        c = new CarroSoma(10, 100, "teste");
    }

    @Test
    public void testParado() {
        Assertions.assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerar() {
        c.acelerar();
        Assertions.assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testFrear() {
        c.acelerar();
        c.frear();
        Assertions.assertEquals(5, c.getVelocidade());
    }

    @Test
    public void testFrearAteZero() {
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        Assertions.assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerarAteVelocidadeMaxima() {
        for (int i = 0; i < 14; i++) {
            c.acelerar();
        }
        Assertions.assertEquals(100, c.getVelocidade());
    }
}
