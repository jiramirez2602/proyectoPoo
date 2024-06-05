package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;

public class ListaDeUsuarios {
    ArrayList <Usuario> listaUsuarios;
    
    public void iniciarArraylistUsuarios(){
        listaUsuarios=new ArrayList();
    }
    
    public void crearUsuario(ArrayList<String>privilegios,String nombre,String contraseña,String nombreCompleto,ArrayList<String>privilegio,String rol,boolean status){
       boolean permitido=false;
        for(String comprobar:privilegios){
            if(comprobar.equals("Usuarios")){
                permitido=true;
            }
        }
        if(permitido==true){
            Usuario usuario=new Usuario(nombre,contraseña,nombreCompleto,privilegio,rol,status);
            listaUsuarios.add(usuario);
        }
        else{
            JOptionPane.showInputDialog("EL USUARIO NO ESTA PERMITIDO");
        }
    }
    
    public void listarUsuarios(ArrayList<String>privilegios){
        for(Usuario i:listaUsuarios){
            
        }
    }
    
    public void listarUsuario(ArrayList<String>privilegios,String id){
        for(Usuario i:listaUsuarios){
            
        }
    }
    
    public void modificarUsuarios(ArrayList<String>privilegios,String nombre,String nombreUsuarioNuevo,String contrasena,String nombrecompleto,ArrayList<String> privilegio,String rol,boolean status){
        boolean permitido=false;
        for(String comprobar:privilegios){
            if(comprobar.equals("Usuarios")){
                permitido=true;
            }
        }
        if(permitido==true){
            for(int cont=0;cont<listaUsuarios.size();cont++){
                if(listaUsuarios.get(cont).getUsername().equals(nombre)){
                    listaUsuarios.get(cont).setUsername(nombreUsuarioNuevo);
                    listaUsuarios.get(cont).setContrasena(contrasena);
                    listaUsuarios.get(cont).setNombreUser(nombrecompleto);
                    listaUsuarios.get(cont).setPrivilegios(privilegio);
                    listaUsuarios.get(cont).setRolUsuario(rol);
                    listaUsuarios.get(cont).setStatus(status);
                }
            }
        }
        else{
            JOptionPane.showInputDialog("EL USUARIO NO ESTA PERMITIDO");
        }
    }
    
    public void eliminarUsuarios(ArrayList<String>privilegios,String nombre){
        boolean permitido=false;
        for(String comprobar:privilegios){
            if(comprobar.equals("Usuarios")){
                permitido=true;
            }
        }
        if(permitido==true){
            for(int cont=0;cont<listaUsuarios.size();cont++){
                if(listaUsuarios.get(cont).getUsername().equals(nombre)){
                    listaUsuarios.remove(cont);
                }
            }
        }
        else{
            JOptionPane.showInputDialog("EL USUARIO NO ESTA PERMITIDO");
        }
    }
    
    public boolean iniciarSesion(String user,String contrasena){
        boolean permitirUser=false;
        boolean permitirPass=false;
        boolean retornar=false;
        for(int cont=0;cont<listaUsuarios.size();cont++){
            if(listaUsuarios.get(cont).getUsername().equals(user)){
                permitirUser=true;
            }
            if(listaUsuarios.get(cont).getContrasena().equals(contrasena)){
                permitirPass=true;
            }
        }
        if(permitirUser==true && permitirPass==true){
            retornar=true;
        }
        return retornar;
    }
}
