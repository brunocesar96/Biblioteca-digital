package br.gov.mec.persistencia;

import br.gov.mec.negocio.Usuario;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by andre on 09/02/17.
 */
@Repository
public abstract class UsuarioDaoImpl extends GenericDaoImpl <Usuario, Integer> implements UsuarioDao{


    @Override
    public Usuario getUsuario(String nome) {
        Query query = currentSession().createQuery(
                String.format("from Usuario  where nome=:nome")
        );
        query.setParameter("nome", nome);
        return (Usuario) query.uniqueResult();
    }
}