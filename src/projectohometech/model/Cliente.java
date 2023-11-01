/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.model;

/**
 *
 * @author mkt
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String contacto;
    private String endereco;

    public Cliente() {
    }

    //Constructor de insercao
    public Cliente(String nome, String contacto, String endereco) {
        this.nome = nome;
        this.contacto = contacto;
        this.endereco = endereco;
    }
    //Constructor de Actualizacao
    public Cliente(int id, String nome, String contacto, String endereco) {
        this.id = id;
        this.nome = nome;
        this.contacto = contacto;
        this.endereco = endereco;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
