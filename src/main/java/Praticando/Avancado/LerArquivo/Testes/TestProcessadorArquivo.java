package Praticando.Avancado.LerArquivo.Testes;

import Praticando.Avancado.LerArquivo.Classes.LeituraArquivoException;
import Praticando.Avancado.LerArquivo.Classes.ProcessadorArquivo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class TestProcessadorArquivo {

    @Test
    public void arquivoCompleto() throws LeituraArquivoException {
        Map<String, String> mapa = ProcessadorArquivo.processar("src/main/java/Avancado/LerArquivo/Arquivos/Arquivo.txt");

        System.out.println(mapa);

        Assertions.assertEquals("Skyrim", mapa.get("nome do jogo"));
        Assertions.assertEquals("RPG", mapa.get("categoria"));
        Assertions.assertEquals("5", mapa.get("horas jogadas"));
    }

    @Test
    public void arquivoVazio() {
        try {
            Map<String, String> mapa = ProcessadorArquivo.processar("src/main/java/Avancado/LerArquivo/Arquivos/ArquivoVazio.txt");
            Assertions.fail();
        } catch (LeituraArquivoException e) {
            Assertions.assertEquals("Arquivo vazio.", e.getMessage());
        }
    }

    @Test
    public void arquivoComFormatoErrado() {
        try {
            Map<String, String> mapa = ProcessadorArquivo.processar("src/main/java/Avancado/LerArquivo/Arquivos/ArquivoFormatoErrado.txt");
            Assertions.fail();
        } catch (LeituraArquivoException e) {
            Assertions.assertEquals("Formatação de arquivo inválida.", e.getMessage());
        }
    }

}
