package controller;

import java.util.ArrayList;
import model.Equipo;
import model.Producto;
import model.Transaccion;
import model.Usuario;

public class ListaTransacciones {

    ArrayList<Transaccion> listaTransacciones;
//    public void iniciarLista() {
//        //TODO: Leer todos los datos preexistentes de xml
//    }

    public ListaTransacciones() {
        listaTransacciones = new ArrayList<>();
    }

    public boolean crearTransacciones(Producto producto, Usuario user, String tipoDeTransaccion, String tipoDeProducto) {
        Transaccion transaccionAux = new Transaccion(producto, user, tipoDeTransaccion, tipoDeProducto);
        listaTransacciones.add(transaccionAux);
        return true;
    }

    public ArrayList<Transaccion> listarTransacciones() {
        return listaTransacciones;
    }
/*
    public void restaurarTransaccion(Usuario user, String id) {
        //Encuentro producto con ese id
        Transaccion transaccionAux = null;
        for (Transaccion i : listaTransacciones) {
            if (i.getId() == id) {
                transaccionAux = i;
            }
        }

        //Encuentro transacciones de ese id de producto y creo una lista
        String idProductoAux = transaccionAux.getProducto().getId();
        ArrayList<Transaccion> listaTransaccionesAux = new ArrayList<>();
        for (Transaccion i : listaTransacciones) {
            if (i.getProducto().getId() == idProductoAux) {
                listaTransaccionesAux.add(i);
            }
        }

        //Ahora por cada tipo de producto y accion hago un proceso
        String tipoDeProductoAux = transaccionAux.getTipoDeProducto();
        String tipoDeTransaccionAux = transaccionAux.getTipoDeTransaccion();

        if (tipoDeProductoAux == "Equipo") {
            //Creo la clase que necesito:
            ListaDeEquipos list = new ListaDeEquipos();
            if (tipoDeTransaccionAux == "Crear") {
                list.eliminarEquipo(user, idProductoAux);
            } else if (tipoDeTransaccionAux == "Modificar") {
                Transaccion transaccionAnterior = listaTransaccionesAux.get(listaTransaccionesAux.size() - 2);
                Producto equipoAnterior = transaccionAnterior.getProducto();
                list.modificarEquipo(user, id, equipoAnterior.descripcion, equipoAnterior.marca, equipoAnterior.modelo, equipoAnterior.numeroSerial, equipoAnterior.numeroActivo, equipoAnterior.presentacion, equipoAnterior.voltaje, equipoAnterior.procesable, equipoAnterior.materialRequerido, equipoAnterior.añoDeCompra, equipoAnterior.aplicacion, equipoAnterior.ultimoMantenimiento, equipoAnterior.proximoMantenimiento, equipoAnterior.ultimaCalibracion, equipoAnterior.proximaCalibracion, equipoAnterior.proovedoresDeServicios, Boolean.TRUE, equipoAnterior.equipoAnterior.codigo, equipoAnterior.nombreProducto, equipoAnterior.inventarioExistente, equipoAnterior.observaciones, equipoAnterior.labo);

            }
        }

        if (tipoDeProductoAux == "Insumo") {
            if (tipoDeTransaccionAux == "Crear") {

            } else if (tipoDeTransaccionAux == "Modificar") {

            } else if (tipoDeTransaccionAux == "Elminar") {

            }
        }

        if (tipoDeProductoAux == "SustanciaQuimica") {
            if (tipoDeTransaccionAux == "Crear") {

            } else if (tipoDeTransaccionAux == "Modificar") {

            } else if (tipoDeTransaccionAux == "Elminar") {

            }
        }
    }
*/
}
