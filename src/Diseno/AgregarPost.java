/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseno;

import javax.swing.*;

import static Diseno.LogIn.usuario;

/**
 *
 * @author Dennisse
 */
public class AgregarPost extends JFrame {

    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextArea Perfil;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JTextArea txtPost;
    private JButton postearBtn;
    private JButton regresarBtn;

    public AgregarPost() {
        initComponents();
        this.setResizable(false);
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        Perfil = new JTextArea();
        jLabel3 = new JLabel();
        jScrollPane1 = new JScrollPane();
        txtPost = new JTextArea();
        postearBtn = new JButton();
        regresarBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 204, 204));

        Perfil.setEditable(false);
        Perfil.setBackground(new java.awt.Color(255, 204, 204));
        Perfil.setColumns(20);
        Perfil.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        Perfil.setRows(5);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(Perfil, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Perfil, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Escribe tu post en el recuadro abajo:");
        jLabel3.setVerticalAlignment(SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 370, -1));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFocusable(false);

        txtPost.setBackground(new java.awt.Color(255, 204, 204));
        txtPost.setColumns(20);
        txtPost.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        txtPost.setForeground(new java.awt.Color(51, 51, 51));
        txtPost.setRows(5);
        txtPost.setBorder(null);
        txtPost.setOpaque(false);
        jScrollPane1.setViewportView(txtPost);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 486, 101));

        postearBtn.setBackground(new java.awt.Color(255, 204, 204));
        postearBtn.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        postearBtn.setForeground(new java.awt.Color(255, 255, 255));
        postearBtn.setText("Postear");
        postearBtn.setBorder(null);
        postearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        postearBtn.setFocusPainted(false);
        postearBtn.setFocusable(false);
        postearBtn.addActionListener(evt -> postearBtnActionPerformed(evt));
        jPanel1.add(postearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 132, 37));

        regresarBtn.setBackground(new java.awt.Color(255, 204, 204));
        regresarBtn.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setText("Regresar");
        regresarBtn.setBorder(null);
        regresarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresarBtn.setFocusPainted(false);
        regresarBtn.setFocusable(false);
        regresarBtn.addActionListener(evt -> regresarBtnActionPerformed(evt));
        jPanel1.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 132, 40));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 657, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 657, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 547, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void postearBtnActionPerformed(java.awt.event.ActionEvent evt) {
        LogIn.uber.agregarPost(LogIn.usuario.getUsername(), txtPost.getText());
        TextPerfil();
    }

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Menu mn = new Menu(usuario.getUsername());
        mn.setVisible(true);
        this.dispose();
    }

    public void TextPerfil() {
        String tipo = "";
        if (LogIn.usuario instanceof Logica.Twitter) {
            tipo = "Twitter";
        } else {
            tipo = "Facebook";
        }
        Perfil.setText("   Usuario: " + LogIn.usuario.getUsername());
        try {
            Perfil.setText(Perfil.getText() + "   Amigos: " + LogIn.usuario.getFriends().size());
        } catch (Exception e) {
            Perfil.setText(Perfil.getText() + "   Amigos: " + 0);
        }

        try {
            Perfil.setText(Perfil.getText() + "\n   Cuenta: " + tipo + "   Posts: " + LogIn.usuario.getPosts().size());
        } catch (Exception e) {
            Perfil.setText(Perfil.getText() + "\n   Cuenta: " + tipo + "   Posts: " + 0);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AgregarPost().setVisible(true));
    }
}
