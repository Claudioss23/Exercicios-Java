package Mediano.FormasDeTratamento.Testes;

import Mediano.FormasDeTratamento.Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAutoridade {

    @Test
    public void testAutoridadeRespeitosoMasculino() {
        FormatadorNome fn = new Respeitoso(true);
        Autoridade a = new Autoridade("Cláudio", "Souza", fn);

        System.out.println(a.getTratamento());

        Assertions.assertEquals("Sr. Souza", a.getTratamento());
    }

    @Test
    public void testAutoridadeRespeitosoFeminino() {
        FormatadorNome fn = new Respeitoso(false);
        Autoridade a = new Autoridade("Júlia", "Fernandes", fn);

        System.out.println(a.getTratamento());

        Assertions.assertEquals("Sra. Fernandes", a.getTratamento());
    }

    @Test
    public void testAutoridadeComTitulo() {
        FormatadorNome fn = new ComTitulo("Poderoso");
        Autoridade a = new Autoridade("Jesus", "Cristo", fn);

        System.out.println(a.getTratamento());

        Assertions.assertEquals("Poderoso Jesus Cristo", a.getTratamento());
    }

    @Test
    public void testAutoridadeInformal() {
        FormatadorNome fn = new Informal();
        Autoridade a = new Autoridade("Cláudio", "Souza", fn);

        System.out.println(a.getTratamento());

        Assertions.assertEquals("Cláudio", a.getTratamento());
    }
}
