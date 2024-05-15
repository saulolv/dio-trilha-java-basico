package edu.saulo.banco_digital;

public class ContaPoupanca extends Conta {

    private static final int AGENCIA = 13;

    private final double taxaRendimento = 0.05;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.agencia = AGENCIA;
    }

    public void render() {
        this.saldo += this.saldo * this.taxaRendimento;
    }


}
