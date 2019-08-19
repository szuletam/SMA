package ontologia;
import jade.content.AgentAction;

public class SolicitarBienvenida implements AgentAction {
    private Paciente pacienteSB;

    public Paciente getPacienteSB() {
        return pacienteSB;
    }

    public void setPacienteSB(Paciente pacienteSB) {
        this.pacienteSB = pacienteSB;
    }
}
