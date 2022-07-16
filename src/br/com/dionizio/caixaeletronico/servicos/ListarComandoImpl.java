package br.com.dionizio.caixaeletronico.servicos;

public class ListarComandoImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Digite 0 para encerrar operação.");
        System.out.println("Digite 1 para Saque:");
        System.out.println("Digite 2 para Depósito:");
        System.out.println("Digite 3 para Abrir uma conta:");
        System.out.println("Digite 4 para Realizar transferência:");


    }
}
