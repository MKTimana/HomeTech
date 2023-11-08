package projectohometech.model;

import projectohometech.model.Armazem;
import java.sql.*;
import java.util.List;
import java.util.Vector;
import projectohometech.ConexaoBD;

/**
 *
 * @author mkt
 */
public class ArmazemDAO {
    ConexaoBD conexao = new ConexaoBD(); //Instancia de conexao da BD
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    //metodo de cadastro
    public void cadastro(Armazem armazem){
        String sql ="INSERT into armazem(nome, endereco, contacto) values(?,?,?)";
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,armazem.getNome());
            ps.setString(2,armazem.getEndereco());
            ps.setString(3,armazem.getContacto());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro de CadastroDAO "+e);
        }
    }
    
    //Metodo de listagem
    public Vector listarArmazem(){
        String sql = "SELECT * from armazem";
        Vector <Armazem> lista = new Vector();
        
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){

                Armazem a = new Armazem();
                a.setId(rs.getInt(1));
                a.setNome(rs.getString(2));
                a.setEndereco(rs.getString(3));
                a.setContacto(rs.getString(4));


                lista.add(a);
            }
        } catch(SQLException e) {
            System.out.println("Erro de listagem "+e);
        }
        return lista;
    }
    
    //Metodo de actualizar
    public void actualizar(Armazem armazem){
        String sql = "UPDATE armazem set nome=?, endereco=?, contacto=? where id=?";
        try {
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, armazem.getNome());
            ps.setString(2, armazem.getEndereco());
            ps.setString(3,armazem.getContacto());
            ps.setInt(4,armazem.getId());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Erro de actualizacao ArmazemDAO "+e);
        }
    }
    
    //Metodo Apagar
    public void apagar(int id){
        String sql = "DELETE from armazem where id="+id;
        try {
            con = conexao.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            
            System.out.println("Erro de eliminacao AramzemDAO "+e);
        }
    }
    
}
