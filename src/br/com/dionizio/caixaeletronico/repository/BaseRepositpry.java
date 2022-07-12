package br.com.dionizio.caixaeletronico.repository;

import br.com.dionizio.caixaeletronico.modelo.Conta;

import java.util.List;

public interface BaseRepositpry <T>{
    List<Conta> findAll();



}
