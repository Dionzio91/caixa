package br.com.dionizio.caixaeletronico.servicos;

public class ComandoEspecificoImpl implements ComandoEspecifico {

    private final Deposito deposito;

    public ComandoEspecificoImpl (){
        this.deposito = new DepositoImpl();
    }

    @Override
    public boolean execute(int comando) {
        boolean resultado = true;

        if (comando == 1) {
            System.out.println("Você sacou R$ valor.");


        } else if (comando == 2) {
            deposito.execute(10,13);


        } else if (comando == 0) {
            System.out.println("Operação encerrada!");
            resultado = false;

        } else {
            System.out.println("Comando inválido!");

        }


        return resultado;
    }
}