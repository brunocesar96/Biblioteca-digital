package br.gov.mec.persistencia;

import br.gov.mec.negocio.ProducaoEducacional;

/**
 * Created by brunocesar on 08/02/17.
 */
public interface ProducaoEducacionalDao extends GenericDao<ProducaoEducacional, Integer> {

    public ProducaoEducacional getProducaoEducacional(String nome);

}
