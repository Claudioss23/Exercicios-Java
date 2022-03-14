package Praticando.Mediano.FormasDeTratamento.Classes;

public class Autoridade {

    private final String nome, sobrenome;
    private final FormatadorNome fn;

    public Autoridade(String nome, String sobrenome, FormatadorNome fn) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.fn = fn;
    }

    public String getTratamento() {
        return fn.formatarNome(nome, sobrenome);
    }
}
