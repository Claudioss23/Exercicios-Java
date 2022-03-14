package Praticando.Mediano.CustoCarro;

import java.util.Scanner;

public class CustoCarroMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String marca;
        double preco;

        System.out.println("Insira a marca do carro: ");
        marca = s.nextLine();

        System.out.println("Insira o preço de fábrica do carro: ");
        preco = s.nextDouble();

        Carro c = new Carro(marca, preco);

        System.out.println("O preço final do carro de marca " + c.getMarca() + " é: R$" + c.calcularPrecoFinal());
    }
}
