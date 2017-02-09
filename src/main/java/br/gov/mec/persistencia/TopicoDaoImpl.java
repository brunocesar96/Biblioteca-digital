package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;
import org.springframework.stereotype.Repository;


@Repository()
public abstract class TopicoDaoImpl extends GenericDaoImpl <Topico> implements TopicoDao{


    @Override
    public Topico getTopico(String nome) {
        return null;
    }
}
