/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diseno;

import static Diseno.LogIn.uber;
import javax.swing.*;

/**
 *
 * @author Dennisse
 */
public class Menu extends JFrame {

    private int XMouse;
    private int YMouse;
    private JPanel Contenedor;
    private JLabel addFriend;
    private JLabel addPost;
    private JLabel comment;
    private JPanel fondo;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JLabel logOut;
    private JLabel miPerfil;
    private JLabel username;

    public Menu(String loggedInUsername) {
        initComponents();
        this.setResizable(false);
        username.setText(loggedInUsername);
    }

    private void initComponents() {

        fondo = new JPanel();
        jPanel1 = new JPanel();
        addPost = new JLabel();
        jLabel4 = new JLabel();
        logOut = new JLabel();
        username = new JLabel();
        addFriend = new JLabel();
        miPerfil = new JLabel();
        comment = new JLabel();
        Contenedor = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        addPost.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        addPost.setForeground(new java.awt.Color(255, 255, 255));
        addPost.setHorizontalAlignment(SwingConstants.CENTER);
        addPost.setText("Agregar Post");
        addPost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPost.setHorizontalTextPosition(SwingConstants.CENTER);
        addPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPostMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPostMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Usuario:");
        jLabel4.setHorizontalTextPosition(SwingConstants.CENTER);

        logOut.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setHorizontalAlignment(SwingConstants.CENTER);
        logOut.setText("Salir");
        logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut.setHorizontalTextPosition(SwingConstants.CENTER);
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });

        username.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(SwingConstants.CENTER);
        username.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        username.setHorizontalTextPosition(SwingConstants.CENTER);

        addFriend.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        addFriend.setForeground(new java.awt.Color(255, 255, 255));
        addFriend.setHorizontalAlignment(SwingConstants.CENTER);
        addFriend.setText("Agregar Amigo");
        addFriend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addFriend.setHorizontalTextPosition(SwingConstants.CENTER);
        addFriend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFriendMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addFriendMouseEntered(evt);
            }
        });

        miPerfil.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        miPerfil.setForeground(new java.awt.Color(255, 255, 255));
        miPerfil.setHorizontalAlignment(SwingConstants.CENTER);
        miPerfil.setText("Mi Perfil");
        miPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miPerfil.setHorizontalTextPosition(SwingConstants.CENTER);
        miPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miPerfilMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miPerfilMouseEntered(evt);
            }
        });

        comment.setFont(new java.awt.Font("Lucida Fax", 1, 18));
        comment.setForeground(new java.awt.Color(255, 255, 255));
        comment.setHorizontalAlignment(SwingConstants.CENTER);
        comment.setText("Comentar");
        comment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comment.setHorizontalTextPosition(SwingConstants.CENTER);
        comment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commentMouseEntered(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(addPost, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(username, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(addFriend, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(miPerfil, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(comment, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(logOut, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(username, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addComponent(addPost)
                                .addGap(34, 34, 34)
                                .addComponent(addFriend)
                                .addGap(31, 31, 31)
                                .addComponent(comment)
                                .addGap(27, 27, 27)
                                .addComponent(miPerfil)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(logOut)
                                .addGap(24, 24, 24))
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setForeground(new java.awt.Color(204, 204, 255));

        GroupLayout ContenedorLayout = new GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
                ContenedorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 340, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
                ContenedorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 350, Short.MAX_VALUE)
        );

        fondo.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 340, 350));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void commentMouseEntered(java.awt.event.MouseEvent evt) {
    }

    private void commentMouseClicked(java.awt.event.MouseEvent evt) {
        AgregarComentario mn = new AgregarComentario();
        mn.setVisible(true);
        this.dispose();
    }

    private void miPerfilMouseEntered(java.awt.event.MouseEvent evt) {
    }

    private void miPerfilMouseClicked(java.awt.event.MouseEvent evt) {
        Perfil pr = new Perfil();
        pr.setVisible(true);
        this.dispose();
    }

    private void addFriendMouseEntered(java.awt.event.MouseEvent evt) {
    }

    private void addFriendMouseClicked(java.awt.event.MouseEvent evt) {
        AgregarAmigo aggAmix = new AgregarAmigo();
        aggAmix.setVisible(true);
        this.setVisible(false);
    }

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {
        LogIn inicio = new LogIn();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.dispose();
    }

    private void addPostMouseEntered(java.awt.event.MouseEvent evt) {
    }

    private void addPostMouseClicked(java.awt.event.MouseEvent evt) {
        AgregarPost agg = new AgregarPost();
        agg.setVisible(true);
        this.dispose();
    }

    public void agregarPanel(JPanel panel) {
        panel.setSize(540, 430);
        panel.setLocation(0, 0);
        Contenedor.removeAll();
        Contenedor.add(panel);
        Contenedor.revalidate();
        Contenedor.repaint();
        Contenedor.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Menu("User").setVisible(true));
    }
}
