package Praticando.Testes.Pizza;

public class PizzaMain {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Pizza pizzaPequena = new Pizza();
        Pizza pizzaMedia = new Pizza();
        Pizza pizzaGrande = new Pizza();

        pizzaPequena.adicionaIngrediente("Mussarela");
        pizzaPequena.adicionaIngrediente("Tomate");

        pizzaMedia.adicionaIngrediente("Mussarela");
        pizzaMedia.adicionaIngrediente("Tomate");
        pizzaMedia.adicionaIngrediente("Oregano");
        pizzaMedia.adicionaIngrediente("Azeitona");

        pizzaGrande.adicionaIngrediente("Mussarela");
        pizzaGrande.adicionaIngrediente("Tomate");
        pizzaGrande.adicionaIngrediente("Oregano");
        pizzaGrande.adicionaIngrediente("Azeitona");
        pizzaGrande.adicionaIngrediente("Espinafre");
        pizzaGrande.adicionaIngrediente("Ketchup");

        carrinho.addPizza(pizzaPequena);
        carrinho.addPizza(pizzaMedia);
        carrinho.addPizza(pizzaGrande);

        System.out.println("Total de pizzas no carrinho: " + carrinho.totalPizzas());
        System.out.println("Valor total: R$" + carrinho.getValorTotal());
        System.out.println("Lista de ingredientes: \n" + Pizza.getMapIngredientes());

    }
}
