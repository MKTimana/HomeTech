
package projectohometech.model;

/**
 *
 * @author Geraldo Junior
 */
public class Armazem {
    private int id;
    private String nome;
    private String endereco;

    public Armazem(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Armazem(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Armazem() {
        
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
   
}
