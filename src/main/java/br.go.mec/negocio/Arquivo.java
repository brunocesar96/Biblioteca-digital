package negocio;

import com.google.gson.annotations.Expose;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.persistence.*;

/**
 * Created by andre on 07/02/17.
 */
@Entity
@SequenceGenerator(name = "arquivo_seq", sequenceName = "arquivo_seq", initialValue = 1)
@Inheritance(strategy = InheritanceType.JOINED)
public class Arquivo {
    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "arquivo_seq")
    private long id;
    @Expose
    private String nome;

    @Lob
    private byte[] bytes;

    public Arquivo() {
    }

    public Arquivo(long id) {
        this.id = id;
    }

    @Expose
    private TipoArquivo tipoArquivo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setDados(CommonsMultipartFile commonsMultipartFile){
        if(commonsMultipartFile.getBytes().length == 0){
            return;
        }

        this.setBytes(commonsMultipartFile.getBytes());
        this.setNome(commonsMultipartFile.getOriginalFilename());
    }

}
