/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.model;

import projectohometech.model.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
            System.out.println("Erro de Cadastro "+e);}
    }
    
    //Metodo de listagem
    public List listarCliente(){
        String sql = "SELECT * from cliente";
        List<Cliente> lista = new ArrayList<>();
        
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
    
}
