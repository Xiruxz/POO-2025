package Clases;

public class Enfermero extends Empleado {

    public Enfermero(String codigoEmpleado,
                     String dni, String nombres, String apellidos,
                     String telefono, String email) {

        super(codigoEmpleado, dni, nombres, apellidos, telefono, email);
    }

    @Override
    public String getTipoEmpleado() {
        return "ENFERMERO";
    }

    @Override
    public boolean tienePermiso(String accion) {
        return true;
    }
}
