package Básico;

public class LevantamentoCavalos {
    public static void main(String[] args) {

        //Calcular quantos cavalos são necessários para levantar uma massa m a uma altura h em t segundos

        double m = 650, h = 40, t = 40, cavalos;

        cavalos = (m * h / t) / 745.6999;

        System.out.println("A quantidade de cavalos é: " + cavalos);

    }
}
