package br.com.dionizio.caixaeletronico.modelo;

public class Conta {

    private int numeroDaConta;
    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getValor() {
        return saldo;
    }

    public void adicionarSaldo (double valor){
        saldo = saldo + valor;
    }

    public boolean retirarSaldo (double valor){
        if (saldo >= valor){
        saldo = saldo - valor;
        return true;
        }else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}
