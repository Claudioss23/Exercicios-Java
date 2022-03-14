package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Testes;

import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBancoDePalavras {

    @Test
    public void testPalavraAleatoria() {
        BancoDePalavras b = new BancoDePalavras();

        System.out.println(b.getPalavraAleatoria());

        Assertions.assertNotNull(b.getPalavraAleatoria());
    }
}
