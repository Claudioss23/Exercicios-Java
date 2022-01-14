package Básico;

public class Horario {
    public static void main(String[] args) {

        //Pegar o horário e mostrar quantos segundos passaram e restam

        int hora = 2, minuto = 35, segundo = 43, passado, restante;

        passado = segundo + minuto * 60 + hora * 3600;

        restante = 86400 - passado;

        System.out.println("Passaram-se " + passado + " segundos");
        System.out.println("Restam " + restante + " segundos");
    }
}
