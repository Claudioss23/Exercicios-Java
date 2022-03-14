package Praticando.Básico;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        //Checar quais são o números primos em um intervalo de números

        int inicio, fim, primo = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número inicial: ");
        inicio = scanner.nextInt();
        System.out.println("Insira o número final: ");
        fim = scanner.nextInt();

        for (int i = inicio; i <= fim; i ++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo ++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " é PRIMO!");
            }
            primo = 0;
        }

        scanner.close();
    }
}
