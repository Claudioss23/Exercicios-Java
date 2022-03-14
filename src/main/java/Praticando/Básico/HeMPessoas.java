package Praticando.Básico;

import java.util.Scanner;

public class HeMPessoas {
    public static void main(String[] args) {

        //Manipular dados contendo altura e sexo de 10 pessoas.

        int sexo, qtMulheres = 0, qtHomens = 0;
        float altura, somaH = 0, mediaHomens, maior = 0, menor = 10;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("1 - Mulher \n2 - Homem \n");
            sexo = entrada.nextInt();

            System.out.println("Insira a altura: ");
            altura = entrada.nextFloat();

            if (sexo == 1) {
                qtMulheres ++;
            } else if (sexo == 2) {
                qtHomens ++;
                somaH = somaH + altura;
            } else {
                System.out.println("Número inválido.");
            }

            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }

        mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo é: " + maior + " m");
        System.out.println("A menor altura do grupo é: " + menor + " m");
        System.out.println("A média de altura dos homens é: " + mediaHomens);
        System.out.println("O número de mulheres é: " + qtMulheres);

        entrada.close();
    }
}
