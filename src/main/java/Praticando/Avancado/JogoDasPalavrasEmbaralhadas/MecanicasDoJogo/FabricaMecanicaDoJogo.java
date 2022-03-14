package Praticando.Avancado.JogoDasPalavrasEmbaralhadas.MecanicasDoJogo;

public class FabricaMecanicaDoJogo {

    private static MecanicaDoJogo mecanica;

    public static MecanicaDoJogo getMecanica() {
        return mecanica;
    }

    public static void setMecanica(MecanicaDoJogo mecanica) {
        FabricaMecanicaDoJogo.mecanica = mecanica;
    }
}
