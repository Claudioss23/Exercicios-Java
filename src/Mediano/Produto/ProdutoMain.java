package Mediano.Produto;

import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço de custo: ");
        produto.setPrecoCusto(Double.parseDouble(scanner.nextLine()));

        System.out.print("Informe o preço de venda: ");
        produto.setPrecoVenda(Double.parseDouble(scanner.nextLine()));

        produto.calcularMargemLucro();

        System.out.println("Preço de custo: " + produto.getPrecoCusto());
        System.out.println("Preço de Venda: " + produto.getPrecoVenda());
        System.out.println("Margem de lucro em moeda: R$" + produto.getMargemLucro());
        System.out.println("Margem de lucro em porcentagem: " + produto.getMargemLucroPorcentagem() + "%");

    }
}
