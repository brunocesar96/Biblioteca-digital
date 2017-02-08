package br.gov.mec.persistencia;

import br.gov.mec.negocio.ProducaoEducacional;

/**
 * Created by brunocesar on 08/02/17.
 */
public interface ProducaoEduDao extends GenericDAO<ProducaoEducacional,Integer> {

    @Override
    void salvar(ProducaoEducacional entidade);

    @Override
    void editar(ProducaoEducacional entidade, Integer integer);


}
