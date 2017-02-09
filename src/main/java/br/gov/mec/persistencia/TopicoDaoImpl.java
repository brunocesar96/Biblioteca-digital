package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;


@Repository()
public abstract class TopicoDaoImpl extends GenericDaoImpl <Topico, Integer> implements TopicoDao{


    @Override
    public Topico getTopico(String nome) {
        Query query = currentSession().createQuery(
                String.format("from Topico  where nome=:nome")
        );
        query.setParameter("nome", nome);
        return (Topico) query.uniqueResult();
    }
}
