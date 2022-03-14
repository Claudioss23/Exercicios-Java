package Praticando.Mediano.Corrida.Classes;

public class CarroMult extends CarroDeCorrida{

    private final double potencia;

    public CarroMult(int velocidadeMaxima, double potencia, String nome) {
        super(velocidadeMaxima, nome);
        if(potencia > 1 && potencia < 2) {
            this.potencia = potencia;
        } else {
            this.potencia = 1.5;
        }
    }

    @Override
    public void acelerar() {
        if(velocidade == 0) {
            velocidade = 10;
        } else {
            velocidade *= potencia;
            if (velocidade > velocidadeMaxima) {
                velocidade = velocidadeMaxima;
            }
        }
    }
}
