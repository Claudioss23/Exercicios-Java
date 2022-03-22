package Praticando.Básico;

public class XOR {
    public static void main(String[] args) {

        //XOR é um condicional que diz se UM e APENAS UM operador
        //é diferente de outro.

        int a = 0, b = 1, c = 10, d = 10;
        boolean boo1 = true, boo2 = false;

        System.out.println(a ^ b);  //Operadores diferentes. (a = 0 e b = 1)
        System.out.println(c ^ d);  //Operadores iguais. (a = 10 e b = 10)
        System.out.println(c ^= d); //O mesmo que c = c ^ d, ou seja, 0, pois tem valores iguais.

        System.out.println(boo2 ^= boo1);   //O mesmo que boo2 = boo2 ^ boo1, ou seja, boo2, que era false, agora é true, pois os dois são diferentes.
    }
}
