package Avancado.JogoDasPalavrasEmbaralhadas.Testes;

import Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;
import Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.Embaralhador;
import Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores.FabricaEmbaralhadores;
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
