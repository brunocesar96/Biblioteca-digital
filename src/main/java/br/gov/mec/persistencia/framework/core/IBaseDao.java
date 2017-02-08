package br.gov.mec.persistencia.framework.core;

import br.gov.mec.persistencia.framework.command.IBusca;
import br.gov.mec.persistencia.framework.model.Entidade;
import br.gov.mec.persistencia.framework.util.Ordenacao;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by brunocesar on 08/02/17.
 */
interface IBaseDao<T extends Entidade> {

    void save(T obj);

    void saveAll(Collection<T> colecao);

    void delete(long id);

    void delete(T obj);

    void deleteAll(Collection<T> colecao);

    T get(long id);

    T get(IBusca<T> busca);

    List<T> getAll(IBusca<T> busca);

    List<T> getAll();

    List<T> getAll(String campoOrdenacao, Ordenacao ordenacao);

    /**
     * Retorna a jpql especifica caso tenha
     *
     * @return Jpql especifica
     */
    QueryBuilder getJpqlEspecifica(IBusca<T> busca);

    Map<String, String> getMapaAtributos();

    Map<String, String> getMapaOrdenacao();

    Set<String> getAtributosJoin();

    long getNumRegistros(IBusca<T> busca);

    long getNumRegistros(String jpql);

    @SuppressWarnings("rawtypes")
    List getSubLista(long inicioPosicao, long qtdMaxima, IBusca<T> busca);

    @SuppressWarnings("rawtypes")
    List getSubLista(int inicioPosicao, int qtdMaxima, String jpql);

    public List<T> getListaJPQL(String jpql);

    @SuppressWarnings("rawtypes")
    public List getListaSQL(String sql);

    public List<T> getAll(Long[] ids);

    public int executeJpql(String jpql);

    public int executeSql(String sql);

    /**
     * Atualiza apenas os atributos da classe que foram informados
     *
     * @param obj
     * @param atributos
     */
    void atualizeAtributos(T obj, String... atributos);

    /**
     * Retorna um conjunto das subclasses da superclasse que o Dao manipula
     *
     * @return
     */
    @SuppressWarnings("rawtypes")
    Set<Class> getSubclassesEntidade();

    @SuppressWarnings("rawtypes")
    List<T> getObjetosCarregados(List resultado, IBusca<T> busca);

    T getComNamedQuery(String nomeQuery, Map<String, Object> params);

    List<T> getListaComNamedQuery(String nomeQuery, Map<String, Object> params);
}
