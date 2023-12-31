
package projectohometech.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import projectohometech.controller.ControllerProdutos;


/**
 *
 * @author mkt
 */
public class ProdutoView extends javax.swing.JFrame {

    /**
     * Creates new form ClientView
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

        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_nome = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        tf_stock = new javax.swing.JTextField();
        tf_quantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        bnt_listar = new javax.swing.JButton();
        bnt_add = new javax.swing.JButton();
        bnt_pesquisar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        bnt_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblId.setText("ID");

        lblNome.setText("Nome");

        tf_codigo.setEnabled(false);
        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        lblNumero.setText("Stock minimo");

        lblEndereco.setText("Quantidade");

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableProdutos);

        bnt_listar.setText("Actualizar");

        bnt_add.setText("Cadastrar");

        bnt_pesquisar.setText("Pesquisar");
        bnt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_pesquisarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");

        bnt_limpar.setText("Limpar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(lblNome)
                            .addComponent(lblNumero)
                            .addComponent(lblEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_stock)
                                .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bnt_listar)
                                    .addComponent(bnt_add))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bnt_pesquisar)
                                    .addComponent(btnRemover)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(bnt_limpar)))
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addGap(15, 15, 15)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumero)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bnt_add)
                                .addGap(13, 13, 13)
                                .addComponent(bnt_listar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRemover)
                                .addGap(13, 13, 13)
                                .addComponent(bnt_pesquisar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnt_limpar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void bnt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnt_pesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        ProdutoView view = new ProdutoView();
        ControllerProdutos produto = new ControllerProdutos(view);  
//        java.awt.EventQueue.invokeLater(new Runnable() {
//           public void run() {
//               new ProdutoView().setVisible(true);
//           }
//            
//      });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_add;
    private javax.swing.JButton bnt_limpar;
    private javax.swing.JButton bnt_listar;
    private javax.swing.JButton bnt_pesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_quantidade;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables

    public JButton getBnt_add() {
        return bnt_add;
    }

    public void setBnt_add(JButton bnt_add) {
        this.bnt_add = bnt_add;
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

    public JButton getBnt_pesquisar() {
        return bnt_pesquisar;
    }

    public void setBnt_pesquisar(JButton bnt_pesquisar) {
        this.bnt_pesquisar = bnt_pesquisar;
    }

    public JButton getBtnRemover() {
        return btnRemover;
    }

    public void setBtnRemover(JButton btnRemover) {
        this.btnRemover = btnRemover;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLblEndereco() {
        return lblEndereco;
    }

    public void setLblEndereco(JLabel lblEndereco) {
        this.lblEndereco = lblEndereco;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public JLabel getLblNumero() {
        return lblNumero;
    }

    public void setLblNumero(JLabel lblNumero) {
        this.lblNumero = lblNumero;
    }

    public JTable getTableProdutos() {
        return tableProdutos;
    }

    public void setTableProdutos(JTable tableProdutos) {
        this.tableProdutos = tableProdutos;
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

   


}
