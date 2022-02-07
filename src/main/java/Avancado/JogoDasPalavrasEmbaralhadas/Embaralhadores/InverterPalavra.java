package Avancado.JogoDasPalavrasEmbaralhadas.Embaralhadores;

public class InverterPalavra implements Embaralhador{

    @Override
    public String embaralhar(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);
        sb.reverse();

        return sb.toString();
    }

    @Override
    public String getNome() {
        return "Palavras Inversas";
    }
}
