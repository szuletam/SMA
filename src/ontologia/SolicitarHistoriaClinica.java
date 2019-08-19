package ontologia;
import jade.content.AgentAction;

public class SolicitarHistoriaClinica implements AgentAction {
    private Paciente pacienteSHC;

    public Paciente getPacienteSHC() {
        return pacienteSHC;
    }

    public void setPacienteSHC(Paciente pacienteSHC) {
        this.pacienteSHC = pacienteSHC;
    }
}
