package model;

import java.util.Date;

public class Transaccion {
    Producto producto;
    Date fecha;
//    Usuario usuario //TODO: Agregar usuario
    int id; // TODO: Generar un identificador aleatorio
    //TODO: agragar getters y setters

    public Producto getProducto() {
        return producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getId() {
        return id;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
