/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Pantallas;

import controller.Form;
import java.awt.BorderLayout;
import java.util.List;
import java.util.function.Function;
import javax.swing.JOptionPane;
import model.Equipo;
import model.Insumo;
import model.Laboratorio;
import model.SustanciaQuimica;
import model.Usuario;

/**
 *
 * @author derno
 */
public class Listar extends javax.swing.JPanel {

    /**
     * Creates new form Listar
     */
    public Listar() {
        initComponents();
        setLayout(new BorderLayout()); 
    }
   
     public void mostrarListaUsuarios(List<Usuario> usuarios) {
        if (!usuarios.isEmpty()) {
            String[] columnNames = {"Username", "Nombre Completo","Privilegios", "Rol", "Estado"};
            List<Function<Usuario, Object>> columnFunctions = List.of(
                    Usuario::getUsername,
                    Usuario::getNombreUser,
                    Usuario::getPrivilegios,
                    Usuario::getRolUsuario,
                    Usuario::isStatus
            );

            // Crear instancia de Form y pasar la lista de usuarios, nombres de columnas y funciones
            Form<Usuario> form = new Form<>(usuarios, columnNames, columnFunctions);
            
            // Limpiar el panel antes de agregar el Form
            removeAll();
            add(form);
            revalidate();
            repaint();
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios disponibles", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
  
    public void mostrarListaLaboratorios(List<Laboratorio> laboratorios) {
        if (!laboratorios.isEmpty()) {
            String[] columnNames = {"ID", "Nombre", "Facultad", "Escuela", "Departamento", "Administrador"};
            List<Function<Laboratorio, Object>> columnFunctions = List.of(
                    Laboratorio::getNombreLaboratorio,
                    Laboratorio::getFacultad,
                    Laboratorio::getEscuela,
                    Laboratorio::getDepartamento,
                    lab -> lab.getAdministrador().getUsername()
            );

            // Crear instancia de Form y pasar la lista de laboratorios, nombres de columnas y funciones
            Form<Laboratorio> form = new Form<>(laboratorios, columnNames, columnFunctions);

            // Limpiar el panel antes de agregar el Form
            removeAll();
            add(form);
            revalidate();
            repaint();
        } else {
            JOptionPane.showMessageDialog(null, "No hay laboratorios disponibles", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

     
    public void mostrarListaEquipos(List<Equipo> equipos){
        if(!equipos.isEmpty()){
            String[] columnNames = {"Nombre del producto","Codigo","Tipo de producto","Inventario","Observaciones","Descripcion","Marca","Modelo","Numero de serial","Numero Activo","Presentacion","Voltaje","Procesable","Material Requerido","Año de compra","Aplicacion","Ultimo mantenimiento","Proximo mantenimiento ","Ultima calibracion","Proxima calibracion","Proveedores de Servicios","Encendido de noche(true=si/false=no)","Laboratorio"};
            List<Function<Equipo, Object>>columnFunctions=List.of(
                    Equipo::getNombreProducto,
                    Equipo::getCodigo,
                    Equipo::getTipoDeProducto,
                    Equipo::getInventarioExistente,
                    Equipo::getObservaciones,
                    Equipo::getDescripcion,
                    Equipo::getMarca,
                    Equipo::getModelo,
                    Equipo::getNumeroSerial,
                    Equipo::getNumeroActivo,
                    Equipo::getPresentacion,
                    Equipo::getVoltaje,
                    Equipo::getProcesable,
                    Equipo::getMaterialRequerido,
                    Equipo::getAñoDeCompra,
                    Equipo::getAplicacion,
                    Equipo::getUltimoMantenimiento,
                    Equipo::getProximoMantenimiento,
                    Equipo::getUltimaCalibracion,
                    Equipo::getProximaCalibracion,
                    Equipo::getProovedoresDeServicios,
                    Equipo::getEncendidoDenoche,
                    equi-> equi.getLaboratorio().getNombreLaboratorio()
                    
            );
            Form<Equipo> form = new Form<>(equipos, columnNames, columnFunctions);
            removeAll();
            add(form);
            revalidate();
            repaint();
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay equipos disponibles", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
         
     }
    
    public void mostrarListaInsumos(List<Insumo> insumos){
        if(!insumos.isEmpty()){
            String[] columnNames = {"Nombre del producto","Codigo","Tipo de producto","Inventario","Observaciones","Descripcion","Marca","Modelo","Presentacion","Clasificacion","Categoria","Ultima Compra","Precio estimado","unidad","Proveedor","Laboratorio"};
            List<Function<Insumo, Object>>columnFunctions=List.of(
                    Insumo::getNombreProducto,
                    Insumo::getCodigo,
                    Insumo::getTipoDeProducto,
                    Insumo::getInventarioExistente,
                    Insumo::getObservaciones,
                    Insumo::getDescripcion,
                    Insumo::getMarca,
                    Insumo::getModelo,
                    Insumo::getPresentacion,
                    Insumo::getClasificacion,
                    Insumo::getCategoria,
                    Insumo::getUltimaCompra,
                    Insumo::getPrecioEstimado,
                    Insumo::getUnidad,
                    Insumo::getProveedor,
                    insu->insu.getLaboratorio().getNombreLaboratorio()
            );
            Form<Insumo> form = new Form<>(insumos, columnNames, columnFunctions);
            removeAll();
            add(form);
            revalidate();
            repaint();
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay insumos disponibles", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
         
     }
    
     public void mostrarListaSustanciasQuimicas(List<SustanciaQuimica> sustancias) {
        if (!sustancias.isEmpty()) {
            String[] columnNames = {
                "Nombre del producto", "Codigo", "Tipo de producto", "Inventario", "Observaciones",
                "Fórmula Química", "Concentración", "Presentación", "Nombre Comercial",
                "Posee MSD(true=si/false=no)", "Número de Identificación", "Grupo de Riesgo",
                "Frase R", "Frase S", "Método de Control", "Permisos",
                "Unidad", "Precio Estimado", "Proveedor", "Almacenado Envasado","Laboratorio"
            };

            List<Function<SustanciaQuimica, Object>> columnFunctions = List.of(
                    SustanciaQuimica::getNombreProducto,
                    SustanciaQuimica::getCodigo,
                    SustanciaQuimica::getTipoDeProducto,
                    SustanciaQuimica::getInventarioExistente,
                    SustanciaQuimica::getObservaciones,
                    SustanciaQuimica::getFormulaQuimica,
                    SustanciaQuimica::getConcentracion,
                    SustanciaQuimica::getPresentacion,
                    SustanciaQuimica::getNombreComercial,
                    SustanciaQuimica::getPoseeMSD,
                    SustanciaQuimica::getNumeroDeIdentificacion,
                    SustanciaQuimica::getGrupoDeRiesgo,
                    SustanciaQuimica::getFraseR,
                    SustanciaQuimica::getFraseS,
                    SustanciaQuimica::getMetodoDeControl,
                    SustanciaQuimica::getPermisos,
                    SustanciaQuimica::getUnidad,
                    SustanciaQuimica::getPrecioEstimado,
                    SustanciaQuimica::getProveedor,
                    SustanciaQuimica::getAlmacenadoEnvasado,
                    sust->sust.getLaboratorio().getNombreLaboratorio()
            );

            Form<SustanciaQuimica> form = new Form<>(sustancias, columnNames, columnFunctions);
            removeAll();
            add(form);
            revalidate();
            repaint();
        } else {
            JOptionPane.showMessageDialog(null, "No hay sustancias químicas disponibles", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
