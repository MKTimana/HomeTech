/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.model;

/**
 *
 * @author mkt
 */
public class Fornecedor {
    private int id;
    private String nome;
    private int nuit;

//    Instancias
    public Fornecedor() {
    }
//insercao
    public Fornecedor(String nome, int nuit) {
        this.nome = nome;
        this.nuit = nuit;
    }
//Actualizacao
    public Fornecedor(int id, String nome, int nuit) {
        this.id = id;
        this.nome = nome;
        this.nuit = nuit;
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

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }
}
