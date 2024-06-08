package model;

import java.util.UUID;
import static model.Laboratorio.generarUUID;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Transaccion {

    Producto producto;
    String fecha;
    Usuario user;
    String id;
    String tipoDeTransaccion;
    String tipoDeProducto;

    public static final String generarUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public Transaccion(Producto producto, Usuario user, String tipoDeTransaccion, String tipoDeProducto) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.fecha = myDateObj.format(myFormatObj);
        this.producto = producto;
        this.user = user;
        this.id = generarUUID();
        this.tipoDeProducto = tipoDeProducto;
        this.tipoDeTransaccion = tipoDeTransaccion;
    }

    public String getTipoDeTransaccion() {
        return tipoDeTransaccion;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUser() {
        return user;
    }

    public String getId() {
        return id;
    }

    public void setTipoDeTransaccion(String tipoDeTransaccion) {
        this.tipoDeTransaccion = tipoDeTransaccion;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setId(String id) {
        this.id = id;
    }

}
