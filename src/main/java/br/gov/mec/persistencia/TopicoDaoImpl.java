package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository()
public abstract class TopicoDaoImpl extends GenericDaoImpl <Topico, Integer> implements TopicoDao{

    public List<Topico> listarTopicos(){

        return  currentSession().createQuery(String.format("From Topico Order by nome Asc")).list();

    }

}