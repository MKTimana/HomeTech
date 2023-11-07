
package projectohometech.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import projectohometech.controller.ControllerCliente;
import projectohometech.model.Armazem;
import projectohometech.model.ArmazemDAO;
import projectohometech.model.Cliente;
import projectohometech.model.ClienteDAO;
import projectohometech.view.ArmazemView;
import projectohometech.view.ClienteView;
import projectohometech.view.MenuView;

/**
 *
 * @author Geraldo Junior
 */
public class ControllerMenu {
    Cliente cliente = new Cliente();
    ControllerCliente cliController = new ControllerCliente();
    ClienteDAO c = new ClienteDAO();
    ClienteView cliView = new ClienteView();
    DefaultTableModel dtmCli = new DefaultTableModel();
    
    Armazem armazem = new Armazem();
    ArmazemDAO a = new ArmazemDAO();
    ArmazemView armView = new ArmazemView();
    DefaultTableModel dtmArm = new DefaultTableModel();
    private final MenuView view;
    
    public ControllerMenu(MenuView view){
        this.view = view;
        view.setVisible(true);
        accoes();
//        listarTabela();
    }
    
    public void accoes(){
        view.getBtn_cliente().addActionListener((ActionListener) this);
        view.getBtn_armazem().addActionListener((ActionListener) this);
//        view.getTblClientes().addMouseListener(new MouseAdapter(){
//        
//            @Override
//            public void mouseClicked(MouseEvent e){
//                preencherCampos(e);
//            }
//        });
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getBtn_cliente()){
            try{
                if(cliController.getCarregarDados()){
                    ClienteView cliente = new ClienteView();
                }
            } catch (Exception ex){
            
            }
            
        }
    }

    
}
