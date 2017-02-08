package br.gov.mec.negocio;

import br.gov.mec.persistencia.model.Entidade;
import com.google.gson.annotations.Expose;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Estado implements Entidade {

    @Expose
    @Id
    private long id;

    @Expose
    private String nome;

    @Expose
    private String sigla;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
