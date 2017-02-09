package br.gov.mec.negocio;

import java.util.ArrayList;

/**
 * Created by brunocesar on 08/02/17.
 */
public class ProducaoEducacional implements Base {

    private int id;
    private String nome;
    private String descricao;
    private ArrayList<String> palavrasChave;
    private ArrayList<String> autores;
    private Arquivo arq;
    private String objetivo;
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
