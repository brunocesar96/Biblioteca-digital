package br.gov.mec.negocio;
import com.google.gson.annotations.Expose;

import javax.persistence.*;

/**
 * Created by andre on 07/02/17.
 */
@Entity
@SequenceGenerator(name = "instituicao_seq", sequenceName = "insituicao_seq", initialValue = 1)
public class Instituicao {

    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "insituicao_seq")
    private long id;

    @Expose
    private String escola;

    @Expose
    private Estado estado;

    @Expose
    private Municipio municipio;

    @Expose
    private StatusEscolar statusEscolar;

    public StatusEscolar getStatusEscolar() {
        return statusEscolar;
    }

    public void setStatusEscolar(StatusEscolar statusEscolar) {
        this.statusEscolar = statusEscolar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}

