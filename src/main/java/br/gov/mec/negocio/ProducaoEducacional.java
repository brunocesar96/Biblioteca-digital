package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by brunocesar on 08/02/17.
 */
@Entity
@SequenceGenerator(name = "arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Table(name = "producaoEducacional")
public class ProducaoEducacional implements Base {

    @Expose
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producaoEducacional_seq")
    @Column(name = "Id")
    private long Id;

    @Expose
    @Column(name = "Nome")
    private String nome;

    @Expose
    @Column(name = "descricao")
    private String descricao;

    @Expose
    @Column(name = "palavrasChave")
    private ArrayList<String> palavrasChave;

    @Expose
    @Column(name = "autores")
    private ArrayList<String> autores;

    @Expose
    @Column(name = "arquivo")
    private Arquivo arquivo;

    @Expose
    @Column(name = "objetivo")
    private String objetivo;

    @Expose
    @Column(name = "visibilidade")
    private Visibilisade visibilisade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<String> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(ArrayList<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public Arquivo getArq() {
        return arquivo;
    }

    public void setArq(Arquivo arq) {
        this.arquivo = arq;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Visibilisade getVisibilisade() {
        return visibilisade;
    }

    public void setVisibilisade(Visibilisade visibilisade) {
        this.visibilisade = visibilisade;
    }

    @Override
    public void setId(long id) {

    }

    @Override
    public long getId() {
        return 0;
    }
}

