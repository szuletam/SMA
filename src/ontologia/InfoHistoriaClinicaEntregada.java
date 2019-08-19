package ontologia;
import jade.content.Predicate;

public class InfoHistoriaClinicaEntregada implements Predicate {
    private HistoriaClinica historiaClinicaIHCE;

    public HistoriaClinica getHistoriaClinicaIHCE() {
        return historiaClinicaIHCE;
    }

    public void setHistoriaClinicaIHCE(HistoriaClinica historiaClinicaIHCE) {
        this.historiaClinicaIHCE = historiaClinicaIHCE;
    }
}
