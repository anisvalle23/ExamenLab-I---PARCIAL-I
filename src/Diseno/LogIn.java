/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseno;

import javax.swing.*;
import java.io.IOException;

/**
 *
 * @author Dennisse
 */
public class LogIn extends JFrame {

    public static Logica.SocialClass usuario;
    public static Logica.UberSocial uber = new Logica.UberSocial();
    private int XMouse;
    private int YMouse;
    private JPanel InicioDeSesion;
    private JButton RegistrarBtn;
    private JPanel fondo;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JButton loginBtn;
    private JTextField txtUsuario;

    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void initComponents() {

        fondo = new JPanel();
        InicioDeSesion = new JPanel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        txtUsuario = new JTextField();
        RegistrarBtn = new JButton();
        loginBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InicioDeSesion.setBackground(new java.awt.Color(255, 255, 255));
        InicioDeSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 24));
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("Inicio de Sesión");
        InicioDeSesion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 3, 18));
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("Usuario:");
        InicioDeSesion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Lucida Fax", 0, 18));
        txtUsuario.setForeground(new java.awt.Color(255, 204, 204));
        txtUsuario.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuario.setOpaque(true);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        InicioDeSesion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 30));

        RegistrarBtn.setBackground(new java.awt.Color(255, 204, 204));
        RegistrarBtn.setFont(new java.awt.Font("Lucida Fax", 0, 18));
        RegistrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarBtn.setText("Registrarse");
        RegistrarBtn.setBorder(null);
        RegistrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarBtn.setFocusPainted(false);
        RegistrarBtn.setFocusable(false);
        RegistrarBtn.addActionListener(evt -> RegistrarBtnActionPerformed(evt));
        InicioDeSesion.add(RegistrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 40));

        loginBtn.setBackground(new java.awt.Color(255, 204, 204));
        loginBtn.setFont(new java.awt.Font("Lucida Fax", 0, 18));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setFocusPainted(false);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(evt -> loginBtnActionPerformed(evt));
        InicioDeSesion.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 120, 40));

        fondo.add(InicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(fondo, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {
        if (txtUsuario.getText().equals("Ingrese su Usuario")) {
            txtUsuario.setText("");
        }
        txtUsuario.setForeground(java.awt.Color.BLACK);
    }

    private void RegistrarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setText("Ingrese su Usuario");

        Registro registro = new Registro();
        registro.setVisible(true);
        this.dispose();
    }

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        usuario = uber.buscar(txtUsuario.getText());
        if (usuario != null) {
            Menu inicio = new Menu(usuario.getUsername());
            inicio.setLocationRelativeTo(this);
            inicio.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: No se encuentra ese usuario.");
        }
    }

    public static void main(String[] args) throws IOException {
        uber = new Logica.UberSocial();
        new LogIn().setVisible(true);
    }
}
