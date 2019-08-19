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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import jade.content.*;
import jade.content.lang.*;
import jade.content.lang.sl.*;
import jade.content.onto.*;
import utils.Console;
import utils.Messages;
import ontologia.*;

public class AgenteInteraccion extends Agent {
	
	private DFAgentDescription[] resultados;
	private final Codec codec = new SLCodec();
    private final Ontology ontologia = SaludOntology.getInstance();
    private final Scanner entrada = new Scanner(System.in);

	@Override
    protected void setup() {
        try {
            DFAgentDescription dfd = new DFAgentDescription();
            dfd.setName(getAID());
            ServiceDescription sd = new ServiceDescription();
            sd.setType("Interaccion");
            sd.setName("Mostrar informacion de usuario");

            ServiceDescription sd1 = new ServiceDescription();
            sd1.setType("Interaccion");
            sd1.setName("Entregar informacion de posibles enfermedades");
            
            ServiceDescription sd2 = new ServiceDescription();
            sd2.setType("Interaccion");
            sd2.setName("Entregar informacion de las citas");

            dfd.addServices(sd);
            dfd.addServices(sd1);
            dfd.addServices(sd2);

            DFService.register(this, dfd);
        } catch (FIPAException e) {
        }
        try {
        	buscarAgentePorServicio();
        } catch (FIPAException ex) {
            Logger.getLogger(AgenteInteraccion.class.getName()).log(Level.SEVERE, null, ex);
        }

        getContentManager().registerLanguage(codec);
        getContentManager().registerOntology(ontologia);
        this.addBehaviour(new Login());
        this.addBehaviour(new Menu());
    }

    public void buscarAgentePorServicio() throws FIPAException {
        DFAgentDescription descripcion = new DFAgentDescription();
        // Todas las descripciones que encajan con la plantilla proporcionada en el DF
        resultados = DFService.search(this, descripcion);
        if (resultados.length == 0) {
            System.out.println("Ningun agente ofrece el servicio deseado");
        } else {
            for (int i = 0; i < resultados.length; ++i) {
                System.out.println("El agente " + resultados[i].getName().getLocalName() + " ofrece los siguientes servicios:");
                Iterator servicios = resultados[i].getAllServices();
                int j = 1;
                while (servicios.hasNext()) {
                    ServiceDescription servicio = (ServiceDescription) servicios.next();
                    System.out.println(j + "- " + servicio.getName());
                    j++;
                }
            }
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
	 
	 private class Login extends OneShotBehaviour {
		 
		 @Override
		 public void action() {

			 System.out.println("Por favor ingrese su cédula:");
			 String cedulaEscrita;
			 cedulaEscrita = entrada.next();
			 
			 Bienvenida bienvenida = new Bienvenida();
			 bienvenida.setDescripcionBienvenida(cedulaEscrita);
			 
			 BienvenidaEntregada bienvenidaEntregada = new BienvenidaEntregada();
			 bienvenidaEntregada.setBienvenidaBE(bienvenida);
			 
			 ACLMessage mensaje = new ACLMessage();
            AID id = new AID();
            id.setLocalName("Gestionador");
            mensaje.addReceiver(id);
            mensaje.setLanguage(codec.getName());
            mensaje.setOntology(ontologia.getName());
            mensaje.setPerformative(ACLMessage.INFORM);
            try {
                getContentManager().fillContent(mensaje, bienvenidaEntregada);
                this.myAgent.send(mensaje);
                this.myAgent.addBehaviour(new Menu());
            } catch (Codec.CodecException | OntologyException ex) {
                Logger.getLogger(AgenteInteraccion.class.getName()).log(Level.SEVERE, null, ex);
            }
			 
		 }
	 }
	 
	 private class Menu extends OneShotBehaviour {

	        @Override
	        public void action() {
	            boolean bandera = false;
	            do {
	                System.out.println("Menu");
	                System.out.println("Opciones del profesor");
	                System.out.println("1. Crear unidad de conocimiento");
	                System.out.println("2. Crear pregunta de simulacro");
	                System.out.println("3. Crear pregunta de evaluacion");
	                System.out.println("4. Crear evalucion");
	                System.out.println("Opciones del estudiante");
	                System.out.println("5. Presentar un simulacro");
	                System.out.println("6. Presentar una evaluacion");
	                System.out.println("Ingrese una opcion");
	                int opcion;
	                opcion = entrada.nextInt();

	                switch (opcion) {
	                    case 1:
	                    	System.out.println("1. Crear unidad de conocimiento");
	                        break;
	                    case 2:
	                    	System.out.println("2. Crear pregunta de simulacro");
	                        break;
	                    case 3:
	                    	System.out.println("3. Crear pregunta de evaluacion");
	                        break;
	                    case 4:
	                    	System.out.println("4. Crear evalucion");
	                        break;
	                    case 5:
	                    	System.out.println("5. Presentar un simulacro");
	                        break;
	                    case 6:
	                    	System.out.println("6. Presentar una evaluacion");
	                        break;
	                    default:
	                        System.out.println("Ingrese un numero valido");
	                        bandera = true;
	                        break;
	                }
	            } while (bandera);
	        }
	    }
	
}
