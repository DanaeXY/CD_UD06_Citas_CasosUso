package src.main;

// Clase principal que simula la interacción del usuario con la aplicación
public class AplicacionSalud {
    public static void main(String[] args) {
        //TODO: addMedicos 
        Medico doctor1 = new Medico();
        Medico doctor2 = new Medico("Natalia", "Fernández Díaz", "25638", "Oncología");
        Medico doctor3 = new Medico("Jose Manuel", "Cabezas Gutierrez", "55362", "Endocrinología", "2233");

        System.out.println(doctor3.toString());

        // Simulando el registro de usuario
        RegistroUsuario registro = new RegistroUsuario();
        registro.registrarUsuario("usuario1", "contraseña1");

        // Simulando el inicio de sesión
        if (registro.verificarCredenciales("usuario1", "contraseña1")) {
            // Simulando las funcionalidades de consulta médica
            GestionMedicos consulta = new GestionMedicos();
            
           
            
            consulta.buscarEspecialistas("Cardiología");
            consulta.verRecetas("Paciente1");
            consulta.generarInforme("Paciente1");

            // Simulando las funcionalidades de citas médicas
            CitasMedicas citas = new CitasMedicas();
            citas.agendarCita("2024-05-01 10:00");
            citas.verCalendario();
            citas.cancelarCita("2024-05-01 10:00");
            citas.reprogramarCita("2024-05-02 09:00", "2024-05-02 10:00");

            // Simulando las funcionalidades de administración
            Administracion admin = new Administracion();
            admin.gestionarPersonalMedico();
            admin.gestionarPacientes();
            admin.gestionarRecetas();
            admin.gestionarEspecialidades();
        }
    }
}
