package Mediano.Pizza;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private double valorTotal = 0;

    public void addPizza(Pizza pizza) {
        if (!pizza.getIngredientes().isEmpty()) {
            pizzas.add(pizza);
        }
    }

    public double getValorTotal() {
        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }
        return valorTotal;
    }

    public int totalPizzas() {
        return pizzas.size();
    }
}
