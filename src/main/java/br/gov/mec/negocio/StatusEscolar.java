package br.gov.mec.negocio;

/**
 * Created by andre on 07/02/17.
 */
public enum  StatusEscolar {

       ABANDONADO("Abandonado"),
       EM_ANDAMENTO("Em andamento"),
       FINALIZADO("Finalizado");


       private String statusEscolar;

       StatusEscolar (String statusEscolar){

              this.statusEscolar=statusEscolar;

       }

       public String getStatusEscolar(){

              return statusEscolar;
       }

}
