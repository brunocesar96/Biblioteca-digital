package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;
import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "topico")
public class Topico {

    @Id
    private Long id;

    @NotNull
    @Expose
    @Size(max = 25)
    @Id
    private String nome;

    @NotNull
    @Expose
    @Size(max = 200)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTopico() {
        return nome;
    }

    public void setTopico(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
