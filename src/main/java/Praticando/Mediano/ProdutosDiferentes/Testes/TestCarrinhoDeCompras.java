package Praticando.Mediano.ProdutosDiferentes.Testes;

import Praticando.Mediano.ProdutosDiferentes.Classes.CarrinhoDeCompras;
import Praticando.Mediano.ProdutosDiferentes.Classes.Produto;
import Praticando.Mediano.ProdutosDiferentes.Classes.ProdutoComTamanho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarrinhoDeCompras {

    CarrinhoDeCompras c;
    Produto p;
    ProdutoComTamanho p2;
    ProdutoComTamanho p3;

    @BeforeEach
    public void inicializaProdutoECarrinho() {
        c = new CarrinhoDeCompras();
        p = new Produto("Maçã", 1, 2.00);
        p2 = new ProdutoComTamanho("Goiaba", 5, 5.00, 4);
        p3 = new ProdutoComTamanho("Goiaba", 5, 5.00, 5);
    }

    @Test
    public void adicionaProduto() {
        c.adicionaProduto(p, 5);
        c.adicionaProduto(p2, 7);

        System.out.println("Quantidade de produtos no carrinho: " + c.getQuantidadeCarrinho());

        Assertions.assertEquals(12, c.getQuantidadeCarrinho());
    }

    @Test
    public void removeProduto() {
        c.adicionaProduto(p, 5);
        c.adicionaProduto(p2, 7);

        System.out.println("Quantidade de produtos no carrinho: " + c.getQuantidadeCarrinho());

        c.removeProduto(p, 3);

        System.out.println("Quantidade de produtos no carrinho: " + c.getQuantidadeCarrinho());

        Assertions.assertEquals(9, c.getQuantidadeCarrinho());
    }

    @Test
    public void getPrecoTotal() {
        c.adicionaProduto(p, 6);
        c.adicionaProduto(p2, 10);
        c.adicionaProduto(p3, 3);

        System.out.println("Quantidade de produtos no carrinho: " + c.getQuantidadeCarrinho());
        System.out.println("Preço total de produtos no carrinho: R$" + c.getPrecoTotal());

        Assertions.assertEquals(95, c.getPrecoTotal());
    }
}
