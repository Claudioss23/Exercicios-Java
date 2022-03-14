package Praticando.Básico;

import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {

        //Ler o preço da fábrica de um carro e mostrar o preço final

        double precoCarro, precoFinal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço de fábrica do carro: ");
        precoCarro = scanner.nextDouble();

        precoFinal = precoCarro + precoCarro * 0.28 + precoCarro * 0.45;

        System.out.println("O preço final é: R$" + precoFinal);
    }
}
