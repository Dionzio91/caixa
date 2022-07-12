package br.com.dionizio.caixaeletronico.servicos;

public interface Saque {

    Double execute(double valor, int numeroDaConta);
}
