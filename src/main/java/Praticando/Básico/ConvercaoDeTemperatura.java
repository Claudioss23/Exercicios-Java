package Praticando.Básico;

public class ConvercaoDeTemperatura {
    public static void main(String[] args) {

        //Tranformar temperatura em C° em K, Re, Ra e F.

        double C, F, K, Re, Ra;

        C = 2.43;

        //Fórmulas

        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        //Print

        System.out.println("A temperatura " + C + " C° em F é: " + F);
        System.out.println("A temperatura " + C + " C° em K é: " + K);
        System.out.println("A temperatura " + C + " C° em Re é: " + Re);
        System.out.println("A temperatura " + C + " C° em Ra é: " + Ra);
    }
}
