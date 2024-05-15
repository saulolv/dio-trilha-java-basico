package edu.saulo.banco_digital;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Cliente {
    @Setter
    private String nome;
    private final String cpf;
    private String email;
    private String senha;
    private String telefone;

    private Conta conta;

    public Cliente(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public Cliente(String nome, String cpf, String email, String senha, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

}