package Testes.Carro;

public class Carro {

    int potencia;
    int velocidade;
    String nome;

    void acelerar() {
        velocidade += potencia;
    }

    void frear() {
        velocidade /= 2;
    }

    int getVelocidade() {
        return velocidade;
    }

    void imprimir() {
        System.out.println("O carro " + nome + " está à velocidade " + getVelocidade() + " km/h");
    }
}
