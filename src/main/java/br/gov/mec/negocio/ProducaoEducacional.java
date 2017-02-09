package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;
import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by brunocesar on 08/02/17.
 */
@Entity
@SequenceGenerator(name="arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Table(name = "producaoEducacional")
public class ProducaoEducacional {

    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producaoEducacional_seq")
    private Long id;

    @Expose
    @NotNull
    private String nome;

    @Expose
    @NotNull
    private String descricao;

    @Expose
    private ArrayList<String> palavrasChave;

    @Expose
    private ArrayList<String> autores;

    @Expose
    @NotNull
    private Arquivo arq;

    @Expose
    private String objetivo;

    @Expose
    private Visibilisade visibilisade;


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
        return arq;
    }

    public void setArq(Arquivo arq) {
        this.arq = arq;
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
}
