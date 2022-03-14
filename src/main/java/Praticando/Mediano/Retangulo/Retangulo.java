package Praticando.Mediano.Retangulo;

public class Retangulo {

    private double largura = 1, altura = 1;
    private static String cor = "Branco";

    public Retangulo() {
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static String getCor() {
        return cor;
    }

    public static void setCor(String cor) {
        Retangulo.cor = cor;
    }

    public double getArea() {
        return (this.largura * this.altura);
    }

    public double getPerimetro() {
        return ((2 * this.largura) + (2 * this.altura));
    }
}
