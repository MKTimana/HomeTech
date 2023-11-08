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

    //metodo de cadastro
    public void cadastro(Produto produto) {
        String sql = "INSERT into produtos (stockminimo, quantidade, nome) values(?,?,?)";
        try {
            con = conexao.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, produto.getStock());
            ps.setString(2, produto.getQuantidade());
            ps.setString(3, produto.getNome());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro de Cadastro " + e);
        }
    }

    //Metodo de listagem
    public List listarCliente() {
        String sql = "SELECT * from produtos";
        Vector<Produto> lista = new Vector();

        try {
            con = conexao.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Produto p = new Produto();
                p.setId(rs.getInt(1));
                p.setStock(rs.getString(2));
                p.setQuantidade(rs.getString(3));
                p.setNome(rs.getString(4));

                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erro de listagem " + e);
        }
        return lista;
    }

    public void excluir(String nome) {
        ///

        try {
            final String query = "DELETE FROM produtos WHERE nome = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, nome);

            preparedStatement.executeUpdate();
            System.out.println("Removido com sucesso");
            con.close();
            preparedStatement.close();

            listarCliente();

        } catch (SQLException | NumberFormatException e) {
            System.out.println("Erro de Cadastro " + e);
        }

    }

    public boolean pesquisar(String nome) {
        String sql = "SELECT * from produtos WHERE nome=?";
        Vector<Produto> lista = new Vector();

        try {
            con = conexao.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, nome);
            rs = ps.executeQuery();
            return true;
        } catch (SQLException e) {

            System.out.println("Erro de pesquisa " + e);
        }
        return true;
    }
}
