
package Clases;


public class Paciente extends Persona  {
    private int anioNacimiento;          
    private String sexo;
    private String direccion;
    private String contactoEmergencia;
    public Paciente(String dni, String nombres, String apellidos,
                    String telefono, String email,
                    int anioNacimiento, String sexo,
                    String direccion, String contactoEmergencia) {

        super(dni, nombres, apellidos, telefono, email);
        this.anioNacimiento = anioNacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.contactoEmergencia = contactoEmergencia;
    }
        // Método para calcular edad
    public int calcularEdad() {
        int anioActual = 2025; 
        return anioActual - anioNacimiento;
    }
    //  Getters y Setters 
    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }
            
    
    @Override
    public String toString() {
        return super.toString() +
               "\nAño de nacimiento: " + anioNacimiento +
               "\nEdad aproximada: " + calcularEdad() +
               "\nSexo: " + sexo +
               "\nDirección: " + direccion +
               "\nContacto de emergencia: " + contactoEmergencia;
    }
    
}
