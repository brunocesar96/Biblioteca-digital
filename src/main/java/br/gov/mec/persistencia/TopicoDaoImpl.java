package br.gov.mec.persistencia;


import br.gov.mec.negocio.Topico;
import org.springframework.stereotype.Repository;

@Repository()
public class TopicoDaoImpl extends GenericDaoImpl <Topico> implements TopicoDao{

    public Topico getTopico(String nome) {
        return null;
    }
}
