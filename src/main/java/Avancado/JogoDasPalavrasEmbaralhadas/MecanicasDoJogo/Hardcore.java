package Avancado.JogoDasPalavrasEmbaralhadas.MecanicasDoJogo;

import Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;

public class Hardcore implements MecanicaDoJogo {

    private static int qtdPalavras = 0;
    private int pontos = 0;
    private final BancoDePalavras bDP = new BancoDePalavras();
    private String palavraVez = bDP.getPalavraAleatoria();
    private final int resta = bDP.getTamanho();

    @Override
    public String getNomeEDescricao() {
        return "Dificuldade: Hardcore\n" +
                "Descrição: Se errar, o jogo acaba.";
    }

    @Override
    public boolean terminou() {
        return qtdPalavras == bDP.getTamanho();
    }

    @Override
    public String getPalavra() {
        return palavraVez;
    }

    @Override
    public String tentativa(String palavra, String resposta) {
        if(palavra.equals(resposta)) {
            pontos++;
            qtdPalavras++;
            palavraVez = bDP.getPalavraAleatoria();

            return "Correto! Vamos para a próxima palavra. \nPalavras restantes: " + (resta - qtdPalavras);
        } else {
            pontos = 0;
            qtdPalavras = bDP.getTamanho();

            return "Você errou!";
        }
    }

    @Override
    public String getPontuacaoFinal() {
        if(pontos == 0) {
            return "Essa dificuldade não é pra todo mundo! Volte quando melhorar.";
        } else {
            return "Parabéns! Você conseguiu a pontuação máxima na dificuldade mais difícil!!!";
        }
    }
}