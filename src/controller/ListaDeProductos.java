package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Equipo;
import model.Insumo;
import model.Laboratorio;
import model.Producto;
import model.SustanciaQuimica;
import model.Usuario;

public class ListaDeProductos {

    ArrayList<Insumo> listaInsumos = new ArrayList<>();
    ArrayList<Equipo> listaEquipos = new ArrayList<>();
    ArrayList<SustanciaQuimica> listaSustancias = new ArrayList<>();


    /*
    public void iniciarLista() {
    //TODO: Leer todos los datos preexistentes de xml
    }
     */
    //Crear producto Insumos
    public boolean crearProductoInsumo(Usuario user, String descripcion, String marca, String modelo, String presentacion, String clasificacion, String categoria, String ultimaCompra, String precioEstimado, String unidad, String proveedor, String codigo, String nombreProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        Validador validador = new Validador();

        if (!validador.validarConRegex(descripcion, "^[^\\n]{0,100}$", "Descripcion", "Descripcion es invalido(a), puede usar hasta 100 caractes alfanumericos")
                || !validador.validarConRegex(marca, "^[^\\n]{0,100}$", "Marca", "Marca es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(modelo, "^[^\\n]{5,100}$", "Modelo", "Modelo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(presentacion, "^[^\\n]{0,100}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(clasificacion, "^[^\\n]{0,100}$", "Clasificacion", "Clasificacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(categoria, "^[^\\n]{0,100}$", "Categoria", "Categoria es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(ultimaCompra, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultima Compra", "Ultima Compra es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(precioEstimado, "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))", "Precio Estimado", "Precio Estimado es invalido(a), puede usar punto(.) y numeros")
                || !validador.validarConRegex(unidad, "^[^\\n]{0,10}$", "Unidad", "Unidad es invalido(a), puede usar hasta 10 caractes alfabeticos")
                || !validador.validarConRegex(proveedor, "^[^\\n]{0,50}$", "Proveedor", "Proveedor es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(codigo, "^[^\\n]{0,100}$", "Codigo", "Codigo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(nombreProducto, "^[^\\n]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                || !validador.validarConRegex(observaciones, "^[^\\n]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
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

            Insumo insumoAux = new Insumo(descripcion, marca, modelo, presentacion, clasificacion, categoria, ultimaCompraAux, precioEstimadoAux, unidad, proveedor, codigo, nombreProducto, existenciasAux, observaciones, laboratorio);
            listaInsumos.add(insumoAux);
            return true;
        }
    }

    //Crear producto Equipos
    public boolean crearProductoEquipo(Usuario user, String descripcion, String marca, String modelo, String numeroSerial, String numeroActivo, String presentacion, String voltaje, String procesable, String materialRequerido, String añoDeCompra, String aplicacion, String ultimoMantenimiento, String proximoMantenimiento, String ultimaCalibracion, String proximaCalibracion, String proovedoresDeServicios, Boolean encendidoDenoche, String codigo, String nombreProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        Validador validador = new Validador();

        if (!validador.validarConRegex(descripcion, "^[^\\n]{0,100}$", "Descripcion", "Descripcion es invalido(a), puede usar hasta 100 caractes alfanumericos")
                || !validador.validarConRegex(marca, "^[^\\n]{0,100}$", "Marca", "Marca es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(modelo, "^[^\\n]{5,100}$", "Modelo", "Modelo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(presentacion, "^[^\\n]{0,100}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(numeroSerial, "^[^\\n]{0,100}$", "Numero de serial", "Numero de serial es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(numeroActivo, "^[^\\n]{0,100}$", "Numero de activo", "Numero de activo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(voltaje, "^[^\\n]{0,100}$", "Voltaje", "Voltaje es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(procesable, "^[^\\n]{0,100}$", "Procesable", "Procesable es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(materialRequerido, "^[^\\n]{0,100}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(aplicacion, "^[^\\n]{0,100}$", "Aplicacion", "Aplicacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(añoDeCompra, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Año de Compra", "Año de Compra es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(ultimoMantenimiento, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultimo Mantenimiento", "Ultimo Mantenimiento es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(proximoMantenimiento, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Proximo Mantenimiento", "Proximo Mantenimiento es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(ultimaCalibracion, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultima Calibracion", "Ultima Calibracion es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(proximaCalibracion, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Proxima Calibracion", "Proxima Calibracion es invalido(a), use el formato dd/mm/yyyy")
                || !validador.validarConRegex(proovedoresDeServicios, "^[^\\n]{0,100}$", "Proovedores De Servicios", "Proovedores De Servicios es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(materialRequerido, "^[^\\n]{0,100}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(materialRequerido, "^[^\\n]{0,100}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(codigo, "^[^\\n]{0,100}$", "Codigo", "Codigo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(nombreProducto, "^[^\\n]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                || !validador.validarConRegex(observaciones, "^[^\\n]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
            /*TODO: encendidoDenoche radio botton*/
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

            Equipo equipoAux = new Equipo(descripcion, marca, modelo, numeroSerial, numeroActivo, presentacion, voltaje, procesable, materialRequerido, añoDeCompraAux, aplicacion, ultimoMantenimientoAux, proximoMantenimientoAux, ultimaCalibracionAux, proximaCalibracionAux, proovedoresDeServicios, encendidoDenoche, codigo, nombreProducto, inventarioExistenteAux, observaciones, laboratorio);
            listaEquipos.add(equipoAux);
            return true;
        }
    }

    //Crear producto Sustancias Químicas
    public boolean crearProductoSustancia(Usuario user, String formulaQuimica, String concentracion, String presentacion, String nombreComercial, Boolean poseeMSD, String numeroDeIdentificacion, String grupoDeRiesgo, String fraseR, String fraseS, String metodoDeControl, String permisos, String unidad, String precioEstimado, String proveedor, String almacenadoEnvasado, String codigo, String nombreProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        Validador validador = new Validador();

        if (!validador.validarConRegex(formulaQuimica, "^[^\\n]{0,100}$", "Formula Quimica", "Formula Quimica es invalido(a), puede usar hasta 100 caractes alfanumericos")
                || !validador.validarConRegex(concentracion, "^[^\\n]{0,100}$", "Concentracion", "Concentracion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(fraseR, "^[^\\n]{0,100}$", "Frase R", "Frase R es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(fraseS, "^[^\\n]{0,100}$", "Frase S", "Frase S es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(metodoDeControl, "^[^\\n]{0,100}$", "Metodo De Control", "Metodo De Control es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(permisos, "^[^\\n]{0,100}$", "Permisos", "Permisos es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(almacenadoEnvasado, "^[^\\n]{0,100}$", "Almacenado Envasado", "Almacenado Envasado es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(nombreComercial, "^[^\\n]{5,100}$", "Nombre Comercial", "Nombre Comercial es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(presentacion, "^[^\\n]{0,100}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(numeroDeIdentificacion, "^[^\\n]{0,50}$", "Numero De Identificacion", "Numero De Identificacion es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(grupoDeRiesgo, "^[^\\n]{0,100}$", "Grupo De Riesgo", "Grupo De Riesgo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(precioEstimado, "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))", "Precio Estimado", "Precio Estimado es invalido(a), puede usar punto(.) y numeros")
                || !validador.validarConRegex(unidad, "^[^\\n]{0,10}$", "Unidad", "Unidad es invalido(a), puede usar hasta 10 caractes alfabeticos")
                || !validador.validarConRegex(proveedor, "^[^\\n]{0,50}$", "Proveedor", "Proveedor es invalido(a), puede usar hasta 50 caractes alfabeticos")
                || !validador.validarConRegex(codigo, "^[^\\n]{0,100}$", "Codigo", "Codigo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                || !validador.validarConRegex(nombreProducto, "^[^\\n]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                /*TODO: Validar con radio botton poseeMSD*/
                || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                || !validador.validarConRegex(observaciones, "^[^\\n]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
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

            SustanciaQuimica sustanciaAux = new SustanciaQuimica(formulaQuimica, concentracion, presentacion, nombreComercial, poseeMSD, numeroDeIdentificacion, grupoDeRiesgo, fraseR, fraseS, metodoDeControl, permisos, unidad, precioEstimadoAux, proveedor, almacenadoEnvasado, codigo, nombreProducto, inventarioExistenteAux, observaciones, laboratorio);
            listaSustancias.add(sustanciaAux);
            return true;
        }
    }

    public ArrayList<Insumo> listarInsumosPorUsuario(Usuario usuario) {
        ArrayList<Insumo> listaInsumosAux = new ArrayList<>();

        for (Insumo i : listaInsumos) {
            if (i.getLaboratorio().getAdministrador().getNombreUser().equals(usuario.getNombreUser())) {
                listaInsumosAux.add(i);
            }
        }
        return listaInsumosAux;
    }

    public ArrayList<Equipo> listarEquipoPorUsuario(Usuario usuario) {
        ArrayList<Equipo> listaEquipoAux = new ArrayList<>();

        for (Equipo i : listaEquipos) {
            if (i.getLaboratorio().getAdministrador().getNombreUser().equals(usuario.getNombreUser())) {
                listaEquipoAux.add(i);
            }
        }
        return listaEquipoAux;
    }

    public ArrayList<SustanciaQuimica> listarSustanciaQuimicasPorUsuario(Usuario usuario) {
        ArrayList<SustanciaQuimica> listaSustanciasQuimicasAux = new ArrayList<>();

        for (SustanciaQuimica i : listaSustancias) {
            if (i.getLaboratorio().getAdministrador().getNombreUser().equals(usuario.getNombreUser())) {
                listaSustanciasQuimicasAux.add(i);
            }
        }
        return listaSustanciasQuimicasAux;
    }

    public Insumo listarInsumo(String id) {
        for (Insumo i : listaInsumos) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    public Equipo listarEquipo(String id) {
        for (Equipo i : listaEquipos) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    public SustanciaQuimica listarSustancia(String id) {
        for (SustanciaQuimica i : listaSustancias) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }
/*
    //TODO: Decidir si borrar
    public Producto listarProducto(String id) {
        for (Equipo i : listaEquipos) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        for (SustanciaQuimica i : listaSustancias) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        for (Insumo i : listaInsumos) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
*/
    //TODO: Agregar logica de transacciones
    //Insumos
    public boolean modificarInsumo(Usuario user, String id, String descripcion, String marca, String modelo, String presentacion, String clasificacion, String categoria, String ultimaCompra, String precioEstimado, String unidad, String proveedor, String codigo, String nombreProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        Insumo product = listarInsumo(id);
        if (product != null) {
            Validador validador = new Validador();
            if (!validador.validarConRegex(descripcion, "^[^\\n]{0,100}$", "Descripcion", "Descripcion es invalido(a), puede usar hasta 100 caractes alfanumericos")
                    || !validador.validarConRegex(marca, "^[^\\n]{0,100}$", "Marca", "Marca es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(modelo, "^[^\\n]{5,100}$", "Modelo", "Modelo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(presentacion, "^[^\\n]{0,100}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(clasificacion, "^[^\\n]{0,100}$", "Clasificacion", "Clasificacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(categoria, "^[^\\n]{0,100}$", "Categoria", "Categoria es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(ultimaCompra, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultima Compra", "Ultima Compra es invalido(a), use el formato dd/mm/yyyy")
                    || !validador.validarConRegex(precioEstimado, "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))", "Precio Estimado", "Precio Estimado es invalido(a), puede usar punto(.) y numeros")
                    || !validador.validarConRegex(unidad, "^[^\\n]{0,10}$", "Unidad", "Unidad es invalido(a), puede usar hasta 10 caractes alfabeticos")
                    || !validador.validarConRegex(proveedor, "^[^\\n]{0,50}$", "Proveedor", "Proveedor es invalido(a), puede usar hasta 50 caractes alfabeticos")
                    || !validador.validarConRegex(codigo, "^[^\\n]{0,100}$", "Codigo", "Codigo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(nombreProducto, "^[^\\n]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                    || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                    || !validador.validarConRegex(observaciones, "^[^\\n]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
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

                Insumo insumoAux = new Insumo(descripcion, marca, modelo, presentacion, clasificacion, categoria, ultimaCompraAux, precioEstimadoAux, unidad, proveedor, codigo, nombreProducto, existenciasAux, observaciones, laboratorio);

                int acumulador = 0;
                for (Insumo i : listaInsumos) {
                    if (i.getId().equals(id)) {
                        listaInsumos.set(acumulador, insumoAux);
                    }
                    acumulador++;
                }
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insumo no se puede modificar", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //TODO: Agregar logica de transacciones
    //Equipos
    public boolean modificarEquipo(Usuario user, String id, String descripcion, String marca, String modelo, String numeroSerial, String numeroActivo, String presentacion, String voltaje, String procesable, String materialRequerido, String añoDeCompra, String aplicacion, String ultimoMantenimiento, String proximoMantenimiento, String ultimaCalibracion, String proximaCalibracion, String proovedoresDeServicios, Boolean encendidoDenoche, String codigo, String nombreProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        Equipo product = listarEquipo(id);
        if (product != null) {
            Validador validador = new Validador();
            if (!validador.validarConRegex(descripcion, "^[^\\n]{0,100}$", "Descripcion", "Descripcion es invalido(a), puede usar hasta 100 caractes alfanumericos")
                    || !validador.validarConRegex(marca, "^[^\\n]{0,100}$", "Marca", "Marca es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(modelo, "^[^\\n]{5,100}$", "Modelo", "Modelo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(presentacion, "^[^\\n]{0,100}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(numeroSerial, "^[^\\n]{0,100}$", "Numero de serial", "Numero de serial es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(numeroActivo, "^[^\\n]{0,100}$", "Numero de activo", "Numero de activo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(voltaje, "^[^\\n]{0,100}$", "Voltaje", "Voltaje es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(procesable, "^[^\\n]{0,100}$", "Procesable", "Procesable es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(materialRequerido, "^[^\\n]{0,100}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(aplicacion, "^[^\\n]{0,100}$", "Aplicacion", "Aplicacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(añoDeCompra, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Año de Compra", "Año de Compra es invalido(a), use el formato dd/mm/yyyy")
                    || !validador.validarConRegex(ultimoMantenimiento, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultimo Mantenimiento", "Ultimo Mantenimiento es invalido(a), use el formato dd/mm/yyyy")
                    || !validador.validarConRegex(proximoMantenimiento, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Proximo Mantenimiento", "Proximo Mantenimiento es invalido(a), use el formato dd/mm/yyyy")
                    || !validador.validarConRegex(ultimaCalibracion, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Ultima Calibracion", "Ultima Calibracion es invalido(a), use el formato dd/mm/yyyy")
                    || !validador.validarConRegex(proximaCalibracion, "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$", "Proxima Calibracion", "Proxima Calibracion es invalido(a), use el formato dd/mm/yyyy")
                    || !validador.validarConRegex(proovedoresDeServicios, "^[^\\n]{0,100}$", "Proovedores De Servicios", "Proovedores De Servicios es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(materialRequerido, "^[^\\n]{0,100}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(materialRequerido, "^[^\\n]{0,100}$", "Material Requerido", "Material Requerido es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(codigo, "^[^\\n]{0,100}$", "Codigo", "Codigo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(nombreProducto, "^[^\\n]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                    || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                    || !validador.validarConRegex(observaciones, "^[^\\n]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
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

                Equipo equipoAux = new Equipo(descripcion, marca, modelo, numeroSerial, numeroActivo, presentacion, voltaje, procesable, materialRequerido, añoDeCompraAux, aplicacion, ultimoMantenimientoAux, proximoMantenimientoAux, ultimaCalibracionAux, proximaCalibracionAux, proovedoresDeServicios, encendidoDenoche, codigo, nombreProducto, inventarioExistenteAux, observaciones, laboratorio);

                int acumulador = 0;
                for (Producto i : listaEquipos) {
                    if (i.getId().equals(id)) {
                        listaEquipos.set(acumulador, equipoAux);
                    }
                    acumulador++;
                }
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Equipo no se puede modificar", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //TODO: Agregar logica de transacciones
    //Sustancias
    public boolean modificarSustancia(Usuario user, String id, String formulaQuimica, String concentracion, String presentacion, String nombreComercial, Boolean poseeMSD, String numeroDeIdentificacion, String grupoDeRiesgo, String fraseR, String fraseS, String metodoDeControl, String permisos, String unidad, String precioEstimado, String proveedor, String almacenadoEnvasado, String codigo, String nombreProducto, String inventarioExistente, String observaciones, Laboratorio laboratorio) {
        SustanciaQuimica product = listarSustancia(id);
        if (product != null) {
            Validador validador = new Validador();
            if (!validador.validarConRegex(formulaQuimica, "^[^\\n]{0,100}$", "Formula Quimica", "Formula Quimica es invalido(a), puede usar hasta 100 caractes alfanumericos")
                    || !validador.validarConRegex(concentracion, "^[^\\n]{0,100}$", "Concentracion", "Concentracion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(fraseR, "^[^\\n]{0,100}$", "Frase R", "Frase R es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(fraseS, "^[^\\n]{0,100}$", "Frase S", "Frase S es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(metodoDeControl, "^[^\\n]{0,100}$", "Metodo De Control", "Metodo De Control es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(permisos, "^[^\\n]{0,100}$", "Permisos", "Permisos es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(almacenadoEnvasado, "^[^\\n]{0,100}$", "Almacenado Envasado", "Almacenado Envasado es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(nombreComercial, "^[^\\n]{5,100}$", "Nombre Comercial", "Nombre Comercial es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(presentacion, "^[^\\n]{0,100}$", "Presentacion", "Presentacion es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(numeroDeIdentificacion, "^[^\\n]{0,50}$", "Numero De Identificacion", "Numero De Identificacion es invalido(a), puede usar hasta 50 caractes alfabeticos")
                    || !validador.validarConRegex(grupoDeRiesgo, "^[^\\n]{0,100}$", "Grupo De Riesgo", "Grupo De Riesgo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(precioEstimado, "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))", "Precio Estimado", "Precio Estimado es invalido(a), puede usar punto(.) y numeros")
                    || !validador.validarConRegex(unidad, "^[^\\n]{0,10}$", "Unidad", "Unidad es invalido(a), puede usar hasta 10 caractes alfabeticos")
                    || !validador.validarConRegex(proveedor, "^[^\\n]{0,50}$", "Proveedor", "Proveedor es invalido(a), puede usar hasta 50 caractes alfabeticos")
                    || !validador.validarConRegex(codigo, "^[^\\n]{0,100}$", "Codigo", "Codigo es invalido(a), puede usar hasta 100 caractes alfabeticos")
                    || !validador.validarConRegex(nombreProducto, "^[^\\n]{5,50}$", "Nombre Producto", "Nombre Producto es invalido(a), puede usar hasta 50 caractes alfabeticos")
                    /*TODO: Validar con radio botton poseeMSD*/
                    || !validador.validarConRegex(inventarioExistente, "^[1-9][0-9]{0,5}(\\.[0-9]{1,2})?$", "Inventario Existente", "Inventario Existente es invalido(a), puede ser hasta de 0 a 999999")
                    || !validador.validarConRegex(observaciones, "^[^\\n]{0,100}$", "Observaciones", "Observaciones es invalido(a), puede usar hasta 100 caractes alfabeticos")) {
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

                SustanciaQuimica sustanciaAux = new SustanciaQuimica(formulaQuimica, concentracion, presentacion, nombreComercial, poseeMSD, numeroDeIdentificacion, grupoDeRiesgo, fraseR, fraseS, metodoDeControl, permisos, unidad, precioEstimadoAux, proveedor, almacenadoEnvasado, codigo, nombreProducto, inventarioExistenteAux, observaciones, laboratorio);

                int acumulador = 0;
                for (Producto i : listaSustancias) {
                    if (i.getId().equals(id)) {
                        listaSustancias.set(acumulador, sustanciaAux);
                    }
                    acumulador++;
                }
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sustancia Quimica no se puede modificar", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    //TODO: Agregar logica de transacciones
    public void eliminarInsumo(Usuario user, String id) {
        Insumo insumo = listarInsumo(id);
        if (insumo != null) {
            int acumulador = 0;
            for (Insumo i : listaInsumos) {
                if (i.getId().equals(id)) {
                    listaInsumos.remove(acumulador);
                }
                acumulador++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insumo no encontrado, no pudo eliminarse", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     //TODO: Agregar logica de transacciones
    public void eliminarEquipo(Usuario user, String id) {
        Equipo equipo = listarEquipo(id);
        if (equipo != null) {
            int acumulador = 0;
            for (Equipo i : listaEquipos) {
                if (i.getId().equals(id)) {
                    listaEquipos.remove(acumulador);
                }
                acumulador++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Equipo no encontrado, no pudo eliminarse", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     //TODO: Agregar logica de transacciones
    public void eliminarSustancia(Usuario user, String id) {
        SustanciaQuimica sustanciaQuimica = listarSustancia(id);
        if (sustanciaQuimica != null) {
            int acumulador = 0;
            for (SustanciaQuimica i : listaSustancias) {
                if (i.getId().equals(id)) {
                    listaSustancias.remove(acumulador);
                }
                acumulador++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sustancia Quimica no encontrado, no pudo eliminarse", "Error", JOptionPane.ERROR_MESSAGE);
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
