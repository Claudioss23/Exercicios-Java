package Testes.Carro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCarro {

    @Test
    public void testParado() {
        Carro c = new Carro();
        Assertions.assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testAcelerar() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        Assertions.assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testFrear() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        Assertions.assertEquals(5, c.getVelocidade());
    }

    @Test
    public void testFrearAteZero() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        Assertions.assertEquals(0, c.getVelocidade());
    }

}
