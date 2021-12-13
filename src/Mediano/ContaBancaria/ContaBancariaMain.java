package Mediano.ContaBancaria;

public class ContaBancariaMain {
    public static void main(String[] args) {

        ContaBancaria cb = new ContaBancaria();

        System.out.println("Saldo atual: " + cb.getSaldo());
        System.out.println("Saldo atual formatado: " + cb.getSaldoFormatado());
        System.out.println("Data de abertura: " + cb.getDataAbetura());
        System.out.println("Data de abertura formatada: " + cb.getDataAberturaFormatada());

        cb.depositar(3409.00);

        System.out.println("Saldo atual: " + cb.getSaldo());
        System.out.println("Saldo atual formatado: " + cb.getSaldoFormatado());

        cb.sacar(500.00);

        System.out.println("Saldo atual: " + cb.getSaldo());
        System.out.println("Saldo atual formatado: " + cb.getSaldoFormatado());

        cb.sacar(2910.00 );
    }
}
