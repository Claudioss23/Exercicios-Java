package Mediano.CalculadoraSimples;

import Mediano.CalculadoraSimples.Classes.Calculos;

import java.util.Scanner;

public class CalculadoraSimplesMain {
    public static void main(String[] args) {

        double[] numero = new double[2];
        int escolhaCaso, escolhaOperacao = 1;
        Scanner scanner = new Scanner(System.in);

        while (escolhaOperacao == 1) {
            System.out.println("\nEscolha a operação:\n1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n");
            System.out.print("> ");
            escolhaCaso = scanner.nextInt();
            switch (escolhaCaso) {
                case 1: {
                    for (int i = 0; i <= 1; i++) {
                        System.out.println("Insira o número: ");
                        System.out.print("> ");
                        numero[i] = scanner.nextDouble();
                    }
                    System.out.println(Calculos.soma(numero[0], numero[1]) + "\n\n");

                    System.out.println("Escolher outra operação?\n1- Sim\n2- Não\n");
                    System.out.print("> ");
                    escolhaOperacao = scanner.nextInt();
                    break;
                }
                case 2: {
                    for (int i = 0; i <= 1; i++) {
                        System.out.println("Insira o número: ");
                        System.out.print("> ");
                        numero[i] = scanner.nextDouble();
                    }
                    System.out.println(Calculos.subtracao(numero[0], numero[1]) + "\n\n");

                    System.out.println("Escolher outra operação?\n1- Sim\n2- Não\n");
                    System.out.print("> ");
                    escolhaOperacao = scanner.nextInt();
                    break;
                }
                case 3: {
                    for (int i = 0; i <= 1; i++) {
                        System.out.println("Insira o número: ");
                        System.out.print("> ");
                        numero[i] = scanner.nextDouble();
                    }
                    System.out.println(Calculos.multiplicacao(numero[0], numero[1]) + "\n\n");

                    System.out.println("Escolher outra operação?\n1- Sim\n2- Não\n");
                    System.out.print("> ");
                    escolhaOperacao = scanner.nextInt();
                    break;
                }
                case 4: {
                    for (int i = 0; i <= 1; i++) {
                        System.out.println("Insira o número: ");
                        System.out.print("> ");
                        numero[i] = scanner.nextDouble();
                    }
                    System.out.println(Calculos.divisao(numero[0], numero[1]) + "\n\n");

                    System.out.println("Escolher outra operação?\n1- Sim\n2- Não\n");
                    System.out.print("> ");
                    escolhaOperacao = scanner.nextInt();
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Terminando o programa.");
                    System.exit(0);
                }
            }
        }
    }
}
