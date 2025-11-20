package Gestores;

import Clases.Empleado;

public class GestionEmpleado {

    private Empleado[] empleados;
    private int cantidad;

    public GestionEmpleado(int maxEmpleados) {
        empleados = new Empleado[maxEmpleados];
        cantidad = 0;
    }

    // +agregar()
    public boolean agregar(Empleado e) {
        if (cantidad < empleados.length) {
            empleados[cantidad] = e;
            cantidad++;
            return true;
        }
        return false;
    }

    // +modificar()  (se busca por DNI)
    public boolean modificar(Empleado empleadoModificado) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDni().equals(empleadoModificado.getDni())) {
                empleados[i] = empleadoModificado;
                return true;
            }
        }
        return false;
    }

    // +eliminar()  (por DNI)
    public boolean eliminar(String dni) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDni().equals(dni)) {
                for (int j = i; j < cantidad - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }
                empleados[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    // +ver()
    public void ver() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(empleados[i]);
        }
    }

    // Getters de apoyo
    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getCantidad() {
        return cantidad;
    }
}
