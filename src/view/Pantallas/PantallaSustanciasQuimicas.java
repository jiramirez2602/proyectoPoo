/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Pantallas;

import controller.Form;
import controller.ListaDeEquipos;
import controller.ListaDeSustanciasQuimicas;
import controller.ListaLaboratorios;
import java.awt.BorderLayout;
import java.util.List;
import java.util.function.Function;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Laboratorio;
import model.SustanciaQuimica;
import model.Usuario;
/**
 *
 * @author derno
 */
public class PantallaSustanciasQuimicas extends javax.swing.JPanel {
    
    private ListaDeSustanciasQuimicas listaSustanciasQuimicas;
    private ListaDeEquipos equipos; 
    private ListaLaboratorios listaLaboratorios;
    private Usuario user;

    public PantallaSustanciasQuimicas(Usuario usuario,ListaLaboratorios labs,ListaDeSustanciasQuimicas quimicas) { // Modificar el constructor
        this.user=usuario;
        this.listaLaboratorios=labs;
        this.listaSustanciasQuimicas=quimicas;
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
        BotonModificarSustancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificarSustancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarSustanciaActionPerformed(evt);
            }
        });

        BotonEliminarSustancia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonEliminarSustancia.setText("Eliminar Sustancia");
        BotonEliminarSustancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminarSustancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarSustanciaActionPerformed(evt);
            }
        });

        BotonListarSustancias.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarSustancias.setText("Listar Sustancias");
        BotonListarSustancias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonListarSustancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListarSustanciasActionPerformed(evt);
            }
        });

        BotonListarSustanciaEspecifica.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonListarSustanciaEspecifica.setText("Listar Sustancia  Especifica");
        BotonListarSustanciaEspecifica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Icono Sustancias Quimicas.png"))); // NOI18N

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
        String formulaQuimica = JOptionPane.showInputDialog("Ingrese la fórmula química:");
        String concentracion = JOptionPane.showInputDialog("Ingrese la concentración:");
        String presentacion = JOptionPane.showInputDialog("Ingrese la presentación:");
        String nombreComercial = JOptionPane.showInputDialog("Ingrese el nombre comercial:");
        Boolean poseeMSD = JOptionPane.showConfirmDialog(null, "¿La sustancia posee MSD?", "Posee MSD", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        String numeroDeIdentificacion = JOptionPane.showInputDialog("Ingrese el número de identificación:");
        String grupoDeRiesgo = JOptionPane.showInputDialog("Ingrese el grupo de riesgo:");
        String fraseR = JOptionPane.showInputDialog("Ingrese la frase R:");
        String fraseS = JOptionPane.showInputDialog("Ingrese la frase S:");
        String metodoDeControl = JOptionPane.showInputDialog("Ingrese el método de control:");
        String permisos = JOptionPane.showInputDialog("Ingrese los permisos:");
        String unidad = JOptionPane.showInputDialog("Ingrese la unidad:");
        String precioEstimado = JOptionPane.showInputDialog("Ingrese el precio estimado:");
        String proveedor = JOptionPane.showInputDialog("Ingrese el proveedor:");
        String almacenadoEnvasado = JOptionPane.showInputDialog("Ingrese el almacenado/envasado:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código:");
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String inventarioExistente = JOptionPane.showInputDialog("Ingrese el inventario existente:");
        String observaciones = JOptionPane.showInputDialog("Ingrese las observaciones:");

        // Obtener el laboratorio asociado a la sustancia química
        String labAsignar=JOptionPane.showInputDialog("Ingrese nombre de laboratorio para asignar sustancia quimica:");
        String iD = listaLaboratorios.listarLaboratorioPorNombre(labAsignar);
        Laboratorio laboratorioExistente=listaLaboratorios.listarLaboratorio(iD);
        // Crear un nuevo objeto SustanciaQuimica con los datos ingresados
        if(laboratorioExistente!=null){
            boolean exito = listaSustanciasQuimicas.crearProductoSustanciaQuimica(user, formulaQuimica, concentracion, presentacion, nombreComercial, poseeMSD, numeroDeIdentificacion, grupoDeRiesgo, fraseR, fraseS, metodoDeControl, permisos, unidad, precioEstimado, proveedor, almacenadoEnvasado, codigo, nombreProducto, inventarioExistente, observaciones, laboratorioExistente);
            if (exito) {
                JOptionPane.showMessageDialog(null, "Sustancia química creada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear la sustancia química");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al crear la sustancia quimica, Laboratorio no encontrado");
        }
     
    }//GEN-LAST:event_BotonCrearSustanciaActionPerformed

    private void BotonModificarSustanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarSustanciaActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la sustancia a modificar:");
        String id=listaSustanciasQuimicas.listarSustanciaQumicaPorNombre(user, nombre);
        SustanciaQuimica sustanciaExistente = listaSustanciasQuimicas.listarSustanciaQuimica(id);
    if (sustanciaExistente != null) {
        String nuevaFormulaQuimica = JOptionPane.showInputDialog("Ingrese la nueva fórmula química:", sustanciaExistente.getFormulaQuimica());
        String nuevaConcentracion = JOptionPane.showInputDialog("Ingrese la nueva concentración:", sustanciaExistente.getConcentracion());
        String nuevaPresentacion = JOptionPane.showInputDialog("Ingrese la nueva presentación:", sustanciaExistente.getPresentacion());
        String nuevoNombreComercial = JOptionPane.showInputDialog("Ingrese el nuevo nombre comercial:", sustanciaExistente.getNombreComercial());
        Boolean nuevoPoseeMSD = JOptionPane.showConfirmDialog(null, "¿Posee MSD?", "MSD", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        String nuevoNumeroDeIdentificacion = JOptionPane.showInputDialog("Ingrese el nuevo número de identificación:", sustanciaExistente.getNumeroDeIdentificacion());
        String nuevoGrupoDeRiesgo = JOptionPane.showInputDialog("Ingrese el nuevo grupo de riesgo:", sustanciaExistente.getGrupoDeRiesgo());
        String nuevaFraseR = JOptionPane.showInputDialog("Ingrese la nueva frase R:", sustanciaExistente.getFraseR());
        String nuevaFraseS = JOptionPane.showInputDialog("Ingrese la nueva frase S:", sustanciaExistente.getFraseS());
        String nuevoMetodoDeControl = JOptionPane.showInputDialog("Ingrese el nuevo método de control:", sustanciaExistente.getMetodoDeControl());
        String nuevosPermisos = JOptionPane.showInputDialog("Ingrese los nuevos permisos:", sustanciaExistente.getPermisos());
        String nuevaUnidad = JOptionPane.showInputDialog("Ingrese la nueva unidad:", sustanciaExistente.getUnidad());
        float nuevoPrecioEstimado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo precio estimado:", sustanciaExistente.getPrecioEstimado()));
        String nuevoProveedor = JOptionPane.showInputDialog("Ingrese el nuevo proveedor:", sustanciaExistente.getProveedor());
        String nuevoAlmacenadoEnvasado = JOptionPane.showInputDialog("Ingrese el nuevo almacenado/envasado:", sustanciaExistente.getAlmacenadoEnvasado());
        String nuevoCodigo = JOptionPane.showInputDialog("Ingrese el nuevo código:", sustanciaExistente.getCodigo());
        String nuevoNombreProducto = JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto:", sustanciaExistente.getNombreProducto());
        int nuevoInventarioExistente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo inventario existente:", sustanciaExistente.getInventarioExistente()));
        String nuevasObservaciones = JOptionPane.showInputDialog("Ingrese las nuevas observaciones:", sustanciaExistente.getObservaciones());
        String labAsignar=JOptionPane.showInputDialog("Ingrese nombre de laboratorio para asignar sustancia quimica:");
        String iD = listaLaboratorios.listarLaboratorioPorNombre(labAsignar);
        Laboratorio nuevoLaboratorio=listaLaboratorios.listarLaboratorio(iD);
        if (nuevoLaboratorio != null) {
            boolean exito = listaSustanciasQuimicas.modificarSustancia(user, id, nuevaFormulaQuimica, nuevaConcentracion, nuevaPresentacion, nuevoNombreComercial, nuevoPoseeMSD, nuevoNumeroDeIdentificacion, nuevoGrupoDeRiesgo, nuevaFraseR, nuevaFraseS, nuevoMetodoDeControl, nuevosPermisos, nuevaUnidad, String.valueOf(nuevoPrecioEstimado), nuevoProveedor, nuevoAlmacenadoEnvasado, nuevoCodigo, nuevoNombreProducto, String.valueOf(nuevoInventarioExistente), nuevasObservaciones, nuevoLaboratorio);

            if (exito) {
                JOptionPane.showMessageDialog(null, "Sustancia modificada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar la sustancia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Laboratorio no encontrado");
        }
    }
    }//GEN-LAST:event_BotonModificarSustanciaActionPerformed

    private void BotonEliminarSustanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarSustanciaActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la sustancia a eliminar:");
        String id=listaSustanciasQuimicas.listarSustanciaQumicaPorNombre(user, nombre);
        SustanciaQuimica sustanciaExistente = listaSustanciasQuimicas.listarSustanciaQuimica(id);
        if (sustanciaExistente != null) {
            listaSustanciasQuimicas.eliminarSustanciaQuimica(sustanciaExistente.getLaboratorio().getAdministrador(), id);
            JOptionPane.showMessageDialog(null, "Sustancia química eliminada exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar la sustancia química");
        }
    }//GEN-LAST:event_BotonEliminarSustanciaActionPerformed

    private void BotonListarSustanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarSustanciasActionPerformed
        List<SustanciaQuimica> sustancias = listaSustanciasQuimicas.getListaSustanciasQuimicas();
        if(!sustancias.isEmpty()){
            Listar pl = new Listar();
        pl.setSize(1100, 610);
        pl.setLocation(0, 0);
        pl.mostrarListaSustanciasQuimicas(sustancias);
        BackGroundPantallaInsumos.removeAll();
        BackGroundPantallaInsumos.add(pl, BorderLayout.CENTER);
        } else{ 
            JOptionPane.showMessageDialog(null, "No hay sustancias disponibles");

        }
        BackGroundPantallaInsumos.revalidate();
        BackGroundPantallaInsumos.repaint();
    }//GEN-LAST:event_BotonListarSustanciasActionPerformed

    private void BotonListarSustanciaEspecificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListarSustanciaEspecificaActionPerformed
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la sustancia a modificar:");
        String id=listaSustanciasQuimicas.listarSustanciaQumicaPorNombre(user, nombre);
        SustanciaQuimica sustanciaExistente = listaSustanciasQuimicas.listarSustanciaQuimica(id);
        if (sustanciaExistente != null) {
            String[] columnNames = {"Campo", "Valor"};
            List<String[]> data = List.of(
                new String[]{"Nombre", sustanciaExistente.getNombreProducto()},
                new String[]{"Tipo", sustanciaExistente.getTipoDeProducto()},
                new String[]{"Cantidad", String.valueOf(sustanciaExistente.getInventarioExistente())},
                new String[]{"Unidad", sustanciaExistente.getUnidad()},
                new String[]{"Fórmula Química", sustanciaExistente.getFormulaQuimica()},
                new String[]{"Concentración", sustanciaExistente.getConcentracion()},
                new String[]{"Presentación", sustanciaExistente.getPresentacion()},
                new String[]{"Nombre Comercial", sustanciaExistente.getNombreComercial()},
                new String[]{"Posee MSD", sustanciaExistente.getPoseeMSD().toString()},
                new String[]{"Número de Identificación", sustanciaExistente.getNumeroDeIdentificacion()},
                new String[]{"Grupo de Riesgo", sustanciaExistente.getGrupoDeRiesgo()},
                new String[]{"Frase R", sustanciaExistente.getFraseR()},
                new String[]{"Frase S", sustanciaExistente.getFraseS()},
                new String[]{"Método de Control", sustanciaExistente.getMetodoDeControl()},
                new String[]{"Permisos", sustanciaExistente.getPermisos()},
                new String[]{"Precio Estimado", String.valueOf(sustanciaExistente.getPrecioEstimado())},
                new String[]{"Proveedor", sustanciaExistente.getProveedor()},
                new String[]{"Almacenado/Envasado", sustanciaExistente.getAlmacenadoEnvasado()},
                new String[]{"Laboratorio perteneciente:", sustanciaExistente.getLaboratorio().getNombreLaboratorio()}                 
            );
            List<Function<String[], Object>> columnFunctions = List.of(
                row -> row[0],
                row -> row[1]
            );
            Form<String[]> form = new Form<>(data, columnNames, columnFunctions);
            JFrame frame = new JFrame("Información de la Sustancia Química");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(form);
            frame.pack();
            frame.setVisible(true);
        }
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
