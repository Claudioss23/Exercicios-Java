package Avancado.JogoDasPalavrasEmbaralhadas.MecanicasDoJogo;

import Avancado.JogoDasPalavrasEmbaralhadas.BancoDePalavras.BancoDePalavras;

public class Dificil implements MecanicaDoJogo {

    private static int qtdPalavras = 0;
    private int pontos = 0;
    private final BancoDePalavras bDP = new BancoDePalavras();
    private String palavraVez = bDP.getPalavraAleatoria();
    private int resta = bDP.getTamanho();

    @Override
    public String getNomeEDescricao() {
        return "Dificuldade: Difícil\n" +
                "Descrição: Se errar, o jogo passa para a próxima palavra.";
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
            pontos--;
            qtdPalavras++;
            palavraVez = bDP.getPalavraAleatoria();

            return "Você errou! Vamos para a próxima palavra. \nPalavras restantes: " + (resta - qtdPalavras);
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
