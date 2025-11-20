package Clases;

public class HistoriaClinica {

    private Paciente paciente;
    private Consulta[] consultas;
    private int cantidad;

    public HistoriaClinica(Paciente paciente, int maxConsultas) {
        this.paciente = paciente;
        this.consultas = new Consulta[maxConsultas];
        this.cantidad = 0;
    }

    public boolean agregarConsulta(Consulta c) {
        if (cantidad < consultas.length) {
            consultas[cantidad] = c;
            cantidad++;
            return true;
        }
        return false;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Consulta[] getConsultas() {
        return consultas;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Historia Clínica de: " +
               (paciente != null ? paciente.getNombreCompleto() : "Sin paciente") +
               " | Número de consultas: " + cantidad;
    }
}
