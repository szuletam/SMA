package ontologia;
import jade.content.Predicate;

public class HistoriaClinicaActualizada implements Predicate {
    private HistoriaClinica historiaClinicaHCA;

    public HistoriaClinica getHistoriaClinicaHCA() {
        return historiaClinicaHCA;
    }

    public void setHistoriaClinicaHCA(HistoriaClinica historiaClinicaHCA) {
        this.historiaClinicaHCA = historiaClinicaHCA;
    }
}
