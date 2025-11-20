package Clases;

public class Cita {

    private String codigo;
    private String fechaHora;   
    private String estado;      
    private String modalidad;   
    private Paciente paciente;
    private Medico medico;
    private Consultorio consultorio;

    public Cita(String codigo,
                String fechaHora,
                String estado,
                Paciente paciente,
                Medico medico,
                Consultorio consultorio) {

        this.codigo = codigo;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.modalidad = "PRESENCIAL"; 
    }

   
    public Cita(String codigo,
                String fechaHora,
                String estado,
                String modalidad,
                Paciente paciente,
                Medico medico,
                Consultorio consultorio) {

        this.codigo = codigo;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.modalidad = modalidad;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

  
    public void confirmar() {
        this.estado = "CONFIRMADA";
    }

    public void marcarEnSala() {
        this.estado = "EN_SALA";
    }

    public void marcarAtendida() {
        this.estado = "ATENDIDA";
    }

    public void cancelar() {
        this.estado = "CANCELADA";
    }

    public void marcarNoShow() {
        this.estado = "NO_SHOW";
    }

    // Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public String toString() {
        return "Cita " + codigo +
               "\nFecha/Hora: " + fechaHora +
               "\nModalidad: " + modalidad +
               "\nEstado: " + estado +
               "\nPaciente: " + (paciente != null ? paciente.getNombreCompleto() : "N/A") +
               "\nMédico: " + (medico != null ? medico.getNombreCompleto() : "N/A") +
               "\nConsultorio: " + (consultorio != null ? consultorio.getCodigo() : "N/A");
    }
}
