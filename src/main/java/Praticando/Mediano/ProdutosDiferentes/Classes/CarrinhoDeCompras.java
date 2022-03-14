package Praticando.Mediano.ProdutosDiferentes.Classes;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

    private final Map<Produto, Integer> produtosCarrinho = new HashMap<>();
    private int quantidadeCarrinho;
    private double precoTotal;

    public void adicionaProduto(Produto produto, int quantidade) {
        if(produtosCarrinho.containsKey(produto)) {
            produtosCarrinho.put(produto, produtosCarrinho.get(produto) + quantidade);
            System.out.println("Produto " + produto.getNome() + " já existe dentro do carrinho. " +
                    "A quantidade informada será somada " +
                    "com a quantidade existente.");
        } else {
            produtosCarrinho.put(produto, quantidade);
            System.out.println("Produto " + produto.getNome() + " adicionado.");
        }
        quantidadeCarrinho += quantidade;
    }

    public void removeProduto(Produto produto, int quantidade) {
        if(produtosCarrinho.containsKey(produto)) {
            produtosCarrinho.remove(produto);
            quantidadeCarrinho -= quantidade;
        }
    }

    public double getPrecoTotal() {
        for(Produto produto : produtosCarrinho.keySet()) {
            precoTotal = produto.getPreco() * quantidadeCarrinho;
        }

        return precoTotal;
    }

    public int getQuantidadeCarrinho() {
        return quantidadeCarrinho;
    }
}
