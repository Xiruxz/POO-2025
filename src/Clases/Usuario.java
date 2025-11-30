package Clases;

import Interfaces.Autenticable;

public class Usuario implements Autenticable {

    private String userName;
    private String password;
    private String rol;        // ADMIN, MEDICO, CAJERO, etc.
    private Empleado empleado; // Empleado asociado a este usuario
    private boolean activo;

    // Constructor
    public Usuario(String userName, String password, String rol, Empleado empleado) {
        this.userName = userName;
        this.password = password;
        this.rol = rol;
        this.empleado = empleado;
        this.activo = true; // por defecto activo
    }

    // Implementación de Autenticable
    @Override
    public boolean autenticar(String userName, String password) {
        if (!activo) {
            return false;
        }
        return this.userName.equals(userName) && this.password.equals(password);
    }

    // Cambiar contraseña
    public void cambiarPassword(String nuevoPassword) {
        this.password = nuevoPassword;
    }

    // Activar / desactivar usuario
    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    // Getters y setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Usuario: " + userName +
               " | Rol: " + rol +
               " | Activo: " + activo +
               "\nEmpleado: " + (empleado != null ? empleado.getNombreCompleto() : "Sin empleado");
    }
}
