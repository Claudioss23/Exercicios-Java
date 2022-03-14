package Praticando.Mediano.Circulo;

import java.util.Scanner;

public class CirculoMain {
    public static void main(String[] args) {

        double raio, percentual;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio do cículo: ");
        raio = Double.parseDouble(scanner.nextLine());

        Circulo circulo = new Circulo(raio);

        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.getArea() + " metros quadrados");
        System.out.println("Circunferência: " + circulo.getCircuferencia() + " metros\n");

        System.out.println("Informe o percentual de aumento do raio: ");
        percentual = Double.parseDouble(scanner.nextLine());
        circulo.aumentarRaio(percentual);

        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.getArea() + " metros quadrados");
        System.out.println("Circunferência: " + circulo.getCircuferencia() + " metros");
    }
}
