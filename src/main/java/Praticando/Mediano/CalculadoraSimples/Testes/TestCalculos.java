package Praticando.Mediano.CalculadoraSimples.Testes;

import Praticando.Mediano.CalculadoraSimples.Classes.Calculos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculos {

    @Test
    public void testSoma() {
        System.out.println(Calculos.soma(10, 1235));

        Assertions.assertEquals(1245, Calculos.getResultado());
    }

    @Test
    public void testSubtracao() {
        System.out.println(Calculos.subtracao(1000, 2000));

        Assertions.assertEquals(-1000, Calculos.getResultado());
    }

    @Test
    public void testMultiplicacao() {
        System.out.println(Calculos.multiplicacao(10, 1235));

        Assertions.assertEquals(12350, Calculos.getResultado());
    }

    @Test
    public void testDivisao() {
        System.out.println(Calculos.divisao(10, 10));

        Assertions.assertEquals(1, Calculos.getResultado());
    }

}
