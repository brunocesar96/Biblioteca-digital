package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;

import java.util.List;

public interface TopicoDao extends GenericDao<Topico> {

    public List<Topico> listarTopicos();


}