package Praticando.Mediano.Dado;

public class DadoMain {
    public static void main(String[] args) {

        Dado d = new Dado();

        System.out.println("Primeira rodada");
        d.rolar();
        System.out.println("Valor tirado: " + d.getValorFace());

        d.setValorFace(7);
    }
}
