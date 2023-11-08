/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.controller;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectohometech.model.Fornecedor;
import projectohometech.model.FornecedorDAO;
import projectohometech.view.FornecedorView;

/**
 *
 * @author mkt
 */
public class ControllerFornecedor implements ActionListener{
    
    Fornecedor fornecedor = new Fornecedor();
    FornecedorDAO f = new FornecedorDAO();
    FornecedorView view = new FornecedorView();
    DefaultTableModel dtm = new DefaultTableModel();
    
    private int id;
    private String nome;
    private int nuit;
    
     public ControllerFornecedor(FornecedorView view){
        this.view = view;
        view.setVisible(true);
        accoes();
        listarTabela();
    }
    
    public void accoes(){
        view.getBtnCadastrar().addActionListener(this);
        view.getBtnActualizar().addActionListener(this);
        view.getTblFornecedores().addMouseListener(new MouseAdapter(){
        
            @Override
            public void mouseClicked(MouseEvent e){
                preencherCampos(e);
            }
        });
    }
    
    private void listarTabela(){
        String [] titulos = new String[]{"ID","Nome","NUIT"};
        dtm = new DefaultTableModel(titulos,0);
        Vector <Fornecedor> listaF = (Vector <Fornecedor>) f.listarFornecedor();
        
        for (Fornecedor forne : listaF) {
            dtm.addRow(new Object[]{forne.getId(),forne.getNome(),forne.getNuit()});
        }
        view.getTblFornecedores().setModel(dtm);
        view.getTblFornecedores().setPreferredSize(new Dimension(350,dtm.getRowCount() * 16));
    }
    
    private void preencherCampos(MouseEvent e){
        JTable target = (JTable) e.getSource();
        
        view.getTxtId().setText(view.getTblFornecedores().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        id = (int) view.getTblFornecedores().getModel().getValueAt(target.getSelectedRow(),0);
        view.getTxtNome().setText(view.getTblFornecedores().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        view.getTxtNuit().setText(view.getTblFornecedores().getModel().getValueAt(target.getSelectedRow(), 2).toString());
    }
    
//-------------Validaçao do formulario--------------
    private boolean validarDados(){
        if("".equals(view.getTxtNome().getText()) || "".equals(view.getTxtNuit().getText())){
            JOptionPane.showMessageDialog(null,"Nenhum campo deve estar vazio","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private boolean carregarDados(){
        try {
            nome = view.getTxtNome().getText();
            nuit = Integer.parseInt(view.getTxtNuit().getText());
            
            return  true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Houve um erro ao carregar os seus dados","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao carregar dados "+e);
        }
        return false;
    }
    
    private void limparCampos(){
        view.getTxtId().setText("");
        view.getTxtNome().setText("");
        view.getTxtNuit().setText("");
        
        id =0;
        nome = "";
        nuit=0;
    }
    
    private void cadastrarFornecedor(){
        try {
            if(validarDados()){
                if(carregarDados()){
                    Fornecedor fornUp = new Fornecedor(nome, nuit);
                    f.cadastro(fornUp);
                    JOptionPane.showMessageDialog(null, "Cadastro com sucesso");
                    limparCampos();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o Fornecedor","Erro de cadastroo",JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro de cadastro do Fornecedor "+e);
        } finally{
            listarTabela();
        }
    }
    
    private void actualizarFornecedor(){
        
        try {
            if(validarDados()){
                if(carregarDados()){
                    Fornecedor fornUp = new Fornecedor(id, nome,nuit);
                    f.actualizar(fornUp);
                    JOptionPane.showMessageDialog(null, "Actualizado com sucesso");
                    limparCampos();
                }
            }
        } catch (HeadlessException e) {
            System.out.println("Erro de actualizao "+e);
        }finally{
        listarTabela();
        }
    
    }
    
    private void apagarFornecedor(){
        try {
            if(id != 0){
                f.apagar(id);
                JOptionPane.showMessageDialog(null, "Apagado com sucesso");
  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao apagar o fornecedor","Erro de cadastroo",JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao apagar o fornecedor "+e);
        }finally{
            listarTabela();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == view.getBtnCadastrar()){
           cadastrarFornecedor();
       }
       
       if(e.getSource() == view.getBtnActualizar()){
           actualizarFornecedor();
       }
    } 
    
}
