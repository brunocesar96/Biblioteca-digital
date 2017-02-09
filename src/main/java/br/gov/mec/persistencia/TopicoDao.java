package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.List;

public interface TopicoDao extends GenericDAO<Topico,Long> {

    Topico buscarPeloCodigo(Long ID);

    void salvar(Topico entidade);

    public List<Topico> listar();

    void editar(Topico entidade, ID id);

    void excluir(Topico entidade);

    void excluir(Long chave);
}

