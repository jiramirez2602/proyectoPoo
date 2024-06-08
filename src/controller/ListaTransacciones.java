package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Equipo;
import model.Insumo;
import model.SustanciaQuimica;
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

    public String convertirFechaString(Date fecha) {
        String pattern = "dd/MM/yyyy";
        DateFormat df = new SimpleDateFormat(pattern);
        String fechaAsString = df.format(fecha);
        return fechaAsString;
    }

    public boolean crearTransacciones(Equipo equipo, Insumo insumo, SustanciaQuimica sustanciaQuimica, Usuario user, String tipoDeTransaccion) {
        Transaccion transaccionAux = new Transaccion(equipo, insumo, sustanciaQuimica, user, tipoDeTransaccion);
        listaTransacciones.add(transaccionAux);
        return true;
    }

    public ArrayList<Transaccion> listarTransacciones() {
        return listaTransacciones;
    }

    public void restaurarTransaccion(Usuario user, String id, ListaDeSustanciasQuimicas listaSustancias, ListaDeInsumos listaInsumos, ListaDeEquipos listaEquipos) {
        //Encuentro producto con ese id
        Transaccion transaccionAux = null;
        for (Transaccion i : listaTransacciones) {
            if (i.getId().equals(id)) {
                transaccionAux = i;
            }
        }

        //Obtenemos el tipo de producto
        String tipoDeProductoAux = "";
        if (transaccionAux.getEquipo() != null) {
            tipoDeProductoAux = "Equipo";
        } else if (transaccionAux.getInsumo() != null) {
            tipoDeProductoAux = "Insumo";
        } else if (transaccionAux.getSustanciaQuimica() != null) {
            tipoDeProductoAux = "SustanciaQuimica";
        }

        //Si es Equipo
        if ("Equipo".equals(tipoDeProductoAux)) {
            //Encuentro transacciones de ese id de equipo y creo una lista
            String idProductoAux = transaccionAux.getEquipo().getId();
            ArrayList<Transaccion> listaTransaccionesAux = new ArrayList<>();
            for (Transaccion i : listaTransacciones) {
                if (i.getEquipo().getId().equals(idProductoAux)) {
                    listaTransaccionesAux.add(i);
                }
            }

            //Ahora por cada tipo de producto y accion hago un proceso
            String tipoDeTransaccionAux = transaccionAux.getTipoDeTransaccion();

            if (null != tipoDeTransaccionAux) //Uso lalista que me pason para hacer operaciones
            {
                switch (tipoDeTransaccionAux) {
                    case "Crear" -> //Si se creo, se eliminara
                        listaEquipos.eliminarEquipo(user, idProductoAux);
                    case "Modificar" -> {
                        //Si se actualizo se busca versión anterior
                        Transaccion transaccionAnterior = listaTransaccionesAux.get(listaTransaccionesAux.size() - 2);
                        Equipo equipoAnterior = transaccionAnterior.getEquipo();
                        listaEquipos.modificarEquipo(user, id, equipoAnterior.getDescripcion(), equipoAnterior.getMarca(), equipoAnterior.getModelo(), equipoAnterior.getNumeroSerial(), equipoAnterior.getNumeroActivo(), equipoAnterior.getPresentacion(), equipoAnterior.getVoltaje(), equipoAnterior.getProcesable(), equipoAnterior.getMaterialRequerido(), convertirFechaString(equipoAnterior.getAñoDeCompra()), equipoAnterior.getAplicacion(), convertirFechaString(equipoAnterior.getUltimoMantenimiento()), convertirFechaString(equipoAnterior.getProximoMantenimiento()), convertirFechaString(equipoAnterior.getUltimaCalibracion()), equipoAnterior.getPresentacion(), equipoAnterior.getProovedoresDeServicios(), equipoAnterior.getEncendidoDenoche(), equipoAnterior.getCodigo(), equipoAnterior.getNombreProducto(), String.valueOf(equipoAnterior.getInventarioExistente()), equipoAnterior.getObservaciones(), equipoAnterior.getLaboratorio());
                    }
                    case "Eliminar" -> {
                        Equipo equipoAnterior = transaccionAux.getEquipo();
                        listaEquipos.crearProductoEquipo(user, equipoAnterior.getDescripcion(), equipoAnterior.getMarca(), equipoAnterior.getModelo(), equipoAnterior.getNumeroSerial(), equipoAnterior.getNumeroActivo(), equipoAnterior.getPresentacion(), equipoAnterior.getVoltaje(), equipoAnterior.getProcesable(), equipoAnterior.getMaterialRequerido(), convertirFechaString(equipoAnterior.getAñoDeCompra()), equipoAnterior.getAplicacion(), convertirFechaString(equipoAnterior.getUltimoMantenimiento()), convertirFechaString(equipoAnterior.getProximoMantenimiento()), convertirFechaString(equipoAnterior.getUltimaCalibracion()), equipoAnterior.getPresentacion(), equipoAnterior.getProovedoresDeServicios(), equipoAnterior.getEncendidoDenoche(), equipoAnterior.getCodigo(), equipoAnterior.getNombreProducto(), String.valueOf(equipoAnterior.getInventarioExistente()), equipoAnterior.getObservaciones(), equipoAnterior.getLaboratorio());
                    }
                    default -> {
                    }
                }
            }
        }

        //Si es Insumo
        if ("Insumo".equals(tipoDeProductoAux)) {
            //Encuentro transacciones de ese id de Insumo y creo una lista
            String idProductoAux = transaccionAux.getInsumo().getId();
            ArrayList<Transaccion> listaTransaccionesAux = new ArrayList<>();
            for (Transaccion i : listaTransacciones) {
                if (i.getInsumo().getId().equals(idProductoAux)) {
                    listaTransaccionesAux.add(i);
                }
            }

            //Ahora por cada tipo de producto y accion hago un proceso
            String tipoDeTransaccionAux = transaccionAux.getTipoDeTransaccion();

            if (null != tipoDeTransaccionAux) //Uso lalista que me pason para hacer operaciones
            {
                switch (tipoDeTransaccionAux) {
                    case "Crear" -> //Si se creo, se eliminara
                        listaInsumos.eliminarInsumo(user, idProductoAux);
                    case "Modificar" -> {
                        //Si se actualizo se busca versión anterior
                        Transaccion transaccionAnterior = listaTransaccionesAux.get(listaTransaccionesAux.size() - 2);
                        Insumo insumoAnterior = transaccionAnterior.getInsumo();
                        listaInsumos.modificarInsumo(user, id, insumoAnterior.getDescripcion(), insumoAnterior.getMarca(), insumoAnterior.getModelo(), insumoAnterior.getPresentacion(), insumoAnterior.getClasificacion(), insumoAnterior.getCategoria(), convertirFechaString(insumoAnterior.getUltimaCompra()), String.valueOf(insumoAnterior.getPrecioEstimado()), insumoAnterior.getUnidad(), insumoAnterior.getProveedor(), insumoAnterior.getCodigo(), insumoAnterior.getNombreProducto(), String.valueOf(insumoAnterior.getInventarioExistente()), insumoAnterior.getObservaciones(), insumoAnterior.getLaboratorio());
                    }
                    case "Eliminar" -> {
                        Insumo insumoAnterior = transaccionAux.getInsumo();
                        listaInsumos.crearProductoInsumo(user, insumoAnterior.getDescripcion(), insumoAnterior.getMarca(), insumoAnterior.getModelo(), insumoAnterior.getPresentacion(), insumoAnterior.getClasificacion(), insumoAnterior.getCategoria(), convertirFechaString(insumoAnterior.getUltimaCompra()), String.valueOf(insumoAnterior.getPrecioEstimado()), insumoAnterior.getUnidad(), insumoAnterior.getProveedor(), insumoAnterior.getCodigo(), insumoAnterior.getNombreProducto(), String.valueOf(insumoAnterior.getInventarioExistente()), insumoAnterior.getObservaciones(), insumoAnterior.getLaboratorio());
                    }
                    default -> {
                    }
                }
            }
        }

        if ("SustanciaQuimica".equals(tipoDeProductoAux)) {
            //Encuentro transacciones de ese id de SustanciaQuimica y creo una lista
            String idProductoAux = transaccionAux.getSustanciaQuimica().getId();
            ArrayList<Transaccion> listaTransaccionesAux = new ArrayList<>();
            for (Transaccion i : listaTransacciones) {
                if (i.getSustanciaQuimica().getId().equals(idProductoAux)) {
                    listaTransaccionesAux.add(i);
                }
            }

            //Ahora por cada tipo de producto y accion hago un proceso
            String tipoDeTransaccionAux = transaccionAux.getTipoDeTransaccion();

            if (null != tipoDeTransaccionAux) //Uso lalista que me pason para hacer operaciones
            {
                switch (tipoDeTransaccionAux) {
                    case "Crear" -> //Si se creo, se eliminara
                        listaSustancias.eliminarSustanciaQuimica(user, idProductoAux);
                    case "Modificar" -> {
                        //Si se actualizo se busca versión anterior
                        Transaccion transaccionAnterior = listaTransaccionesAux.get(listaTransaccionesAux.size() - 2);
                        SustanciaQuimica sustanciaAnterior = transaccionAnterior.getSustanciaQuimica();
                        listaSustancias.modificarSustancia(user, id, sustanciaAnterior.getFormulaQuimica(), sustanciaAnterior.getConcentracion(), sustanciaAnterior.getPresentacion(), sustanciaAnterior.getNombreComercial(), sustanciaAnterior.getPoseeMSD(), sustanciaAnterior.getNumeroDeIdentificacion(), sustanciaAnterior.getGrupoDeRiesgo(), sustanciaAnterior.getFraseR(), sustanciaAnterior.getFraseS(), sustanciaAnterior.getMetodoDeControl(), sustanciaAnterior.getPermisos(), sustanciaAnterior.getUnidad(), String.valueOf(sustanciaAnterior.getPrecioEstimado()), sustanciaAnterior.getProveedor(), sustanciaAnterior.getAlmacenadoEnvasado(), sustanciaAnterior.getCodigo(), sustanciaAnterior.getNombreProducto(), String.valueOf(sustanciaAnterior.getInventarioExistente()), sustanciaAnterior.getObservaciones(), sustanciaAnterior.getLaboratorio());
                    }
                    case "Eliminar" -> {
                        SustanciaQuimica sustanciaAnterior = transaccionAux.getSustanciaQuimica();
                        listaSustancias.crearProductoSustanciaQuimica(user, sustanciaAnterior.getFormulaQuimica(), sustanciaAnterior.getConcentracion(), sustanciaAnterior.getPresentacion(), sustanciaAnterior.getNombreComercial(), sustanciaAnterior.getPoseeMSD(), sustanciaAnterior.getNumeroDeIdentificacion(), sustanciaAnterior.getGrupoDeRiesgo(), sustanciaAnterior.getFraseR(), sustanciaAnterior.getFraseS(), sustanciaAnterior.getMetodoDeControl(), sustanciaAnterior.getPermisos(), sustanciaAnterior.getUnidad(), String.valueOf(sustanciaAnterior.getPrecioEstimado()), sustanciaAnterior.getProveedor(), sustanciaAnterior.getAlmacenadoEnvasado(), sustanciaAnterior.getCodigo(), sustanciaAnterior.getNombreProducto(), String.valueOf(sustanciaAnterior.getInventarioExistente()), sustanciaAnterior.getObservaciones(), sustanciaAnterior.getLaboratorio());
                    }
                    default -> {
                    }
                }
            }
        }
    }
}
