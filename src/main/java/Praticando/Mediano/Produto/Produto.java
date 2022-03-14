package Praticando.Mediano.Produto;

public class Produto {

    private String nome;
    private double precoCusto, precoVenda, margemLucro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda > this.precoCusto) {
            this.precoVenda = precoVenda;
        } else {
            System.out.println("O preço da venda não pode ser menor que o preço da compra.");
        }
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public void calcularMargemLucro() {
        this.margemLucro = this.precoVenda - this.precoCusto;
    }

    public double getMargemLucroPorcentagem() {
        return (this.margemLucro / this.precoCusto) * 100;
    }
}
