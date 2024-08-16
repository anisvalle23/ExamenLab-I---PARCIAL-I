/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseno;

import javax.swing.*;
import static Diseno.LogIn.usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Dennisse
 */
public class AgregarAmigo extends JFrame {

    private JTextArea Perfil;
    private JButton addFriendBtn;
    private JButton jButton2;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JButton regresarBtn;
    private JTextField txtUsuario;

    public AgregarAmigo() {
        initComponents();
        this.setResizable(false);
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        Perfil = new JTextArea();
        addFriendBtn = new JButton();
        jLabel1 = new JLabel();
        txtUsuario = new JTextField();
        jButton2 = new JButton();
        regresarBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        Perfil.setEditable(false);
        Perfil.setBackground(new java.awt.Color(255, 204, 204));
        Perfil.setColumns(20);
        Perfil.setFont(new java.awt.Font("Segoe UI", 3, 24));
        Perfil.setRows(5);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(Perfil, GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 13, Short.MAX_VALUE)
                                .addComponent(Perfil, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 168, 475, -1));

        addFriendBtn.setBackground(new java.awt.Color(255, 204, 204));
        addFriendBtn.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        addFriendBtn.setForeground(new java.awt.Color(255, 255, 255));
        addFriendBtn.setText("Agregar Amigo");
        addFriendBtn.setBorder(null);
        addFriendBtn.setBorderPainted(false);
        addFriendBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addFriendBtn.setFocusPainted(false);
        addFriendBtn.setFocusable(false);
        addFriendBtn.addActionListener(evt -> addFriendBtnActionPerformed(evt));
        jPanel1.add(addFriendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 132, 37));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Buscar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 317, 38));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Lucida Fax", 1, 10));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buscar");
        jButton2.setBorder(null);
        jButton2.setMaximumSize(new java.awt.Dimension(18, 18));
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 50, 30));

        regresarBtn.setBackground(new java.awt.Color(255, 204, 204));
        regresarBtn.setFont(new java.awt.Font("Lucida Fax", 1, 12));
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setText("REGRESAR");
        regresarBtn.addActionListener(evt -> regresarBtnActionPerformed(evt));
        jPanel1.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 130, 40));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 540, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 430, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void addFriendBtnActionPerformed(java.awt.event.ActionEvent evt) {
        LogIn.uber.agregarAmigo(LogIn.usuario.getUsername(), txtUsuario.getText());
    }

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {
        txtUsuario.setText("");
        txtUsuario.setForeground(java.awt.Color.BLACK);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Logica.SocialClass usuario = LogIn.uber.buscar(txtUsuario.getText());
            TextPerfil(usuario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: Ese usuario no existe.");
        }
    }

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Menu mn = new Menu(usuario.getUsername());
        mn.setVisible(true);
        this.dispose();
    }

    public void TextPerfil(Logica.SocialClass usuario) {
        String tipo = "";
        if (usuario instanceof Logica.Twitter) {
            tipo = "Twitter";
        } else {
            tipo = "Facebook";
        }
        Perfil.setText("   Usuario: " + usuario.getUsername());
        try {
            Perfil.setText(Perfil.getText() + "   Amigos: " + usuario.getFriends().size());
        } catch (Exception e) {
            Perfil.setText(Perfil.getText() + "   Amigos: " + 0);
        }

        try {
            Perfil.setText(Perfil.getText() + "\n   Cuenta: " + tipo + "   Posts: " + usuario.getPosts().size());
        } catch (Exception e) {
            Perfil.setText(Perfil.getText() + "\n   Cuenta: " + tipo + "   Posts: " + 0);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AgregarAmigo().setVisible(true));
    }
}
