package model;

public class Producto {
    String codigo;
    String nombreProducto;
    String tipoDeProducto;
    int inventarioExistente;
    String observaciones;
    Laboratorio laboratorio;
    int existenciasMinimas;

    public Producto(String codigo, String nombreProducto, String tipoDeProducto, int inventarioExistente, String observaciones, Laboratorio laboratorio, int existenciasMinimas) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.tipoDeProducto = tipoDeProducto;
        this.inventarioExistente = inventarioExistente;
        this.observaciones = observaciones;
        this.laboratorio = laboratorio;
        this.existenciasMinimas = existenciasMinimas;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public int getInventarioExistente() {
        return inventarioExistente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public int getExistenciasMinimas() {
        return existenciasMinimas;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public void setInventarioExistente(int inventarioExistente) {
        this.inventarioExistente = inventarioExistente;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setExistenciasMinimas(int existenciasMinimas) {
        this.existenciasMinimas = existenciasMinimas;
    }
    
    public void necesitaCompra(){
        //TODO: Añadir logica de necesita compra;
    }
}
