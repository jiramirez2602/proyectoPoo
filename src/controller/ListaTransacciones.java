package controller;

import java.util.ArrayList;
import model.Transaccion;

public class ListaTransacciones {
    ArrayList<Transaccion> listaTransacciones = new ArrayList<>();
//    public void iniciarLista() {
//        //TODO: Leer todos los datos preexistentes de xml
//    }
    
    public void crearTransacciones(ArrayList<String> privileges) {
        //Transacciones TransaccionesAux = new Transacciones("x", "x", "x", "x");
        //listaTransaccioness.add(TransaccionesAux);
    }

    public void listarTransacciones(ArrayList<String> privileges) {
            //TODO: pintar lista aquí
    }


    public void restaurarTransaccion(ArrayList<String> privileges, int id) {
        for (Transaccion i : listaTransacciones) {
            if (i.getId() == id) {
                //TODO: tooooda la logica para revertir
            }
        }
    }
}
