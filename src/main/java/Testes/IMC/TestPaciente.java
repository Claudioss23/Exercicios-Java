package Testes.IMC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPaciente {

    @Test
    public void testPesoBaixoMuitoGrave() {
        Paciente p = new Paciente(37, 1.6);

        System.out.println("Paciente: " + p.calcularIMC());

        Assertions.assertEquals(14, p.calcularIMC(), 0.5);
    }

    @Test
    public void testPesoBaixoGrave() {
        Paciente p = new Paciente(50, 1.75);

        System.out.println("Paciente: " + p.calcularIMC());

        Assertions.assertEquals(16, p.calcularIMC(), 0.99);
    }

    @Test
    public void testPesoBaixo() {
        Paciente p = new Paciente(50, 1.7);

        System.out.println("Paciente: " + p.calcularIMC());

        Assertions.assertEquals(17, p.calcularIMC(), 1.49);
    }

    @Test
    public void testPesoNormal() {
        Paciente p = new Paciente(90, 2);

        System.out.println("Paciente: " + p.calcularIMC());

        Assertions.assertEquals(18.5, p.calcularIMC(), 6.49);
    }

    @Test
    public void testSobrePeso() {
        Paciente p = new Paciente(110, 2);

        System.out.println("Paciente: " + p.calcularIMC());

        Assertions.assertEquals(25, p.calcularIMC(), 4.99);
    }

    @Test
    public void testObesidadeI() {
        Paciente p = new Paciente(125, 2);

        System.out.println("Paciente: " + p.calcularIMC());

        Assertions.assertEquals(30, p.calcularIMC(), 4.99);
    }

    @Test
    public void testObesidadeII() {
        Paciente p = new Paciente(150, 2);

        System.out.println("Paciente: " + p.calcularIMC());

        Assertions.assertEquals(35, p.calcularIMC(), 4.99);
    }

    @Test
    public void testObesidadeIII() {
        Paciente p = new Paciente(150, 1.8);

        System.out.println("Paciente: " + p.calcularIMC());

        Assertions.assertEquals(40, p.calcularIMC(), 10);
    }
}
