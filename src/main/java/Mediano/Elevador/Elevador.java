package Mediano.Elevador;

public class Elevador {

    private int andar,
            capElevador,
            pesPresentes = 0;

    public Elevador() {}

    public Elevador(int andar, int capElevador, int pesPresentes) {
        this.andar = andar;
        this.capElevador = capElevador;
        this.pesPresentes = pesPresentes;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getCapElevador() {
        return capElevador;
    }

    public void setCapElevador(int capElevador) {
        this.capElevador = capElevador;
    }

    public int getPesPresentes() {
        return pesPresentes;
    }

    public void setPesPresentes(int pesPresentes) {
        this.pesPresentes = pesPresentes;
    }

    public void iniciar() {
        this.capElevador = 5;
        this.andar = 0;
        System.out.println("Elevador está funcionando.");
    }

    public void entra() {
        if (this.pesPresentes < this.capElevador) {
            this.pesPresentes ++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio.");
        }
    }

    public void sai() {
        if (this.pesPresentes > 0) {
            this.pesPresentes --;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador está vazio.");
        }
    }

    public void sobe() {
        if (this.andar < 10){
            this.andar ++;
            System.out.println("Elevador subiu para o " + andar + "° andar.");
        } else {
            System.out.println("Elevador já está no último andar.");
        }
    }

    public void desce() {
        if (this.andar > 0) {
            this.andar --;
            if (this.andar == 0) {
                System.out.println("Elevador está no térreo.");
            } else {
                System.out.println("Elevador desceu para o " + andar + "° andar.");
            }
        } else {
            System.out.println("Elevador já está no térreo.");
        }
    }
}
