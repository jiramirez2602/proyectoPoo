package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Insumo;
import model.Laboratorio;
import model.Producto;
import model.Usuario;

public class listaDeProductos {

    ArrayList<Producto> lista = new ArrayList<>();

//    public void iniciarLista() {
//        //TODO: Leer todos los datos preexistentes de xml
//    }
    public boolean crearProducto(Usuario user, String descripcion, String marca, String modelo, String presentacion, String clasificacion, String categoria, String ultimaCompra, String precioEstimado, String unidad, String proveedor, String codigo, String nombreProducto, String tipoDeProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio, String existenciasMinimas) {
        Validador validador = new Validador();

        if (!validador.validarConRegex(descripcion, "^[A-Za-z0-9\\s]{0,100}$", "Descripcion", "Descripcion es invalido(a), puede usar hasta 100 caractes alfanumericos")
                || !validador.validarConRegex(marca, "^[A-Za-z\\s]{0,30}$", "Marca", "Marca es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(modelo, "^[A-Za-z\\s]{5,30}$", "Modelo", "Modelo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(presentacion, "^[A-Za-z\\s]{0,30}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(clasificacion, "^[A-Za-z\\s]{0,30}$", "Clasificacion", "Clasificacion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(categoria, "^[A-Za-z\\s]{0,30}$", "Categoria", "Categoria es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(presentacion, "^[A-Za-z\\s]{0,30}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(ultimaCompra, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultima Compra", "Ultima Compra es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(precioEstimado, "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))", "Precio Estimado", "Precio Estimado es invalido(a), puede usar punto(.) y numeros")
                || !validador.validarConRegex(unidad, "^[A-Za-z\\s]{0,10}$", "Unidad", "Unidad es invalido(a), puede usar hasta 10 caractes alfabeticos")
                || !validador.validarConRegex(proveedor, "^[A-Za-z\\s]{0,50}$", "Proveedor", "Proveedor es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(codigo, "^[A-Za-z\\s]{0,30}$", "Codigo", "Codigo es invalido(a), puede usar hasta 30 caractes alfabeticos")
                || !validador.validarConRegex(nombreProducto, "^[A-Za-z\\s]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                /* TODO: solicitar con combo box*/
                /*|| !validador.validarConRegex(tipoDeProducto, "^[A-Za-z\\s]{0,50}$", "Tipo De Producto", "Tipo De Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")*/
                || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                || !validador.validarConRegex(observaciones, "^[A-Za-z\\s]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(existenciasMinimas, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Existencias Minimas", "Existencias Minimas son invalido(a)s, puede ser hasta de 0 a 999999")) {
            //nombreProducto
            return false;
        } else {
            Date ultimaCompraAux;
            float precioEstimadoAux;
            int existenciasAux;
            int existenciasMinimasAux;

            try {
                //Convertir a Date ultimaCompra
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                ultimaCompraAux = formatter.parse(ultimaCompra);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fecha ingresada invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                precioEstimadoAux = Float.parseFloat(precioEstimado);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Precio ingresado invalido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                existenciasAux = Integer.parseInt(inventarioExistente);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Existencias invalidas", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            try {
                existenciasMinimasAux = Integer.parseInt(existenciasMinimas);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Existencias minimas invalidas", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Producto productoAux = new Insumo(descripcion, marca, modelo, presentacion, clasificacion, categoria, ultimaCompraAux, precioEstimadoAux, unidad, proveedor, codigo, nombreProducto, tipoDeProducto, existenciasAux, observaciones, laboratorio, existenciasMinimasAux);
            lista.add(productoAux);
            return true;
        }

    }

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
