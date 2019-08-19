package ontologia;
import jade.content.Predicate;

public class InfoCitaEntregada implements Predicate {
    private Cita citaICE;

    public Cita getCitaICE() {
        return citaICE;
    }

    public void setCitaICE(Cita citaICE) {
        this.citaICE = citaICE;
    }
}
