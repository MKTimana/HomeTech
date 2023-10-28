package hometech;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Vector;

public class RegistroArmazem extends JFrame implements ActionListener {

    private JLabel lblNome, lblNumero;
    private JTextField txtNome, txtNumero;
    private JButton btnRegistrar, btnProcurar;
    private JTable tableComponentes;
    private DefaultTableModel model;

    public RegistroArmazem() {
        createTable();
        createComponents();
        setFrameSettings();
    }

    private void createTable() {
        String[] columns = {"Nome", "Número"};
        model = new DefaultTableModel(columns, 0);
        tableComponentes = new JTable(model);
    }

    private void createComponents() {
        setLayout(new BorderLayout());

        lblNome = new JLabel("Nome:");
        lblNumero = new JLabel("Numero:");
        txtNome = new JTextField();
        txtNumero = new JTextField();
        btnRegistrar = new JButton("Registrar");
        btnProcurar = new JButton("Procurar");

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblNumero);
        panel.add(txtNumero);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnRegistrar);
        panelButtons.add(btnProcurar);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(tableComponentes), BorderLayout.CENTER);
        add(panelButtons, BorderLayout.SOUTH);

        btnRegistrar.addActionListener(this);
        btnProcurar.addActionListener(this);
    }

    private void setFrameSettings() {
        setTitle("Registro de Armazém");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            String nome = txtNome.getText();
            String numero = txtNumero.getText();

            if (!nome.isEmpty() && !numero.isEmpty()) {
                Vector row = new Vector();
                row.add(nome);
                row.add(numero);

                model.addRow(row);

                txtNome.setText("");
                txtNumero.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos");
            }
        } else if (e.getSource() == btnProcurar) {
            String nome = txtNome.getText();
            String numero = txtNumero.getText();

            for (int i = 0; i < model.getRowCount(); i++) {
                if (nome.equalsIgnoreCase((String) model.getValueAt(i, 0)) || numero.equalsIgnoreCase((String) model.getValueAt(i, 1))) {
                    tableComponentes.setRowSelectionInterval(i, i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroArmazem().setVisible(true);
            }
        });
    }
}