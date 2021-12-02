package Básico;

import java.util.Scanner;

public class CodigoDeUsuario {
    public static void main(String[] args) {

        //Checar o login e senha corretos

        int codigo, senha;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o Código do Usuário: ");
        codigo = scanner.nextInt();

        if (codigo == 1234) {
            System.out.println("Escreva a senha: ");
            senha = scanner.nextInt();

            if(senha == 9999) {
                System.out.println("Login feito com sucesso!");
            } else {
                System.out.println("Senha errada!");
            }
        } else {
            System.out.println("Usuário inválido!");
        }

        scanner.close();
    }
}
