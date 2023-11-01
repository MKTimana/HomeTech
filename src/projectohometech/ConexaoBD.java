/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
   String driver = "com.mysql.cj.jdbc.Driver";
    String db = "homeTech";
    String url = "jdbc:mysql://localhost:3306/"+db+"?useSSL=false&serverTimeZone=UTC";
    String user = "root";
    String pass= "";
    
    public Connection conectar(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Conectado!");
        }catch(ClassNotFoundException|SQLException e){
            System.out.println("Erro de conexao "+e);
        }
        return con;
    }
}
