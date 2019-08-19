package ontologia;
import jade.content.Concept;

public class Cita implements Concept {
    private String descripcionCita;
    private Nutricionista nutricionistaCita;
    private Paciente pacienteCita;

    public String getDescripcionCita() {
        return descripcionCita;
    }

    public void setDescripcionCita(String descripcionCita) {
        this.descripcionCita = descripcionCita;
    }

    public Nutricionista getNutricionistaCita() {
        return nutricionistaCita;
    }

    public void setNutricionistaCita(Nutricionista nutricionistaCita) {
        this.nutricionistaCita = nutricionistaCita;
    }

    public Paciente getPacienteCita() {
        return pacienteCita;
    }

    public void setPacienteCita(Paciente pacienteCita) {
        this.pacienteCita = pacienteCita;
    }
}
