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
    public Empleado buscarEmpleadoPorDni(String dni) {
    for (int i = 0; i < cantidad; i++) {
        if (empleados[i].getDni().equals(dni)) {
            return empleados[i];
        }
    }
    return null;
}

    // +eliminar()  (por DNI)
// Archivo: GestionEmpleado.java

// Archivo: GestionEmpleado.java

public boolean eliminar(String dni) {
    // 1. Limpiamos el DNI que nos llega (debe ser el que ingresó el Administrador)
    String dniBuscado = dni.trim().toUpperCase(); 

    for (int i = 0; i < cantidad; i++) {
        
        // 2. Comparamos el DNI GUARDADO (también limpio y en MAYÚSCULAS) contra el buscado
        // Al usar toUpperCase() forzamos que no haya diferencia entre 'a' y 'A' ni problemas de codificación.
        if (empleados[i] != null && empleados[i].getDni().trim().toUpperCase().equals(dniBuscado)) { 
            
            // 3. Lógica para mover los elementos del arreglo (la eliminación física)
            for (int j = i; j < cantidad - 1; j++) {
                empleados[j] = empleados[j + 1];
            }
            
            // 4. Limpiamos la última posición y reducimos el contador
            empleados[cantidad - 1] = null;
            cantidad--;
            return true; // Éxito: Encontrado y eliminado
        }
    }
    return false; // Fracaso: No se encontró
}
    // Getters de apoyo
    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getCantidad() {
        return cantidad;
    }
}
