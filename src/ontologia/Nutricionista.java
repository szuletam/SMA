package ontologia;
import jade.content.Concept;

public class Nutricionista implements Concept {
    private String cedulaNutricionista;
    private String nombreNutricionista;

    public String getCedulaNutricionista() {
        return cedulaNutricionista;
    }

    public void setCedulaNutricionista(String cedulaNutricionista) {
        this.cedulaNutricionista = cedulaNutricionista;
    }

    public String getNombreNutricionista() {
        return nombreNutricionista;
    }

    public void setNombreNutricionista(String nombreNutricionista) {
        this.nombreNutricionista = nombreNutricionista;
    }
}
