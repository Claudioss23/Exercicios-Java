package Mediano.Banco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestContaCorrente {

    ContaCorrente cc;

    @BeforeEach
    public void inicializaConta() {
        cc = new ContaCorrente();
        cc.depositar(200);
    }

    @Test
    public void deposito() {
        Assertions.assertEquals(200, cc.saldo);
    }

    @Test
    public void saque() {
        int valorSacado = cc.sacar(50);

        Assertions.assertEquals(150, cc.saldo);
        Assertions.assertEquals(50, valorSacado);
    }

    @Test
    public void saqueMaiorQueSaldo() {
        int valorSacado = cc.sacar(350);

        Assertions.assertEquals(200, cc.saldo);
        Assertions.assertEquals(0, valorSacado);
    }

    @Test
    public void saqueMaiorQueSaldoDentroDoLimite() {
        int valorSacado = cc.sacar(250);

        Assertions.assertEquals(-50, cc.saldo);
        Assertions.assertEquals(250, valorSacado);
    }
}
