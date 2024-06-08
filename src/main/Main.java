package main;

import controller.ListaDeEquipos;
import controller.ListaDeInsumos;
import controller.ListaLaboratorios;
import controller.ListaDeProductos;
import controller.ListaDeUsuarios;
import java.util.ArrayList;
import model.Equipo;
import model.Insumo;
import model.Laboratorio;
import model.Producto;
import model.SustanciaQuimica;
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

        //Ejemplo 1 para crear un laboratorio , considera que el usuario 
        //debe ser seleccionado desde un combobox que liste los usario que deben 
        //ser previamente registrados en este ejemplo uso un usuario que cree
        //pero no es elflujo normal
        //Este metodo que sige devuelve true cuando todo salio bien puedes usar ese rotorno para continuar a la siguiente ventana o mostrar mensaje de exito
        //El departamento es opcional as[i debes llamar al metodo o este es un ejemplo
        listaLaboratorios.crearLaboratorio(usuarioQueLlamaAlMetodo, "Labo 1", "Ingenieria", "Telecom", "Sanitaria", administradorLaboratorio);
        listaLaboratorios.crearLaboratorio(usuarioQueLlamaAlMetodo, "Labo 2", "Ingenieria", "Telecom", "", administradorLaboratorio); //Ejemplo departamento opcional

        //Ejemplo 2 para mostrar laboratorios completos
        //Considerando que el codigo de arriba creamos dos laboratorios, 
        //ahora los podremos listar
        ArrayList<Laboratorio> lista = new ArrayList<>(); //Creo este array para guardar lo que me devuelva esta busqueda
        lista = listaLaboratorios.listarLaboratorios(); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        //Asi puedes extraer los datos del objeto laboratorio para pintarlos:
        System.out.println("\n");
        System.out.println("Nombre 1: " + lista.get(0).getNombreLaboratorio());
        System.out.println("Nombre 2: " + lista.get(1).getNombreLaboratorio());

        //Ejemplo 3 para mostrar laboratorio
        //Considerando que el codigo de arriba creamos un laboratorio, ahora lo 
        //podremos listar
        //Creo este objeto para guardar lo que me devuelva esta busqueda
        Laboratorio labo;
        //Esta es la verdadera llamada al metodo si tiene coincidencias me 
        //trae toda la info del laboratorio
        labo = listaLaboratorios.listarLaboratorio(lista.get(0).getId());
        //Asi puedes extraer los datos del objeto laboratorio para pintarlos:
        System.out.println("\n");
        System.out.println("Id: " + labo.getId());
        System.out.println("Nombre: " + labo.getNombreLaboratorio());
        System.out.println("Facultad: " + labo.getFacultad());
        System.out.println("Escuela: " + labo.getEscuela());
        System.out.println("Departamento: " + labo.getDepartamento());
        System.out.println("Admin: " + labo.getAdministrador().getNombreUser());

        //Ejemplo 4:
        //Para actualizar Laboratorio Considerando que el codigo de arriba 
        //creamosLaboratorio ahora los podremos actualizar 
        //debemos enviar todos los parametros de nuevo y como
        //primer parametro el nombre del usuario que modifica y de segundo
        //el id que tiene el laboratorio porque ese es nuestro identificador
        listaLaboratorios.modificarLaboratorio(usuarioQueLlamaAlMetodo, lista.get(0).getId(), "Labo 1 modificado", "Humanidades", "Informatica", "Hidraulica", administradorLaboratorio);
        listaLaboratorios.modificarLaboratorio(usuarioQueLlamaAlMetodo, lista.get(1).getId(), "Labo 2", "Ingenieria", "civil", "Sanitaria", administradorLaboratorio);

        //Esto de abajo es olo para mostrar el resultado de la actualizacion
        lista = listaLaboratorios.listarLaboratorios(); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        System.out.println("\n");
        System.out.println("Nombre 1 actualizado: " + lista.get(0).getNombreLaboratorio());
        System.out.println("Facultad 1 actualizado: " + lista.get(0).getEscuela());

        System.out.println("Nombre 2 no actualizado: " + lista.get(1).getNombreLaboratorio());
        System.out.println("Escuela 2 actualizado: " + lista.get(1).getEscuela());

        //Ejemplo 5 para eliminar laboratorio
        //Considerando que el codigo de arriba creamos dos laboratorios, ahora los 
        //podremos eliminar debemos enviar unicamente el nombre y se borrara en
        //este ejemplo vamo a borrar el primer laboratorio que se creo y 
        //consultaremos la lista nuevamente
        listaLaboratorios.eliminarLaboratorio(usuarioQueLlamaAlMetodo, lista.get(0).getId());

        //Esto de abajo es olo para mostrar el resultado de la actualizacion
        lista = listaLaboratorios.listarLaboratorios(); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        System.out.println("\n");
        System.out.println("Nombre del laboratorio que quedo: " + lista.get(0).getNombreLaboratorio());

        //Nota final: pregunta si tienes dudas
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
        
        boolean bool=lista2.iniciarSesion("jimmy","1234");
        System.out.println("\n");
        System.out.println(bool);
        
        bool=lista2.verificarPrivilegios(lista2.listarUsuario(listadeusuarios.get(0).getId()),"Laboratorios");
        System.out.println("\n");
        System.out.println(bool);
         */
        //MANEJO DE EQUIPOS
        System.out.println("\n");

        //TODO: encendidoDenoche radio botton
        ListaDeEquipos listaEquipos = new ListaDeEquipos();
        //Equipo creado por un Keny
        listaEquipos.crearProductoEquipo(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "numeroSerial", "numeroActivo", "presentacion", "voltaje", "procesable", "materialRequerido", "26/02/2001", "aplicacion", "26/02/2001", "26/02/2001", "26/02/2001", "26/02/2001", "proovedoresDeServicios", Boolean.TRUE, "codigo", "NombreProducto: Equipo 1", "56", "observaciones", labo);
        listaEquipos.crearProductoEquipo(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "numeroSerial", "numeroActivo", "presentacion", "voltaje", "procesable", "materialRequerido", "26/02/2001", "aplicacion", "26/02/2001", "26/02/2001", "26/02/2001", "26/02/2001", "proovedoresDeServicios", Boolean.TRUE, "codigo", "NombreProducto: Equipo 2", "56", "observaciones", labo);
        listaEquipos.crearProductoEquipo(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "numeroSerial", "numeroActivo", "presentacion", "voltaje", "procesable", "materialRequerido", "26/02/2001", "aplicacion", "26/02/2001", "26/02/2001", "26/02/2001", "26/02/2001", "proovedoresDeServicios", Boolean.TRUE, "codigo", "NombreProducto: Equipo 3", "56", "observaciones", labo);

        //Pintar equipo del laboratorio de Keny
        //Esta linea de la los Equipos en su laboratorio que administra keny :
        //listaEquipos.listarEquipoPorUsuario(usuarioQueLlamaAlMetodo)
        for (Equipo i : listaEquipos.listarEquipoPorUsuario(usuarioQueLlamaAlMetodo)) {
            System.out.println(i.getNombreProducto());
        }

        System.out.println("");
        //Obtengo un id de uno de los equipo que registre
        String idEquipo = listaEquipos.listarEquipoPorUsuario(usuarioQueLlamaAlMetodo).get(2).getId();
        //En este ejemplo obtengo los datos de un Equipo por su id y pinto su nombre:
        System.out.println(listaEquipos.listarEquipo(idEquipo).getNombreProducto());

        //Actualizo descripcion de Equipo Creado para laboratorio de Keny
        listaEquipos.modificarEquipo(usuarioQueLlamaAlMetodo, idEquipo, "Actualizar descipcion", "marca", "modelo", "numeroSerial", "numeroActivo", "presentacion", "voltaje", "procesable", "materialRequerido", "26/02/2001", "aplicacion", "26/02/2001", "26/02/2001", "26/02/2001", "26/02/2001", "proovedoresDeServicios", Boolean.TRUE, "codigo", "nombreProducto: Equipo 3", "56", "observaciones", labo);
        System.out.println("Actualizacion: " + listaEquipos.listarEquipo(idEquipo).getDescripcion());

        //Obtengo un id de uno de los equipo que registre
        idEquipo = listaEquipos.listarEquipoPorUsuario(usuarioQueLlamaAlMetodo).get(0).getId();
        //Elimino un equipo 
        listaEquipos.eliminarEquipo(usuarioQueLlamaAlMetodo, idEquipo);

        //Obtengo un id de uno de los equipo que registre
        idEquipo = listaEquipos.listarEquipoPorUsuario(usuarioQueLlamaAlMetodo).get(0).getId();
        //Elimino un segundo equipo 
        listaEquipos.eliminarEquipo(usuarioQueLlamaAlMetodo, idEquipo);
        //Pintar equipo del laboratorio de Keny para mostrar que quedan 
        //dos menos
        //Esta linea de la los Equipos en su laboratorio que administra keny :
        //listaEquipos.listarEquipoPorUsuario(usuarioQueLlamaAlMetodo)
        for (Equipo i : listaEquipos.listarEquipoPorUsuario(usuarioQueLlamaAlMetodo)) {
            System.out.println("\nEquipo restante: " + i.getNombreProducto());
        }

        //MANEJO DE INSUMOS
        System.out.println("\n");

        ListaDeInsumos listaInsumos = new ListaDeInsumos();
        //Insumo creado por un Keny
        listaInsumos.crearProductoInsumo(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "presentacion", "clasificacion", "categoria", "26/02/2001", "10.0", "unidad", "proveedor", "codigo", "nombreProducto: Insumo 1", "12", "observaciones", labo);
        listaInsumos.crearProductoInsumo(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "presentacion", "clasificacion", "categoria", "26/02/2001", "10.0", "unidad", "proveedor", "codigo", "nombreProducto: Insumo 2", "12", "observaciones", labo);
        listaInsumos.crearProductoInsumo(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "presentacion", "clasificacion", "categoria", "26/02/2001", "10.0", "unidad", "proveedor", "codigo", "nombreProducto: Insumo 3", "12", "observaciones", labo);

        //Pintar Insumo del laboratorio de Keny
        //Esta linea de la los Insumo en su laboratorio que administra keny :
        //listaInsumos.listarInsumoPorUsuario(usuarioQueLlamaAlMetodo)
        for (Insumo i : listaInsumos.listarInsumoPorUsuario(usuarioQueLlamaAlMetodo)) {
            System.out.println(i.getNombreProducto());
        }

        System.out.println("");
        //Obtengo un id de uno de los Insumo que registre
        String idInsumo = listaInsumos.listarInsumoPorUsuario(usuarioQueLlamaAlMetodo).get(2).getId();
        //En este ejemplo obtengo los datos de un Insumo
        //por su id y pinto su nombre:
        System.out.println(listaInsumos.listarInsumo(idInsumo).getNombreProducto());

        //Actualizo descripcion de Insumo Creado para laboratorio de Keny
        listaInsumos.modificarInsumo(usuarioQueLlamaAlMetodo, idInsumo, "descripcion actualizada", "marca", "modelo", "presentacion", "clasificacion", "categoria", "26/02/2001", "10.0", "unidad", "proveedor", "codigo", "nombreProducto: Insumo 3", "12", "observaciones", labo);
        System.out.println("Actualizacion: " + listaInsumos.listarInsumo(idInsumo).getDescripcion());

        //Obtengo un id de uno de los Insumos que registre
        idInsumo = listaInsumos.listarInsumoPorUsuario(usuarioQueLlamaAlMetodo).get(0).getId();
        //Elimino un Insumo 
        listaInsumos.eliminarInsumo(usuarioQueLlamaAlMetodo, idInsumo);

        //Obtengo un id de uno de los Insumo que registre
        idInsumo = listaInsumos.listarInsumoPorUsuario(usuarioQueLlamaAlMetodo).get(0).getId();
        //Elimino un segundo Insumo 
        listaInsumos.eliminarInsumo(usuarioQueLlamaAlMetodo, idInsumo);
        
        //Pintar Insumo del laboratorio de Keny para mostrar que quedan 
        //dos menos
        //Esta linea de la los Insumos en su laboratorio que administra keny :
        //listaInsumos.listarInsumoPorUsuario(usuarioQueLlamaAlMetodo)
        for (Insumo i : listaInsumos.listarInsumoPorUsuario(usuarioQueLlamaAlMetodo)) {
            System.out.println("\nInsumo restante: " + i.getNombreProducto());
        }
    }

}
