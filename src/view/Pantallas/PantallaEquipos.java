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

    public PantallaEquipos(Usuario usuario,ListaLaboratorios labs,ListaDeEquipos listaEquip) { // Modificar el constructor
        this.equipos=listaEquip;
        this.lab=labs;   
        this.user=usuario;
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
        BotonModificarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarEquipoActionPerformed(evt);
            }
        });

        BotonEliminarEquipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonEliminarEquipo.setText("Eliminar Equipo");
        BotonEliminarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarEquipoActionPerformed(evt);
            }
        });

        BotonListarEquipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarEquipo.setText("Listar Equipo");
        BotonListarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonListarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarEquipoActionPerformed(evt);
            }
        });

        BotonListarEquipoEspecifico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarEquipoEspecifico.setText("Listar Equipo Especifico");
        BotonListarEquipoEspecifico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Equipos.png"))); // NOI18N

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
      Boolean encendido = JOptionPane.showConfirmDialog(null, "¿Esta encendido de noche?", "Encendido de noche", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
      String materialRequerido = JOptionPane.showInputDialog("Ingrese el material requerido del equipo:");
      String codigo = JOptionPane.showInputDialog("Ingrese el codigo del equipo:");
      String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
      String inventarioExistente = JOptionPane.showInputDialog("Ingrese el inventario existente(0 hasta 999999):");
      String observaciones = JOptionPane.showInputDialog("Ingrese observaciones del producto:");
      String labAsignar=JOptionPane.showInputDialog("Ingrese nombre del laboratorio para asignar el equipo:");
      String id = lab.listarLaboratorioPorNombre(labAsignar);
      Laboratorio laboratorio=lab.listarLaboratorio(id);
      if (laboratorio != null) {
        boolean exito = equipos.crearProductoEquipo(user, descripcion, marca, modelo, numeroSerial, numeroActivo, presentacion, voltaje, procesable, materialRequerido, añoDeCompra, aplicacion, ultimoMantenimiento, proximoMantenimiento, ultimaCalibracion, proximaCalibracion, provedores, encendido, codigo, nombreProducto, inventarioExistente, observaciones, laboratorio);
        if (exito) {
                JOptionPane.showMessageDialog(null, "Equipo creado exitosamente");
        } else {
                JOptionPane.showMessageDialog(null, "Error al crear el equipo");
        }
      }
      else{
        JOptionPane.showMessageDialog(null, "Error al crear el equipo, Laboratorio no encontrado");
      }
    }//GEN-LAST:event_BotonCrearEquipoActionPerformed

    private void BotonModificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarEquipoActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo a modificar:");
        String id=equipos.listarEquipoPorNombre(user, nombre);
        Equipo equipoExistente = equipos.listarEquipo(id);
        if (equipoExistente != null) {
            String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del equipo:",equipoExistente.getDescripcion());
            String marca = JOptionPane.showInputDialog("Ingrese la marca del equipo:",equipoExistente.getMarca());
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del equipo:",equipoExistente.getModelo());
            String presentacion = JOptionPane.showInputDialog("Ingrese la presentacion del equipo:",equipoExistente.getPresentacion());
            String numeroSerial = JOptionPane.showInputDialog("Ingrese el numero serial del equipo:",equipoExistente.getNumeroSerial());
            String numeroActivo = JOptionPane.showInputDialog("Ingrese el numero activo del equipo:",equipoExistente.getNumeroActivo());
            String voltaje = JOptionPane.showInputDialog("Ingrese el voltaje del equipo:",equipoExistente.getVoltaje());
            String procesable = JOptionPane.showInputDialog("Ingrese el procesable del equipo:",equipoExistente.getProcesable());
            String aplicacion = JOptionPane.showInputDialog("Ingrese la aplicacion del equipo:",equipoExistente.getAplicacion());
            String añoDeCompra = JOptionPane.showInputDialog("Ingrese el año de compra del equipo(use el formato dd/mm/yyyy):");
            String ultimoMantenimiento = JOptionPane.showInputDialog("Ingrese el ultimo mantenimiento del equipo(use el formato dd/mm/yyyy):");
            String proximoMantenimiento = JOptionPane.showInputDialog("Ingrese el proximo mantenimiento del equipo(use el formato dd/mm/yyyy):");
            String ultimaCalibracion = JOptionPane.showInputDialog("Ingrese la ultima calibracion del equipo(use el formato dd/mm/yyyy):");
            String proximaCalibracion = JOptionPane.showInputDialog("Ingrese la proxima calibracion del equipo(use el formato dd/mm/yyyy):");
            String provedores = JOptionPane.showInputDialog("Ingrese los proveedores de servicios del equipo",equipoExistente.getProovedoresDeServicios());
            Boolean encendido = JOptionPane.showConfirmDialog(null, "¿Esta encendido de noche?", "Encendido de noche", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            String materialRequerido = JOptionPane.showInputDialog("Ingrese el material requerido del equipo:",equipoExistente.getMaterialRequerido());
            String codigo = JOptionPane.showInputDialog("Ingrese el codigo del equipo:",equipoExistente.getCodigo());
            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:",equipoExistente.getNombreProducto());
            String inventarioExistente = JOptionPane.showInputDialog("Ingrese el inventario existente(0 hasta 999999):",equipoExistente.getInventarioExistente());
            String observaciones = JOptionPane.showInputDialog("Ingrese observaciones del producto:",equipoExistente.getObservaciones());
            String labAsignar=JOptionPane.showInputDialog("Ingrese nombre del laboratorio para asignar el equipo:");
            String iD = lab.listarLaboratorioPorNombre(labAsignar);
            Laboratorio laboratorio=lab.listarLaboratorio(iD);
            if (laboratorio != null) {
                boolean exito = equipos.crearProductoEquipo(user, descripcion, marca, modelo, numeroSerial, numeroActivo, presentacion, voltaje, procesable, materialRequerido, añoDeCompra, aplicacion, ultimoMantenimiento, proximoMantenimiento, ultimaCalibracion, proximaCalibracion, provedores, encendido, codigo, nombreProducto, inventarioExistente, observaciones, laboratorio);
                if (exito) {
                    JOptionPane.showMessageDialog(null, "Equipo creado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al crear el equipo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear el equipo, Laboratorio no encontrado");
            }
        }
    }//GEN-LAST:event_BotonModificarEquipoActionPerformed

    private void BotonEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarEquipoActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo a modificar:");
        String id=equipos.listarEquipoPorNombre(user, nombre);
        Equipo equipoExistente = equipos.listarEquipo(id);
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
        if (!tool.isEmpty()){
            Listar p1 = new Listar();
            p1.setSize(1100, 610);
            p1.setLocation(0, 0);
            p1.mostrarListaEquipos(tool);
            BackGroundPantallaUsuarios.removeAll(); // Llamar a removeAll() en la instancia de PantallaUsuarios
            BackGroundPantallaUsuarios.add(p1, BorderLayout.CENTER);
            }else{
                JOptionPane.showMessageDialog(null, "No hay equipos disponibles");
        }
        BackGroundPantallaUsuarios.revalidate();
        BackGroundPantallaUsuarios.repaint();
    }//GEN-LAST:event_BotonListarEquipoActionPerformed

    private void BotonListarEquipoEspecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarEquipoEspecificoActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo a mostrar:");
        String id=equipos.listarEquipoPorNombre(user, nombre);
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
            info.append("Material Requerido:").append(equipment.getMaterialRequerido()).append("\n");
            info.append("Año de compra:").append(equipment.getAñoDeCompra()).append("\n");
            info.append("Aplicacion:").append(equipment.getAplicacion()).append("\n");
            info.append("Ultimo Mantenimiento:").append(equipment.getUltimoMantenimiento()).append("\n");
            info.append("Proximo Mantenimiento:").append(equipment.getProximoMantenimiento()).append("\n");
            info.append("Ultima Calibracion:").append(equipment.getUltimaCalibracion()).append("\n");
            info.append("Proxima Calibracion:").append(equipment.getProximaCalibracion()).append("\n");
            info.append("Proveedores de Servicios:").append(equipment.getProovedoresDeServicios()).append("\n");
            info.append("Encendido de noche:").append(equipment.getEncendidoDenoche()).append("\n");
            info.append("Laboratorio perteneciente:").append(equipment.getLaboratorio().getNombreLaboratorio()).append("\n");
            
            JOptionPane.showMessageDialog(null, info.toString(), "Información del Equipo", JOptionPane.INFORMATION_MESSAGE);
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
