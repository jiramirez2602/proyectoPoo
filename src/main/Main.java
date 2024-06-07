package main;

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
        Ejemplo 3 para mostrar laboratorio
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
        Ejemplo 4:
        Para actualizar Laboratorio Considerando que el codigo de arriba 
        creamosLaboratorio ahora los podremos actualizar 
        debemos enviar todos los parametros de nuevo y como
        primer parametro el nombre del usuario que modifica y de segundo
        el id que tiene el laboratorio porque ese es nuestro identificador*/
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

        Este metodo que sige devuelve true cuando todo salio bien puedes usar 
        ese rotorno para continuar a la siguiente ventana o mostrar mensaje de exito
        Algunos campos son opcionales debes llamar al metodo o este es un ejemplo
        Como existen tres tipos de producto el metodo está sobre cargado es decir
        cada llamada es para generar un tipo de producto distinto
         */
        //
        //Llamada de ejemplo (insumo)
        listaDeProductos.crearProductoInsumo(usuarioQueLlamaAlMetodo, "Soy una descripcion de insumo Herramienta manual de 8 utilizada para aflojar", "No especifica", "No especifica", "Unitaria", "No Consumibles, Herramientas del laboratorio", "N/A", "26/02/2024", "5", "unds", "Ferreterias", "No especifíca", "Destornilladores de estrias", "9", "Observaciones: se debe utiliza de dia", labo);

        //Ejemplo insumo
        listaDeProductos.crearProductoInsumo(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "presentacion", "clasificacion", "categoria", "26/02/2001", "10.0", "unidad", "proveedor", "codigo", "nombreProducto", "12", "observaciones", labo);
        //Ejemplo sustancia quimica
        listaDeProductos.crearProductoSustancia(usuarioQueLlamaAlMetodo, "formulaQuimica", "concentracion", "presentacion", "nombreComercial", Boolean.TRUE, "numeroDeIdentificacion", "grupoDeRiesgo", "fraseR", "fraseS", "metodoDeControl", "permisos", "unidad", "12", "proveedor", "almacenadoEnvasado", "codigo", "nombreProducto", "12", "observaciones", labo);
        //Ejemplo equipo
        listaDeProductos.crearProductoEquipo(usuarioQueLlamaAlMetodo, "descripcion", "marca", "modelo", "numeroSerial", "numeroActivo", "presentacion", "voltaje", "procesable", "materialRequerido", "26/02/2001", "aplicacion", "26/02/2001", "26/02/2001", "26/02/2001", "26/02/2001", "proovedoresDeServicios", Boolean.TRUE, "codigo", "nombreProducto", "56", "observaciones", labo);

        /*
        Ejemplo 2 para mostrar Productos de cada tipo segun que usuario eres
        Considerando que el codigo de arriba creamos varios productos, ahora los 
        podremos listar
         */
        ArrayList<Insumo> listaInsumos = new ArrayList<>();
        ArrayList<SustanciaQuimica> listaSustanciaQuimica = new ArrayList<>();
        ArrayList<Equipo> listaEquipo = new ArrayList<>();

        //Esta es la verdadera llamada al metodo si tiene coincidencias me trae 
        //toda la info de los productos, esta llamada trae los productos filtrando
        //por tipo de producto.
        listaInsumos = listaDeProductos.listarInsumosPorUsuario(usuarioQueLlamaAlMetodo);
        listaEquipo = listaDeProductos.listarEquipoPorUsuario(usuarioQueLlamaAlMetodo);
        listaSustanciaQuimica = listaDeProductos.listarSustanciaQuimicasPorUsuario(usuarioQueLlamaAlMetodo);
        //Asi puedes extraer los datos del objeto insumo, sustanciaQuimica producto para pintarlos como creamos dos insumos simulamos una lista:
        System.out.println("\n");
        System.out.println("Nombre de insumo: " + listaInsumos.get(0).getNombreProducto());
        System.out.println("Nombre de equipo: " + listaEquipo.get(0).getNombreProducto());
        System.out.println("Nombre de sustancia: " + listaSustanciaQuimica.get(0).getNombreProducto());

        /*
        Ejemplo 3 para mostrar Pruducto
        Considerando que el codigo de arriba creamos varios productos, ahora lo 
        podremos listar
         */
        //Para este ejemplo simularemos que estamos en la lista de insumos y queremos ver en detalle los datos de un producto
        Equipo equipo = listaDeProductos.listarEquipo(listaEquipo.get(0).getId()); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        Insumo insumo = listaDeProductos.listarInsumo(listaInsumos.get(0).getId()); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        SustanciaQuimica sustanciaQuimica = listaDeProductos.listarSustancia(listaSustanciaQuimica.get(0).getId()); //Esta es la verdadera llamada al metodo si tiene coincidencias me trae toda la info del laboratorio
        //Asi puedes extraer los datos del objeto producto para pintarlos(los parametros que pinto son un ejemplo, solo hay que pintar los que es propio del producto mas el nombre del laboratorio y el nombre del usuario):
        System.out.println("\n");
        System.out.println("Tipo: " + equipo.getTipoDeProducto());
        System.out.println("Nombre de producto: " + equipo.getNombreProducto());
        System.out.println("Tipo: " + insumo.getTipoDeProducto());
        System.out.println("Nombre de producto: " + insumo.getNombreProducto());
        System.out.println("Tipo: " + sustanciaQuimica.getTipoDeProducto());
        System.out.println("Nombre de producto: " + sustanciaQuimica.getNombreProducto());

        /*
        Ejemplo 4 
        Para actualizar Producto Considerando que el codigo de arriba 
        creamos dos insumos, sustancias y equipos, ahora los podremos actualizar 
        debemos enviar todos los parametros de nuevo y como
        primer parametro el nombre del usuario que modifica y de segundo
        el id que tiene el Producto porque ese es nuestro identificador
         */
        listaDeProductos.modificarEquipo(usuarioQueLlamaAlMetodo, listaEquipo.get(0).getId(), "Actualizar descipcion", "marca", "modelo", "numeroSerial", "numeroActivo", "presentacion", "voltaje", "procesable", "materialRequerido", "26/02/2001", "aplicacion", "26/02/2001", "26/02/2001", "26/02/2001", "26/02/2001", "proovedoresDeServicios", Boolean.TRUE, "codigo", "nombreProducto", "56", "observaciones", labo);
        listaDeProductos.modificarSustancia(usuarioQueLlamaAlMetodo, listaSustanciaQuimica.get(0).getId(), "Actualizar formula Quimica", "concentracion", "presentacion", "nombreComercial", Boolean.TRUE, "numeroDeIdentificacion", "grupoDeRiesgo", "fraseR", "fraseS", "metodoDeControl", "permisos", "unidad", "12", "proveedor", "almacenadoEnvasado", "codigo", "nombreProducto", "12", "observaciones", labo);
        listaDeProductos.modificarInsumo(usuarioQueLlamaAlMetodo, listaInsumos.get(0).getId(), "Actualizar descipcion", "marca", "modelo", "presentacion", "clasificacion", "categoria", "26/02/2001", "10.0", "unidad", "proveedor", "codigo", "nombreProducto", "12", "observaciones", labo);
        /*No voy a ejemplificar como se pinta en este caso aumo que ya se entiende mi logica en este punto preguntar si no es asi*/

 /*
        Ejemplo 5 para eliminar laboratorio
        Considerando que el codigo de arriba creamos varios productos, ahora los 
        podremos eliminar debemos enviar unicamente el id y se borrara en
        este ejemplo vamo a borrar el primer producto de cada lista que se creó
         */
        System.out.println(listaEquipo.get(0).getId());
        listaDeProductos.eliminarEquipo(usuarioQueLlamaAlMetodo, listaEquipo.get(0).getId());
        listaDeProductos.eliminarSustancia(usuarioQueLlamaAlMetodo, listaSustanciaQuimica.get(0).getId());
        listaDeProductos.eliminarInsumo(usuarioQueLlamaAlMetodo, listaInsumos.get(0).getId());
        /*No voy a ejemplificar como se pinta en este caso aumo que ya se entiende mi logica en este punto preguntar si no es asi*/

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
    }
    
}
