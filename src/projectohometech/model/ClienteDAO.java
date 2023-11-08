/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.model;

import projectohometech.model.Cliente;
import java.sql.*;
import java.util.List;
import java.util.Vector;
import projectohometech.ConexaoBD;

/**
 *
 * @author mkt
 */
public class ClienteDAO {
    ConexaoBD conexao = new ConexaoBD(); //Instancia de conexao da BD
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    //metodo de cadastro
    public void cadastro(Cliente cliente){
        String sql ="INSERT into cliente(nome, contacto, endereco) values(?,?,?)";
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,cliente.getNome());
            ps.setString(2,cliente.getContacto());
            ps.setString(3,cliente.getEndereco());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro de Cadastro "+e);
        }
    }
    
    //Metodo de listagem
    public List listarCliente(){
        String sql = "SELECT * from cliente";
        Vector <Cliente> lista = new Vector();
        
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){

            Cliente c = new Cliente();
            c.setId(rs.getInt(1));
            c.setNome(rs.getString(2));
            c.setEndereco(rs.getString(3));
            c.setContacto(rs.getString(4));

            lista.add(c);
            }
        }catch(SQLException e){
            System.out.println("Erro de listagem "+e);
        }
        return lista;
    }
    
    //Metodo de actualizar
    public void actualizar(Cliente cliente){
        String sql = "UPDATE cliente set nome=?, contacto=?, endereco=? where id=?";
        try {
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, cliente.getNome());
            ps.setString(2,cliente.getContacto());
            ps.setString(3, cliente.getEndereco());
            ps.setInt(4,cliente.getId());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro de actualizacao ClienteDAO "+e);
        }
    }
    
    //Metodo Apagar
    public void apagar(int id){
        String sql = "DELETE from cliente where id="+id;
        try {
            con = conexao.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            
            System.out.println("Erro de eliminacaoDAO "+e);
        }
    }
}
