package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Insumo;
import model.Laboratorio;
import model.Usuario;

public class ListaDeInsumos {

    ArrayList<Insumo> listaInsumos;

    public ListaDeInsumos() {
        listaInsumos = new ArrayList<>();
    }

    public ArrayList<Insumo> getListaInsumos() {
        return listaInsumos;
    }

    public void setListaEquipos(ArrayList<Insumo> listaEquipos) {
        this.listaInsumos = listaEquipos;
    }

    //TODO: Agregar logica de transacciones
    //Crear producto Insumo
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

    //Listar un equipo con un ID
    public Insumo listarInsumo(String id) {
        for (Insumo i : getListaInsumos()) {
            if (i.getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    //Listar un equipo con un Usuario
    public ArrayList<Insumo> listarInsumoPorUsuario(Usuario usuario) {
        ArrayList<Insumo> listaInsumoAux = new ArrayList<>();

        for (Insumo i : getListaInsumos()) {
            if (i.getLaboratorio().getAdministrador().getNombreUser().equals(usuario.getNombreUser())) {
                listaInsumoAux.add(i);
            }
        }
        return listaInsumoAux;
    }

    //TODO: Agregar logica de transacciones
    //Modifica Equipos
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
                insumoAux.setId(id);
                
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
    //Eliminar Equipos
    public boolean eliminarInsumo(Usuario user, String id) {
        Insumo insumo = listarInsumo(id);
        if (insumo != null) {
            int acumulador = 0;
            for (Insumo i : listaInsumos) {
                if (i.getId().equals(id)) {
                    listaInsumos.remove(acumulador);
                    return Boolean.TRUE;
                }
                acumulador++;
            }
        }
        JOptionPane.showMessageDialog(null, "Insumo no encontrado, no pudo eliminarse", "Error", JOptionPane.ERROR_MESSAGE);
        return Boolean.FALSE;
    }
}