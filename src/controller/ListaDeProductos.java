package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Equipo;
import model.Insumo;
import model.Laboratorio;
import model.Producto;
import model.SustanciaQuimica;
import model.Usuario;

public class ListaDeProductos {

    ArrayList<Producto> lista = new ArrayList<>();

    /*
    public void iniciarLista() {
    //TODO: Leer todos los datos preexistentes de xml
    }
     */
    //Crear producto Insumos
    public boolean crearProducto(Usuario user, String descripcion, String marca, String modelo, String presentacion, String clasificacion, String categoria, String ultimaCompra, String precioEstimado, String unidad, String proveedor, String codigo, String nombreProducto, String tipoDeProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        Validador validador = new Validador();

        if (!validador.validarConRegex(descripcion, "^[A-Za-z0-9\\s]{0,100}$", "Descripcion", "Descripcion es invalido(a), puede usar hasta 100 caractes alfanumericos")
                || !validador.validarConRegex(marca, "^[A-Za-z\\s]{0,30}$", "Marca", "Marca es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(modelo, "^[A-Za-z\\s]{5,30}$", "Modelo", "Modelo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(presentacion, "^[A-Za-z\\s]{0,30}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(clasificacion, "^[A-Za-z\\s]{0,30}$", "Clasificacion", "Clasificacion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(categoria, "^[A-Za-z\\s]{0,30}$", "Categoria", "Categoria es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(ultimaCompra, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultima Compra", "Ultima Compra es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(precioEstimado, "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))", "Precio Estimado", "Precio Estimado es invalido(a), puede usar punto(.) y numeros")
                || !validador.validarConRegex(unidad, "^[A-Za-z\\s]{0,10}$", "Unidad", "Unidad es invalido(a), puede usar hasta 10 caractes alfabeticos")
                || !validador.validarConRegex(proveedor, "^[A-Za-z\\s]{0,50}$", "Proveedor", "Proveedor es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(codigo, "^[A-Za-z\\s]{0,30}$", "Codigo", "Codigo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(nombreProducto, "^[A-Za-z\\s]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                /* TODO: solicitar con combo box*/
                /*|| !validador.validarConRegex(tipoDeProducto, "^[A-Za-z\\s]{0,50}$", "Tipo De Producto", "Tipo De Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")*/
                || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                || !validador.validarConRegex(observaciones, "^[A-Za-z\\s]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
            return false;
        } else {
            Date ultimaCompraAux;
            float precioEstimadoAux;
            int existenciasAux;

            try {
                //Convertir a Date ultimaCompra
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                ultimaCompraAux = formatter.parse(ultimaCompra);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha ingresada invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                precioEstimadoAux = Float.parseFloat(precioEstimado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio ingresado invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                existenciasAux = Integer.parseInt(inventarioExistente);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Existencias invalidas", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Producto productoAux = new Insumo(descripcion, marca, modelo, presentacion, clasificacion, categoria, ultimaCompraAux, precioEstimadoAux, unidad, proveedor, codigo, nombreProducto, tipoDeProducto, existenciasAux, observaciones, laboratorio);
            lista.add(productoAux);
            return true;
        }
    }

    //Crear producto Equipos
    public boolean crearProducto(Usuario user, String descripcion, String marca, String modelo, String numeroSerial, String numeroActivo, String presentacion, String voltaje, String procesable, String materialRequerido, String añoDeCompra, String aplicacion, String ultimoMantenimiento, String proximoMantenimiento, String ultimaCalibracion, String proximaCalibracion, String proovedoresDeServicios, Boolean encendidoDenoche, String codigo, String nombreProducto, String tipoDeProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        Validador validador = new Validador();

        if (!validador.validarConRegex(descripcion, "^[A-Za-z0-9\\s]{0,100}$", "Descripcion", "Descripcion es invalido(a), puede usar hasta 100 caractes alfanumericos")
                || !validador.validarConRegex(marca, "^[A-Za-z\\s]{0,30}$", "Marca", "Marca es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(modelo, "^[A-Za-z\\s]{5,30}$", "Modelo", "Modelo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(presentacion, "^[A-Za-z\\s]{0,30}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(numeroSerial, "^[A-Za-z\\s]{0,30}$", "Numero de serial", "Numero de serial es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(numeroActivo, "^[A-Za-z\\s]{0,30}$", "Numero de activo", "Numero de activo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(voltaje, "^[A-Za-z\\s]{0,30}$", "Voltaje", "Voltaje es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(procesable, "^[A-Za-z\\s]{0,30}$", "Procesable", "Procesable es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(materialRequerido, "^[A-Za-z\\s]{0,30}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(aplicacion, "^[A-Za-z\\s]{0,30}$", "Aplicacion", "Aplicacion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(añoDeCompra, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Año de Compra", "Año de Compra es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(ultimoMantenimiento, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultimo Mantenimiento", "Ultimo Mantenimiento es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(proximoMantenimiento, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Proximo Mantenimiento", "Proximo Mantenimiento es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(ultimaCalibracion, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultima Calibracion", "Ultima Calibracion es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(proximaCalibracion, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Proxima Calibracion", "Proxima Calibracion es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(proovedoresDeServicios, "^[A-Za-z\\s]{0,30}$", "Proovedores De Servicios", "Proovedores De Servicios es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(materialRequerido, "^[A-Za-z\\s]{0,30}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(materialRequerido, "^[A-Za-z\\s]{0,30}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(codigo, "^[A-Za-z\\s]{0,30}$", "Codigo", "Codigo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(nombreProducto, "^[A-Za-z\\s]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                || !validador.validarConRegex(observaciones, "^[A-Za-z\\s]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
            /*TODO: encendidoDenoche radio botton*/ /*TODO: encendidoDenoche radio botton*/
 /*TODO: tipoDeProducto combo box*/
            return false;
        } else {
            Date añoDeCompraAux;
            Date ultimoMantenimientoAux;
            Date proximoMantenimientoAux;
            Date ultimaCalibracionAux;
            Date proximaCalibracionAux;
            int inventarioExistenteAux;

            try {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                añoDeCompraAux = formatter.parse(añoDeCompra);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha ingresada invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                //Convertir a Date ultimaCompra
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                ultimoMantenimientoAux = formatter.parse(ultimoMantenimiento);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha ingresada invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                //Convertir a Date ultimaCompra
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                proximoMantenimientoAux = formatter.parse(proximoMantenimiento);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha ingresada invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                //Convertir a Date ultimaCompra
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                ultimaCalibracionAux = formatter.parse(ultimaCalibracion);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha ingresada invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                //Convertir a Date ultimaCompra
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                proximaCalibracionAux = formatter.parse(proximaCalibracion);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha ingresada invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                inventarioExistenteAux = Integer.parseInt(inventarioExistente);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Existencias invalidas", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            Producto productoAux = new Equipo(descripcion, marca, modelo, numeroSerial, numeroActivo, presentacion, voltaje, procesable, materialRequerido, añoDeCompraAux, aplicacion, ultimoMantenimientoAux, proximoMantenimientoAux, ultimaCalibracionAux, proximaCalibracionAux, proovedoresDeServicios, encendidoDenoche, codigo, nombreProducto, tipoDeProducto, inventarioExistenteAux, observaciones, laboratorio);
            lista.add(productoAux);
            return true;
        }
    }

    //Crear producto Sustancias Químicas
    public boolean crearProducto(Usuario user, String formulaQuimica, String concentracion, String presentacion, String nombreComercial, Boolean poseeMSD, String numeroDeIdentificacion, String grupoDeRiesgo, String fraseR, String fraseS, String metodoDeControl, String permisos, String unidad, String precioEstimado, String proveedor, String almacenadoEnvasado, String codigo, String nombreProducto, String tipoDeProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        Validador validador = new Validador();
        
        if (!validador.validarConRegex(formulaQuimica, "^[^]{0,100}$", "Formula Quimica", "Formula Quimica es invalido(a), puede usar hasta 100 caractes alfanumericos")
                || !validador.validarConRegex(concentracion, "^[A-Za-z\\s]{0,30}$", "Concentracion", "Concentracion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(fraseR, "^[A-Za-z\\s]{0,30}$", "Frase R", "Frase R es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(fraseS, "^[A-Za-z\\s]{0,30}$", "Frase S", "Frase S es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(metodoDeControl, "^[A-Za-z\\s]{0,30}$", "Metodo De Control", "Metodo De Control es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(permisos, "^[A-Za-z\\s]{0,100}$", "Permisos", "Permisos es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(almacenadoEnvasado, "^[A-Za-z\\s]{0,30}$", "Almacenado Envasado", "Almacenado Envasado es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(nombreComercial, "^[A-Za-z\\s]{5,30}$", "Nombre Comercial", "Nombre Comercial es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(presentacion, "^[A-Za-z\\s]{0,30}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(numeroDeIdentificacion, "^[A-Za-z\\s]{0,50}$", "Numero De Identificacion", "Numero De Identificacion es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(grupoDeRiesgo, "^[A-Za-z\\s]{0,30}$", "Grupo De Riesgo", "Grupo De Riesgo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(precioEstimado, "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))", "Precio Estimado", "Precio Estimado es invalido(a), puede usar punto(.) y numeros")
                || !validador.validarConRegex(unidad, "^[A-Za-z\\s]{0,10}$", "Unidad", "Unidad es invalido(a), puede usar hasta 10 caractes alfabeticos")
                || !validador.validarConRegex(proveedor, "^[A-Za-z\\s]{0,50}$", "Proveedor", "Proveedor es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(codigo, "^[A-Za-z\\s]{0,30}$", "Codigo", "Codigo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(nombreProducto, "^[A-Za-z\\s]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                /* TODO: solicitar con combo box tipoDeProducto*/
                /*TODO: Validar con radio botton poseeMSD*/
                || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                || !validador.validarConRegex(observaciones, "^[A-Za-z\\s]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
            return false;
        } else {
            float precioEstimadoAux;
            int inventarioExistenteAux;

            try {
                precioEstimadoAux = Float.parseFloat(precioEstimado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Precio ingresado invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                inventarioExistenteAux = Integer.parseInt(inventarioExistente);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Existencias invalidas", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            Producto productoAux = new SustanciaQuimica(formulaQuimica, concentracion, presentacion, nombreComercial, poseeMSD, numeroDeIdentificacion, grupoDeRiesgo, fraseR, fraseS, metodoDeControl, permisos, unidad, precioEstimadoAux, proveedor, almacenadoEnvasado, codigo, nombreProducto, tipoDeProducto, inventarioExistenteAux, observaciones, laboratorio);
            lista.add(productoAux);
            return true;
        }
    }

    /*
    public void listarProductos(ArrayList<String> privileges) {
        for (Producto i : lista) {
            //TODO: pintar lista aquí
        }
    }

    public void listarProducto(ArrayList<String> privileges, String nombreProducto) {
        for (Producto i : lista) {
            if (i.getNombreProducto() == nombreProducto) {
                //TODO: Regresar datos especificos de un Producto
            }
        }
    }

    public void modificarProducto(ArrayList<String> privileges, String nombreProducto) {
        for (Producto i : lista) {
            if (i.getNombreProducto() == nombreProducto) {
                //TODO: Regresar datos especificos de un Producto
                //TODO: Regresar ventanas para setear datos
            }
        }
    }

    public void eliminarProducto(ArrayList<String> privileges, String nombreProducto) {
        for (Producto i : lista) {
            if (i.getNombreProducto() == nombreProducto) {
                //TODO: Verificar los productos de ese Producto
                //TODO: Si no tiene productos asociados empezar a elimniar todo
            }
        }
    }
     */
 /*
    //TODO crear sistema de de generacion de reportes excel
    public void generarReporteProducto(ArrayList<String> privileges, String tipoDeproducto) {
        for (Producto i : listaDeProductos) {
            if (i.getTipoDeProducto() == tipoDeproducto) {
                //TODO: Verificar los productos de ese Producto
                //Todo: consultar ruta de guardado o establecer una por defecto
            }
        }
    }
     */
}
