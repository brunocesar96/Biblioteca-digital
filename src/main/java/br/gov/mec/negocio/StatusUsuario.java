package br.gov.mec.negocio;

/**
 * Created by andre on 07/02/17.
 */
public enum  StatusUsuario {
    ATIVO("Ativo"),
    INATIVO("Inativo");

    private String statusUsuario;

    StatusUsuario(String statusUsuario){

        this.statusUsuario=statusUsuario;
    }

    public String getStatusUsuario(){

        return statusUsuario;

    }


}
