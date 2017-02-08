package br.gov.mec.persistencia;

import br.gov.mec.negocio.ProducaoEducacional;

import java.util.List;

/**
 * Created by brunocesar on 08/02/17.
 */
public class ProducaoEduDaoImp implements ProducaoEduDao{


    @Override
    public ProducaoEducacional buscarPeloCodigo(Integer integer) {
        return null;
    }

    @Override
    public List<ProducaoEducacional> filtrar(ProducaoEducacional entidade, String... propriedades) {
        return null;
    }

    @Override
    public List<ProducaoEducacional> listar() {
        return null;
    }

    @Override
    public void salvar(ProducaoEducacional entidade) {

    }

    @Override
    public void editar(ProducaoEducacional entidade, Integer integer) {

    }

    @Override
    public void excluir(ProducaoEducacional entidade) {

    }

    @Override
    public void excluir(Integer chave) {

    }
}
