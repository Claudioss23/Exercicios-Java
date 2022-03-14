package Praticando.Mediano.MediaDeAluno;

public class Aluno {
    int pBim;
    int sBim;
    int tBim;
    int qBim;

    public int media(Aluno a) {
        int total = 0;
        total += a.pBim;
        total += a.sBim;
        total += a.tBim;
        total += a.qBim;

        return total / 4;
    }

    public boolean passouDeAno(Aluno a) {
        return media(a) >= 60;
    }
}
