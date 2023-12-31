
package projectohometech.controller;

import projectohometech.view.ArmazemView;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projectohometech.model.ArmazemDAO;
import projectohometech.model.Armazem;
/**
 *
 * @author Geraldo Junior
 */
public class ControllerArmazem implements ActionListener{
    Armazem armazem = new Armazem();
    ArmazemDAO a = new ArmazemDAO();
    ArmazemView view = new ArmazemView();
    DefaultTableModel dtm = new DefaultTableModel();
    
    
    private int id;
    private String nome;
    private String endereco;
    
    public ControllerArmazem(ArmazemView view){
        this.view = view;
        view.setVisible(true);
        accoes();
        listarTabela();
    }
    
    public final void accoes(){
        view.getBtnCadastrar().addActionListener(this);
        view.getBtnActualizar().addActionListener(this);
        view.getBtnRemover().addActionListener(this);
        view.getBtnPesquisar().addActionListener(this);
        view.getBtnLimpar().addActionListener(this);
        view.getTblArmazens().addMouseListener(new MouseAdapter(){
        
            @Override
            public void mouseClicked(MouseEvent e){
                preencherCampos(e);
            }
        });
    }
    
    private void listarTabela(){
        String [] titulos = new String[]{"ID","Nome","Endereço"};
        dtm = new DefaultTableModel(titulos,0);
        Vector <Armazem> listaArmazens = (Vector <Armazem>) a.listarArmazem();
        
        for (Armazem arm : listaArmazens) {
            dtm.addRow(new Object[]{arm.getId(),arm.getNome(),arm.getEndereco()});
        }
        view.getTblArmazens().setModel(dtm);
        view.getTblArmazens().setPreferredSize(new Dimension(350,dtm.getRowCount() * 16));
    }
    
    private void preencherCampos(MouseEvent e){
        JTable target = (JTable) e.getSource();
        
        view.getTxtNome().setText(view.getTblArmazens().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        view.getTxtEndereco().setText(view.getTblArmazens().getModel().getValueAt(target.getSelectedRow(), 2).toString());
    }
    
    private boolean validarDados(){
        if("".equals(view.getTxtNome().getText()) ||  "".equals(view.getTxtEndereco().getText())){
            JOptionPane.showMessageDialog(null,"Nenhum campo deve estar vazio","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    private boolean carregarDados(){
        try {
            nome = view.getTxtNome().getText();
            endereco = view.getTxtEndereco().getText();
            return  true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Houve um erro ao carregar os seus dados","Erro de preenchimento",JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao carregar dados "+e);
        }
        return false;
    }
    
    private void limparCampos(){
        view.getTxtNome().setText("");
        view.getTxtEndereco().setText("");
        
        id = 0;
        nome = "";
        endereco = "";
    }
    
    private void cadastrarArmazem(){
        try {
            if(validarDados()){
                if(carregarDados()){
                    Armazem armazem = new Armazem(nome, endereco);
                    a.cadastro(armazem);
                    JOptionPane.showMessageDialog(null, "Cadastro com sucesso");
                    limparCampos();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o armazém","Erro de cadastroo",JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro de cadastro do armazém "+e);
        } finally{
            listarTabela();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getBtnCadastrar()){
            cadastrarArmazem();
        }
        if(e.getSource() == view.getBtnLimpar()){
            limparCampos();
        }
    }
    
    
}
