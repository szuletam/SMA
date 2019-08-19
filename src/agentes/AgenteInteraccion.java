package agentes;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPANames;
import jade.domain.DFService;
import jade.domain.FIPAException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jade.content.*;
import jade.content.lang.*;
import jade.content.lang.sl.*;
import jade.content.onto.*;
import utils.Console;
import utils.Messages;

public class AgenteInteraccion extends Agent {
	
	private DFAgentDescription[] resultados;

	@Override
	public void setup() {
		System.out.println("El agente: " + getAID().getName() + " esta corriendo.");
		Long cedula = Console.getLongFromConsole("Digíte su cedula");
		ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
		msg.addReceiver(new AID(Messages.SEARCH_ID_FOR_WELCOME, AID.ISLOCALNAME));
		msg.setContent(cedula.toString());
	}
	
	 public void buscarAgentesPorServicio() throws FIPAException {
	        ServiceDescription servicio = new ServiceDescription();
	        servicio.setType("Gestionador");
	        servicio.setName("Gestionar informacion del paciente");

	        // Plantilla de descripción que busca el agente
	        DFAgentDescription descripcion = new DFAgentDescription();
	        DFAgentDescription descripcion2 = new DFAgentDescription();

	        // Servicio que busca el agente
	        descripcion.addServices(servicio);

	        ServiceDescription servicio2 = new ServiceDescription();
	        servicio2.setType("Diagnostico");
	        servicio2.setName("Realizar diagnostico");

	        descripcion2.addServices(servicio2);

	        // Todas las descripciones que encajan con la plantilla proporcionada en el DF
	        resultados = DFService.search(this, descripcion);

	        if (resultados.length == 0) {
	            System.out.println("Ningun agente ofrece el servicio deseado");
	        }
	    }
	
	 private class BienvenidaPersonalizada extends OneShotBehaviour {

	        @Override
	        public void action() {
	        }

	    }
	 
	 private class SolicitarDieta extends OneShotBehaviour {

	        @Override
	        public void action() {
	        }

	    }
	 
	 private class EsperarInformacion extends CyclicBehaviour {

	        @Override
	        public void action() {
			}
	    }
	
}
