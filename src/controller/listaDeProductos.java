package controller;

import java.util.ArrayList;
import model.Producto;

public class listaDeProductos {
    ArrayList<Producto> listaDeProductos = new ArrayList<>();
    
//    public void iniciarLista() {
//        //TODO: Leer todos los datos preexistentes de xml
//    }
    
    public void crearProducto(ArrayList<String> privileges) {
        //TODO: Validar cada dato ingresado pidiendo por formulario
        //Producto ProductoAux = new Producto("x", "x", "x", "x");
        //listaDeProductos.add(ProductoAux);
    }

    public void listarProductos(ArrayList<String> privileges) {
        for (Producto i : listaDeProductos) {
            //TODO: pintar lista aquí
        }
    }

    public void listarProducto(ArrayList<String> privileges, String nombreProducto) {
        for (Producto i : listaDeProductos) {
            if (i.getNombreProducto() == nombreProducto) {
                //TODO: Regresar datos especificos de un Producto
            }
        }
    }

    public void modificarProducto(ArrayList<String> privileges, String nombreProducto) {
        for (Producto i : listaDeProductos) {
            if (i.getNombreProducto() == nombreProducto) {
                //TODO: Regresar datos especificos de un Producto
                //TODO: Regresar ventanas para setear datos
            }
        }
    }

    public void eliminarProducto(ArrayList<String> privileges, String nombreProducto) {
        for (Producto i : listaDeProductos) {
            if (i.getNombreProducto() == nombreProducto) {
                //TODO: Verificar los productos de ese Producto
                //TODO: Si no tiene productos asociados empezar a elimniar todo
            }
        }
    }
    
    public void generarReporteProducto(ArrayList<String> privileges, String tipoDeproducto) {
        for (Producto i : listaDeProductos) {
            if (i.getTipoDeProducto() == tipoDeproducto) {
                //TODO: Verificar los productos de ese Producto
                //Todo: consultar ruta de guardado o establecer una por defecto
            }
        }
    }
}
