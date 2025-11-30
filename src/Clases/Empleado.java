package Clases;

public abstract class Empleado extends Persona {

    protected String codigoEmpleado;
    public Empleado(String codigoEmpleado,
                    String dni, String nombres, String apellidos,
                    String telefono, String email) {
        super(dni, nombres, apellidos, telefono, email);
        this.codigoEmpleado = codigoEmpleado;
    }

    public abstract boolean tienePermiso(String accion);
    public abstract String getTipoEmpleado();
     
    // Getters y Setters
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCódigo empleado: " + codigoEmpleado;
    }
   

}

