package Clases;

public class Orden {

    private String codigo;
    private String tipo;        
    private String descripcion;
    private double precio;
    private String estado;      

    private Consulta consulta;

    public Orden(String codigo,
                 String tipo,
                 String descripcion,
                 double precio,
                 Consulta consulta) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.consulta = consulta;
        this.estado = "PENDIENTE";
    }

    // Cambios de estado
    public void marcarEnProceso() {
        this.estado = "EN_PROCESO";
    }

    public void marcarConResultado() {
        this.estado = "CON_RESULTADO";
    }

    public void marcarEntregado() {
        this.estado = "ENTREGADO";
    }

    // Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Orden " + codigo +
               " | Tipo: " + tipo +
               " | Desc: " + descripcion +
               " | Precio: " + precio +
               " | Estado: " + estado;
    }
}
