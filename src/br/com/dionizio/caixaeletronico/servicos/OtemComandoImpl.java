package br.com.dionizio.caixaeletronico.servicos;

import java.util.Scanner;

public class OtemComandoImpl implements ObtemComando {


    @Override
    public int execute() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a opção desejada:");
        int escolha = entrada.nextInt();
        return escolha;
    }
}
