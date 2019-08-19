package agentes;

import jade.content.ContentElement;
import jade.content.lang.Codec;
import jade.content.lang.Codec.CodecException;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.onto.UngroundedException;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import models.Paciente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import ontologia.*;

public class AgenteGestionInformacion extends Agent {

    private List<Paciente> pacientes = new ArrayList<Paciente>();
    private List<Paciente> nutricionistas = new ArrayList<Paciente>();
    private final Ontology ontologia = SaludOntology.getInstance();

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
        	AID id = new AID();
            id.setLocalName("AgenteInteraccion");
            MessageTemplate mt = MessageTemplate.and(
                    MessageTemplate.MatchSender(id),
                    MessageTemplate.MatchOntology(ontologia.getName()));
            ACLMessage msg = myAgent.receive(mt);
            if(msg != null) {
            	try {
					ContentElement contenido = getContentManager().extractContent(msg);
					BienvenidaEntregada bienvenidaEntregada = (BienvenidaEntregada) contenido;
					
					Bienvenida bienvenida = bienvenidaEntregada.getBienvenidaBE();
					
					System.out.println(bienvenida.getDescripcionBienvenida());
				} catch (UngroundedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CodecException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (OntologyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
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
