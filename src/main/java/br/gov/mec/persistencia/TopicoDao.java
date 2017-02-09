package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;

public interface TopicoDao extends GenericDao<Topico> {

    public Topico getTopico(String nome);


}

