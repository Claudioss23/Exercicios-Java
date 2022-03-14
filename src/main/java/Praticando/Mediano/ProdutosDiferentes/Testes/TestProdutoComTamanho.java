package Praticando.Mediano.ProdutosDiferentes.Testes;

import Praticando.Mediano.ProdutosDiferentes.Classes.ProdutoComTamanho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProdutoComTamanho {

    ProdutoComTamanho p;

    @BeforeEach
    public void inicializaProduto() {
        p = new ProdutoComTamanho("Maçã", 1, 2.00, 3);
    }

    @Test
    public void imprimirProduto() {
        System.out.println("Produto: " + p.getNome() + "\n" +
                "Código: " + p.getCodigo() + "\n" +
                "Preço: R$" + p.getPreco() + "\n" +
                "Tamanho: " + p.getTamanho() + " cm");
        Assertions.assertEquals("Maçã", p.getNome());
        Assertions.assertEquals(1, p.getCodigo());
        Assertions.assertEquals(2.0, p.getPreco());
        Assertions.assertEquals(3.0, p.getTamanho());
    }

    @Test
    public void doisProdutosIguais() {
        ProdutoComTamanho p2 = new ProdutoComTamanho("Maçã", 1, 2.00, 3);

        System.out.println("Produto p e p2 iguais: " + p.equals(p2));

        Assertions.assertEquals(p, p2);
    }

    @Test
    public void doisProdutosDiferentes() {
        ProdutoComTamanho p2 = new ProdutoComTamanho("Pera", 2, 3.25, 6);

        System.out.println("Produto p e p2 iguais: " + p.equals(p2));

        Assertions.assertNotEquals(p, p2);
    }

    @Test
    public void doisProdutosCodigosIguais() {
        ProdutoComTamanho p2 = new ProdutoComTamanho("Maçã", 1, 3.25, 6);

        System.out.println("Produto p e p2 iguais: " + p.equals(p2));

        Assertions.assertNotEquals(p, p2);
    }

    @Test
    public void doisProdutosTamanhosIguais() {
        ProdutoComTamanho p2 = new ProdutoComTamanho("Pera", 2, 3.25, 3);

        System.out.println("Produto p e p2 iguais: " + p.equals(p2));

        Assertions.assertNotEquals(p, p2);
    }

    @Test
    public void hashcodeDeProduto() {
        System.out.println("Hashcode de Produto: " + p.hashCode());
        Assertions.assertEquals(1074268065, p.hashCode());
    }

    @Test
    public void hashcodeDeDoisProdutosDiferentes() {
        ProdutoComTamanho p2 = new ProdutoComTamanho("Graviola", 25, 4.00, 1.5);

        System.out.println("Hashcode de p: " + p.hashCode());
        System.out.println("Hashcode de p2: " + p2.hashCode());

        Assertions.assertNotEquals(p.hashCode(), p2.hashCode());
    }
}
