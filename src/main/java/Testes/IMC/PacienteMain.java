package Testes.IMC;

public class PacienteMain {
    public static void main(String[] args) {

        Paciente p1 = new Paciente(90, 2);
        Paciente p2 = new Paciente(37.5, 1.6);
        Paciente p3 = new Paciente(150, 1.8);

        System.out.println("_______________________________");
        System.out.println("Paciente 1: " + p1.calcularIMC() + "\nIMC: ");
        p1.diagnostico();
        System.out.println("_______________________________");

        System.out.println("Paciente 2: " + p2.calcularIMC() + "\nIMC: ");
        p2.diagnostico();
        System.out.println("_______________________________");

        System.out.println("Paciente 3: " + p3.calcularIMC() + "\nIMC: ");
        p3.diagnostico();
        System.out.println("_______________________________");
    }
}
