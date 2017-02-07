package negocio;

import com.google.gson.annotations.Expose;
import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "topico")
public class Topico {

    @NotNull
    @Expose
    @BatchSize(size = 25)
    private String nome;

    @NotNull
    @Expose
    @BatchSize(size = 200)
    private String descricao;


    public String getTopico() {
        return nome;
    }

    public void setTopico(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
