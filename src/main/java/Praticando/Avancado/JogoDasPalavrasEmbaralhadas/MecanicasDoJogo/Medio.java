package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.MecanicasDoJogo;

import Praticando.Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;

public class Medio implements MecanicaDoJogo {

    private static int qtdPalavras = 0;
    private int tentativas = 1;
    private int pontos = 0;
    private final BancoDePalavras bDP = new BancoDePalavras();
    private String palavraVez = bDP.getPalavraAleatoria();
    private final int resta = bDP.getTamanho();

    @Override
    public String getNomeEDescricao() {
        return "Dificuldade: Médio\n" +
                "Descrição: Pode errar 2 vezes por palavra. Você perde pontos ao errar.";
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
        if(!(tentativas == 0)) {
            if(palavra.equals(resposta)) {
                pontos++;
                qtdPalavras++;
                tentativas = 1;
                palavraVez = bDP.getPalavraAleatoria();

                return "Correto! Vamos para a próxima palavra. \nPalavras restantes: " + (resta - qtdPalavras);
            } else {
                tentativas--;

                return "Você errou! Tente novamente. \nTentativas restantes: " + tentativas;
            }
        } else {
            pontos--;
            qtdPalavras++;
            tentativas = 1;
            palavraVez = bDP.getPalavraAleatoria();

            return "Você errou e perdeu todas as tentativas! Vamos para a próxima palavra. \nPalavras restantes: " + (resta - qtdPalavras);
        }
    }

    @Override
    public String getPontuacaoFinal() {
        if(pontos <= 0) {
            return "Pontuação Final: " + pontos +
                    "\nTu é horrível, boy!";
        } else if(pontos <= 5) {
            return "Pontuação Final: " + pontos + "\nAinda dá pra melhorar!";
        } else if(pontos <= 10) {
            return "Pontuação Final: " + pontos + "\nMuito bem!";
        } else if(pontos <= 15) {
            return "Pontuação Final: " + pontos + "\nÓtima performance!";
        } else if(pontos <= 19) {
            return "Pontuação Final: " + pontos + "\nIncrível!";
        } else {
            return "Pontuação Final: " + pontos + "\nParabéns! Você conseguiu a pontuação máxima!\nTente uma dificuldade mais difícil.";
        }
    }
}
