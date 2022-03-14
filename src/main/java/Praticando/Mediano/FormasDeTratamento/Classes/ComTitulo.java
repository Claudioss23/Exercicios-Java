package Praticando.Mediano.FormasDeTratamento.Classes;

public class ComTitulo implements FormatadorNome{

    private final String titulo;

    public ComTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return titulo + " " + nome + " " + sobrenome;
    }
}
