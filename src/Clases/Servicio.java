        
package Clases;


public class Servicio {
   private String codigo;
   private String descripcion;
   private double precio;
   private String tipoServicio; 

    public Servicio(String codigo, String descripcion, double precio, String tipoServicio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoServicio = tipoServicio;
    }
 //  Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
   @Override
    public String toString() {
        return "Servicio {" +
                "\n  Código: " + codigo +
                "\n  Descripción: " + descripcion +
                "\n  Precio: " + precio +
                "\n  Tipo de Servicio: " + tipoServicio +
                "\n}";
    }   






}
