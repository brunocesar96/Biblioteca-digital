package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by andre on 07/02/17.
 */

@Entity
@SequenceGenerator(name="arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Table(name = "Usuario")
public class Usuario {

    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    private Long Id;

    @Expose
    private String nome;

    @Expose
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataCadastro;

    @Expose
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;

    @Expose
    private String cpf;

    @Expose
    private String email;

    @Expose
    private String senha;

    @Expose
    private Escolaridade tipoEscolaridade;

    @Expose StatusUsuario statusAluno;

    public StatusUsuario getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(StatusUsuario statusAluno) {
        this.statusAluno = statusAluno;
    }

    public Escolaridade getTipoEscolaridade() {
        return tipoEscolaridade;
    }

    public void setTipoEscolaridade(Escolaridade tipoEscolaridade) {
        this.tipoEscolaridade = tipoEscolaridade;
    }

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

     public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
