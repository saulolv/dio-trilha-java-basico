package edu.saulo.banco_digital;

import lombok.Getter;

@Getter
public class Conta {

    protected static int SEQUENCIAL = 1;

    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;
    protected int agencia;

    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if(contaOrigem.getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }
        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
    }
}
