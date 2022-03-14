package Praticando.Básico;

public class Circulo {
    public static void main(String[] args) {

        //Calcular e mostrar perímetro e área do cículo usando o raio
        double raio = 10, perimetro, area;

        perimetro = 2 * 3.14159 * raio;
        area = 3.14159 * raio * raio;

        System.out.println("O perímetro é de " + perimetro + " m");
        System.out.println("A área é de " + area + " m");
    }
}
