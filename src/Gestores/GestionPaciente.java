package Gestores;

import Clases.Paciente;

public class GestionPaciente {

    private Paciente[] pacientes;
    private int cantidad;

    public GestionPaciente(int maxPacientes) {
        pacientes = new Paciente[maxPacientes];
        cantidad = 0;
    }

    // +agregar()
    public boolean agregar(Paciente p) {
        if (cantidad < pacientes.length) {
            pacientes[cantidad] = p;
            cantidad++;
            return true;
        }
        return false;
    }

    // +modificar()  (se busca por DNI)
    public boolean modificar(Paciente pacienteModificado) {
        for (int i = 0; i < cantidad; i++) {
            if (pacientes[i].getDni().equals(pacienteModificado.getDni())) {
                pacientes[i] = pacienteModificado;
                return true;
            }
        }
        return false;
    }

    // +eliminar() (por DNI)
    public boolean eliminar(String dni) {
        for (int i = 0; i < cantidad; i++) {
            if (pacientes[i].getDni().equals(dni)) {
                for (int j = i; j < cantidad - 1; j++) {
                    pacientes[j] = pacientes[j + 1];
                }
                pacientes[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    // +ver()
    public void ver() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(pacientes[i]);
        }
    }

    // Getters
    public Paciente[] getPacientes() {
        return pacientes;
    }

    public int getCantidad() {
        return cantidad;
    }
}
