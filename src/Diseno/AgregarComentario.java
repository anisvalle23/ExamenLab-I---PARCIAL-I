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
public class AgregarComentario extends JFrame {

    private Logica.SocialClass amigo;
    private JTextArea Perfil;
    private JTextArea Posts;
    private JButton jButton1;
    private JButton jButton3;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JButton searchBtn;
    private JTextArea txtPost;
    private JTextField txtUsuario;

    public AgregarComentario() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jLabel1 = new JLabel();
        txtUsuario = new JTextField();
        searchBtn = new JButton();
        jPanel2 = new JPanel();
        Posts = new JTextArea();
        Perfil = new JTextArea();
        jComboBox1 = new JComboBox<>();
        jLabel3 = new JLabel();
        jScrollPane1 = new JScrollPane();
        txtPost = new JTextArea();
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar Comentario");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 175, 37));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Buscar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 25, 317, 40));

        searchBtn.setBackground(new java.awt.Color(255, 204, 204));
        searchBtn.setFont(new java.awt.Font("Lucida Fax", 1, 10));
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Buscar");
        searchBtn.setBorder(null);
        searchBtn.addActionListener(evt -> searchBtnActionPerformed(evt));
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 57, 30));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        Posts.setEditable(false);
        Posts.setBackground(new java.awt.Color(255, 204, 204));
        Posts.setColumns(20);
        Posts.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        Posts.setRows(5);

        Perfil.setEditable(false);
        Perfil.setBackground(new java.awt.Color(255, 204, 204));
        Perfil.setColumns(20);
        Perfil.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        Perfil.setRows(5);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Posts, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Perfil, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Perfil, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(Posts, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 204, 204));
        jComboBox1.setBorder(null);
        jComboBox1.addItemListener(evt -> jComboBox1ItemStateChanged(evt));
        jComboBox1.addActionListener(evt -> jComboBox1ActionPerformed(evt));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 115, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Buscar Post:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFocusable(false);

        txtPost.setBackground(new java.awt.Color(255, 204, 204));
        txtPost.setColumns(20);
        txtPost.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        txtPost.setForeground(new java.awt.Color(51, 51, 51));
        txtPost.setRows(5);
        txtPost.setBorder(null);
        txtPost.setOpaque(false);
        jScrollPane1.setViewportView(txtPost);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 253, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Lucida Fax", 1, 14));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Regresar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 175, 37));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            LogIn.uber.agregarComment(amigo.getUsername(),
                    jComboBox1.getSelectedIndex(), LogIn.usuario.getUsername(), txtPost.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: Algo salio mal al comentar.\n"
                    + "Asegurese de comentar correctamente.");
        }
    }

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {
        txtUsuario.setText("");
        txtUsuario.setForeground(java.awt.Color.BLACK);
    }

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Logica.SocialClass usuario = LogIn.uber.buscar(txtUsuario.getText());
            amigo = usuario;
            TextPerfil(usuario);
            TextPos(usuario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: Ese usuario no existe.");
        }
    }

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
        Posts.setText(amigo.getPosts().get(jComboBox1.getSelectedIndex()));
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void TextPos(Logica.SocialClass usuario) {
        String[] posts = new String[usuario.getPosts().size()];
        for (int ciclo = 0; ciclo < posts.length; ciclo++) {
            posts[ciclo] = Integer.toString(ciclo);
        }

        jComboBox1.setModel(new DefaultComboBoxModel<>(posts));
        Posts.setText(amigo.getPosts().get(0));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AgregarComentario().setVisible(true));
    }
}
