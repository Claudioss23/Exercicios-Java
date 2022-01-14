package Mediano.Ventilador;

public class Ventilador {

    public static final int BAIXA = 1;
    public static final int MEDIA = 2;
    public static final int RAPIDA = 3;

    private int velocidade = BAIXA;
    private boolean ligado = false;
    private String cor = "Branco";

    public Ventilador() {}

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        String status = "Desligado";
        if (this.ligado) {
            status = "Ligado";
        }

        return "Velocidade: " + this.velocidade + "; Cor: " + this.cor + "; " + "Status: " + status;
    }
}

