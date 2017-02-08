package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by brunocesar on 08/02/17.
 */
@Entity
@SequenceGenerator(name = "arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Table
public class Escola {

    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "escola_seq")
    private int inep;

    @Expose
    @Size(max = 15)
    @Column(name = "nomeEscola")
    private String nomeEscola;

    @Expose
    @Column(name = "estado", nullable = false)
    private String estado;

    @Expose
    @Column(name = "municipio", nullable = false)
    private String municipio;

    @Expose
    @Column(name = "situacao", nullable = false)
    private StatusEscolar situcao;

    public int getInep() {
        return inep;
    }

    public void setInep(int inep) {
        this.inep = inep;
    }

    public String getNome_Escola() {
        return nomeEscola;
    }

    public void setNome_Escola(String nome_Escola) {
        this.nomeEscola = nome_Escola;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public StatusEscolar getSitucao() {
        return situcao;
    }

    public void setSitucao(StatusEscolar situcao) {
        this.situcao = situcao;
    }
}
