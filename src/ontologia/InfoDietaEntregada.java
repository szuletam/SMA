package ontologia;
import jade.content.Predicate;

public class InfoDietaEntregada implements Predicate {
    private Dieta dietaIDE;

    public Dieta getDietaIDE() {
        return dietaIDE;
    }

    public void setDietaIDE(Dieta dietaIDE) {
        this.dietaIDE = dietaIDE;
    }
}
