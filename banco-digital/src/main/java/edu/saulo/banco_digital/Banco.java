package edu.saulo.banco_digital;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : this.contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criando testes

        Cliente cliente1 = new Cliente("João", "123.456.789-00", "123", "123");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00", "321", "321");

        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupanca(cliente2);

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(1000);

        conta2.depositar(500);
    }




}
