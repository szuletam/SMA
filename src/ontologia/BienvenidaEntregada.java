package ontologia;
import jade.content.Predicate;
public class BienvenidaEntregada implements Predicate {
    private Bienvenida bienvenidaBE;

    public Bienvenida getBienvenidaBE() {
        return bienvenidaBE;
    }

    public void setBienvenidaBE(Bienvenida bienvenidaBE) {
        this.bienvenidaBE = bienvenidaBE;
    }
}
