package Clases;

public class Consulta {
    private String codigoConsulta;
    private String motivo;
    private String antecedentes;
    private String signosVitales;
    private String examenFisico;
    private String diagnostico;
    private String plan;
    private String estado;   
    private double precio;
    private Cita cita;

    public Consulta(String codigoConsulta,
                    String motivo,
                    String antecedentes,
                    String signosVitales,
                    String examenFisico,
                    String diagnostico,
                    String plan,
                    double precio,
                    Cita cita) {

        this.codigoConsulta = codigoConsulta;
        this.motivo = motivo;
        this.antecedentes = antecedentes;
        this.signosVitales = signosVitales;
        this.examenFisico = examenFisico;
        this.diagnostico = diagnostico;
        this.plan = plan;
        this.precio = precio;
        this.cita = cita;
        this.estado = "ABIERTA"; 
    }

  
    public void abrir() {
        this.estado = "ABIERTA";
    }

    public void cerrar() {
        this.estado = "CERRADA";
    }

    // Getters y setters

    public String getCodigoConsulta() {
        return codigoConsulta;
    }

    public void setCodigoConsulta(String codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(String signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   
    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        return "Consulta " + codigoConsulta +
               "\nMotivo: " + motivo +
               "\nDiagnóstico: " + diagnostico +
               "\nPlan: " + plan +
               "\nEstado: " + estado +
               "\nPrecio: " + precio;
    }
}
