package ontologia;
import jade.content.AgentAction;

public class SolicitarPaciente implements AgentAction {
    private String cedulaSP;

    public String getCedulaSP() {
        return cedulaSP;
    }

    public void setCedulaSP(String cedulaSP) {
        this.cedulaSP = cedulaSP;
    }
}
