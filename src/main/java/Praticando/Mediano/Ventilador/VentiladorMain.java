package Praticando.Mediano.Ventilador;

public class VentiladorMain {
    public static void main(String[] args) {

        Ventilador v1 = new Ventilador();
        Ventilador v2 = new Ventilador();

        System.out.println("Primeiro ventilador:\n" + v1);

        v2.setVelocidade(Ventilador.MEDIA);
        v2.setCor("Amarelo");
        v2.setLigado(true);

        System.out.println("\nSegundo ventilador:\n" + v2);
    }
}
