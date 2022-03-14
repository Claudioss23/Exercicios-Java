package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Testes;

import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;
import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.Embaralhador;
import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.FabricaEmbaralhadores;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFabricaEmbaralhadores {

    @Test
    public void testCriacaoFabricaEmbaralhadores() {
        BancoDePalavras b = new BancoDePalavras();
        Embaralhador e = FabricaEmbaralhadores.embaralhadorAleatorio();

        System.out.println(e.getNome());
        System.out.println(b.getPalavraAleatoria());
        System.out.println(e.embaralhar(b.getPalavraAleatoria()));

        Assertions.assertNotNull(e);
    }
}
