package Praticando.Mediano.Corrida.Classes;

public abstract class CarroDeCorrida {

    protected int velocidade;
    protected int velocidadeMaxima;
    protected String nome;

    public CarroDeCorrida(int velocidadeMaxima, String nome) {
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    public abstract void acelerar();

    public void frear() {
        velocidade /= 2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getNome() {
        return nome;
    }
}
