package persistencia;


import negocio.Topico;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.jms.Topic;
import java.util.List;


@Repository("topicoDao")
public class TopicoDaoImpl implements TopicoDao {


    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addTopico(Topico topico) {
        getCurrentSession().save(topico);
    }

    public void updateTopico(Topico topico) {
        Topico topicoToUpdate = getTopico(topico.getTopico());
        topicoToUpdate.setTopico(topico.getTopico());
        getCurrentSession().update(topicoToUpdate);

    }

    public Topico getTopico(String nome) {
        Topico topico = (Topico) getCurrentSession().get(Topico.class, nome);
        return topico;
    }

    public void deleteTopico(String nome) {
        Topico topico = getTopico(nome);
        if (topico != null)
            getCurrentSession().delete(topico);
    }

    @SuppressWarnings("unchecked")
    public List<Topico> getTopicos() {
        return getCurrentSession().createQuery("from Topico").list();
    }



}
