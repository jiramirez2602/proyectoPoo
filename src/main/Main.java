package main;

import controller.ListaLaboratorios;
import java.util.ArrayList;
import model.Laboratorio;
import model.Usuario;

public class Main {

    public static void main(String[] args) {
        //Estos pasos previos solo se realiza para lograr ejemplificar, 
        //en la practica los valore no debe obtenerse asi
        ArrayList<String> privilegios = new ArrayList<>();//Esto se maneja en modulo de usuarios
        Usuario administradorLaboratorio = new Usuario("Keny", "1234", "jorge1", privilegios, "invitado", true); //Este usuario debería venir de combo box que liste usuario existente no deberia crearse en el momento
        Usuario usuarioQueLlamaAlMetodo = new Usuario("Harry", "1234", "jorge1", privilegios, "invitado", true); //Este usuario debería venir de combo box que liste usuario existente no deberia crearse en el momento

        //**********************************************************************
        //Esto se debe crear siempre en el mainframe a diferencia de los anteriores
        ListaLaboratorios listaLaboratorios = new ListaLaboratorios();
        //**********************************************************************

        /*
        Ejemplo 1 para crear un laboratorio , considera que el usuario 
        debe ser seleccionado desde un combobox que liste los usario que deben 
        ser previamente registrados en este ejemplo uso un usuario que cree
        pero no es elflujo normal
         */
        //Este metodo que sige devuelve tru cuando todo salio bien puedes usar ese rotorno para continuar a la siguiente ventana o mostrar mensaje de exito
        //El departamento es opcional as[i debes llamar al metodo o este es un ejemplo
        listaLaboratorios.crearLaboratorio(usuarioQueLlamaAlMetodo, "Labo 1", "Ingenieria", "Telecom", "Sanitaria", administradorLaboratorio);
        listaLaboratorios.crearLaboratorio(usuarioQueLlamaAlMetodo, "Labo 2", "Ingenieria", "Telecom", "", administradorLaboratorio); //Ejemplo departamento opcional

        /*
        Ejemplo 2 para mostrar laboratorio
        Considerando que el codigo de arriba creamos un laboratorio, ahora lo 
        podremos listar
         */
        Laboratorio labo; //Creo este objeto para guardar lo que me devuelva esta busqueda
        labo = listaLaboratorios.listarLaboratorio("Labo 1"); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        //Asi puedes extraer los datos del objeto laboratorio para pintarlos:
        System.out.println("\n");
        System.out.println("Nombre: " + labo.getNombreLaboratorio());
        System.out.println("Facultad: " + labo.getFacultad());
        System.out.println("Escuela: " + labo.getEscuela());
        System.out.println("Departamento: " + labo.getDepartamento());
        System.out.println("Admin: " + labo.getAdministrador().getNombreUser());

        /*
        Ejemplo 3 para mostrar laboratorios completos
        Considerando que el codigo de arriba creamos dos laboratorios, ahora los 
        podremos listar
         */
        ArrayList<Laboratorio> lista = new ArrayList<>(); //Creo este array para guardar lo que me devuelva esta busqueda
        lista = listaLaboratorios.listarLaboratorios(); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        //Asi puedes extraer los datos del objeto laboratorio para pintarlos:
        System.out.println("\n");
        System.out.println("Nombre 1: " + lista.get(0).getNombreLaboratorio());
        System.out.println("Nombre 2: " + lista.get(1).getNombreLaboratorio());

        /*
        Ejemplo 4 para actualizar 1 laboratorio
        Considerando que el codigo de arriba creamos dos laboratorios, ahora los 
        podremos actualizar debemos enviar todos los parametros de nuevo y como
        primer parametro el nombre que tenia el laboratorio originalmente porque
        ese es nuestro identificador
        como segundo parametro mandamos el nombre actualizado, en caso de no 
        actualizar el nombre de puede enviar el mismo nombre en primer y segundo 
        parametro como ocurre en la segunda llamada a la funcion
         */
        listaLaboratorios.modificarLaboratorio(usuarioQueLlamaAlMetodo, "Labo 1", "Labo 1 modificado", "Humanidades", "Informatica", "Hidraulica", administradorLaboratorio);
        listaLaboratorios.modificarLaboratorio(usuarioQueLlamaAlMetodo, "Labo 2", "Labo 2", "Ingenieria", "civil", "Sanitaria", administradorLaboratorio);

        //Esto de abajo es olo para mostrar el resultado de la actualizacion
        lista = listaLaboratorios.listarLaboratorios(); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        System.out.println("\n");
        System.out.println("Nombre 1 actualizado: " + lista.get(0).getNombreLaboratorio());
        System.out.println("Facultad 1 actualizado: " + lista.get(0).getEscuela());

        System.out.println("Nombre 2 no actualizado: " + lista.get(1).getNombreLaboratorio());
        System.out.println("Escuela 2 actualizado: " + lista.get(1).getEscuela());

        /*
        Ejemplo 5 para eliminar laboratorio
        Considerando que el codigo de arriba creamos dos laboratorios, ahora los 
        podremos eliminar debemos enviar unicamente el nombre y se borrara en
        este ejemplo vamo a borrar el primer laboratorio que se creo y 
        consultaremos la lista nuevamente
         */
        listaLaboratorios.eliminarLaboratorio(usuarioQueLlamaAlMetodo, "Labo 1 modificado");

        //Esto de abajo es olo para mostrar el resultado de la actualizacion
        lista = listaLaboratorios.listarLaboratorios(); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        System.out.println("\n");
        System.out.println("Nombre del laboratorio que quedo: " + lista.get(0).getNombreLaboratorio());

        /*
        Nota final: pregunta si tienes dudas
         */
    }

}
