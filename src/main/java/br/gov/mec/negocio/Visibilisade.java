package br.gov.mec.negocio;

/**
 * Created by brunocesar on 08/02/17.
 */
public enum Visibilisade {

    RESTRITA("Restrita"),
    ESCOLA("Escola"),
    SISTEMA("Sistema");

    private String visibilidade;

    Visibilisade(String visibilidade){

        this.visibilidade=visibilidade;

    }

    public String getVisibilidade(){

        return visibilidade;
    }


}
