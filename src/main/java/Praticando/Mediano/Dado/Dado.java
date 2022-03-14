package Praticando.Mediano.Dado;

public class Dado {

    private final int FACES = 6;
    private int valorFace;

    public Dado() {
        valorFace = 1;
    }

    public int getValorFace() {
        return valorFace;
    }

    public void setValorFace(int valorFace) {
        if ((valorFace > 0) && (valorFace <= FACES)) {
            this.valorFace = valorFace;
        } else {
            System.out.println("Valor inválido para a face do dado");
        }
    }

    public void rolar() {
        this.valorFace = (int) (Math.random() * FACES) + 1;
    }

    public int getQuantidadeFaces() {
        return this.FACES;
    }

}
