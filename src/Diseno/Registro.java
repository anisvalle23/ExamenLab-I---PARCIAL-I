/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseno;

import javax.swing.*;

/**
 *
 * @author Dennisse
 */
public class Registro extends JFrame {

    private JPanel Registrarse;
    private JButton cancelarBtn;
    private JButton registrarBtn;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JTextField txtUsuarioCrear;
    private JComboBox<String> Cuentas;
    private JLabel jLabel10;
    private JPanel jPanel1;

    public Registro() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        Registrarse = new JPanel();
        cancelarBtn = new JButton();
        registrarBtn = new JButton();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        txtUsuarioCrear = new JTextField();
        Cuentas = new JComboBox<>();
        jLabel10 = new JLabel();
        jPanel1 = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Registrarse.setBackground(new java.awt.Color(255, 255, 255));

        cancelarBtn.setBackground(new java.awt.Color(255, 204, 204));
        cancelarBtn.setFont(new java.awt.Font("Lucida Fax", 0, 18));
        cancelarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setBorder(null);
        cancelarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarBtn.setFocusPainted(false);
        cancelarBtn.setFocusable(false);
        cancelarBtn.addActionListener(evt -> cancelarBtnActionPerformed(evt));

        registrarBtn.setBackground(new java.awt.Color(255, 204, 204));
        registrarBtn.setFont(new java.awt.Font("Lucida Fax", 0, 18));
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setText("Registrarse");
        registrarBtn.setBorder(null);
        registrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBtn.setFocusPainted(false);
        registrarBtn.setFocusable(false);
        registrarBtn.addActionListener(evt -> registrarBtnActionPerformed(evt));

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 24));
        jLabel8.setForeground(new java.awt.Color(255, 204, 204));
        jLabel8.setText("Registrarse");

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 3, 18));
        jLabel9.setForeground(new java.awt.Color(255, 204, 204));
        jLabel9.setText("Usuario:");

        txtUsuarioCrear.setFont(new java.awt.Font("Lucida Fax", 0, 18));
        txtUsuarioCrear.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuarioCrear.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuarioCrear.setOpaque(true);
        txtUsuarioCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioCrearMousePressed(evt);
            }
        });

        Cuentas.setBackground(new java.awt.Color(255, 204, 204));
        Cuentas.setFont(new java.awt.Font("Lucida Fax", 0, 14));
        Cuentas.setModel(new DefaultComboBoxModel<>(new String[]{"Facebook", "Twitter"}));
        Cuentas.setBorder(null);
        Cuentas.addActionListener(evt -> CuentasActionPerformed(evt));

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 3, 18));
        jLabel10.setForeground(new java.awt.Color(255, 204, 204));
        jLabel10.setText("Tipo de Cuenta:");

        GroupLayout RegistrarseLayout = new GroupLayout(Registrarse);
        Registrarse.setLayout(RegistrarseLayout);
        RegistrarseLayout.setHorizontalGroup(
                RegistrarseLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrarseLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(RegistrarseLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(RegistrarseLayout.createSequentialGroup()
                                                .addGroup(RegistrarseLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(RegistrarseLayout.createSequentialGroup()
                                                                .addGap(68, 68, 68)
                                                                .addComponent(jLabel8)
                                                                .addGap(72, 72, 72))
                                                        .addGroup(GroupLayout.Alignment.LEADING, RegistrarseLayout.createSequentialGroup()
                                                                .addComponent(jLabel9)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtUsuarioCrear, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.LEADING, RegistrarseLayout.createSequentialGroup()
                                                                .addComponent(jLabel10)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Cuentas, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(48, Short.MAX_VALUE))
                                        .addGroup(RegistrarseLayout.createSequentialGroup()
                                                .addComponent(cancelarBtn, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(registrarBtn, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36))))
        );
        RegistrarseLayout.setVerticalGroup(
                RegistrarseLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrarseLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8)
                                .addGap(44, 44, 44)
                                .addGroup(RegistrarseLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(txtUsuarioCrear, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(RegistrarseLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(Cuentas, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(RegistrarseLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelarBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(registrarBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(354, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(Registrarse, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 377, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(Registrarse, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        txtUsuarioCrear.setText("Ingrese su Usuario");
        txtUsuarioCrear.setForeground(new java.awt.Color(102, 102, 102));

        LogIn log = new LogIn();
        log.setVisible(true);
        this.dispose();
    }

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            LogIn.uber.agregarCuenta(txtUsuarioCrear.getText(), Cuentas.getSelectedItem().toString());
            txtUsuarioCrear.setText("Ingrese su Usuario");
            txtUsuarioCrear.setForeground(new java.awt.Color(102, 102, 102));
            LogIn mn = new LogIn();
            mn.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: No ha elegido correctamente un dato.");
        }
    }

    private void txtUsuarioCrearMousePressed(java.awt.event.MouseEvent evt) {
        if (txtUsuarioCrear.getText().equals("Ingrese su Usuario")) {
            txtUsuarioCrear.setText("");
        }
        txtUsuarioCrear.setForeground(java.awt.Color.BLACK);
    }

    private void CuentasActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Registro().setVisible(true));
    }
}
