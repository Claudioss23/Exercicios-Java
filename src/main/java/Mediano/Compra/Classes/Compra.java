package Mediano.Compra.Classes;

public class Compra {

    protected final double valor;

    public Compra(double valor) {
        this.valor = valor;
    }

    public double total() {
        return valor;
    }
}
