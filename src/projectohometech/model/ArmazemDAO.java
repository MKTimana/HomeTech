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
        String sql ="INSERT into armazem (nome, endereco) values(?,?)";
        try{
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1,armazem.getNome());
            ps.setString(2,armazem.getEndereco());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("Erro de Cadastro "+e);
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


                lista.add(a);
            }
        } catch(SQLException e) {
            System.out.println("Erro de listagem "+e);
        }
        return lista;
    }
    
}
