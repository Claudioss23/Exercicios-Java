package Praticando.Mediano.MediaDeAluno;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno claudio = new Aluno();
        claudio.pBim = 70;
        claudio.sBim = 60;
        claudio.tBim = 80;
        claudio.qBim = 70;

        System.out.println(claudio.media(claudio));
        System.out.println(claudio.passouDeAno(claudio));
    }
}
