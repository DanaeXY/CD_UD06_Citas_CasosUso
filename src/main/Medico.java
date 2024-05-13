package src.main;
public class Medico {
    String nombre;
    String apellidos;
    String numeroColegiado;
    String pacienteAsignado;
    public Medico() {
    }
    public Medico(String nombre, String apellidos, String numeroColegiado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
    }
    public Medico(String nombre, String apellidos, String numeroColegiado, String pacienteAsignado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
        this.pacienteAsignado = pacienteAsignado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNumeroColegiado() {
        return numeroColegiado;
    }
    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
    public String getPacienteAsignado() {
        return pacienteAsignado;
    }
    public void setPacienteAsignado(String pacienteAsignado) {
        this.pacienteAsignado = pacienteAsignado;
    }

    
}