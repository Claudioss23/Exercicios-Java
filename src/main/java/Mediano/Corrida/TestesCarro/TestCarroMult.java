package Mediano.Corrida.TestesCarro;

import Mediano.Corrida.Classes.CarroDeCorrida;
import Mediano.Corrida.Classes.CarroMult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarroMult {

    CarroDeCorrida c;

    @BeforeEach
    public void inicializaCarro() {
        c = new CarroMult(100, 1.5, "teste");
    }

    @Test
    public void testParado() {
        Assertions.assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerarUmaVez() {
        c.acelerar();
        Assertions.assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testAcelerarDuasVezes() {
        c.acelerar();
        c.acelerar();
        Assertions.assertEquals(15, c.getVelocidade());
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
