package Mediano.Banco;

import org.junit.jupiter.api.BeforeEach;

public class TestContaEspecial extends TestContaCorrente{

    @BeforeEach
    public void inicializaConta() {
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }
}
