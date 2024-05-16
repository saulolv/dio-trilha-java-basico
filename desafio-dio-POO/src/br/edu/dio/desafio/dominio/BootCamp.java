package br.edu.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String nome;
    private String descricao;

    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = LocalDate.now().plusDays(45);

    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devs = new HashSet<>();

    public BootCamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BootCamp bootCamp)) return false;
        return Objects.equals(getNome(), bootCamp.getNome()) && Objects.equals(getDescricao(), bootCamp.getDescricao()) && Objects.equals(getConteudos(), bootCamp.getConteudos()) && Objects.equals(getDevs(), bootCamp.getDevs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getConteudos(), getDevs());
    }

    @Override
    public String toString() {
        return "BootCamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", conteudos=" + conteudos +
                ", devs=" + devs +
                '}';
    }
}
