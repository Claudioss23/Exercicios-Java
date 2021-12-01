package Básico;

public class Azulejos {
    public static void main(String[] args) {

        //Calcular quantidade de azulejos com a altura e largura da parede e do azulejo

        double hp = 2.6, lp = 1.6, ha = 0.35, la = 0.3, qtd;

        qtd = (hp* lp) / (ha * la);

        System.out.println("A quantidade de azulejos é de: " + qtd);
    }
}
