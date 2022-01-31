package Mediano.PilhaEncapsulada;

public class PilhaEncapsuladaMain {
    public static void main(String[] args) {

        Pilha p = new Pilha(10);

        p.empilhar("Eduardo");
        p.empilhar("Maria");
        p.empilhar("José");

        System.out.println(p.topo());
        System.out.println(p.tamanho());

        System.out.println("------------");

        System.out.println(p.desempilhar().toString().toUpperCase());

        System.out.println(p.topo().toString().toUpperCase());
        System.out.println(p.tamanho());
    }
}
