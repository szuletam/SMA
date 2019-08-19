package ontologia;
import jade.content.Predicate;

public class InfoPacienteEntregada implements Predicate {
    private Paciente pacienteIPE;

    public Paciente getPacienteIPE() {
        return pacienteIPE;
    }

    public void setPacienteIPE(Paciente pacienteIPE) {
        this.pacienteIPE = pacienteIPE;
    }
}
