package Praticando.Testes.Zodiaco.Testes;

import Praticando.Testes.Zodiaco.Classes.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class TestPessoa {

    Pessoa p;
    Pessoa p2;
    Pessoa p3;

    @BeforeEach
    public void setPessoas() throws ParseException {
        p = new Pessoa("17-08-2001");
        p2 = new Pessoa("25-05-1990");
        p3 = new Pessoa("01-02-1974");
    }

    @Test
    public void testIdade() {
        System.out.println("P1 Idade: " + p.getIdade());
        System.out.println("P2 Idade: " + p2.getIdade());
        System.out.println("P3 Idade: " + p3.getIdade());

        Assertions.assertEquals(21, p.getIdade());
        Assertions.assertEquals(32, p2.getIdade());
        Assertions.assertEquals(48, p3.getIdade());
    }

    @Test
    public void testSigno() {
        System.out.println("P1 Signo: " + p.getSigno());
        System.out.println("P2 Signo: " + p2.getSigno());
        System.out.println("P3 Signo: " + p3.getSigno());

        Assertions.assertEquals("Leão: 22 de julho - 22 de agosto", p.getSigno());
        Assertions.assertEquals("Gêmeos: 21 de maio - 20 de junho", p2.getSigno());
        Assertions.assertEquals("Aquário: 21 de Janeiro - 19 de fevereiro", p3.getSigno());
    }
}
