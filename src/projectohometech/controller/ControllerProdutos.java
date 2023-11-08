/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.controller;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import projectohometech.model.Produto;
import projectohometech.model.ProdutoDAO;
import projectohometech.view.ProdutoView;

/**
 *
 * @author USER
 */
public class ControllerProdutos implements ActionListener {

    /**
     *
     * @author Cindy Zacarias
     */
    Produto p = new Produto();
    ProdutoDAO a = new ProdutoDAO();
    ProdutoView view = new ProdutoView();
    DefaultTableModel dtm = new DefaultTableModel();

    private int id;
    private String nome;
    private String stock;
    private String quantidade;

    //private String []fornecedor;
    public ControllerProdutos(ProdutoView view) {
        this.view = view;
     // view.getTableProdutos().setModel(dtm);
        view.getTf_codigo().setEnabled(false);
        // dtm.set
        //view.getTableProdutos().setVisible(true);
        view.setVisible(true);
        accoes();
        listarTabela();
    }

    public void accoes() {
        view.getBnt_add().addActionListener(this);
        view.getBnt_listar().addActionListener(this);
        view.getBnt_pesquisar().addActionListener(this);
        //view.getBtnPesquisar().addActionListener(this);
        view.getBnt_limpar().addActionListener(this);
        view.getBtnRemover().addActionListener(this);
        view.getTableProdutos().addMouseListener(new MouseAdapter() {
        
            @Override
            public void mouseClicked(MouseEvent e) {
                preencherCampos(e);
            }
        });
    }



    private void listarTabela() {
        String[] titulos = new String[]{"ID", "Stock Minimo", "Qunatidade", "Nome"};
        dtm = new DefaultTableModel(titulos, 0);
        Vector<Produto> listaCliente = (Vector<Produto>) a.listarCliente();

        for (Produto pro : listaCliente) {
            dtm.addRow(new Object[]{pro.getId(), pro.getStock(), pro.getQuantidade(), pro.getNome()});
        }
        view.getTableProdutos().setModel(dtm);
        view.getTableProdutos().setPreferredSize(new Dimension(350, dtm.getRowCount() * 16));
    }

    private void preencherCampos(MouseEvent e) {
        JTable target = (JTable) e.getSource();

        view.getTf_codigo().setText(view.getTableProdutos().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        view.getTf_stock().setText(view.getTableProdutos().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        view.getTf_quantidade().setText(view.getTableProdutos().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        view.getTf_nome().setText(view.getTableProdutos().getModel().getValueAt(target.getSelectedRow(), 3).toString());
    }

    //-------------Validaçao do formulario--------------
    private boolean validarDados() {
        if ("".equals(view.getTf_nome().getText()) || "".equals(view.getTf_nome().getText()) || "".equals(view.getTf_quantidade().getText())) {
            JOptionPane.showMessageDialog(null, "Nenhum campo deve estar vazio", "Erro de preenchimento", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private boolean carregarDados() {
        try {
            nome = view.getTf_nome().getText();
            stock = view.getTf_stock().getText();
            quantidade = view.getTf_quantidade().getText();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao carregar os seus dados", "Erro de preenchimento", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao carregar dados " + e);
        }
        return false;
    }

    private void limparCampos() {
        view.getTf_codigo().setText("");
        view.getTf_nome().setText("");
        view.getTf_stock().setText("");
        view.getTf_quantidade().setText("");

        id = 0;
        nome = "";
        stock = ""; 
        quantidade = "";
    }

    private void cadastrarProdutos() {
        try {
            if (validarDados()) {
                if (carregarDados()) {
                    Produto pro = new Produto(nome, stock, quantidade,id);
                    a.cadastro(pro);
                    JOptionPane.showMessageDialog(null, "Cadastro com sucesso");
                    limparCampos();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente", "Erro de cadastroo", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro de cadastro do cliente " + e);
        } finally {
            listarTabela();
        }
    }
    
       private void excluirProdutos() {
        try {
               
                    nome=view.getTf_nome().getText();
                    a.excluir(nome);
                    JOptionPane.showMessageDialog(null, "Removido com sucesso");
                    limparCampos();     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o produto", "Erro de Remocao", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro de cadastro do Produto " + e);
        } finally {
            listarTabela();
        }
    }
    

    private void pesquisarProduto() {
           try {
                    JTextField n = new JTextField();
                    nome=view.getTf_nome().getText();
                     JOptionPane.showInputDialog("Insira o valor a pesquisar ", nome);
                   boolean valo =a.pesquisar(nome);
                   if(valo==true){
                       JOptionPane.showMessageDialog(null, "Valor Encotrado");
                   }else{
                       JOptionPane.showMessageDialog(null, "Valor nao encontrado");
                   }
                    //JOptionPane.showMessageDialog(null, "Removido com sucesso");
                  
                    limparCampos();      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o produto", "Erro de Remocao", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro de cadastro do Produto " + e);
        } finally {
            listarTabela();
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getBnt_add()) {
            cadastrarProdutos();
        }
        if (e.getSource() == view.getBnt_limpar()) {
            limparCampos();
        }
        if (e.getSource() == view.getBtnRemover()) {
            excluirProdutos();
        }
        if (e.getSource() == view.getBnt_pesquisar()) {
            pesquisarProduto();
        }
    }

}
