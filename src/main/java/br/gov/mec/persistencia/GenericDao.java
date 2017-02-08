package br.gov.mec.persistencia;

import java.util.List;

/**
 * Created by andre on 08/02/17.
 */
public interface GenericDao<E, K> {

    public void add (E entity);
    public void saveOrUpdate(E entity);
    public void update(E entity);
    public void remove(E entity);
    public E find(K Id);
    public List<E> getAll();
}
