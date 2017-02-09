package br.gov.mec.persistencia;

import br.gov.mec.negocio.Base;

import java.util.List;

/**
 * Created by andre on 08/02/17.
 */
public interface GenericDao<T extends Base> {

    void add (T entity);
    void saveOrUpdate(T entity);
    void update(T entity);
    void remove(T entity);
    T find (long key);
    List<T> getAll();
}
