/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Pantallas;

import controller.ListaDeInsumos;
import controller.ListaDeUsuarios;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import static java.awt.SystemColor.info;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Insumo;
import model.Laboratorio;
import model.Usuario;
/**
 *
 * @author derno
 */
public class PantallaInsumos extends javax.swing.JPanel {

    private ListaDeInsumos insumos;
    private Usuario user;
    private ListaLaboratorios lab;

    public PantallaInsumos(Usuario usuario,ListaLaboratorios labs,ListaDeInsumos insum) { // Modificar el constructor
        this.lab=labs;
        this.insumos=insum;
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
        BotonCrearInsumo = new javax.swing.JButton();
        BotonModificarInsumo = new javax.swing.JButton();
        BotonEliminarInsumo = new javax.swing.JButton();
        BotonListarInsumo = new javax.swing.JButton();
        BotonListarInsumoEspecifico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        BackGroundPantallaUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(62, 183, 248));

        BotonCrearInsumo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonCrearInsumo.setText("Crear Insumo");
        BotonCrearInsumo.setAlignmentY(0.0F);
        BotonCrearInsumo.setBorder(null);
        BotonCrearInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCrearInsumo.setHideActionText(true);
        BotonCrearInsumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCrearInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearInsumoActionPerformed(evt);
            }
        });

        BotonModificarInsumo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonModificarInsumo.setText("Modificar Insumo");
        BotonModificarInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarInsumoActionPerformed(evt);
            }
        });

        BotonEliminarInsumo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonEliminarInsumo.setText("Eliminar Insumo");
        BotonEliminarInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarInsumoActionPerformed(evt);
            }
        });

        BotonListarInsumo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarInsumo.setText("Listar Insumo");
        BotonListarInsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonListarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarInsumoActionPerformed(evt);
            }
        });

        BotonListarInsumoEspecifico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarInsumoEspecifico.setText("Listar Insumo Especifico");
        BotonListarInsumoEspecifico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonListarInsumoEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarInsumoEspecificoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonListarInsumoEspecifico, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(BotonListarInsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminarInsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCrearInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonModificarInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BotonCrearInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonModificarInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonEliminarInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonListarInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(BotonListarInsumoEspecifico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Insumos.png"))); // NOI18N

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

    private void BotonCrearInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearInsumoActionPerformed
      String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del insumo:");
      String marca = JOptionPane.showInputDialog("Ingrese la marca del insumo:");
      String modelo = JOptionPane.showInputDialog("Ingrese el modelo del insumo:");
      String presentacion = JOptionPane.showInputDialog("Ingrese la presentacion del insumo:");
      String clasificacion = JOptionPane.showInputDialog("Ingrese la clasificacion del insumo:");  
      String categoria = JOptionPane.showInputDialog("Ingrese la categoria del insumo:");
      String ultimaCompra = JOptionPane.showInputDialog("Ingrese la ultima compra del insumo(use el formato dd/mm/yy):");
      String precioEstimado = JOptionPane.showInputDialog("Ingrese el precio estimado del insumo(puede usar puntos(.) y numeros):");
      String unidad = JOptionPane.showInputDialog("Ingrese la unidad del insumo:");
      String proveedor = JOptionPane.showInputDialog("Ingrese el provedor del insumo:");
      String codigo = JOptionPane.showInputDialog("Ingrese el codigo del insumo:");
      String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre producto del insumo:");
      String inventarioExistente = JOptionPane.showInputDialog("Ingrese el inventario existente de los insumos(puede ser hasta 0 a 999999):");
      String observaciones = JOptionPane.showInputDialog("Ingrese las observaciones del insumo:");
      String labAsignar=JOptionPane.showInputDialog("Ingrese nombre de laboratorio para asignar Insumo:");
      String iD = lab.listarLaboratorioPorNombre(labAsignar);
      Laboratorio laboratorio=lab.listarLaboratorio(iD);
      if (laboratorio != null) {
        boolean exito = insumos.crearProductoInsumo(user, descripcion, marca, modelo, presentacion, clasificacion, categoria, ultimaCompra, precioEstimado, unidad, proveedor, codigo, nombreProducto, inventarioExistente, observaciones, laboratorio);
        if (exito) {
            JOptionPane.showMessageDialog(null, "Insumo creado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear el insumo");
        }
      }
      else{
          JOptionPane.showMessageDialog(null, "Error al crear el insumo, Laboratorio no encontrado");
      }
      
    }//GEN-LAST:event_BotonCrearInsumoActionPerformed

    private void BotonModificarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarInsumoActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del insumo a modificar:");
        String id=insumos.listarInsumosPorNombre(user, nombre);
        Insumo insumoExistente = insumos.listarInsumo(id);
        if (insumoExistente != null) {
            String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del insumo:",insumoExistente.getDescripcion());
            String marca = JOptionPane.showInputDialog("Ingrese la marca del insumo:",insumoExistente.getMarca());
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del insumo:",insumoExistente.getModelo());
            String presentacion = JOptionPane.showInputDialog("Ingrese la presentacion del insumo:",insumoExistente.getPresentacion());
            String clasificacion = JOptionPane.showInputDialog("Ingrese la clasificacion del insumo:",insumoExistente.getClasificacion());
            String categoria = JOptionPane.showInputDialog("Ingrese la categoria del insumo:",insumoExistente.getCategoria());
            String ultimaCompra = JOptionPane.showInputDialog("Ingrese la ultima compra del insumo(use el formato dd/mm/yy):");
            String precioEstimado = JOptionPane.showInputDialog("Ingrese el precio estimado del insumo(puede usar puntos(.) y numeros):",insumoExistente.getPrecioEstimado());
            String unidad = JOptionPane.showInputDialog("Ingrese la unidad del insumo:",insumoExistente.getUnidad());
            String proveedor = JOptionPane.showInputDialog("Ingrese el provedor del insumo:",insumoExistente.getProveedor());
            String codigo = JOptionPane.showInputDialog("Ingrese el codigo del insumo:",insumoExistente.getCodigo());
            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre producto del insumo:",insumoExistente.getNombreProducto());
            String inventarioExistente = JOptionPane.showInputDialog("Ingrese el inventario existente de los insumos(puede ser hasta 0 a 999999):",insumoExistente.getInventarioExistente());
            String observaciones = JOptionPane.showInputDialog("Ingrese las observaciones del insumo:",insumoExistente.getObservaciones());
            String labAsignar=JOptionPane.showInputDialog("Ingrese nombre de laboratorio para asignar Insumo:");
            String iD = lab.listarLaboratorioPorNombre(labAsignar);
            Laboratorio laboratorio=lab.listarLaboratorio(iD);
            if (laboratorio != null) {
                boolean exito = insumos.modificarInsumo(user, id, descripcion, marca, modelo, presentacion, clasificacion, categoria, ultimaCompra, precioEstimado, unidad, proveedor, codigo, nombreProducto, inventarioExistente, observaciones, laboratorio);
                if (exito) {
                    JOptionPane.showMessageDialog(null, "Insumo creado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al crear el insumo");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al crear el insumo, Laboratorio no encontrado");
            }
        }
    }//GEN-LAST:event_BotonModificarInsumoActionPerformed

    private void BotonEliminarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarInsumoActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del insumo a eliminar:");
        String id=insumos.listarInsumosPorNombre(user, nombre);
        Insumo insumoExistente = insumos.listarInsumo(id);
        if(insumoExistente != null){
            boolean exito = insumos.eliminarInsumo(user, id);
            if (exito) {
                JOptionPane.showMessageDialog(null, "Insumo eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el insumo");
            }
        }
    }//GEN-LAST:event_BotonEliminarInsumoActionPerformed

    private void BotonListarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarInsumoActionPerformed
        List<Insumo> insumo = insumos.listarInsumoPorUsuario(user);
        if(!insumo.isEmpty()){
             Listar p1 = new Listar();
            p1.setSize(1100, 610);
            p1.setLocation(0, 0);
            p1.mostrarListaInsumos(insumo);
            BackGroundPantallaUsuarios.removeAll(); 
            BackGroundPantallaUsuarios.add(p1, BorderLayout.CENTER);
        } else{
              JOptionPane.showMessageDialog(null, "No hay insumos disponibles");
        }
        BackGroundPantallaUsuarios.revalidate();
        BackGroundPantallaUsuarios.repaint();
       
    }//GEN-LAST:event_BotonListarInsumoActionPerformed

    private void BotonListarInsumoEspecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarInsumoEspecificoActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del insumo a mostrar");
        String id=insumos.listarInsumosPorNombre(user, nombre);
        Insumo insumo = insumos.listarInsumo(id);
        if(insumo!=null){
            StringBuilder info=new StringBuilder();
            info.append("Nombre del Producto:").append(insumo.getNombreProducto()).append("\n");
            info.append("Codigo:").append(insumo.getCodigo()).append("\n");
            info.append("Tipo de producto:").append(insumo.getTipoDeProducto()).append("\n");
            info.append("Inventario:").append(insumo.getInventarioExistente()).append("\n");
            info.append("Observaciones:").append(insumo.getObservaciones()).append("\n");
            info.append("Descripcion:").append(insumo.getDescripcion()).append("\n");
            info.append("Marca:").append(insumo.getMarca()).append("\n");
            info.append("Modelo:").append(insumo.getModelo()).append("\n");
            info.append("Presentacion:").append(insumo.getPresentacion()).append("\n");
            info.append("Clasificacion:").append(insumo.getClasificacion()).append("\n");
            info.append("Categoria:").append(insumo.getCategoria()).append("\n");
            info.append("Ultima Compra:").append(insumo.getUltimaCompra()).append("\n");
            info.append("Precio Estimado:").append(insumo.getPrecioEstimado()).append("\n");
            info.append("Unidad:").append(insumo.getUnidad()).append("\n");
            info.append("Provedor:").append(insumo.getProveedor()).append("\n");
            info.append("Laboratorio perteneciente:").append(insumo.getLaboratorio().getNombreLaboratorio()).append("\n");
            
            JOptionPane.showMessageDialog(null, info.toString(), "Información del Insumo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BotonListarInsumoEspecificoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPantallaUsuarios;
    private javax.swing.JButton BotonCrearInsumo;
    private javax.swing.JButton BotonEliminarInsumo;
    private javax.swing.JButton BotonListarInsumo;
    private javax.swing.JButton BotonListarInsumoEspecifico;
    private javax.swing.JButton BotonModificarInsumo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
