package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsIncristos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

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

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsIncristos() {
        return devsIncristos;
    }

    public void setDevsIncristos(Set<Dev> devsIncristos) {
        this.devsIncristos = devsIncristos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BootCamp bootCamp = (BootCamp) object;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(dataFinal, bootCamp.dataFinal) && Objects.equals(devsIncristos, bootCamp.devsIncristos) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsIncristos, conteudos);
    }
}
