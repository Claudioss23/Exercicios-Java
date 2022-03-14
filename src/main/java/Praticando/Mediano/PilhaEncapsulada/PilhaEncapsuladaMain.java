package Praticando.Mediano.PilhaEncapsulada;

import java.util.Arrays;

public class PilhaEncapsuladaMain {
    public static void main(String[] args) {

        Pilha p = new Pilha(10);

        p.empilhar("Eduardo");
        p.empilhar("Maria");
        p.empilhar("José");

        System.out.println(p.topo());
        System.out.println(p.tamanho());

        Object[] arrayElementos = p.getElementos();
        System.out.println(Arrays.toString(arrayElementos));
        System.out.println(arrayElementos.length);

        System.out.println("------------");

        arrayElementos[2] = "OUTRO";

        System.out.println(p.desempilhar());
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        System.out.println(Arrays.toString(arrayElementos));
        System.out.println(arrayElementos.length);
    }
}
