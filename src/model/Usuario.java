package model;

import java.util.ArrayList;
import java.util.UUID;

public class Usuario {
    private String username;
    private String contrasena;
    private String nombreUser;
    private ArrayList<String> privilegios;
    private String rolUsuario;
    private boolean status;
    private String id;

    public static final String generarUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    
    public Usuario(String username, String contrasena, String nombreUser, ArrayList<String> privilegios, String rolUsuario, boolean status) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombreUser = nombreUser;
        this.privilegios = privilegios;
        this.rolUsuario = rolUsuario;
        this.status = status;
        this.id=generarUUID();
    }

    public String getUsername() {
        return username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public ArrayList<String> getPrivilegios() {
        return privilegios;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPrivilegios(ArrayList<String> privilegios) {
        this.privilegios = privilegios;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }
       
}
