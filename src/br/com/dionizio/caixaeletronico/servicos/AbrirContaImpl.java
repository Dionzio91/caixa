package br.com.dionizio.caixaeletronico.servicos;

import br.com.dionizio.caixaeletronico.modelo.Conta;
import br.com.dionizio.caixaeletronico.repository.MemoriaContaRepository;

public class AbrirContaImpl implements AbrirConta{

    private final MemoriaContaRepository repository;

    public AbrirContaImpl (MemoriaContaRepository repository){
        this.repository = repository;

    }

    @Override
    public Conta execute (){
        Conta conta;
        conta = new Conta();

        repository.adiciona(conta);

        System.out.printf("Conta número %d o saldo atual é de R$ %.2f %n",conta.getNumeroDaConta(), conta.getValor());
        return conta;

    }
}
