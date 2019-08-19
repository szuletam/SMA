package agentes;

import jade.core.Agent;
import jade.core.behaviours.*;

public class AgenteGestionInformacion extends Agent{

	@Override
	protected void setup() {
        System.out.println("El agente: " + getAID().getName() + " esta corriendo.");
    }

	private class EsperarDatos extends CyclicBehaviour {

        @Override
        public void action() {
        }
    }

	private class EsperarConfirmacion extends CyclicBehaviour {

        @Override
        public void action() {
        }
    }


}
