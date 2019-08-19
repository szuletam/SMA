package agentes;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.*;
import models.Paciente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AgenteGestionInformacion extends Agent {

    private List<Paciente> pacientes = new ArrayList<Paciente>();
    private List<Paciente> nutricionistas = new ArrayList<Paciente>();

	@Override
	protected void setup() {
        pacientes.add(new Paciente(12345678L, "Sleyder Zuleta"));
        pacientes.add(new Paciente(87654321L, "Angel Machado"));
        nutricionistas.add(new Paciente(12345678L, "Sebastian Nino"));
        System.out.println("El agente: " + getAID().getName() + " esta corriendo.");
        this.addBehaviour(new BuscarCeluda());
    }

	private class BuscarCeluda extends SimpleBehaviour {

	    private boolean completed = false;

        @Override
        public void action() {

        }

        @Override
        public boolean done() {
            return completed;
        }
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
