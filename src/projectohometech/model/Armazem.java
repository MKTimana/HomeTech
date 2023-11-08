
package projectohometech.model;

/**
 *
 * @author Geraldo Junior
 */
public class Armazem {
    private int id;
    private String nome;
    private String endereco;
    private String contacto;

    //Actualizacao
    public Armazem(int id, String nome, String endereco, String contacto) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.contacto = contacto;
    }

    public Armazem() {
        
    }
//Insercao
    public Armazem(String nome, String endereco, String contacto) {
        this.nome = nome;
        this.endereco = endereco;
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

   
   
}
