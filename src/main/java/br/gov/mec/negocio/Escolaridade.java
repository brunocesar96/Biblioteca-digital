package br.gov.mec.negocio;

/**
 * Created by brunocesar on 08/02/17.
 */
public enum Escolaridade {

    FUNDAMENTAL("Fundamental"),
    MEDIO("Médio"),
    GRADUACAO("Graduação"),
    ESPECIALIZACAO("Especialização"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado"),
    POS_DOUTORADO("Pós doutorado");

    private String escolaridade;

    Escolaridade(String escolaridade) {

        this.escolaridade=escolaridade;

    }

    public String getEscolaridade(){

        return escolaridade;
    }

}
