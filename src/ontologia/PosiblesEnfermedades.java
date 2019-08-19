package ontologia;
import jade.content.Concept;

public class PosiblesEnfermedades implements Concept {
    private String descripcionPE;
    private Paciente pacientePE;

    public String getDescripcionPE() {
        return descripcionPE;
    }

    public void setDescripcionPE(String descripcionPE) {
        this.descripcionPE = descripcionPE;
    }

    public Paciente getPacientePE() {
        return pacientePE;
    }

    public void setPacientePE(Paciente pacientePE) {
        this.pacientePE = pacientePE;
    }
}
