/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Pantallas;

import controller.ListaDeEquipos;
import controller.ListaDeUsuarios;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import static java.awt.SystemColor.info;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Usuario;
import model.Equipo;
import model.Laboratorio;
/**
 *
 * @author derno
 */
public class PantallaEquipos extends javax.swing.JPanel {

    private ListaDeEquipos equipos; 
    private ListaLaboratorios lab;
    private Usuario user;

    public PantallaEquipos() { // Modificar el constructor
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

        BackGroundPantallaUsuarios = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BotonCrearEquipo = new javax.swing.JButton();
        BotonModificarEquipo = new javax.swing.JButton();
        BotonEliminarEquipo = new javax.swing.JButton();
        BotonListarEquipo = new javax.swing.JButton();
        BotonListarEquipoEspecifico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BackGroundPantallaUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(62, 183, 248));

        BotonCrearEquipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonCrearEquipo.setText("Crear Equipo");
        BotonCrearEquipo.setAlignmentY(0.0F);
        BotonCrearEquipo.setBorder(null);
        BotonCrearEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCrearEquipo.setHideActionText(true);
        BotonCrearEquipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearEquipoActionPerformed(evt);
            }
        });

        BotonModificarEquipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonModificarEquipo.setText("Modificar Equipo");
        BotonModificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarEquipoActionPerformed(evt);
            }
        });

        BotonEliminarEquipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonEliminarEquipo.setText("Eliminar Equipo");
        BotonEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarEquipoActionPerformed(evt);
            }
        });

        BotonListarEquipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarEquipo.setText("Listar Equipo");
        BotonListarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarEquipoActionPerformed(evt);
            }
        });

        BotonListarEquipoEspecifico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarEquipoEspecifico.setText("Listar Equipo Especifico");
        BotonListarEquipoEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarEquipoEspecificoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonListarEquipoEspecifico, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(BotonListarEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminarEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCrearEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BotonCrearEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonModificarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonEliminarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonListarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonListarEquipoEspecifico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Imagen Usuarios(2).png"))); // NOI18N

        javax.swing.GroupLayout BackGroundPantallaUsuariosLayout = new javax.swing.GroupLayout(BackGroundPantallaUsuarios);
        BackGroundPantallaUsuarios.setLayout(BackGroundPantallaUsuariosLayout);
        BackGroundPantallaUsuariosLayout.setHorizontalGroup(
            BackGroundPantallaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPantallaUsuariosLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(144, 144, 144)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(186, 186, 186))
        );
        BackGroundPantallaUsuariosLayout.setVerticalGroup(
            BackGroundPantallaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPantallaUsuariosLayout.createSequentialGroup()
                .addGroup(BackGroundPantallaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundPantallaUsuariosLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackGroundPantallaUsuariosLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69)))
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPantallaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPantallaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearEquipoActionPerformed
      String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del equipo:");
      String marca = JOptionPane.showInputDialog("Ingrese la marca del equipo");
      String modelo = JOptionPane.showInputDialog("Ingrese el modelo del equipo:");
      String presentacion = JOptionPane.showInputDialog("Ingrese la presentacion del equipo");
      String numeroSerial = JOptionPane.showInputDialog("Ingrese el numero serial del equipo");  
      String numeroActivo = JOptionPane.showInputDialog("Ingrese el numero activo del equipo");
      String voltaje = JOptionPane.showInputDialog("Ingrese el voltaje del equipo:");
      String procesable = JOptionPane.showInputDialog("Ingrese el procesable del equipo:");
      String aplicacion = JOptionPane.showInputDialog("Ingrese la aplicacion del equipo:");
      String añoDeCompra = JOptionPane.showInputDialog("Ingrese el año de compra del equipo(use el formato dd/mm/yyyy):");
      String ultimoMantenimiento = JOptionPane.showInputDialog("Ingrese el ultimo mantenimiento del equipo(use el formato dd/mm/yyyy):");
      String proximoMantenimiento = JOptionPane.showInputDialog("Ingrese el proximo mantenimiento del equipo(use el formato dd/mm/yyyy):");
      String ultimaCalibracion = JOptionPane.showInputDialog("Ingrese la ultima calibracion del equipo(use el formato dd/mm/yyyy):");
      String proximaCalibracion = JOptionPane.showInputDialog("Ingrese la proxima calibracion del equipo(use el formato dd/mm/yyyy):");
      String provedores = JOptionPane.showInputDialog("Ingrese los proveedores de servicios del equipo");
      String encendido = JOptionPane.showInputDialog("Ingrese si esta encendido en la noche del equipo (si/no) :");
      String materialRequerido = JOptionPane.showInputDialog("Ingrese el material requerido del equipo:");
      String codigo = JOptionPane.showInputDialog("Ingrese el codigo del equipo:");
      String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
      String inventarioExistente = JOptionPane.showInputDialog("Ingrese el inventario existente(0 hasta 999999):");
      String observaciones = JOptionPane.showInputDialog("Ingrese observaciones del producto:");
      ArrayList<Laboratorio> labs=lab.listarLaboratorios();
      Laboratorio laboratorio=lab.listarLaboratorio(labs.get(0).getId());
      boolean on=false;
      if(encendido.toLowerCase().equals("si")){
          on=true;
      }
      boolean exito = equipos.crearProductoEquipo(user,descripcion,marca,modelo,numeroSerial,numeroActivo,presentacion,voltaje, procesable,materialRequerido,añoDeCompra,aplicacion,ultimoMantenimiento,proximoMantenimiento,ultimaCalibracion,proximaCalibracion, provedores,on,codigo,nombreProducto,inventarioExistente,observaciones,laboratorio);
      if (exito) {
          JOptionPane.showMessageDialog(null, "Equipo creado exitosamente");
      } else {
          JOptionPane.showMessageDialog(null, "Error al crear el equipo");
      }
    }//GEN-LAST:event_BotonCrearEquipoActionPerformed

    private void BotonModificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarEquipoActionPerformed
        String id = JOptionPane.showInputDialog("Ingrese el ID del equipo a modificar:");
        Equipo equipoExistente = equipos.listarEquipo(id);
        ArrayList<Laboratorio> labs = lab.listarLaboratorios();
        Laboratorio laboratorio = lab.listarLaboratorio(labs.get(0).getId());
        if (equipoExistente != null && laboratorio!=null ) {
            String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del equipo:");
            String marca = JOptionPane.showInputDialog("Ingrese la marca del equipo:");
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del equipo:");
            String presentacion = JOptionPane.showInputDialog("Ingrese la presentacion del equipo:");
            String numeroSerial = JOptionPane.showInputDialog("Ingrese el numero serial del equipo:");
            String numeroActivo = JOptionPane.showInputDialog("Ingrese el numero activo del equipo:");
            String voltaje = JOptionPane.showInputDialog("Ingrese el voltaje del equipo:");
            String procesable = JOptionPane.showInputDialog("Ingrese el procesable del equipo:");
            String aplicacion = JOptionPane.showInputDialog("Ingrese la aplicacion del equipo:");
            String añoDeCompra = JOptionPane.showInputDialog("Ingrese el año de compra del equipo(use el formato dd/mm/yyyy):");
            String ultimoMantenimiento = JOptionPane.showInputDialog("Ingrese el ultimo mantenimiento del equipo(use el formato dd/mm/yyyy):");
            String proximoMantenimiento = JOptionPane.showInputDialog("Ingrese el proximo mantenimiento del equipo(use el formato dd/mm/yyyy):");
            String ultimaCalibracion = JOptionPane.showInputDialog("Ingrese la ultima calibracion del equipo(use el formato dd/mm/yyyy):");
            String proximaCalibracion = JOptionPane.showInputDialog("Ingrese la proxima calibracion del equipo(use el formato dd/mm/yyyy):");
            String provedores = JOptionPane.showInputDialog("Ingrese los proveedores de servicios del equipo");
            String encendido = JOptionPane.showInputDialog("Ingrese si esta encendido en la noche del equipo (si/no) :");
            String materialRequerido = JOptionPane.showInputDialog("Ingrese el material requerido del equipo:");
            String codigo = JOptionPane.showInputDialog("Ingrese el codigo del equipo:");
            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            String inventarioExistente = JOptionPane.showInputDialog("Ingrese el inventario existente(0 hasta 999999):");
            String observaciones = JOptionPane.showInputDialog("Ingrese observaciones del producto:");
            boolean on = false;
            if (encendido.toLowerCase().equals("si")) {
                on = true;
            }
            boolean exito = equipos.modificarEquipo(user, id, descripcion, marca, modelo, numeroSerial, numeroActivo, presentacion, voltaje, procesable, materialRequerido, añoDeCompra, aplicacion, ultimoMantenimiento, proximoMantenimiento, ultimaCalibracion, proximaCalibracion, provedores, on, codigo, nombreProducto, inventarioExistente, observaciones, laboratorio);
            if (exito) {
                JOptionPane.showMessageDialog(null, "Equipo modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el equipo");
            }
        }
    }//GEN-LAST:event_BotonModificarEquipoActionPerformed

    private void BotonEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarEquipoActionPerformed
        String id = JOptionPane.showInputDialog("Ingrese el ID del equipo a eliminar:");
        Equipo equipoExistente= equipos.listarEquipo(id);
        if (equipoExistente != null) {
            boolean exito = equipos.eliminarEquipo(user, id);
            if (exito) {
                JOptionPane.showMessageDialog(null, "Equipo eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el equipo");
            }
        }
    }//GEN-LAST:event_BotonEliminarEquipoActionPerformed

    private void BotonListarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarEquipoActionPerformed
        List<Equipo> tool = equipos.listarEquipoPorUsuario(user);
        if (!tool.isEmpty()) {
            Listar p1 = new Listar();
            p1.setSize(1100, 610);
            p1.setLocation(0, 0);
            p1.mostrarListaEquipos(tool);
            BackGroundPantallaUsuarios.removeAll(); // Llamar a removeAll() en la instancia de PantallaUsuarios
            BackGroundPantallaUsuarios.add(p1, BorderLayout.CENTER);
            BackGroundPantallaUsuarios.revalidate();
            BackGroundPantallaUsuarios.repaint();
        }else{
            JOptionPane.showMessageDialog(null, info.toString(), "No hay equipos disponibles", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BotonListarEquipoActionPerformed

    private void BotonListarEquipoEspecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarEquipoEspecificoActionPerformed
        String id = JOptionPane.showInputDialog("Ingrese el ID del equipo a mostrar:");
        Equipo equipment = equipos.listarEquipo(id);
        if(equipment!=null){
            StringBuilder info=new StringBuilder();
            info.append("Nombre del Producto:").append(equipment.getNombreProducto()).append("\n");
            info.append("Codigo:").append(equipment.getCodigo()).append("\n");
            info.append("Tipo de producto:").append(equipment.getTipoDeProducto()).append("\n");
            info.append("Inventario:").append(equipment.getInventarioExistente()).append("\n");
            info.append("Observaciones:").append(equipment.getObservaciones()).append("\n");
            info.append("Descripcion:").append(equipment.getDescripcion()).append("\n");
            info.append("Marca:").append(equipment.getMarca()).append("\n");
            info.append("Modelo:").append(equipment.getModelo()).append("\n");
            info.append("Numero serial:").append(equipment.getNumeroSerial()).append("\n");
            info.append("Numero Activo:").append(equipment.getNumeroActivo()).append("\n");
            info.append("Presentacion:").append(equipment.getPresentacion()).append("\n");
            info.append("Voltaje:").append(equipment.getVoltaje()).append("\n");
            info.append("Procesable:").append(equipment.getProcesable()).append("\n");
            info.append("Material Requerido:").append(equipment.getNombreProducto()).append("\n");
            info.append("Año de compra:").append(equipment.getAñoDeCompra()).append("\n");
            info.append("Aplicacion:").append(equipment.getAplicacion()).append("\n");
            info.append("Ultimo Mantenimiento:").append(equipment.getNombreProducto()).append("\n");
            info.append("Proximo Mantenimiento:").append(equipment.getNombreProducto()).append("\n");
            info.append("Ultima Calibracion:").append(equipment.getNombreProducto()).append("\n");
            info.append("Proxima Calibracion:").append(equipment.getNombreProducto()).append("\n");
            info.append("Proveedores de Servicios:").append(equipment.getNombreProducto()).append("\n");
            info.append("Encendido de noche:").append(equipment.getNombreProducto()).append("\n");
            
            JOptionPane.showMessageDialog(null, info.toString(), "Información del Equipo", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Equipo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonListarEquipoEspecificoActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPantallaUsuarios;
    private javax.swing.JButton BotonCrearEquipo;
    private javax.swing.JButton BotonEliminarEquipo;
    private javax.swing.JButton BotonListarEquipo;
    private javax.swing.JButton BotonListarEquipoEspecifico;
    private javax.swing.JButton BotonModificarEquipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
