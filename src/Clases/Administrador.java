package Clases;

import Gestores.GestionEmpleado;
import Gestores.GestionConsultorio;
import Gestores.GestionConsulta;

public class Administrador extends Empleado {
   
    private GestionEmpleado gestionEmpleado;
    private GestionConsultorio gestionConsultorio;
    private GestionConsulta gestionConsulta;

    public Administrador(GestionEmpleado gestionEmpleado, GestionConsultorio gestionConsultorio, GestionConsulta gestionConsulta, String codigoEmpleado, String dni, String nombres, String apellidos, String telefono, String email) {
        super(codigoEmpleado, dni, nombres, apellidos, telefono, email);
        this.gestionEmpleado = gestionEmpleado;
        this.gestionConsultorio = gestionConsultorio;
        this.gestionConsulta = gestionConsulta;
    }
        
    @Override
    public boolean tienePermiso(String accion) {
        return true;
    }
    @Override
    public String getTipoEmpleado() {
        return "ADMINISTRADOR";
    }

    // EMPLEADOS 
    public boolean crearEmpleado(Empleado e) {
        return gestionEmpleado.agregar(e);
    }
    public boolean modificarEmpleado(Empleado empleadoModificado) {
        return gestionEmpleado.modificar(empleadoModificado);
    }
    public boolean eliminarEmpleado(String dni) {
        return gestionEmpleado.eliminar(dni);
    }

    // CONSULTORIOS 
public boolean registrarConsultorio(Consultorio c) {
    return gestionConsultorio.agregar(c);
}

public boolean modificarConsultorio(Consultorio consultorioModificado) {
    return gestionConsultorio.modificar(consultorioModificado);
}

public boolean eliminarConsultorio(String codigoConsultorio) {
    return gestionConsultorio.eliminar(codigoConsultorio);
}

    //  REPORTES
    public void generarReporteConsultorios() {
        Consultorio[] consultorios = gestionConsultorio.getConsultorios();
        int cantidad = gestionConsultorio.getCantidad();

        System.out.println("=== REPORTE DE CONSULTORIOS ===");
        for (int i = 0; i < cantidad; i++) {
            Consultorio c = consultorios[i];
            System.out.println(
                "Código: " + c.getCodigo() +
                " | Especialidad: " + c.getEspecialidad() +
                " | Estado: " + c.getEstado()
            );
        }
    }

 
   public void generarReporteMedicos() {
    Empleado[] empleados = gestionEmpleado.getEmpleados();
    int cantidad = gestionEmpleado.getCantidad();
    System.out.println("=== REPORTE DE MÉDICOS ===");
    for (int i = 0; i < cantidad; i++)  {
        if (empleados[i].getTipoEmpleado().equalsIgnoreCase("MEDICO")) {
            Medico m = (Medico) empleados[i]; 
            System.out.println(
                "DNI: " + m.getDni() +
                " | Nombre: " + m.getNombreCompleto() +
                " | Especialidad: " + m.getEspecialidad()
            );
        }
    }
}
    public void generarReporteIngresos() {
        Consulta[] consultas = gestionConsulta.getConsultas();
        int cantidad = gestionConsulta.getCantidad();
        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            total += consultas[i].getPrecio();
        }
        System.out.println("=== REPORTE DE INGRESOS ===");
        System.out.println("Total de ingresos por consultas: " + total);
    }
    

public GestionEmpleado getGestionEmpleado() {
        return gestionEmpleado;
    }

    public void setGestionEmpleado(GestionEmpleado gestionEmpleado) {
        this.gestionEmpleado = gestionEmpleado;
    }

    public GestionConsultorio getGestionConsultorio() {
        return gestionConsultorio;
    }

    public void setGestionConsultorio(GestionConsultorio gestionConsultorio) {
        this.gestionConsultorio = gestionConsultorio;
    }

    public GestionConsulta getGestionConsulta() {
        return gestionConsulta;
    }

    public void setGestionConsulta(GestionConsulta gestionConsulta) {
        this.gestionConsulta = gestionConsulta;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}

 

  

