package br.com.dionizio.caixaeletronico;

import br.com.dionizio.caixaeletronico.servicos.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa Eletônico Ligado");

        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()) {
            System.out.println("Executando um novo comando!");
        }

        System.out.println("Caixa Eletrõnico Desligando");

    }

}
