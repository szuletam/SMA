package ontologia;
import jade.content.AgentAction;
public class ActualizarHistoriaClinica implements AgentAction {
    private HistoriaClinica historiaClinicaAHC;

    public HistoriaClinica getHistoriaClinicaAHC() {
        return historiaClinicaAHC;
    }

    public void setHistoriaClinicaAHC(HistoriaClinica historiaClinicaAHC) {
        this.historiaClinicaAHC = historiaClinicaAHC;
    }
}
