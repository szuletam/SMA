package ontologia;
import jade.content.Concept;
public class Bienvenida implements Concept {
    private String descripcionBienvenida;

    public String getDescripcionBienvenida() {
        return descripcionBienvenida;
    }

    public void setDescripcionBienvenida(String descripcionBienvenida) {
        this.descripcionBienvenida = descripcionBienvenida;
    }
}
