package Clases;

public class Cajero extends Empleado {

    public Cajero(String codigoEmpleado,
                  String dni, String nombres, String apellidos,
                  String telefono, String email) {

        super(codigoEmpleado, dni, nombres, apellidos, telefono, email);
    }

    @Override
    public String getTipoEmpleado() {
        return "CAJERO";
    }

    @Override
    public boolean tienePermiso(String accion) {
        return true;
    }
}
