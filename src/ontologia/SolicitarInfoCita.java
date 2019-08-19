package ontologia;
import jade.content.AgentAction;

public class SolicitarInfoCita implements AgentAction {
    private Paciente pacienteSIC;

    public Paciente getPacienteSIC() {
        return pacienteSIC;
    }

    public void setPacienteSIC(Paciente pacienteSIC) {
        this.pacienteSIC = pacienteSIC;
    }
}
