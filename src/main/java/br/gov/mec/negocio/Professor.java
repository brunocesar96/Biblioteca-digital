package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by brunocesar on 08/02/17.
 */
@Entity
@SequenceGenerator(name="arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Table
public class Professor {

    @Expose
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_seq")
    private Long Id;

    @Expose
    @Size(min=3, max=200)
    @Column(name = "NOME", nullable = false)
    private String nome;

    @Expose
    @Column(name = "CPF", unique = true, nullable = false)
    private String cpf;

    @Expose
    @Column(name = "escola",nullable = false)
    private Escola escola;

    @Expose
    @Column(name = "topicos")
    private List<Topico>listaTopicos;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public List<Topico> getListaTopicos() {
        return listaTopicos;
    }

    public void setListaTopicos(List<Topico> listaTopicos) {
        this.listaTopicos = listaTopicos;
    }
}
