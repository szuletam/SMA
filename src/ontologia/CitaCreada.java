package ontologia;
import jade.content.Predicate;

public class CitaCreada implements Predicate {
    private Cita citaCCR;

    public Cita getCitaCCR() {
        return citaCCR;
    }

    public void setCitaCCR(Cita citaCCR) {
        this.citaCCR = citaCCR;
    }
}
