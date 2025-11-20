package Clases;

public class Consultorio {

    private String codigo;
    private String especialidad;
    private String estado; // "DISPONIBLE", "OCUPADO", "MANTENIMIENTO"

    // Constructor
    public Consultorio(String codigo, String especialidad, String estado) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    // Cambiar estado (por ejemplo, de DISPONIBLE a OCUPADO)
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Consultorio " + codigo +
               " | Especialidad: " + especialidad +
               " | Estado: " + estado;
    }
}
