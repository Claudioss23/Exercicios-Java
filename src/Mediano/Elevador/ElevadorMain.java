package Mediano.Elevador;

public class ElevadorMain {
    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        elevador.iniciar();

        System.out.println("Há " + elevador.getPesPresentes() + " pessoas no elevador.");

        elevador.entra();
        System.out.println("Há " + elevador.getPesPresentes() + " pessoas no elevador.");

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        System.out.println("Há " + elevador.getPesPresentes() + " pessoas no elevador.");

        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        System.out.println("Há " + elevador.getPesPresentes() + " pessoas no elevador. \n");

        elevador.desce();
        elevador.sobe();
        elevador.desce();
        elevador.sobe();
        elevador.sobe();

    }
}
