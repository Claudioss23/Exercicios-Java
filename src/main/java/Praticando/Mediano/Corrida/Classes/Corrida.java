package Praticando.Mediano.Corrida.Classes;

import java.util.HashMap;
import java.util.Map;

public class Corrida {

    private final int pista;
    private final Map<CarroDeCorrida, Integer> carros = new HashMap<>();

    public Corrida(int pista) {
        this.pista = pista;
    }

    public void adicionaCarro(CarroDeCorrida carro) {
        carros.put(carro, 0);
    }

    public void largada() {
        while(!terminou()) {
            for (CarroDeCorrida carro : carros.keySet()) {
                carro.acelerar();
                int distancia = carros.get(carro);
                distancia += carro.getVelocidade();
                carros.put(carro, distancia);
            }
        }
        for (CarroDeCorrida carro : carros.keySet()) {
            System.out.println(carro.getNome() + " - " + carros.get(carro));
        }
    }

    private boolean terminou() {
        for(Integer valor : carros.values()) {
            if(valor > pista) {
                return true;
            }
        }
        return false;
    }
}
