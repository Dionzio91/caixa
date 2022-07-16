package br.com.dionizio.caixaeletronico.servicos;

import br.com.dionizio.caixaeletronico.modelo.Conta;
import br.com.dionizio.caixaeletronico.repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito{

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    @Override

    public void execute(double valor, int numeroDaConta) {
        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.adicionarSaldo(valor);


        System.out.println("Depositando:" + valor);
        System.out.println("Número da conta:" + numeroDaConta);
        System.out.printf("O saldo resultante é de R$ %.2f %n", conta.getValor() );

    }
}
