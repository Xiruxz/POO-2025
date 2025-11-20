package Clases;

import Interfaces.Reporteable;

public class Factura implements Reporteable {

    private String numero;
    private String fecha;
    private double total;
    private String metodoPago;

    private Paciente paciente;
    private Cita cita;

    private DetalleFactura[] detalles;
    private int indice;

    public Factura(String numero, String fecha,
                   String metodoPago, Paciente paciente,
                   int capacidadDetalles) {

        this.numero = numero;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.paciente = paciente;
        this.detalles = new DetalleFactura[capacidadDetalles];
        this.indice = 0;
        this.total = 0;
        this.cita = null;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        if (indice < detalles.length) {
            detalles[indice] = detalle;
            indice++;
            calcularTotal();
        }
    }

    public void calcularTotal() {
        total = 0;
        for (int i = 0; i < indice; i++) {
            total += detalles[i].getSubtotal();
        }
    }

    @Override
    public String generarReporte(String criterio) {
        return "Reporte de Factura " + numero +
               "\nPaciente: " + paciente.getNombreCompleto() +
               "\nTotal: " + total +
               "\nMétodo de pago: " + metodoPago +
               "\nCriterio: " + criterio;
    }

    // Getters y setters

    public String getNumero() { return numero; }

    public void setNumero(String numero) { this.numero = numero; }

    public String getFecha() { return fecha; }

    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getTotal() { return total; }

    public String getMetodoPago() { return metodoPago; }

    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public Paciente getPaciente() { return paciente; }

    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Cita getCita() { return cita; }

    public void setCita(Cita cita) { this.cita = cita; }

    public DetalleFactura[] getDetalles() { return detalles; }

    @Override
    public String toString() {
        String texto = "Factura {" +
                       "\nNúmero: " + numero +
                       "\nFecha: " + fecha +
                       "\nMétodo pago: " + metodoPago +
                       "\nPaciente: " + paciente.getNombreCompleto() +
                       "\nDetalles:\n";

        for (int i = 0; i < indice; i++) {
            texto += detalles[i].toString() + "\n";
        }

        texto += "Total: " + total +
                 "\n}";

        return texto;
    }
}
