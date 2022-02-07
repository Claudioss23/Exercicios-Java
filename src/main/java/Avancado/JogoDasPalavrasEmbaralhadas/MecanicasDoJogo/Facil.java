package Avancado.JogoDasPalavrasEmbaralhadas.MecanicasDoJogo;

import Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;

public class Facil implements MecanicaDoJogo {

    private static int qtdPalavras = 0;
    private int tentativas = 2;
    private int pontos = 0;
    private final BancoDePalavras bDP = new BancoDePalavras();
    private String palavraVez = bDP.getPalavraAleatoria();
    private int resta = bDP.getTamanho();

    @Override
    public String getNomeEDescricao() {
        return "Dificuldade: Fácil\n" +
                "Descrição: Pode errar até 3 vezes por palavra.";
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
                tentativas = 2;
                palavraVez = bDP.getPalavraAleatoria();

                return "Correto! Vamos para a próxima palavra. \nPalavras restantes: " + (resta - qtdPalavras);
            } else {
                tentativas--;

                return "Você errou! Tente novamente. \nTentativas restantes: " + tentativas;
            }
        } else {
            pontos--;
            qtdPalavras++;
            tentativas = 2;
            palavraVez = bDP.getPalavraAleatoria();

            return "Você errou e perdeu todas as tentativas! Vamos para a próxima palavra. \nPalavras restantes: " + (resta - qtdPalavras);
        }
    }

    @Override
    public String getPontuacaoFinal() {
        if(pontos <= 0) {
            return "Pontuação Final: " + pontos +
                    "\nTu é horrível, boy!";
        } else {
            return "Pontuação Final: " + pontos + "\nParabéns!";
        }
    }
}
