package br.gov.mec.persistencia;

import br.gov.mec.negocio.Usuario;

/**
 * Created by andre on 09/02/17.
 */
public interface UsuarioDao extends GenericDao<Usuario> {

    public Usuario getUsuario(String nome);

}
