package main;

import controller.ListaLaboratorios;
import controller.ListaDeProductos;
import controller.ListaDeUsuarios;
import java.util.ArrayList;
import model.Laboratorio;
import model.Usuario;

public class Main {

    public static void main(String[] args) {
        /**
         * ***********************************************************
         */
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
        //Este metodo que sige devuelve true cuando todo salio bien puedes usar ese rotorno para continuar a la siguiente ventana o mostrar mensaje de exito
        //El departamento es opcional as[i debes llamar al metodo o este es un ejemplo
        listaLaboratorios.crearLaboratorio(usuarioQueLlamaAlMetodo, "Labo 1", "Ingenieria", "Telecom", "Sanitaria", administradorLaboratorio);
        listaLaboratorios.crearLaboratorio(usuarioQueLlamaAlMetodo, "Labo 2", "Ingenieria", "Telecom", "", administradorLaboratorio); //Ejemplo departamento opcional

        /*
        Ejemplo 2 para mostrar laboratorios completos
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
        Ejemplo 2 para mostrar laboratorio
        Considerando que el codigo de arriba creamos un laboratorio, ahora lo 
        podremos listar
         */
      
        Laboratorio labo; //Creo este objeto para guardar lo que me devuelva esta busqueda
        labo = listaLaboratorios.listarLaboratorio(lista.get(0).getId()); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        //Asi puedes extraer los datos del objeto laboratorio para pintarlos:
        System.out.println("\n");
        System.out.println("Id: " + labo.getId());
        System.out.println("Nombre: " + labo.getNombreLaboratorio());
        System.out.println("Facultad: " + labo.getFacultad());
        System.out.println("Escuela: " + labo.getEscuela());
        System.out.println("Departamento: " + labo.getDepartamento());
        System.out.println("Admin: " + labo.getAdministrador().getNombreUser());
        
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
        listaLaboratorios.modificarLaboratorio(usuarioQueLlamaAlMetodo, lista.get(0).getId(), "Labo 1 modificado", "Humanidades", "Informatica", "Hidraulica", administradorLaboratorio);
        listaLaboratorios.modificarLaboratorio(usuarioQueLlamaAlMetodo, lista.get(1).getId(), "Labo 2", "Ingenieria", "civil", "Sanitaria", administradorLaboratorio);

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
        listaLaboratorios.eliminarLaboratorio(usuarioQueLlamaAlMetodo, lista.get(0).getId());

        //Esto de abajo es olo para mostrar el resultado de la actualizacion
        lista = listaLaboratorios.listarLaboratorios(); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        System.out.println("\n");
        System.out.println("Nombre del laboratorio que quedo: " + lista.get(0).getNombreLaboratorio());

        /*
        Nota final: pregunta si tienes dudas
         */
        /**
         * ***********************************************************
         */
        /*Uso de productos*/
        //**********************************************************************
        //Esto se debe crear siempre en el mainframe a diferencia de los anteriores
        ListaDeProductos listaDeProductos = new ListaDeProductos();
        //**********************************************************************

        /*
        Ejemplo 1 para crear un Producto, considera que el usuario 
        debe ser obtenido cuando se inicia la sesión no como se hace en este
        ejemplo donde se creo en este mismo documento
         */
 /*
        Este metodo que sige devuelve true cuando todo salio bien puedes usar 
        ese rotorno para continuar a la siguiente ventana o mostrar mensaje de exito
        Algunos campos son opcionales debes llamar al metodo o este es un ejemplo
        Como existen tres tipos de producto el metodo está sobre cargado es decir
        cada llamada es para generar un tipo de producto distinto
         */
        //
        /*
        listaDeProductos.crearProducto(usuarioQueLlamaAlMetodo, "Soy una descripcion de insumo Herramienta manual de 8 utilizada para aflojar", "No especifica", "No especifica", "Unitaria", "No Consumibles, Herramientas del laboratorio", "N/A", "26/02/2024", "5", "unds", "Ferreterias", "No especifíca", "Destornilladores de estrias", "Insumo", "9", "Observaciones: se debe utiliza de dia", labo);
        //listaDeProductos.crearProducto(usuarioQueLlamaAlMetodo, "H2O", "concentracion", "presentacion", "nombreComercial", Boolean.TRUE, "numeroDeIdentificacion", "grupoDeRiesgo", "fraseR", "fraseS", "metodoDeControl", "permisos", "unidad", "precioEstimado", "proveedor", "almacenadoEnvasado", "codigo", "nombreProducto", "tipoDeProducto", "inventarioExistente", "observaciones", labo);
        //listaDeProductos.crearProducto(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "numeroSerial", "321654", "presentacion", "321654", "procesable", "materialRequerido", "añoDeCompra", aplicacion, ultimoMantenimiento, proximoMantenimiento, ultimaCalibracion, proximaCalibracion, proovedoresDeServicios, Boolean.TRUE, codigo, nombreProducto, tipoDeProducto, inventarioExistente, observaciones, labo);
       
        /*Prueba de usuarios*/
        
        /*
        privilegios.add("Usuarios");
        privilegios.add("Laboratorios");
        ListaDeUsuarios lista2=new ListaDeUsuarios();
        lista2.crearUsuario(administradorLaboratorio,"jimmy","1234","Jimmy Fung", privilegios,"invitado", "true");
        lista2.crearUsuario(usuarioQueLlamaAlMetodo,"john","1234","John Marston", privilegios,"inivitado","true");
        
        ArrayList<Usuario>usuario1=lista2.listarUsuarios();
        Usuario usuario=lista2.listarUsuario(usuario1.get(1).getId());
        
        System.out.println("\n");
        System.out.println("Nombre: " + usuario.getUsername());
        System.out.println("contraseña: " + usuario.getContrasena());
        System.out.println("Nombre completo: " + usuario.getNombreUser());
        System.out.println("Rol: " + usuario.getRolUsuario());
        System.out.println("Estado: " +usuario.isStatus());
        System.out.println("ID: "+usuario.getId());
        ArrayList<Usuario>listadeusuarios=new ArrayList<>();
        listadeusuarios=lista2.listarUsuarios();
        
        System.out.println("\n");
        System.out.println("Nombre 1: " + listadeusuarios.get(0).getUsername());
        System.out.println("Nombre 2: " + listadeusuarios.get(1).getUsername());
        lista2.modificarUsuarios(administradorLaboratorio,listadeusuarios.get(1).getId(),"hank","j2312","hank tonks", privilegios,"admin","true");
        listadeusuarios=lista2.listarUsuarios();
        
        System.out.println("\n");
        System.out.println("Nombre: " + listadeusuarios.get(1).getUsername());
        System.out.println("contraseña: " + listadeusuarios.get(1).getContrasena());
        System.out.println("Nombre completo: " + listadeusuarios.get(1).getNombreUser());
        System.out.println("Rol: " + listadeusuarios.get(1).getRolUsuario());
        System.out.println("Estado: " +listadeusuarios.get(1).isStatus());
        System.out.println("ID: "+listadeusuarios.get(1).getId());
        
        lista2.eliminarUsuarios(administradorLaboratorio,listadeusuarios.get(1).getId());
       
        lista2.crearUsuario(usuarioQueLlamaAlMetodo,"john","1234","John Marston", privilegios,"inivitado","true");
        listadeusuarios=lista2.listarUsuarios();
        System.out.println("\n");
        System.out.println("Nombre: " + listadeusuarios.get(1).getUsername());
        System.out.println("contraseña: " + listadeusuarios.get(1).getContrasena());
        System.out.println("Nombre completo: " + listadeusuarios.get(1).getNombreUser());
        System.out.println("Rol: " + listadeusuarios.get(1).getRolUsuario());
        System.out.println("Estado: " +listadeusuarios.get(1).isStatus());
        System.out.println("ID: "+listadeusuarios.get(1).getId());
        
        usuario=lista2.iniciarSesion("jimmy","1234");
        System.out.println("\n");
        if(usuario!=null){
            System.out.println("Nombre: " + usuario.getUsername());
            System.out.println("contraseña: " + usuario.getContrasena());
            System.out.println("Nombre completo: " + usuario.getNombreUser());
            System.out.println("Rol: " + usuario.getRolUsuario());
            System.out.println("Estado: " + usuario.isStatus());
            System.out.println("ID: " + usuario.getId());
        
        }
        boolean bool=lista2.verificarPrivilegios(lista2.listarUsuario(listadeusuarios.get(0).getId()),"Laboratorios");
        System.out.println("\n");
        System.out.println(bool);
        */
    }

}
