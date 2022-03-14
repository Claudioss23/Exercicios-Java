package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.MecanicasDoJogo;

public interface MecanicaDoJogo {

    String getNomeEDescricao();

    boolean terminou();

    String getPalavra();

    String tentativa(String palavra, String resposta);

    String getPontuacaoFinal();
}
