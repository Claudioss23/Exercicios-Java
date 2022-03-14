package Praticando.Mediano.Corrida.Classes;

public class CarroSoma extends CarroDeCorrida{

    private final int potencia;

    public CarroSoma(int potencia, int velocidadeMaxima, String nome) {
        super(velocidadeMaxima, nome);
        this.potencia = potencia;
    }

    @Override
    public void acelerar() {
        velocidade += potencia;
        if (getVelocidade() > velocidadeMaxima) {
            velocidade = velocidadeMaxima;
        }
    }

}
