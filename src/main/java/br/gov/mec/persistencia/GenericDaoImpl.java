package br.gov.mec.persistencia;

import br.gov.mec.negocio.Base;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by andre on 09/02/17.
 */
@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDaoImpl <T extends Base> implements GenericDao{

    @Autowired
    private SessionFactory sessionFactory;

    protected Class<? extends Base> daoType;
    private java.io.Serializable key;

    public GenericDaoImpl(){
        Type t = (Type) getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }

    protected Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    public void add(T entity) {
        currentSession().save(entity);

    }

    public void saveOrUpdate(T entity) {
        currentSession().saveOrUpdate(entity);

    }

    public void update(T entity) {
        currentSession().saveOrUpdate(entity);

    }

    public void remove(T entity) {
        currentSession().delete(entity);

    }

    public Object find(Object Id) {
        return (T) currentSession().get(daoType, key);
    }

    public List getAll() {
        return currentSession().createCriteria(daoType).list();
    }
}
