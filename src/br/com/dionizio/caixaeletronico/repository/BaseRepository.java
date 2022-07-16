package br.com.dionizio.caixaeletronico.repository;

import br.com.dionizio.caixaeletronico.modelo.Conta;

import java.util.List;

public interface BaseRepository<T> {

    List<Conta> findAll();

    Conta findById(int id);


    void adiciona(Conta objeto);

}




