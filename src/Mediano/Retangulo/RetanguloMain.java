package Mediano.Retangulo;

public class RetanguloMain {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo(10, 5);

        Retangulo.setCor("verde");

        System.out.println("Primeiro retângulo\n");
        System.out.println("Largura: " + retangulo1.getLargura());
        System.out.println("Altura: " + retangulo1.getAltura());
        System.out.println("Cor: " + Retangulo.getCor());
        System.out.println("Área: " + retangulo1.getArea() + " metros quadrados");
        System.out.println("Perímetro: " + retangulo1.getPerimetro() + " metros\n");

        System.out.println("Segundo retângulo\n");
        System.out.println("Largura: " + retangulo2.getLargura());
        System.out.println("Altura: " + retangulo2.getAltura());
        System.out.println("Cor: " + Retangulo.getCor());
        System.out.println("Área: " + retangulo2.getArea() + " metros quadrados");
        System.out.println("Perímetro: " + retangulo2.getPerimetro() + " metros\n");
    }
}
