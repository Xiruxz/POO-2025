package Clases;

public class Receta {

    private String codigo;
    private Medicamento[] medicamentos;
    private int cantidad;
    private Consulta consulta;

    public Receta(String codigo, int maxMedicamentos, Consulta consulta) {
        this.codigo = codigo;
        this.medicamentos = new Medicamento[maxMedicamentos];
        this.cantidad = 0;
        this.consulta = consulta;
    }

    public boolean agregarMedicamento(Medicamento m) {
        if (cantidad < medicamentos.length) {
            medicamentos[cantidad] = m;
            cantidad++;
            return true;
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }

    public Medicamento[] getMedicamentos() {
        return medicamentos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    @Override
    public String toString() {
        return "Receta " + codigo +
               " | Consulta: " + (consulta != null ? consulta.getCodigoConsulta() : "N/A") +
               " | Nº medicamentos: " + cantidad;
    }
}
    