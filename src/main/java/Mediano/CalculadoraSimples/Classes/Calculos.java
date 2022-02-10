package Mediano.CalculadoraSimples.Classes;

public class Calculos {

    private static double resultado;

    public static String soma(double n1, double n2) {
        resultado = n1 + n2;

        return "A soma é: " + resultado;
    }

    public static String subtracao(double n1, double n2) {
        resultado = n1 - n2;

        return "A subtração é: " + resultado;
    }

    public static String multiplicacao(double n1, double n2) {
        resultado = n1 * n2;

        return "A multiplicação é: " + resultado;
    }

    public static String divisao(double n1, double n2) {
        resultado = n1 / n2;

        return "A divisão é: " + resultado;
    }

    public static double getResultado() {
        return resultado;
    }
}