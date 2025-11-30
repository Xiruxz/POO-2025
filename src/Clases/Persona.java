    
package Clases;


public abstract class Persona {
    protected String dni;
    protected String nombres;
    protected String apellidos;
    protected String telefono;
    protected String email;
  //Constuctor
    public Persona(String dni, String nombres, String apellidos, String telefono, String email) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;      
}
//GETTERS AND SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres; 
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //FIN GETTERS AND SETTERS
    //METODOS
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }
    
    @Override
    public String toString() {
        return "DNI: " + dni +
               "\nNombre: " + getNombreCompleto() +
               "\nTeléfono: " + telefono +
               "\nEmail: " + email;
    }
}
