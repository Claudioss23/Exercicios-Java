package Básico;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double[] numero = new double[2];
        double resultado;
        int escolhaCaso, escolhaOperacao = 1;
        Scanner scanner = new Scanner(System.in);

        while (escolhaOperacao == 1) {
            System.out.println("Escolha a operação:\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n");
            escolhaCaso = scanner.nextInt();
            switch (escolhaCaso) {
                case 1: {
                    for (int i = 0; i <= 1; i++) {
                        System.out.println("Insira o número: ");
                        numero[i] = scanner.nextDouble();
                    }
                    resultado = numero[0] + numero[1];

                    System.out.println("A soma é: " + resultado + "\n\n");
                    System.out.println("Escolher outra operação?\n1- Sim\n2- Não\n");
                    escolhaOperacao = scanner.nextInt();
                    break;
                }
                case 2: {
                    for (int i = 0; i <= 1; i++) {
                        System.out.println("Insira o número: ");
                        numero[i] = scanner.nextDouble();
                    }
                    resultado = numero[0] - numero[1];

                    System.out.println("A subtração é: " + resultado + "\n\n");
                    System.out.println("Escolher outra operação?\n1- Sim\n2- Não\n");
                    escolhaOperacao = scanner.nextInt();
                    break;
                }
                case 3: {
                    for (int i = 0; i <= 1; i++) {
                        System.out.println("Insira o número: ");
                        numero[i] = scanner.nextDouble();
                    }
                    resultado = numero[0] * numero[1];

                    System.out.println("A multiplicação é: " + resultado + "\n\n");
                    System.out.println("Escolher outra operação?\n1- Sim\n2- Não\n");
                    escolhaOperacao = scanner.nextInt();
                    break;
                }
                case 4: {
                    for (int i = 0; i <= 1; i++) {
                        System.out.println("Insira o número: ");
                        numero[i] = scanner.nextDouble();
                    }
                    resultado = numero[0] / numero[1];

                    System.out.println("A divisão é: " + resultado + "\n\n");
                    System.out.println("Escolher outra operação?\n1- Sim\n2- Não\n");
                    escolhaOperacao = scanner.nextInt();
                    break;
                }
            }
        }
    }
}
