package Clases;

public class Medico extends Empleado {

    private String especialidad;

    public Medico(String codigoEmpleado,
                  String dni, String nombres, String apellidos,
                  String telefono, String email,
                  String especialidad) {

        super(codigoEmpleado, dni, nombres, apellidos, telefono, email);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String getTipoEmpleado() {
        return "MEDICO";
    }

    @Override
    public boolean tienePermiso(String accion) {
        // Aquí podrías evaluar acciones específicas
        return true;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nEspecialidad: " + especialidad;
    }
}
