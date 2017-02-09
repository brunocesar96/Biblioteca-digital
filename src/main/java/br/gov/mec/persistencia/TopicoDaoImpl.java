package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("topicoDao")
public  class TopicoDaoImpl implements TopicoDao {


    @Autowired
    private SessionFactory sessionFactory;


    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Topico buscarPeloCodigo(Long ID) {

        Topico topico = (Topico) getCurrentSession().get(Topico.class,ID);
        return  topico;

    }

    @Override
    public void salvar(Topico entidade) {

        getCurrentSession().save(entidade);
    }

    @Override
    public List<Topico> filtrar(Topico entidade, String... propriedades) {
        return null;
    }

    @Override
    public List<Topico> listar() {

        return getCurrentSession().createQuery("SELECT* FROM topico ORDER BY nome ASC ").list();

    }

    @Override
    public void editar(Topico entidade, Long aLong) {

        Topico t = buscarPeloCodigo(entidade.getId());
        t.setTopico(t.getTopico());
        t.setDescricao(t.getDescricao());
        getCurrentSession().update(t);

    }

    @Override
    public void editar(Topico entidade, ID id) {

    }

    @Override
    public void excluir(Topico entidade) {


    }

    @Override
    public void excluir(Long chave) {

        Topico topico = buscarPeloCodigo(chave);
        if(topico != null) getCurrentSession().delete(topico);

    }


}
