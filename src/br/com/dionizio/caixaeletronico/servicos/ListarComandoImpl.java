package br.com.dionizio.caixaeletronico.servicos;

public class ListarComandoImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Digite 0 para encerrar operação.");
        System.out.println("Digite 1 para saque:");
        System.out.println("Digite 2 para depósito:");

    }
}
