package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores;

import java.util.Random;

public class FabricaEmbaralhadores {

    public static Embaralhador embaralhadorAleatorio() {
        Random random = new Random();
        int i = random.nextInt(3);

        if (i == 1) {
            return new LetrasEmbaralhadas();
        } else {
            return new InverterPalavra();
        }
    }
}
