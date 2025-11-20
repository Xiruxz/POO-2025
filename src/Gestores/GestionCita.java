package Gestores;

import Clases.Cita;

public class GestionCita {

    private Cita[] citas;
    private int cantidad;

    public GestionCita(int maxCitas) {
        citas = new Cita[maxCitas];
        cantidad = 0;
    }

 
    public boolean agregar(Cita c) {
        if (cantidad < citas.length) {
            citas[cantidad] = c;
            cantidad++;
            return true;
        }
        return false;
    }


    public boolean modificar(Cita citaModificada) {
        for (int i = 0; i < cantidad; i++) {
            if (citas[i] == citaModificada || citas[i].equals(citaModificada)) {
                citas[i] = citaModificada;
                return true;
            }
        }
        return false;
    }

  
    public boolean eliminar(Cita cita) {
        for (int i = 0; i < cantidad; i++) {
            if (citas[i] == cita || citas[i].equals(cita)) {
                for (int j = i; j < cantidad - 1; j++) {
                    citas[j] = citas[j + 1];
                }
                citas[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    
    public void ver() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(citas[i]);
        }
    }

    // Getters
    public Cita[] getCitas() {
        return citas;
    }

    public int getCantidad() {
        return cantidad;
    }
}
