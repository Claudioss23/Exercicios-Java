package Testes.Pizza;

import org.junit.jupiter.api.*;

public class TestPizza {

    @Test
    public void testePizzaPequenaPreco() {
        Pizza pizzaPequena = new Pizza();

        pizzaPequena.adicionaIngrediente("Mussarela");
        pizzaPequena.adicionaIngrediente("Tomate");

        //Checagem de preço
        pizzaPequena.getPreco();
    }

    @Test
    public void testePizzaPequenaIngredientes() {
        Pizza pizzaPequena = new Pizza();

        pizzaPequena.adicionaIngrediente("Mussarela");
        pizzaPequena.adicionaIngrediente("Tomate");

        //Checagem de ingredientes
        System.out.println(pizzaPequena.getIngredientes());
        System.out.println(Pizza.getMapIngredientes());

        //Removendo lista de ingredientes
        Pizza.zeraIngredientes();

        //Checagem de ingredientes zerados
        System.out.println(Pizza.getMapIngredientes());
    }

    @Test
    public void testePizzaMediaPreco() {
        Pizza pizzaMedia = new Pizza();

        pizzaMedia.adicionaIngrediente("Mussarela");
        pizzaMedia.adicionaIngrediente("Tomate");
        pizzaMedia.adicionaIngrediente("Oregano");
        pizzaMedia.adicionaIngrediente("Azeitona");

        //Checagem de preço
        pizzaMedia.getPreco();
    }

    @Test
    public void testePizzaMediaIngredientes() {
        Pizza pizzaMedia = new Pizza();

        pizzaMedia.adicionaIngrediente("Mussarela");
        pizzaMedia.adicionaIngrediente("Tomate");
        pizzaMedia.adicionaIngrediente("Oregano");
        pizzaMedia.adicionaIngrediente("Azeitona");

        //Checagem de ingredientes
        System.out.println(pizzaMedia.getIngredientes());
        System.out.println(Pizza.getMapIngredientes());

        //Removendo lista de ingredientes
        Pizza.zeraIngredientes();

        //Checagem de ingredientes zerados
        System.out.println(Pizza.getMapIngredientes());
    }

    @Test
    public void testePizzaGrandePreco() {
        Pizza pizzaGrande = new Pizza();

        pizzaGrande.adicionaIngrediente("Mussarela");
        pizzaGrande.adicionaIngrediente("Tomate");
        pizzaGrande.adicionaIngrediente("Oregano");
        pizzaGrande.adicionaIngrediente("Azeitona");
        pizzaGrande.adicionaIngrediente("Espinafre");
        pizzaGrande.adicionaIngrediente("Ketchup");

        //Checagem de preço
        pizzaGrande.getPreco();
    }

    @Test
    public void testePizzaGrandeIngredientes() {
        Pizza pizzaGrande = new Pizza();

        pizzaGrande.adicionaIngrediente("Mussarela");
        pizzaGrande.adicionaIngrediente("Tomate");
        pizzaGrande.adicionaIngrediente("Oregano");
        pizzaGrande.adicionaIngrediente("Azeitona");
        pizzaGrande.adicionaIngrediente("Espinafre");
        pizzaGrande.adicionaIngrediente("Ketchup");

        //Checagem de ingredientes
        System.out.println(pizzaGrande.getIngredientes());
        System.out.println(Pizza.getMapIngredientes());

        //Removendo lista de ingredientes
        Pizza.zeraIngredientes();

        //Checagem de ingredientes zerados
        System.out.println(Pizza.getMapIngredientes());
    }

    @Test
    public void testeCarrinho() {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        //Adicionando ingredientes
        for (int i = 0; i <= 6; i++) {
            p1.adicionaIngrediente("Mussarela");
        }
        for (int i = 0; i <= 1; i++) {
            p2.adicionaIngrediente("Oregano");
        }
        for (int i = 0; i <= 3; i++) {
            p3.adicionaIngrediente("Oregano");
        }

        //Verificando preços de cada pizza
        p1.getPreco();
        p2.getPreco();
        p3.getPreco();

        //Adicionando pizzas no carrinho
        c.addPizza(p1);
        c.addPizza(p2);
        c.addPizza(p3);

        //Verificando valor total
        System.out.println("\nValor total das pizzas: R$" + c.getValorTotal());
    }

    @Test
    public void testeCarrinhoSemIngredientes() {
        Pizza p = new Pizza();
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        //Adicionando pizza sem ingredientes ao carrinho
        c.addPizza(p);
    }
}
