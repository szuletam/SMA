package ontologia;
import jade.content.Predicate;

public class InfoPosiblesEnfermedadesEntregada implements Predicate {
    private PosiblesEnfermedades posiblesEnfermedadesIPEE;

    public PosiblesEnfermedades getPosiblesEnfermedadesIPEE() {
        return posiblesEnfermedadesIPEE;
    }

    public void setPosiblesEnfermedadesIPEE(PosiblesEnfermedades posiblesEnfermedadesIPEE) {
        this.posiblesEnfermedadesIPEE = posiblesEnfermedadesIPEE;
    }
}
