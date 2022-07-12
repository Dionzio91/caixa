package br.com.dionizio.caixaeletronico.servicos;

public class DepositoImpl implements Deposito{

    @Override

    public void execute(double valor, int numeroDaConta) {
        System.out.println("Depositando:" + valor);
        System.out.println("Número da conta:" + numeroDaConta);

    }
}
