package com.algaworks.gestaofesta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private Integer quantidadeDeAcompanhantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDeAcompanhantes() {
        return quantidadeDeAcompanhantes;
    }

    public void setQuantidadeDeAcompanhantes(Integer quantidadeDeAcompanhantes) {
        this.quantidadeDeAcompanhantes = quantidadeDeAcompanhantes;
    }
}
