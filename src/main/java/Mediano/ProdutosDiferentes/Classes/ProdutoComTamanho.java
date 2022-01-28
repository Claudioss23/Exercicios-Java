package Mediano.ProdutosDiferentes.Classes;

import java.util.Objects;

public class ProdutoComTamanho extends Produto{

    public ProdutoComTamanho(String nome, int codigo, double preco, double tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    private double tamanho;

    public double getTamanho() {
        return tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoComTamanho that = (ProdutoComTamanho) o;
        return Double.compare(that.tamanho, tamanho) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanho);
    }
}
