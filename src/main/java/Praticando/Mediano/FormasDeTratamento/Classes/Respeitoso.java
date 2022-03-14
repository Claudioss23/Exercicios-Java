package Praticando.Mediano.FormasDeTratamento.Classes;

public class Respeitoso implements FormatadorNome{

    private final boolean masculino;

    public Respeitoso(boolean masculino) {
        this.masculino = masculino;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        if(masculino) {
            return "Sr. " + sobrenome;
        } else {
            return "Sra. " + sobrenome;
        }
    }
}
