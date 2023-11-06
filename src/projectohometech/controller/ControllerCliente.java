/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectohometech.controller;

import projectohometech.view.ClienteView;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectohometech.model.ClienteDAO;
import projectohometech.model.Cliente;

/**
 *
 * @author mkt
 */
public final class ControllerCliente implements ActionListener{
    //Instancias
    Cliente cliente = new Cliente();
    ClienteDAO c = new ClienteDAO();
    ClienteView view = new ClienteView();
    DefaultTableModel dtm = new DefaultTableModel();
    
    //Variaveis globais
    private int id;
    private String nome;
    private String contacto;
    private String endereco;
    
    public ControllerCliente(ClienteView view){
        this.view = view;
        view.setVisible(true);
        accoes();
        listarTabela();
    }
    
    public void accoes(){
        view.getBtnCadastro().addActionListener(this);
        view.getBtnActualizar().addActionListener(this);
        view.getBtnRemover().addActionListener(this);
        view.getBtnPesquisar().addActionListener(this);
        view.getBtnLimpar().addActionListener(this);
        view.getTblClientes().addMouseListener(new MouseAdapter(){
        
            @Override
            public void mouseClicked(MouseEvent e){
                preencherCampos(e);
            }
        });
    }
private void listarTabela(){
        String [] titulos = new String[]{"ID","Nome","Endereço","Contacto"};
        dtm = new DefaultTableModel(titulos,0);
        Vector <Cliente> listaCliente = (Vector <Cliente>) c.listarCliente();
        
        for (Cliente cli : listaCliente) {
            dtm.addRow(new Object[]{cli.getId(),cli.getNome(),cli.getContacto(),cli.getEndereco()});
        }
        view.getTblClientes().setModel(dtm);
        view.getTblClientes().setPreferredSize(new Dimension(350,dtm.getRowCount() * 16));
    }
    
    private void preencherCampos(MouseEvent e){
        JTable target = (JTable) e.getSource();
        
        view.getTxtId().setText(view.getTblClientes().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        view.getTxtNome().setText(view.getTblClientes().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        view.getTxtEndereco().setText(view.getTblClientes().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        view.getTxtContacto().setText(view.getTblClientes().getModel().getValueAt(target.getSelectedRow(), 3).toString());
    }
    
    //-------------Validaçao do formulario--------------
    private boolean validarDados(){
        if("".equals(view.getTxtNome().getText()) || "".equals(view.getTxtContacto().getText()) || "".equals(view.getTxtEndereco().getText())){
            JOptionPane.showMessageDialog(null,"Nenhum campo deve estar vazio","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private boolean carregarDados(){
        try {
            nome = view.getTxtNome().getText();
            endereco = view.getTxtEndereco().getText();
            contacto = view.getTxtContacto().getText();
            return  true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Houve um erro ao carregar os seus dados","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao carregar dados "+e);
        }
        return false;
    }
    
    private void limparCampos(){
        view.getTxtNome().setText("");
        view.getTxtContacto().setText("");
        view.getTxtEndereco().setText("");
        
        id =0;
        nome = "";
        contacto = "";
        endereco = "";
    }
    
    private void cadastrarCliente(){
        try {
            if(validarDados()){
                if(carregarDados()){
                    Cliente cliente = new Cliente(nome, contacto, endereco);
                    c.cadastro(cliente);
                    JOptionPane.showMessageDialog(null, "Cadastro com sucesso");
                    limparCampos();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o cliente","Erro de cadastroo",JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro de cadastro do cliente "+e);
        } finally{
            listarTabela();
        }
    }
    
    private void actualizarCliente(){
        
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getBtnCadastro()){
        cadastrarCliente();
        }
        
        if(e.getSource() == view.getBtnLimpar()){
            limparCampos();
        }
        
        if(e.getSource() == view.getBtnActualizar()){
            actualizarCliente();
        }
    }
    
}
