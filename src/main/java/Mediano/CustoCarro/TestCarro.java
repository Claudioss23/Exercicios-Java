package Mediano.CustoCarro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCarro {

    @Test
    public void testPrecoCarro() {
        Carro c = new Carro("Fiat", 100000);

        System.out.println("O preço final do carro de marca " + c.getMarca() + " é: R$" + c.calcularPrecoFinal());

        Assertions.assertEquals(173000.0, c.calcularPrecoFinal());
    }
}
