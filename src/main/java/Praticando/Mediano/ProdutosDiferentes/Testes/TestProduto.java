package Praticando.Mediano.ProdutosDiferentes.Testes;

import Praticando.Mediano.ProdutosDiferentes.Classes.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProduto {

    Produto p;

    @BeforeEach
    public void inicializaProduto() {
        p = new Produto("Maçã", 1, 2.00);
    }

    @Test
    public void imprimirProduto() {
        System.out.println("Produto: " + p.getNome() + "\n" +
                "Código: " + p.getCodigo() + "\n" +
                "Preço: R$" + p.getPreco());
        Assertions.assertEquals("Maçã", p.getNome());
        Assertions.assertEquals(1, p.getCodigo());
        Assertions.assertEquals(2.0, p.getPreco());
    }

    @Test
    public void doisProdutosIguais() {
        Produto p2 = new Produto("Maçã", 1, 2.00);

        System.out.println("Produto p e p2 iguais: " + p.equals(p2));

        Assertions.assertEquals(p, p2);
    }

    @Test
    public void doisProdutosDiferentes() {
        Produto p2 = new Produto("Pera", 2, 3.25);

        System.out.println("Produto p e p2 iguais: " + p.equals(p2));

        Assertions.assertNotEquals(p, p2);
    }

    @Test
    public void hashcodeDeProduto() {
        System.out.println("Hashcode de Produto: " + p.hashCode());
        Assertions.assertEquals(32, p.hashCode());
    }

    @Test
    public void hashcodeDeDoisProdutosDiferentes() {
        Produto p2 = new Produto("Graviola", 25, 4.00);

        System.out.println("Hashcode de p: " + p.hashCode());
        System.out.println("Hashcode de p2: " + p2.hashCode());

        Assertions.assertNotEquals(p.hashCode(), p2.hashCode());
    }
}
