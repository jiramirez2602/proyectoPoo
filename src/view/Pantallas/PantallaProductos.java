/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Pantallas;

import java.awt.BorderLayout;

/**
 *
 * @author derno
 */
public class PantallaProductos extends javax.swing.JPanel {


    public PantallaProductos() { // Modificar el constructor
        initComponents();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPantallaEquipos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BotonEquipos = new javax.swing.JButton();
        BotonInsumos = new javax.swing.JButton();
        BotonSustanciasQuimicas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BackGroundPantallaEquipos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(62, 183, 248));

        BotonEquipos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonEquipos.setText("Equipos");
        BotonEquipos.setAlignmentY(0.0F);
        BotonEquipos.setBorder(null);
        BotonEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEquipos.setHideActionText(true);
        BotonEquipos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEquiposActionPerformed(evt);
            }
        });

        BotonInsumos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonInsumos.setText("Insumos");
        BotonInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsumosActionPerformed(evt);
            }
        });

        BotonSustanciasQuimicas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonSustanciasQuimicas.setText("Sustancias Quimicas");
        BotonSustanciasQuimicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSustanciasQuimicasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonSustanciasQuimicas, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(BotonEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(BotonEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotonInsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(BotonSustanciasQuimicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Imagen Usuarios(2).png"))); // NOI18N

        javax.swing.GroupLayout BackGroundPantallaEquiposLayout = new javax.swing.GroupLayout(BackGroundPantallaEquipos);
        BackGroundPantallaEquipos.setLayout(BackGroundPantallaEquiposLayout);
        BackGroundPantallaEquiposLayout.setHorizontalGroup(
            BackGroundPantallaEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPantallaEquiposLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(144, 144, 144)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(186, 186, 186))
        );
        BackGroundPantallaEquiposLayout.setVerticalGroup(
            BackGroundPantallaEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPantallaEquiposLayout.createSequentialGroup()
                .addGroup(BackGroundPantallaEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundPantallaEquiposLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackGroundPantallaEquiposLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69)))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPantallaEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPantallaEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEquiposActionPerformed
        PantallaEquipos pl = new PantallaEquipos();
        pl.setSize(1100,610);
        pl.setLocation(0,0);
        BackGroundPantallaEquipos.removeAll();
        BackGroundPantallaEquipos.add(pl, BorderLayout.CENTER);
        BackGroundPantallaEquipos.revalidate();
        BackGroundPantallaEquipos.repaint();
    }//GEN-LAST:event_BotonEquiposActionPerformed

    private void BotonInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsumosActionPerformed
        PantallaInsumos pl = new PantallaInsumos();
        pl.setSize(1100,610);
        pl.setLocation(0,0);
        BackGroundPantallaEquipos.removeAll();
        BackGroundPantallaEquipos.add(pl, BorderLayout.CENTER);
        BackGroundPantallaEquipos.revalidate();
        BackGroundPantallaEquipos.repaint();
    }//GEN-LAST:event_BotonInsumosActionPerformed

    private void BotonSustanciasQuimicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSustanciasQuimicasActionPerformed
        PantallaSustanciasQuimicas pl = new PantallaSustanciasQuimicas();
        pl.setSize(1100,610);
        pl.setLocation(0,0);
        BackGroundPantallaEquipos.removeAll();
        BackGroundPantallaEquipos.add(pl, BorderLayout.CENTER);
        BackGroundPantallaEquipos.revalidate();
        BackGroundPantallaEquipos.repaint();
    }//GEN-LAST:event_BotonSustanciasQuimicasActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPantallaEquipos;
    private javax.swing.JButton BotonEquipos;
    private javax.swing.JButton BotonInsumos;
    private javax.swing.JButton BotonSustanciasQuimicas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
