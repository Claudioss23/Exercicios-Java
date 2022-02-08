package Mediano.Compra.Classes;

public class CompraParcelada extends Compra{

    protected int parcelas;
    protected double jurosMensal;

    public CompraParcelada(double valor, int parcelas, double porcentagem) {
        super(valor);
        this.parcelas = parcelas;
        jurosMensal = porcentagem / 100;
    }

    @Override
    public double total() {
        return valor * Math.pow((1 + jurosMensal), parcelas);
    }
}
