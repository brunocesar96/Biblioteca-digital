package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by brunocesar on 08/02/17.
 */
@Entity
@SequenceGenerator(name="arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Table
public class Professor {

    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_seq")
    private int Id;

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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
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

    /**
     * Created by andre on 07/02/17.
     */
    public static enum TipoEscolaridade {

        FUNDAMENTAL, MEDIO, GRADUACAO, ESPECIALIZACAO, MESTRADO, DOUTORADO, POS_DOUTORADO;
    }
}
