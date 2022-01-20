package Testes.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

    private double preco;
    public static int qtdIngredientes = 0;
    private ArrayList <String>  ingredientes = new ArrayList<>();
    public static Map <String, Integer> mapIngredientes = new HashMap<>();

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public static Map<String, Integer> getMapIngredientes() {
        return mapIngredientes;
    }

    public static void contabilizaIngrediente(String ingrediente) {
        if(mapIngredientes.containsKey(ingrediente)) {
            int valor = mapIngredientes.get(ingrediente);
            mapIngredientes.put(ingrediente, valor+1);
        } else {
            mapIngredientes.put(ingrediente, 1);
        }
        qtdIngredientes++;
    }

    public void adicionaIngrediente(String ingrediente){
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    public double getPreco() {
        if (ingredientes.size() == 0) {
            System.out.println("Não é possível vender uma pizza sem ingredientes");
        } else if(ingredientes.size() <= 2) {
            System.out.println("A pizza custa R$15,00");
            preco = 15;
        } else if(ingredientes.size() > 3 && ingredientes.size() <= 5) {
            System.out.println("A pizza custa R$20,00");
            preco = 20;
        } else if(ingredientes.size() > 5) {
            System.out.println("A pizza custa R$23,00");
            preco = 23;
        }
        return preco;
    }

    public static void zeraIngredientes() {
        mapIngredientes.clear();
        qtdIngredientes = 0;
    }
}

