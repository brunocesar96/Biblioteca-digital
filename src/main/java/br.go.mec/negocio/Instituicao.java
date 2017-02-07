package negocio;


import com.google.gson.annotations.Expose;
import persistencia.model.Entidade;

import javax.persistence.*;

/**
 * Created by andre on 07/02/17.
 */
@Entity
@SequenceGenerator(name = "instituicao_seq", sequenceName = "insituicao_seq", initialValue = 1)
public class Instituicao implements Entidade {

    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "insituicao_seq")
    private long id;
    @Expose
    private String nome;

    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
