package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Testes;

import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;
import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.Embaralhador;
import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.LetrasEmbaralhadas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLetrasEmbaralhadas {

    @Test
    public void testLetrasEmbaralhadas() {
        BancoDePalavras b = new BancoDePalavras();
        Embaralhador e = new LetrasEmbaralhadas();

        System.out.println(e.getNome());
        System.out.println(b.getPalavraAleatoria());
        System.out.println(e.embaralhar(b.getPalavraAleatoria()));

        Assertions.assertNotEquals(b.getPalavraAleatoria(), e.embaralhar(b.getPalavraAleatoria()));
    }
}
