package Mediano.Circulo;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return (Math.PI * Math.pow(this.raio, 2));
    }

    public double getCircuferencia() {
        return ((2 * Math.PI) * this.raio);
    }

    public void aumentarRaio(double porcentagem) {
        this.raio = this.raio + (porcentagem / 100) * this.raio;
    }
}
