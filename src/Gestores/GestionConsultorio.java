package Gestores;

import Clases.Consultorio;

public class GestionConsultorio {

    private Consultorio[] consultorios;
    private int cantidad;

    public GestionConsultorio(int maxConsultorios) {
        consultorios = new Consultorio[maxConsultorios];
        cantidad = 0;
    }

    // +agregar()
    public boolean agregar(Consultorio c) {
        if (cantidad < consultorios.length) {
            consultorios[cantidad] = c;
            cantidad++;
            return true;
        }
        return false;
    }

    // +modificar() (se busca por código)
    public boolean modificar(Consultorio consultorioModificado) {
        for (int i = 0; i < cantidad; i++) {
            if (consultorios[i].getCodigo().equals(consultorioModificado.getCodigo())) {
                consultorios[i] = consultorioModificado;
                return true;
            }
        }
        return false;
    }

    // +eliminar() (por código)
    public boolean eliminar(String codigo) {
        for (int i = 0; i < cantidad; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {
                for (int j = i; j < cantidad - 1; j++) {
                    consultorios[j] = consultorios[j + 1];
                }
                consultorios[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    // +ver()
    public void ver() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(consultorios[i]);
        }
    }

    // Getters
    public Consultorio[] getConsultorios() {
        return consultorios;
    }

    public int getCantidad() {
        return cantidad;
    }
}
