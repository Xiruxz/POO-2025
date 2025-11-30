package Clases;

public class Medicamento {

    private String nombre;
    private String dosis;       
    private String frecuencia;  
    private int duracionDias;   
    private String via;         
    private double precio;      

    public Medicamento(String nombre,
                       String dosis,
                       String frecuencia,
                       int duracionDias,
                       String via,
                       double precio) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracionDias = duracionDias;
        this.via = via;
        this.precio = precio;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " " + dosis +
               " | " + frecuencia +
               " por " + duracionDias + " día(s)" +
               " | Vía: " + via;
    }
}
