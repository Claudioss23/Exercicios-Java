package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Testes;

import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;
import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.Embaralhador;
import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.InverterPalavra;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInverterPalavra {

    @Test
    public void testInverterPalavra() {
        BancoDePalavras b = new BancoDePalavras();
        Embaralhador e = new InverterPalavra();

        System.out.println(e.getNome());
        System.out.println(b.getPalavraAleatoria());
        System.out.println(e.embaralhar(b.getPalavraAleatoria()));

        Assertions.assertNotEquals(b.getPalavraAleatoria(), e.embaralhar(b.getPalavraAleatoria()));
    }
}
