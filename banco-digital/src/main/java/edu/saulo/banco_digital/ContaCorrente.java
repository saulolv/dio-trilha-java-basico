package edu.saulo.banco_digital;

public class ContaCorrente extends Conta {

    private static final int AGENCIA = 11;


    private final double limiteChequeEspecial = 1000;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.agencia = AGENCIA;
    }

    public void usarChequeEspecial(double valor) {
        if (valor > this.limiteChequeEspecial) {
            System.out.println("Valor excede o limite do cheque especial");
        } else {
            this.saldo -= valor;
        }
    }

}
