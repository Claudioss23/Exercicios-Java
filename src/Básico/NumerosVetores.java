package Básico;

import java.util.Scanner;

public class NumerosVetores {
    public static void main(String[] args) {

        //Ler 50 números e dizer se foi número repetido ou não

        int[] VET = new int[50];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            VET[i] = scanner.nextInt();

            for (int j = 0; j < 50; j++) {
                if (VET[i] == VET[j] && i != j) {
                    System.out.println("O número " + VET[i] + " é repetido!");
                    break;
                }
            }
        }

        scanner.close();
    }
}
