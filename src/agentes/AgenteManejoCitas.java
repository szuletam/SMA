package agentes;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPANames;
import jade.domain.DFService;
import jade.domain.FIPAException;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import jade.content.*;
import jade.content.lang.*;
import jade.content.lang.sl.*;
import jade.content.onto.*;

public class AgenteManejoCitas extends Agent{

	@Override
    protected void setup() {
        System.out.println("El agente: " + getAID().getName() + " esta corriendo.");
    }
	
}
