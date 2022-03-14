package Praticando.Mediano.Corrida;

import Praticando.Mediano.Corrida.Classes.CarroMult;
import Praticando.Mediano.Corrida.Classes.CarroSoma;
import Praticando.Mediano.Corrida.Classes.Corrida;

public class CorridaMain {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(2000);

        corrida.adicionaCarro(new CarroSoma(10,110, "CarroA"));
        corrida.adicionaCarro(new CarroSoma(8,140, "CarroB"));
        corrida.adicionaCarro(new CarroMult(100,1.7, "CarroC"));
        corrida.adicionaCarro(new CarroMult(110,1.4, "CarroD"));

        corrida.largada();
    }
}
