package ontologia;
import jade.content.Concept;

public class Paciente implements Concept {
    private String cedulaPaciente;
    private String nombrePaciente;
    private Dieta dietaPaciente;
    private HistoriaClinica historiaClinicaPaciente;

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public Dieta getDietaPaciente() {
        return dietaPaciente;
    }

    public void setDietaPaciente(Dieta dietaPaciente) {
        this.dietaPaciente = dietaPaciente;
    }

    public HistoriaClinica getHistoriaClinicaPaciente() {
        return historiaClinicaPaciente;
    }

    public void setHistoriaClinicaPaciente(HistoriaClinica historiaClinicaPaciente) {
        this.historiaClinicaPaciente = historiaClinicaPaciente;
    }
}
