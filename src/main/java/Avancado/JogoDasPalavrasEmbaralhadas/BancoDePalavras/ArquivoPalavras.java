package Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoPalavras {

    private FileReader arquivo;

    public List<String> getPalavraDoArquivo() throws IOException {
        List<String> lista = new ArrayList<>();

        try {
            File a = new File("src\\main\\java\\Avancado\\JogoDasPalavrasEmbaralhadas\\BancoDePalavras\\ListaDePalavras.txt");
            arquivo = new FileReader(a);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String l = lerArquivo.readLine();

            while (l != null) {
                lista.add(l);
                l = lerArquivo.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo de texto.");
        } finally {
            arquivo.close();
        }
        return lista;
    }
}
