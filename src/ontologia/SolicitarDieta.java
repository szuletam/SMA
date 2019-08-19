package ontologia;
import jade.content.AgentAction;

public class SolicitarDieta implements AgentAction {
    private Paciente pacienteSD;

    public Paciente getPacienteSD() {
        return pacienteSD;
    }

    public void setPacienteSD(Paciente pacienteSD) {
        this.pacienteSD = pacienteSD;
    }
}
