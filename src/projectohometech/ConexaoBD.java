
package projectohometech;

/**
 *
 * @author mkt
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    
    Connection con;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/homeTech";
    private final String user = "root";
    private final String password = "Admin2023.";
    
    public Connection conectar(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Conectado!");
        }catch(ClassNotFoundException|SQLException e){
            System.out.println("Erro de conexao "+e);
        }
        return con;
    }
}
