package Clases;

public class DetalleFactura {

    private int cantidad;
    private double subtotal;
    private Servicio servicio;

    public DetalleFactura(int cantidad, Servicio servicio) {
        this.cantidad = cantidad;
        this.servicio = servicio;
        this.subtotal = cantidad * servicio.getPrecio();  // se calcula solo
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = cantidad * servicio.getPrecio();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
        this.subtotal = cantidad * servicio.getPrecio();
    }

    @Override
    public String toString() {
        return "DetalleFactura {" +
               "\n  Servicio: " + servicio.getDescripcion() +
               "\n  Cantidad: " + cantidad +
               "\n  Subtotal: " + subtotal +
               "\n}";
    }
}
