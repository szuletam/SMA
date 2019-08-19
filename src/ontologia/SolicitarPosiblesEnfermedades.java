package ontologia;
import jade.content.AgentAction;

public class SolicitarPosiblesEnfermedades implements AgentAction {
    private Paciente pacienteSPE;

    public Paciente getPacienteSPE() {
        return pacienteSPE;
    }

    public void setPacienteSPE(Paciente pacienteSPE) {
        this.pacienteSPE = pacienteSPE;
    }
}
