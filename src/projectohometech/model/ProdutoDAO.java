/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.model;

import projectohometech.view.ProdutoView;
import projectohometech.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import projectohometech.ConexaoBD;


/**
 *
 * @author USER
 */
public class ProdutoDAO {
    ConexaoBD conexao = new ConexaoBD(); //Instancia de conexao da BD
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ProdutoView view = new ProdutoView();
    
    //metodo de cadastro
    public void cadastro(Produto produto){
        String sql ="INSERT INTO produtos (stockminimo, quantidade, nome) VALUES (?, ?, ?)";
        String stock =view.getTf_stock().getText();
        String quant =view.getTf_quantidade().getText();
        String nome =view.getTf_nome().getText();
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,stock);
            ps.setString(2,quant);
            ps.setString(3,nome);
            ps.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("Erro de Cadastro "+e);
        }
        
                    listarProdutos();

    }
    
    //Metodo de listagem
    public Vector listarProdutos(){
        String sql = "SELECT * from produtos";
        Vector <Produto> lista = new Vector();
         DefaultTableModel dtm = new DefaultTableModel();
         view.getTableProdutos().setModel(dtm);
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){

                Produto a = new Produto();
                a.setId(rs.getInt(1));
                a.setStock(rs.getString(2));
                a.setQuantidade(rs.getString(3));
                a.setNome(rs.getString(4));  
                int id =rs.getInt(1); 
                int stock = rs.getInt(2);
                int quant =rs.getInt(3);
                String nome =rs.getString(4);
                dtm.addRow(new Object[] { id, stock, quant, nome });
                //table_model.addRow(new Object[] { id, nome, preco, quantidade });
                lista.add(a);
            }
        } catch(SQLException e) {
            System.out.println("Erro de listagem "+e);
        }
       return lista;
    }
    
    
}
