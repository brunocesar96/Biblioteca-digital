package br.gov.mec.persistencia;

import br.gov.mec.negocio.ProducaoEducacional;
import org.hibernate.Query;

/**
 * Created by brunocesar on 08/02/17.
 */
public abstract class ProducaoEducacionalDaoImpl extends GenericDaoImpl <ProducaoEducacional, Integer> implements ProducaoEducacionalDao {

    @Override
    public ProducaoEducacional getProducaoEducacional(String nome){
        Query query = currentSession().createQuery(
                String.format("from ProducaoEducacional  where nome=:nome")
        );
        query.setParameter("nome", nome);
        return (ProducaoEducacional) query.uniqueResult();
    }
}
