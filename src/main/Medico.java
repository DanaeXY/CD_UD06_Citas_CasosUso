package src.main;
public class Medico {
    String nombre;
    String apellidos;
    String numeroColegiado;
    String especialidad;
    String pacienteAsignado;
    public Medico() {
    }
    
    public Medico(String nombre, String apellidos, String numeroColegiado, String especialidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
        this.especialidad = especialidad;
    }

    
    public Medico(String nombre, String apellidos, String numeroColegiado, String especialidad,
            String pacienteAsignado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroColegiado = numeroColegiado;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [nombre: " + getNombre() + ", apellidos: " + getApellidos() + ", con número de colegiado: "
                + getNumeroColegiado() + ", tiene el paciente asignado num.: " + getPacienteAsignado() + ", en la especialidad: "
                + getEspecialidad() + "]";
    }

    
    
}