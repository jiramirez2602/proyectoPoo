/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import controller.ListaDeEquipos;
import controller.ListaDeInsumos;
import controller.ListaDeSustanciasQuimicas;
import controller.ListaDeUsuarios;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import model.Usuario;
import view.Pantallas.PantallaLaboratorios;
import view.Pantallas.PantallaProductos;
import view.Pantallas.PantallaUsuarios;

/**
 *
 * @author derno
 */
public class MainJFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainJFrame
     */
    private Usuario user;
    private ListaDeUsuarios listaUsuario;
    private ListaLaboratorios listaLaboratorios;
    private ListaDeInsumos listaInsumos;
    private ListaDeEquipos listaEquipos;
    private ListaDeSustanciasQuimicas listaQuimicas;
    int xMouse;
    int yMouse;
    
    public MainJFrame(Usuario usuarioActual,ListaDeUsuarios users,ListaLaboratorios labs,ListaDeEquipos equipos,ListaDeInsumos insumos,ListaDeSustanciasQuimicas quimicas) {
        this.user=usuarioActual;
        this.listaUsuario=users;
        this.listaLaboratorios=labs;
        this.listaInsumos=insumos;
        this.listaEquipos=equipos;
        this.listaQuimicas=quimicas;
        initComponents();
        initContenido();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        jLabel4.setText(usuarioActual.getUsername());
    }
    private void initContenido() {
        Contenido pl = new Contenido();
        pl.setSize(1100, 610);
        pl.setLocation(0, 0);
        ContenidoMain.removeAll();
        ContenidoMain.add(pl, BorderLayout.CENTER);
        ContenidoMain.revalidate();
        ContenidoMain.repaint();
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/file.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        BotonInicio = new javax.swing.JButton();
        BotonUsuarios = new javax.swing.JButton();
        BotonLaboratorios = new javax.swing.JButton();
        BotonProductos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ContenidoMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 772));
        setUndecorated(true);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(62, 183, 248));

        BotonInicio.setBackground(new java.awt.Color(62, 183, 248));
        BotonInicio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(255, 255, 255));
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Inicio Main (2).png"))); // NOI18N
        BotonInicio.setText("Inicio");
        BotonInicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonInicio.setBorderPainted(false);
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonInicio.setIconTextGap(55);
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        BotonUsuarios.setBackground(new java.awt.Color(62, 183, 248));
        BotonUsuarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        BotonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BotonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Usuarios Main.png"))); // NOI18N
        BotonUsuarios.setText("Usuarios");
        BotonUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonUsuarios.setBorderPainted(false);
        BotonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonUsuarios.setIconTextGap(45);
        BotonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuariosActionPerformed(evt);
            }
        });

        BotonLaboratorios.setBackground(new java.awt.Color(62, 183, 248));
        BotonLaboratorios.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        BotonLaboratorios.setForeground(new java.awt.Color(255, 255, 255));
        BotonLaboratorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Lab Main.png"))); // NOI18N
        BotonLaboratorios.setText("Laboratorios");
        BotonLaboratorios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonLaboratorios.setBorderPainted(false);
        BotonLaboratorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLaboratorios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonLaboratorios.setIconTextGap(35);
        BotonLaboratorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLaboratoriosActionPerformed(evt);
            }
        });

        BotonProductos.setBackground(new java.awt.Color(62, 183, 248));
        BotonProductos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        BotonProductos.setForeground(new java.awt.Color(255, 255, 255));
        BotonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Productos Main.png"))); // NOI18N
        BotonProductos.setText("Productos");
        BotonProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonProductos.setBorderPainted(false);
        BotonProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonProductos.setIconTextGap(45);
        BotonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProductosActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo_UCAB_3 (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Usuario");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonLaboratorios, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BotonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BotonLaboratorios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BotonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );

        Header.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo UCAB.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(383, 383, 383)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ContenidoMain.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContenidoMainLayout = new javax.swing.GroupLayout(ContenidoMain);
        ContenidoMain.setLayout(ContenidoMainLayout);
        ContenidoMainLayout.setHorizontalGroup(
            ContenidoMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1093, Short.MAX_VALUE)
        );
        ContenidoMainLayout.setVerticalGroup(
            ContenidoMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(ContenidoMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(ContenidoMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        Contenido pl = new Contenido();
        pl.setSize(1100, 610);
        pl.setLocation(0, 0);
        ContenidoMain.removeAll();
        ContenidoMain.add(pl, BorderLayout.CENTER);
        ContenidoMain.revalidate();
        ContenidoMain.repaint();
    }//GEN-LAST:event_BotonInicioActionPerformed
    
    private void BotonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuariosActionPerformed
        boolean privilegios=user.verificarPrivilegios(user, "Usuarios");
        if(privilegios==true){
            PantallaUsuarios pl = new PantallaUsuarios(listaUsuario);
            pl.setSize(1100, 610);
            pl.setLocation(0, 0);
            ContenidoMain.removeAll();
            ContenidoMain.add(pl, BorderLayout.CENTER);
            ContenidoMain.revalidate();
            ContenidoMain.repaint();
        }
       
    }//GEN-LAST:event_BotonUsuariosActionPerformed

    private void BotonLaboratoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLaboratoriosActionPerformed
        boolean privilegios=user.verificarPrivilegios(user, "Laboratorios");
        if (privilegios == true) {
            PantallaLaboratorios pl = new PantallaLaboratorios(listaUsuario,listaLaboratorios);
            pl.setSize(1100, 610);
            pl.setLocation(0, 0);
            ContenidoMain.removeAll();
            ContenidoMain.add(pl, BorderLayout.CENTER);
            ContenidoMain.revalidate();
            ContenidoMain.repaint();
        }
    }//GEN-LAST:event_BotonLaboratoriosActionPerformed

    private void BotonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProductosActionPerformed
        boolean privilegios=user.verificarPrivilegios(user, "Productos");
        if (privilegios == true) {
            PantallaProductos pl = new PantallaProductos(user,listaLaboratorios,listaEquipos,listaInsumos,listaQuimicas);
            pl.setSize(1100, 610);
            pl.setLocation(0, 0);
            ContenidoMain.removeAll();
            ContenidoMain.add(pl, BorderLayout.CENTER);
            ContenidoMain.revalidate();
            ContenidoMain.repaint();
        }
    }//GEN-LAST:event_BotonProductosActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jPanel1.setBackground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jPanel1.setBackground(new Color(51,204,255));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonLaboratorios;
    private javax.swing.JButton BotonProductos;
    private javax.swing.JButton BotonUsuarios;
    private javax.swing.JPanel ContenidoMain;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
