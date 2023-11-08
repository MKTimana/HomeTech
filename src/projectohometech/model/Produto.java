/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.model;

/**
 *
 * @author USER
 */
public class Produto {
    private int id;
    private String nome;
    private String stock;
    private String quantidade;
    private int numarmazem;

    public Produto() {
    }

    public Produto(String nome, String stock, String quantidade, int numarmazem) {
        this.nome = nome;
        this.stock = stock;
        this.quantidade = quantidade;
        this.numarmazem = numarmazem;
    }

    public Produto(int id, String nome, String stock, String quantidade, int numarmazem) {
        this.id = id;
        this.nome = nome;
        this.stock = stock;
        this.quantidade = quantidade;
      
        this.numarmazem = numarmazem;
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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public int getNumarmazem() {
        return numarmazem;
    }

    public void setNumarmazem(int numarmazem) {
        this.numarmazem = numarmazem;
    }

    
    
    
    
    
    
}
