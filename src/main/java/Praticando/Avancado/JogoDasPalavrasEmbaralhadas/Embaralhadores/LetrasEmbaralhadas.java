package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores;

import java.util.Random;

public class LetrasEmbaralhadas implements Embaralhador{


    public String embaralhar(String palavra) {
        Random random = new Random();
        char[] c = palavra.toCharArray();

        for(int i = 0; i < c.length; i++) {
            int j = random.nextInt(c.length);
            char a = c[i];
            c[i] = c[j];
            c[j] = a;
        }

        return new String(c);
    }

    @Override
    public String getNome() {
        return "Palavras com Letras Embaralhadas";
    }
}
