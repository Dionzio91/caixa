package br.com.dionizio.caixaeletronico.servicos;

import br.com.dionizio.caixaeletronico.modelo.Conta;
import br.com.dionizio.caixaeletronico.repository.MemoriaContaRepository;

public class TEDImpl implements TED{
    private final MemoriaContaRepository repository;

    public TEDImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public double execute(double valorASerTransferido, int numeroDaConta, int contaQueRecebe) {
        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.retirarSaldo(valorASerTransferido);
        conta.adicionarSaldo(contaQueRecebe);
        boolean tedRealizada = conta.retirarSaldo(valorASerTransferido);
        if (tedRealizada) {
            System.out.printf("TED realizadao! Seu saldo atual é de R$ %.2f (sujeito a alteração até o final do dia)!%n", conta.getValor());
        }

        return valorASerTransferido;

    }
}
