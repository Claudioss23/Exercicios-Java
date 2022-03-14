package Praticando.Testes.TesteAntesDepois;

import org.junit.jupiter.api.*;

public class TestAntesDepois {

    //Antes de cada teste:

    @BeforeEach
    public void before() {
        System.out.println("@Before");
    }

    //Depois de cada teste:

    @AfterEach
    public void after() {
        System.out.println("@After");
    }

    //Antes de todos os testes:

    @BeforeAll
    static void beforeClass() {
        System.out.println("@BeforeAll");
    }

    //Depois de todos os testes:

    @AfterAll
    static void afterClass() {
        System.out.println("@AfterAll");
    }

    //Testes:

    @Test
    public void test1() {
        System.out.println("Teste 1");
    }

    @Test
    public void test2() {
        System.out.println("Teste 2");
    }

    @Test
    public void test3() {
        System.out.println("Teste 3");
    }

}
