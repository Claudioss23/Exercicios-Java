package Praticando.Mediano.Concurso;

public class Candidato implements Comparable<Candidato>{

    private final int nota, idade;
    private final boolean deficiente;

    public Candidato(int nota, boolean deficiente, int idade) {
        super();
        this.nota = nota;
        this.deficiente = deficiente;
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public boolean isDeficiente() {
        return deficiente;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Candidato outro) {
        if(nota == outro.getNota()) {
            if(deficiente == outro.isDeficiente()) {
                return idade - outro.getIdade();
            } else {
                if(deficiente) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            return nota - outro.getNota();
        }
    }

    @Override
    public String toString() {
        return nota + ";" + deficiente + ";" + idade;
    }
}
