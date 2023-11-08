/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectohometech.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import projectohometech.controller.ControllerProdutos;

/**
 *
 * @author USER
 */
public class ProdutoView extends javax.swing.JFrame {
    
    
    private String [] forn = {"Jose","Carlos","Anna","Rabia"};

    public String[] getForn() {
        return forn;
    }

    public void setForn(String[] forn) {
        this.forn = forn;
    }
    /**
     * Creates new form ProdutoView
     */
    public ProdutoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        l_codigo = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        l_stock = new javax.swing.JLabel();
        l_armazem = new javax.swing.JLabel();
        tf_armazem = new javax.swing.JTextField();
        tf_stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        l_quantidade = new javax.swing.JLabel();
        tf_quantidade = new javax.swing.JTextField();
        l_nome = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        bnt_add = new javax.swing.JButton();
        bnt_listar = new javax.swing.JButton();
        bnt_limpar = new javax.swing.JButton();
        bnt_pesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_result = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_codigo.setText("Codigo");

        l_stock.setText("Stock Minimo");

        l_armazem.setText("Armazem");

        l_quantidade.setText("Quantidade");

        l_nome.setText("Nome");

        bnt_add.setText("Adcionar");
        bnt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_addActionPerformed(evt);
            }
        });

        bnt_listar.setText("Listar");
        bnt_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_listarActionPerformed(evt);
            }
        });

        bnt_limpar.setText("Limpar");

        bnt_pesquisar.setText("Pesquisar");
        bnt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_pesquisarActionPerformed(evt);
            }
        });

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Stock minimo", "Quantidade", "Nome"
            }
        ));
        jScrollPane2.setViewportView(tableProdutos);

        tf_result.setColumns(20);
        tf_result.setRows(5);
        jScrollPane3.setViewportView(tf_result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(l_stock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(l_quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l_armazem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_armazem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(l_nome))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bnt_limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt_pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnt_listar)
                        .addGap(18, 18, 18)
                        .addComponent(bnt_add)
                        .addGap(24, 24, 24))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_armazem)
                    .addComponent(tf_armazem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_stock)
                    .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(l_quantidade)
                    .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_nome)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_pesquisar)
                    .addComponent(bnt_limpar)
                    .addComponent(bnt_listar)
                    .addComponent(bnt_add))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_addActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bnt_addActionPerformed

    private void bnt_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_listarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnt_listarActionPerformed

    private void bnt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnt_pesquisarActionPerformed

    public JTextArea getTf_result() {
        return tf_result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ProdutoView view = new ProdutoView();
        ControllerProdutos produto = new ControllerProdutos(view);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ProdutoView().setVisible(true);
            }
        });
    }

    public JButton getBnt_add() {
        return bnt_add;
    }

    public void setBnt_add(JButton bnt_add) {
        this.bnt_add = bnt_add;
    }

    public JButton getBnt_pesquisar() {
        return bnt_pesquisar;
    }

    public void setBnt_pesquisar(JButton bnt_pesquisar) {
        this.bnt_pesquisar = bnt_pesquisar;
    }

    public JButton getBnt_limpar() {
        return bnt_limpar;
    }

    public void setBnt_limpar(JButton bnt_limpar) {
        this.bnt_limpar = bnt_limpar;
    }

    public JButton getBnt_listar() {
        return bnt_listar;
    }

    public void setBnt_listar(JButton bnt_listar) {
        this.bnt_listar = bnt_listar;
    }

   

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JLabel getL_armazem() {
        return l_armazem;
    }

    public void setL_armazem(JLabel l_armazem) {
        this.l_armazem = l_armazem;
    }

    public JTextField getTf_armazem() {
        return tf_armazem;
    }

    public void setTf_armazem(JTextField tf_armazem) {
        this.tf_armazem = tf_armazem;
    }

    public JTextField getTf_codigo() {
        return tf_codigo;
    }

    public void setTf_codigo(JTextField tf_codigo) {
        this.tf_codigo = tf_codigo;
    }

    public JTextField getTf_nome() {
        return tf_nome;
    }

    public JTable getTableProdutos() {
        return tableProdutos;
    }

    public void setTableProdutos(JTable tableProdutos) {
        this.tableProdutos = tableProdutos;
    }
    
    

    public void setTf_nome(JTextField tf_nome) {
        this.tf_nome = tf_nome;
    }

    public JTextField getTf_quantidade() {
        return tf_quantidade;
    }

    public void setTf_quantidade(JTextField tf_quantidade) {
        this.tf_quantidade = tf_quantidade;
    }

    public JTextField getTf_stock() {
        return tf_stock;
    }

    public void setTf_stock(JTextField tf_stock) {
        this.tf_stock = tf_stock;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_add;
    private javax.swing.JButton bnt_limpar;
    private javax.swing.JButton bnt_listar;
    private javax.swing.JButton bnt_pesquisar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel l_armazem;
    private javax.swing.JLabel l_codigo;
    private javax.swing.JLabel l_nome;
    private javax.swing.JLabel l_quantidade;
    private javax.swing.JLabel l_stock;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField tf_armazem;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_quantidade;
    private javax.swing.JTextArea tf_result;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables


}
