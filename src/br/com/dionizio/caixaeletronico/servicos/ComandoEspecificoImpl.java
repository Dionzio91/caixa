package br.com.dionizio.caixaeletronico.servicos;

import br.com.dionizio.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ComandoEspecificoImpl implements ComandoEspecifico {

    private final Deposito deposito;
    private final Saque saque;
    private final AbrirConta abrirConta;

    private final TED ted;


    public ComandoEspecificoImpl (){
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.saque = new SaqueImpl(repository);
        this.deposito = new DepositoImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
        this.ted = new TEDImpl(repository);
    }

    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {
            System.out.println("Operação encerrada!");
            resultado = false;

        }  else  if (comando == 1) {
            System.out.println("Digite o número da conta:");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor do saque:");
            double valor = entrada.nextInt();
            this.saque.execute(valor,numero);
            System.out.println("Você sacou R$" + valor);


        } else if (comando == 2) {
            System.out.println("Digite o número da conta:");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser depositado:");
            double valor = entrada.nextInt();
            this.deposito.execute(valor,numero);


        } else if (comando == 3) {
            abrirConta.execute();


        } else if (comando == 4) {

            System.out.println("Digite o número de sua conta: ");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor a ser transferido: ");
            double valorASerTransferido = entrada.nextInt();
            System.out.println("Digite a conta do favorecido: ");
            int contaQueRecebe = entrada.nextInt();
            this.ted.execute(valorASerTransferido, numeroDaConta,contaQueRecebe);


        }else {
            System.out.println("Comando inválido!");
        }


        return resultado;
        }

}