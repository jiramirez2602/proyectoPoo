/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Pantallas;

import controller.ListaDeEquipos;
import controller.ListaLaboratorios;
import model.Usuario;
/**
 *
 * @author derno
 */
public class PantallaSustanciasQuimicas extends javax.swing.JPanel {

    private ListaDeEquipos equipos; 
    private ListaLaboratorios lab;
    private Usuario user;

    public PantallaSustanciasQuimicas() { // Modificar el constructor
        initComponents();
        equipos=new ListaDeEquipos();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPantallaInsumos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BotonCrearSustancia = new javax.swing.JButton();
        BotonModificarSustancia = new javax.swing.JButton();
        BotonEliminarSustancia = new javax.swing.JButton();
        BotonListarSustancias = new javax.swing.JButton();
        BotonListarSustanciaEspecifica = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BackGroundPantallaInsumos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(62, 183, 248));

        BotonCrearSustancia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonCrearSustancia.setText("Crear Sustancia");
        BotonCrearSustancia.setActionCommand("Crear Sustancia");
        BotonCrearSustancia.setAlignmentY(0.0F);
        BotonCrearSustancia.setBorder(null);
        BotonCrearSustancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCrearSustancia.setHideActionText(true);
        BotonCrearSustancia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCrearSustancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearSustanciaActionPerformed(evt);
            }
        });

        BotonModificarSustancia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonModificarSustancia.setText("Modificar Sustancia");
        BotonModificarSustancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarSustanciaActionPerformed(evt);
            }
        });

        BotonEliminarSustancia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonEliminarSustancia.setText("Eliminar Sustancia");
        BotonEliminarSustancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarSustanciaActionPerformed(evt);
            }
        });

        BotonListarSustancias.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarSustancias.setText("Listar Sustancias");
        BotonListarSustancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarSustanciasActionPerformed(evt);
            }
        });

        BotonListarSustanciaEspecifica.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarSustanciaEspecifica.setText("Listar Sustancia  Especifica");
        BotonListarSustanciaEspecifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarSustanciaEspecificaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonListarSustanciaEspecifica, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(BotonListarSustancias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminarSustancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCrearSustancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarSustancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BotonCrearSustancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonModificarSustancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonEliminarSustancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonListarSustancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonListarSustanciaEspecifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Imagen Usuarios(2).png"))); // NOI18N

        javax.swing.GroupLayout BackGroundPantallaInsumosLayout = new javax.swing.GroupLayout(BackGroundPantallaInsumos);
        BackGroundPantallaInsumos.setLayout(BackGroundPantallaInsumosLayout);
        BackGroundPantallaInsumosLayout.setHorizontalGroup(
            BackGroundPantallaInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPantallaInsumosLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(144, 144, 144)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(186, 186, 186))
        );
        BackGroundPantallaInsumosLayout.setVerticalGroup(
            BackGroundPantallaInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPantallaInsumosLayout.createSequentialGroup()
                .addGroup(BackGroundPantallaInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundPantallaInsumosLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackGroundPantallaInsumosLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69)))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPantallaInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPantallaInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearSustanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearSustanciaActionPerformed
        
    }//GEN-LAST:event_BotonCrearSustanciaActionPerformed

    private void BotonModificarSustanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarSustanciaActionPerformed
       
    }//GEN-LAST:event_BotonModificarSustanciaActionPerformed

    private void BotonEliminarSustanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarSustanciaActionPerformed
      
    }//GEN-LAST:event_BotonEliminarSustanciaActionPerformed

    private void BotonListarSustanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarSustanciasActionPerformed
       
    }//GEN-LAST:event_BotonListarSustanciasActionPerformed

    private void BotonListarSustanciaEspecificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarSustanciaEspecificaActionPerformed
     
    }//GEN-LAST:event_BotonListarSustanciaEspecificaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPantallaInsumos;
    private javax.swing.JButton BotonCrearSustancia;
    private javax.swing.JButton BotonEliminarSustancia;
    private javax.swing.JButton BotonListarSustanciaEspecifica;
    private javax.swing.JButton BotonListarSustancias;
    private javax.swing.JButton BotonModificarSustancia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
