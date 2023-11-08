/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import projectohometech.ConexaoBD;

/**
 *
 * @author mkt
 */
public class FornecedorDAO {
    ConexaoBD conexao = new ConexaoBD(); //Instancia de conexao da BD
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
      //metodo de cadastro
    public void cadastro(Fornecedor fornecedor){
        String sql ="INSERT into fornecedor (nome, nuit) values(?,?)";
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,fornecedor.getNome());
            ps.setInt(2,fornecedor.getNuit());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro de Cadastro "+e);
        }
    }
    
    //Metodo de listagem
    public List listarFornecedor(){
        String sql = "SELECT * from fornecedor";
        Vector <Fornecedor> lista = new Vector();
        
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){

            Fornecedor f = new Fornecedor();
            f.setId(rs.getInt(1));
            f.setNome(rs.getString(2));
            f.setNuit(rs.getInt(3));

            lista.add(f);
            }
        }catch(SQLException e){
            System.out.println("Erro de listagem "+e);
        }
        return lista;
    }
    
    //Metodo de actualizar
    public void actualizar(Fornecedor fornecedor){
        String sql = "UPDATE fornecedor set nome=?, nuit=? where id=?";
        try {
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, fornecedor.getNome());
            ps.setInt(2,fornecedor.getNuit());
            ps.setInt(3,fornecedor.getId());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro de actualizacao FornecedorDAO "+e);
        }
    }
    
    //Metodo Apagar
    public void apagar(int id){
        String sql = "DELETE from fornecedor where id="+id;
        try {
            con = conexao.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            
            System.out.println("Erro de eliminacao FornecedorDAO "+e);
        }
    }
}
