package Praticando.Avancado.LerArquivo.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

    public static Map<String, String> processar(String nomeDoArquivo) throws LeituraArquivoException {
        Map<String, String> mapa = new HashMap<>();

        try {
            File arquivo = new File(nomeDoArquivo);
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] valores = s.split("->");
                if(valores.length != 2) {
                    throw new LeituraArquivoException("Formatação de arquivo inválida.");
                }
                mapa.put(valores[0], valores[1]);
            }
            if(mapa.isEmpty()) {
                throw new LeituraArquivoException("Arquivo vazio.");
            }
        } catch (FileNotFoundException e) {
            throw new LeituraArquivoException("Erro ao abrir o arquivo. " + e.getMessage());
        }

        return mapa;
    }
}
