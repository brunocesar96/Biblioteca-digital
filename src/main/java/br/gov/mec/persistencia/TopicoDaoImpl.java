package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
        return getCurrentSession().createQuery("SELECT * FROM topico ORDER BY nome ASC").list();
    }



}
