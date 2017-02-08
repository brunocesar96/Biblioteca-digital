package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@SequenceGenerator(name="arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Table(name = "Usuario")
public class Usuario {

    @Expose
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    private int Id;

    @Expose
    @Size(min=3, max=200)
    @Column(name = "NOME", nullable = false)
    private String nome;

    @Expose
    @Size(min=3, max=7)
    @Column(name = "SITUACAO", nullable = false)
    private String situacao;

    @Expose
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DATA_CADASTRO", nullable = false)
    private Date dataCadastro;

    @Expose
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;

    @Expose
    @Column(name = "CPF", unique = true, nullable = false)
    private String cpf;

    @Expose
    @Size(max=100)
    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @Expose
    @NotNull
    @Size(min=6, max=15)
    @Column(name = "SENHA", nullable = false)
    private String senha;

    @Expose
    @Column(name = "ESCOLARIDADE")
    private Escolaridade escolaridade;

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

     public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
}
