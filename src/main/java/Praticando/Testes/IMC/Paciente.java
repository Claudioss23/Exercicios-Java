package Praticando.Testes.IMC;

public class Paciente {

    private final double peso, altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void diagnostico() {
        double imc = calcularIMC();

        if (imc < 16) {
            System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
        }
        if (imc >= 16 && imc <= 16.99) {
            System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
        }
        if (imc >= 17 && imc <= 18.49) {
            System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m²");
        }
        if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
        }
        if (imc >= 25 && imc <= 29.99) {
            System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
        }
        if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
        }
        if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
        }
        if (imc >= 40) {
            System.out.println("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
        }

    }
}
