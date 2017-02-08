package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by andre on 07/02/17.
 */
@Entity
public class Municipio {

    @Expose
    @Id
    private long id;

    @Expose
    private String nome;

    @Expose
    @ManyToOne
    private Estado estado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

