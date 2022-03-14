package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Testes;

import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.ArquivoPalavras;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class TestArquivoPalavras {

    @Test
    public void testLista() throws IOException {
        ArquivoPalavras a = new ArquivoPalavras();

        System.out.println(a.getPalavraDoArquivo().toString());
        Assertions.assertEquals("[homem, mulher, doido, cachorro, gato, casamento, heroina, pastor, telefone, luz, jogo, palavra, corrida, concurso, banco, tratamento, retângulo, vento, pilha, dado]", a.getPalavraDoArquivo().toString());
    }
}
