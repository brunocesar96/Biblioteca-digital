package br.gov.mec.persistencia;


import negocio.Topico;

import java.util.List;


public interface TopicoDao {

    public void addTopico(Topico topico);
    public void updateTopico(Topico topico);
    public Topico getTopico(String nome);
    public void deleteTopico(String nome);
    public List<Topico> getTopicos();


}

