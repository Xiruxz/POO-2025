package Gestores;

import Clases.Factura;
import Clases.Cita;
import Clases.Servicio;
import Clases.DetalleFactura;

public class GestionFactura {

    private Factura[] facturas;
    private int cantidad;

    public GestionFactura(int maxFacturas) {
        facturas = new Factura[maxFacturas];
        cantidad = 0;
    }

    // +crearFactura()
    // (similar a lo que hacías en tu antigua clase Clinica)
    public Factura crearFactura(Cita cita, Servicio[] servicios, String metodoPago) {
        if (cantidad >= facturas.length) {
            return null;
        }

        String numero = "FAC-" + (cantidad + 1);
        String fecha = cita.getFechaHora(); // ajusta si tu Cita tiene otro método

        Factura factura = new Factura(
                numero,
                fecha,
                metodoPago,
                cita.getPaciente(),
                servicios.length
        );

        factura.setCita(cita);

        for (int i = 0; i < servicios.length; i++) {
            DetalleFactura det = new DetalleFactura(1, servicios[i]);
            factura.agregarDetalle(det);
        }

        facturas[cantidad] = factura;
        cantidad++;

        return factura;
    }

    // +eliminarFactura()
    public boolean eliminarFactura(Factura factura) {
        for (int i = 0; i < cantidad; i++) {
            if (facturas[i] == factura || facturas[i].equals(factura)) {
                for (int j = i; j < cantidad - 1; j++) {
                    facturas[j] = facturas[j + 1];
                }
                facturas[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    // Getters
    public Factura[] getFacturas() {
        return facturas;
    }

    public int getCantidad() {
        return cantidad;
    }
}
