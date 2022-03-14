package Praticando.Mediano.ContaBancaria;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class ContaBancaria {

    private double saldo;
    private final Date dataAbetura;

    public ContaBancaria() {
        this.saldo = 0.0;
        this.dataAbetura = new Date();
        System.out.println("Abertura de conta realizada com sucesso");
    }

    public Date getDataAbetura() {
        return dataAbetura;
    }

    public String getDataAberturaFormatada() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return df.format(this.dataAbetura);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSaldoFormatado() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.saldo);
    }

    public void depositar(double quantia) {
        this.saldo = this.saldo + quantia;
        System.out.println("Novo depósito efetuado.");
    }

    public void sacar(double quantia) {
        if ((this.saldo - quantia) < 0) {
            System.out.println("Saldo insuficiente para este saque.");
        } else {
            this.saldo = this.saldo - quantia;
            System.out.println("Novo saque efetuado.");
        }
    }
}
