/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseno;

import static Diseno.LogIn.usuario;

import javax.swing.*;

/**
 *
 * @author Dennisse
 */
public class Perfil extends JFrame {

    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTextArea Perfil;
    private JButton regresarBtn;

    public Perfil() {
        initComponents();
        Logica.SocialClass social = LogIn.uber.buscar(LogIn.usuario.getUsername());
        Perfil.setText(social.myProfile());
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        Perfil = new JTextArea();
        regresarBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 430));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Perfil.setEditable(false);
        Perfil.setBackground(new java.awt.Color(255, 204, 204));
        Perfil.setColumns(20);
        Perfil.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        Perfil.setRows(5);
        jScrollPane1.setViewportView(Perfil);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 477, 380));

        regresarBtn.setBackground(new java.awt.Color(255, 204, 204));
        regresarBtn.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setText("REGRESAR");
        regresarBtn.addActionListener(evt -> regresarBtnActionPerformed(evt));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(213, 213, 213)
                                                .addComponent(regresarBtn, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(regresarBtn, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Menu mn = new Menu(usuario.getUsername());
        mn.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Perfil().setVisible(true));
    }
}
