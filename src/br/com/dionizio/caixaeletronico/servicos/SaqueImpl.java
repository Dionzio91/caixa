package br.com.dionizio.caixaeletronico.servicos;

import br.com.dionizio.caixaeletronico.modelo.Conta;
import br.com.dionizio.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque{
    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    public Double execute(double valorASersacado, int numeroDaConta){
        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.adicionarSaldo(valorASersacado);


        System.out.println("Sacando:" + valorASersacado);
        System.out.println("Número da conta:" + numeroDaConta);
        System.out.printf("O saldo resultante é de R$ %.2f %n", conta.getValor() - valorASersacado);


        return valorASersacado;
    }
}
