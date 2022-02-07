package Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDePalavras {

    private final ArquivoPalavras arquivo = new ArquivoPalavras();
    private List<String> listaPalavras = new ArrayList<>();

    public String getPalavraAleatoria() {
        try {
            listaPalavras = arquivo.getPalavraDoArquivo();
        } catch (IOException e) {
            Logger.getLogger(BancoDePalavras.class.getName()).log(Level.SEVERE, null, e);
        }
        Random random = new Random(System.currentTimeMillis());
        int ref = random.nextInt();
        int i = ref % (listaPalavras.size());

        return listaPalavras.get(Math.abs(i));
    }

    public int getTamanho() {
        return listaPalavras.size();
    }
}
