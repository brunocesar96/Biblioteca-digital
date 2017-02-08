package br.gov.mec.persistencia.framework.util;

/**
 * Created by brunocesar on 08/02/17.
 */
public enum Ordenacao {
    ASCENDENTE("ASC", true), DESCENDENTE("DESC", false);

    private String valor;
    private boolean valorBooleano;

    private Ordenacao(String valor) {
        this.valor = valor;
    }

    private Ordenacao(String valor, boolean valorBooleano) {
        this.valor = valor;
        this.valorBooleano = valorBooleano;
    }

    public String getValor() {
        return this.valor;
    }

    public boolean getValorBooleano() {
        return this.valorBooleano;
    }

    @Override
    public String toString() {
        return this.getValor();
    }
}