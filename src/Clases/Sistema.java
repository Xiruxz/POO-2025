package Clases;

import Gestores.GestionPaciente;
import Gestores.GestionEmpleado;
import Gestores.GestionCita;
import Gestores.GestionConsulta;
import Gestores.GestionConsultorio;
import Gestores.GestionFactura;

public class Sistema {

    private GestionPaciente gestionPaciente;
    private GestionEmpleado gestionEmpleado;
    private GestionCita gestionCita;
    private GestionConsulta gestionConsulta;
    private GestionConsultorio gestionConsultorio;
    private GestionFactura gestionFactura;

    private Usuario[] usuarios;
    private int cantidadUsuarios;

    public Sistema(int maxPacientes,
                   int maxEmpleados,
                   int maxCitas,
                   int maxConsultas,
                   int maxConsultorios,
                   int maxFacturas,
                   int maxUsuarios) {

        this.gestionPaciente = new GestionPaciente(maxPacientes);
        this.gestionEmpleado = new GestionEmpleado(maxEmpleados);
        this.gestionCita = new GestionCita(maxCitas);
        this.gestionConsulta = new GestionConsulta(maxConsultas);
        this.gestionConsultorio = new GestionConsultorio(maxConsultorios);
        this.gestionFactura = new GestionFactura(maxFacturas);

        this.usuarios = new Usuario[maxUsuarios];
        this.cantidadUsuarios = 0;
    }

    //  USUARIOS 

    public boolean agregarUsuario(Usuario u) {
        if (cantidadUsuarios < usuarios.length) {
            usuarios[cantidadUsuarios] = u;
            cantidadUsuarios++;
            return true;
        }
        return false;
    }

    public Usuario buscarUsuario(String userName) {
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (usuarios[i].getUserName().equals(userName)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public Usuario login(String userName, String password) {
        for (int i = 0; i < cantidadUsuarios; i++) {
            if (usuarios[i].autenticar(userName, password)) {
                return usuarios[i];
            }
        }
        return null;
    }
    public Empleado buscarEmpleadoPorDni(String dni) {
    return gestionEmpleado.buscarEmpleadoPorDni(dni);
}

    // Getters de gestores (para que los usen Admin, Recepcionista, etc.)

    public GestionPaciente getGestionPaciente() {
        return gestionPaciente;
    }

    public GestionEmpleado getGestionEmpleado() {
        return gestionEmpleado;
    }

    public GestionCita getGestionCita() {
        return gestionCita;
    }

    public GestionConsulta getGestionConsulta() {
        return gestionConsulta;
    }

    public GestionConsultorio getGestionConsultorio() {
        return gestionConsultorio;
    }

    public GestionFactura getGestionFactura() {
        return gestionFactura;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }
}
