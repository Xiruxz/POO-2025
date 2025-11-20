package Clases;

public class Recepcionista extends Empleado {

    public Recepcionista(String codigoEmpleado,
                         String dni, String nombres, String apellidos,
                         String telefono, String email) {

        super(codigoEmpleado, dni, nombres, apellidos, telefono, email);
    }

    @Override
    public String getTipoEmpleado() {
        return "RECEPCIONISTA";
    }

    @Override
    public boolean tienePermiso(String accion) {
        // puedes limitar acciones si deseas
        return true;
    }
}
