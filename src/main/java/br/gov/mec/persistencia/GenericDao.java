package br.gov.mec.persistencia;

import java.io.Serializable;
import java.util.List;

/**
 * Created by brunocesar on 09/02/17.
 */
interface GenericDAO<T, ID extends Serializable> {

    public T buscarPeloCodigo(ID id);
    public void salvar(T entidade);
    public List<T> filtrar(T entidade, String... propriedades);
    public List<T> listar();
    public void editar(T entidade,ID id);
    public void excluir(T entidade);
    public  void excluir(ID chave);

}