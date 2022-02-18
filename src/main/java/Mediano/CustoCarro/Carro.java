package Mediano.CustoCarro;

public class Carro {

    private final String marca;
    private final double precoCarro;

    public Carro(String marca, double precoCarro) {
        this.marca = marca;
        this.precoCarro = precoCarro;
    }

    public double calcularPrecoFinal() {
        return (precoCarro + precoCarro * 0.28 + precoCarro * 0.45);
    }

    public String getMarca() {
        return marca;
    }
}
