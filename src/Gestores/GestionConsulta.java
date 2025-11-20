package Gestores;

import Clases.Consulta;
import Clases.Cita;

public class GestionConsulta {

    private Consulta[] consultas;
    private int cantidad;

    public GestionConsulta(int maxConsultas) {
        consultas = new Consulta[maxConsultas];
        cantidad = 0;
    }

   
    public boolean agregar(Consulta c) {
        if (cantidad < consultas.length) {
            consultas[cantidad] = c;
            cantidad++;
            return true;
        }
        return false;
    }

   
    public boolean modificar(Consulta consultaModificada) {
        for (int i = 0; i < cantidad; i++) {
            if (consultas[i] == consultaModificada || consultas[i].equals(consultaModificada)) {
                consultas[i] = consultaModificada;
                return true;
            }
        }
        return false;
    }

  
    public boolean eliminar(Consulta consulta) {
        for (int i = 0; i < cantidad; i++) {
            if (consultas[i] == consulta || consultas[i].equals(consulta)) {
                for (int j = i; j < cantidad - 1; j++) {
                    consultas[j] = consultas[j + 1];
                }
                consultas[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

   
    public Consulta buscar(Cita cita) {
        for (int i = 0; i < cantidad; i++) {
            if (consultas[i].getCita() == cita || consultas[i].getCita().equals(cita)) {
                return consultas[i];
            }
        }
        return null;
    }

  
    public Consulta[] getConsultas() {
        return consultas;
    }

    public int getCantidad() {
        return cantidad;
    }
}
