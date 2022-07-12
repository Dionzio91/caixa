package br.com.dionizio.caixaeletronico.servicos;

import java.util.Scanner;


public class SelecionaComando {

    ListarComandos listarComandos;
    ObtemComando obtemComando;

    ComandoEspecifico comandoEspecifico;

    public SelecionaComando() {
        this.listarComandos = new ListarComandoImpl();
        this.obtemComando = new OtemComandoImpl();
        this.comandoEspecifico = new ComandoEspecificoImpl();
    }

    public boolean executar (){
        listarComandos.execute();
        int comando = obtemComando.execute();
        comandoEspecifico.execute(comando);

      return true;
    }






    }

