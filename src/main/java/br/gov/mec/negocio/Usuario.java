package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by andre on 07/02/17.
 */

@Entity
@SequenceGenerator(name = "arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Table(name = "Usuario")
public class Usuario {

    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    @Column(name = "Id")
    private int Id;

    @Expose
    @Column(name = "Nome")
    private String nome;

    @Expose
    @Column(name = "Situacao")
    private StatusAluno statusAluno;

    @Expose
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "Data_Cadastro")
    private Date dataCadastro;

    @Expose
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "Data_Nascimento")
    private Date dataNascimento;

    @Expose
    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private Arquivo foto;

    @Expose
    @Column(name = "CPF")
    private String cpf;

    @Expose
    @Column(name = "Email")
    private String email;

    @Expose
    private String senha;

    @Expose
    @Column(name = "Escolaridade")
    private TipoEscolaridade tipoEscolaridade;

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

    public StatusAluno getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(StatusAluno statusAluno) {
        this.statusAluno = statusAluno;
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

    public Arquivo getFoto() {
        return foto;
    }

    public void setFoto(Arquivo foto) {
        this.foto = foto;
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

    public TipoEscolaridade getTipoEscolaridade() {
        return tipoEscolaridade;
    }

    public void setTipoEscolaridade(TipoEscolaridade tipoEscolaridade) {
        this.tipoEscolaridade = tipoEscolaridade;
    }

}
