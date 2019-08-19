package ontologia;

import jade.content.onto.*;
import jade.content.schema.*;

public class SaludOntology extends Ontology {

    public static final String ONTOLOGY_NAME = "ontología de salud";

    //Bienvenida
    public static final String BIENVENIDA = "Bienvenida";
    public static final String BIENVENIDA_DESCRIPCION_BIENVENIDA = "descripcionBienvenida";


    //Cita
    public static final String CITA = "Cita";
    public static final String CITA_DESCRIPCION_CITA = "descripcionCita";
    public static final String CITA_NUTRICIONISTA_CITA = "nutricionistaCita";
    public static final String CITA_PACIENTE_CITA = "pacienteCita";

    //Dieta
    public static final String DIETA = "Dieta";
    public static final String DIETA_DESCRIPCION_DIETA = "descripcionDieta";

    //HistoriaClinica
    public static final String HISTORIA_CLINICA = "HistoriaClinica";
    public static final String HISTORIA_CLINICA_DESCRIPCION_HISTORIA_CLINICA = "descripcionHistoriaClinica";

    //Nutricionista
    public static final String NUTRICIONISTA = "Nutricionista";
    public static final String NUTRICIONISTA_CEDULA_NUTRICIONISTA = "cedulaNutricionista";
    public static final String NUTRICIONISTA_NOMBRE_NUTRICIONISTA = "nombreNutricionista";

    //Paciente
    public static final String PACIENTE = "Paciente";
    public static final String PACIENTE_CEDULA_PACIENTE = "cedulaPaciente";
    public static final String PACIENTE_NOMBRE_PACIENTE = "nombrePaciente";
    public static final String PACIENTE_HISTORIA_CLINICA_PACIENTE = "historiaClinicaPaciente";


    //PosiblesEnfermedades
    public static final String POSIBLES_ENFERMEDADES = "PosiblesEnfermedades";
    public static final String POSIBLES_ENFERMEDADES_DESCRIPCIONPE = "descripcionPE";
    public static final String POSIBLES_ENFERMEDADES_PACIENTEPE = "pacientePE";

    //BienvenidaEntregada
    public static final String BIENVENIDA_ENTREGADA = "BienvenidaEntregada";
    public static final String BIENVENIDA_ENTREGADA_BIENVENIDABE = "bienvenidaBE";

    //CitaCreada
    public static final String CITA_CREADA = "CitaCreada";
    public static final String CITA_CREADA_CITACCR = "citaCCR";


    //HistoriaClinicaActualizada
    public static final String HISTORIA_CLINICA_ACTUALIZADA = "HistoriaClinicaActualizada";
    public static final String HISTORIA_CLINICA_ACTUALIZADA_HISTORIA_CLINICAHCA = "historiaClinicaHCA";

    //InfoCitaEntregada
    public static final String INFO_CITA_ENTREGADA = "InfoCitaEntregada";
    public static final String INFO_CITA_ENTREGADA_CITAICE = "citaICE";

    //InfoDietaEntregada
    public static final String INFO_DIETA_ENTREGADA = "InfoDietaEntregada";
    public static final String INFO_DIETA_ENTREGADA_DIETAIDE = "dietaIDE";


    //InfoHistoriaClinicaEntregada
    public static final String INFO_HISTORIA_CLINICA_ENTREGADA = "InfoHistoriaClinicaEntregada";
    public static final String INFO_HISTORIA_CLINICA_ENTREGADA_HISTORIA_CLINICAIHCE = "historiaClinicaIHCE";


    //InfoPacienteEntregada
    public static final String INFO_PACIENTE_ENTREGADA = "InfoPacienteEntregada";
    public static final String INFO_PACIENTE_ENTREGADA_PACIENTEIPE = "pacienteIPE";

    //InfoPosiblesEnfermedadesEntregada
    public static final String INFO_POSIBLES_ENFERMEDADES_ENTREGADA = "InfoPosiblesEnfermedadesEntregada";
    public static final String INFO_POSIBLES_ENFERMEDADES_ENTREGADA_POSIBLES_ENFERMEDADES_ENTREGADAIPEE = "posiblesEnfermedadesIPEE";


    //ActualizarHistoriaClinica
    public static final String ACTUALIZAR_HISTORIA_CLINICA = "ActualizarHistoriaClinica";
    public static final String ACTUALIZAR_HISTORIA_CLINICA_HISTORIA_CLINICA_AHC = "historiaClinicaAHC";

    //CrearCita
    public static final String CREAR_CITA = "CrearCita";
    public static final String CREAR_CITA_CITACC = "citaCC";

    //SolicitarBienvenida
    public static final String SOLICITAR_BIENVENIDA = "SolicitarBienvenida";
    public static final String SOLICITAR_BIENVENIDA_PACIENTESB = "pacienteSB";


    //SolicitarDieta
    public static final String SOLICITAR_DIETA = "SolicitarDieta";
    public static final String SOLICITAR_DIETA_PACIENTESD = "pacienteSD";

    //SolicitarHistoriaClinica
    public static final String SOLICITAR_HISTORIA_CLINICA = "SolicitarHistoriaClinica";
    public static final String SOLICITAR_HISTORIA_CLINICA_PACIENTESHC = "pacienteSHC";


    //SolicitarInfoCita
    public static final String SOLICITAR_INFO_CITA = "SolicitarInfoCita";
    public static final String SOLICITAR_INFO_CITA_PACIENTESIC = "pacienteSIC";

    //SolicitarPosiblesEnfermedades
    public static final String SOLICITAR_POSIBLES_ENFERMEDADES = "SolicitarPosiblesEnfermedades";
    public static final String SOLICITAR_POSIBLES_ENFERMEDADES_PACIENTESPE = "pacienteSPE";

    //SolicitarPaciente
    public static final String SOLICITAR_PACIENTE = "SolicitarPaciente";
    public static final String SOLICITAR_PACIENTE_CEDULASP = "cedulaSP";


    // Instancia de la ontología (que será única)
    private static Ontology instancia = new SaludOntology();


    // Método para acceder a la instancia de la ontología
    public static Ontology getInstance() {
        return instancia;
    }

    private SaludOntology() {
        super(ONTOLOGY_NAME, BasicOntology.getInstance());

        try {
            // Añade los elementos

            //Conceptos
            add(new ConceptSchema(BIENVENIDA), Bienvenida.class);
            add(new ConceptSchema(CITA), Cita.class);
            add(new ConceptSchema(DIETA), Dieta.class);
            add(new ConceptSchema(HISTORIA_CLINICA), HistoriaClinica.class);
            add(new ConceptSchema(NUTRICIONISTA), Nutricionista.class);
            add(new ConceptSchema(PACIENTE), Paciente.class);
            add(new ConceptSchema(POSIBLES_ENFERMEDADES), PosiblesEnfermedades.class);


            //Predicados
            add(new PredicateSchema(BIENVENIDA_ENTREGADA), BienvenidaEntregada.class);
            add(new PredicateSchema(CITA_CREADA), CitaCreada.class);
            add(new PredicateSchema(HISTORIA_CLINICA_ACTUALIZADA), HistoriaClinicaActualizada.class);
            add(new PredicateSchema(INFO_CITA_ENTREGADA), InfoCitaEntregada.class);
            add(new PredicateSchema(INFO_DIETA_ENTREGADA), InfoDietaEntregada.class);
            add(new PredicateSchema(INFO_HISTORIA_CLINICA_ENTREGADA), InfoHistoriaClinicaEntregada.class);
            add(new PredicateSchema(INFO_PACIENTE_ENTREGADA), InfoPacienteEntregada.class);
            add(new PredicateSchema(INFO_POSIBLES_ENFERMEDADES_ENTREGADA), InfoPosiblesEnfermedadesEntregada.class);

            //Acciones
            add(new AgentActionSchema(ACTUALIZAR_HISTORIA_CLINICA), ActualizarHistoriaClinica.class);
            add(new AgentActionSchema(CREAR_CITA), CrearCita.class);
            add(new AgentActionSchema(SOLICITAR_BIENVENIDA), SolicitarBienvenida.class);
            add(new AgentActionSchema(SOLICITAR_DIETA), SolicitarDieta.class);
            add(new AgentActionSchema(SOLICITAR_HISTORIA_CLINICA), SolicitarHistoriaClinica.class);
            add(new AgentActionSchema(SOLICITAR_INFO_CITA), SolicitarInfoCita.class);
            add(new AgentActionSchema(SOLICITAR_POSIBLES_ENFERMEDADES), SolicitarPosiblesEnfermedades.class);
            add(new AgentActionSchema(SOLICITAR_PACIENTE), SolicitarPaciente.class);


            // Estructura del esquema para el concepto BIENVENIDA
            ConceptSchema csBIENVENIDA = (ConceptSchema) getSchema(BIENVENIDA);
            csBIENVENIDA.add(BIENVENIDA_DESCRIPCION_BIENVENIDA, (PrimitiveSchema) getSchema(BasicOntology.STRING));

            // Estructura del esquema para el concepto DIETA
            ConceptSchema csDIETA = (ConceptSchema) getSchema(DIETA);
            csDIETA.add(DIETA_DESCRIPCION_DIETA, (PrimitiveSchema) getSchema(BasicOntology.STRING));

            // Estructura del esquema para el concepto HISTORIA_CLINICA
            ConceptSchema csHISTORIA_CLINICA = (ConceptSchema) getSchema(HISTORIA_CLINICA);
            csHISTORIA_CLINICA.add(HISTORIA_CLINICA_DESCRIPCION_HISTORIA_CLINICA, (PrimitiveSchema) getSchema(BasicOntology.STRING));

            // Estructura del esquema para el concepto NUTRICIONISTA
            ConceptSchema csNUTRICIONISTA = (ConceptSchema) getSchema(NUTRICIONISTA);
            csNUTRICIONISTA.add(NUTRICIONISTA_CEDULA_NUTRICIONISTA, (PrimitiveSchema) getSchema(BasicOntology.STRING));
            csNUTRICIONISTA.add(NUTRICIONISTA_NOMBRE_NUTRICIONISTA, (PrimitiveSchema) getSchema(BasicOntology.STRING));

            // Estructura del esquema para el concepto PACIENTE
            ConceptSchema csPACIENTE = (ConceptSchema) getSchema(PACIENTE);
            csPACIENTE.add(PACIENTE_CEDULA_PACIENTE, (PrimitiveSchema) getSchema(BasicOntology.STRING));
            csPACIENTE.add(PACIENTE_NOMBRE_PACIENTE, (PrimitiveSchema) getSchema(BasicOntology.STRING));
            csPACIENTE.add(PACIENTE_NOMBRE_PACIENTE, (ConceptSchema) getSchema(DIETA));
            csPACIENTE.add(PACIENTE_HISTORIA_CLINICA_PACIENTE, (ConceptSchema) getSchema(HISTORIA_CLINICA));

            // Estructura del esquema para el concepto POSIBLES_ENFERMEDADES
            ConceptSchema csPOSIBLES_ENFERMEDADES = (ConceptSchema) getSchema(POSIBLES_ENFERMEDADES);
            csPOSIBLES_ENFERMEDADES.add(POSIBLES_ENFERMEDADES_DESCRIPCIONPE, (PrimitiveSchema) getSchema(BasicOntology.STRING));
            csPOSIBLES_ENFERMEDADES.add(POSIBLES_ENFERMEDADES_PACIENTEPE, (ConceptSchema) getSchema(PACIENTE));

            // Estructura del esquema para el concepto CITA
            ConceptSchema csCITA = (ConceptSchema) getSchema(CITA);
            csCITA.add(CITA_DESCRIPCION_CITA, (PrimitiveSchema) getSchema(BasicOntology.STRING));
            csCITA.add(CITA_NUTRICIONISTA_CITA, (ConceptSchema) getSchema(NUTRICIONISTA));
            csCITA.add(CITA_PACIENTE_CITA, (ConceptSchema) getSchema(PACIENTE));


            // Estructura del esquema para el predicado BIENVENIDA_ENTREGADA
            PredicateSchema psBIENVENIDA_ENTREGADA = (PredicateSchema) getSchema(BIENVENIDA_ENTREGADA);
            psBIENVENIDA_ENTREGADA.add(BIENVENIDA_DESCRIPCION_BIENVENIDA, (ConceptSchema) getSchema(BIENVENIDA));

            // Estructura del esquema para el predicado CITA_CREADA
            PredicateSchema psCITA_CREADA = (PredicateSchema) getSchema(CITA_CREADA);
            psCITA_CREADA.add(CITA_CREADA_CITACCR, (ConceptSchema) getSchema(CITA));

            // Estructura del esquema para el predicado HISTORIA_CLINICA_ACTUALIZADA
            PredicateSchema psHISTORIA_CLINICA_ACTUALIZADA = (PredicateSchema) getSchema(HISTORIA_CLINICA_ACTUALIZADA);
            psCITA_CREADA.add(HISTORIA_CLINICA_ACTUALIZADA_HISTORIA_CLINICAHCA, (ConceptSchema) getSchema(HISTORIA_CLINICA));

            // Estructura del esquema para el predicado INFO_CITA_ENTREGADA
            PredicateSchema psINFO_CITA_ENTREGADA = (PredicateSchema) getSchema(INFO_CITA_ENTREGADA);
            psINFO_CITA_ENTREGADA.add(INFO_CITA_ENTREGADA_CITAICE, (ConceptSchema) getSchema(CITA));

            // Estructura del esquema para el predicado INFO_DIETA_ENTREGADA
            PredicateSchema psINFO_DIETA_ENTREGADA = (PredicateSchema) getSchema(INFO_DIETA_ENTREGADA);
            psINFO_DIETA_ENTREGADA.add(INFO_DIETA_ENTREGADA_DIETAIDE, (ConceptSchema) getSchema(DIETA));

            // Estructura del esquema para el predicado INFO_HISTORIA_CLINICA_ENTREGADA
            PredicateSchema psINFO_HISTORIA_CLINICA_ENTREGADA = (PredicateSchema) getSchema(INFO_HISTORIA_CLINICA_ENTREGADA);
            psINFO_HISTORIA_CLINICA_ENTREGADA.add(INFO_HISTORIA_CLINICA_ENTREGADA_HISTORIA_CLINICAIHCE, (ConceptSchema) getSchema(HISTORIA_CLINICA));

            // Estructura del esquema para el predicado INFO_POSIBLES_ENFERMEDADES_ENTREGADA
            PredicateSchema psINFO_POSIBLES_ENFERMEDADES_ENTREGADA = (PredicateSchema) getSchema(INFO_POSIBLES_ENFERMEDADES_ENTREGADA);
            psINFO_POSIBLES_ENFERMEDADES_ENTREGADA.add(INFO_POSIBLES_ENFERMEDADES_ENTREGADA_POSIBLES_ENFERMEDADES_ENTREGADAIPEE, (ConceptSchema) getSchema(POSIBLES_ENFERMEDADES));

            // Estructura del esquema para el predicado INFO_PACIENTE_ENTREGADA
            PredicateSchema psINFO_PACIENTE_ENTREGADA = (PredicateSchema) getSchema(INFO_PACIENTE_ENTREGADA);
            psINFO_PACIENTE_ENTREGADA.add(INFO_PACIENTE_ENTREGADA_PACIENTEIPE, (ConceptSchema) getSchema(PACIENTE));


            // Estructura del esquema para la acción ACTUALIZAR_HISTORIA_CLINICA
            AgentActionSchema asACTUALIZAR_HISTORIA_CLINICA = (AgentActionSchema) getSchema(ACTUALIZAR_HISTORIA_CLINICA);
            asACTUALIZAR_HISTORIA_CLINICA.add(ACTUALIZAR_HISTORIA_CLINICA_HISTORIA_CLINICA_AHC, (ConceptSchema) getSchema(HISTORIA_CLINICA));

            // Estructura del esquema para la acción CREAR_CITA
            AgentActionSchema asCREAR_CITA = (AgentActionSchema) getSchema(CREAR_CITA);
            asCREAR_CITA.add(CREAR_CITA_CITACC, (ConceptSchema) getSchema(CITA));

             // Estructura del esquema para la acción SOLICITAR_BIENVENIDA
            AgentActionSchema asSOLICITAR_BIENVENIDA = (AgentActionSchema) getSchema(SOLICITAR_BIENVENIDA);
            asSOLICITAR_BIENVENIDA.add(SOLICITAR_BIENVENIDA_PACIENTESB, (ConceptSchema) getSchema(PACIENTE));

            // Estructura del esquema para la acción SOLICITAR_DIETA
            AgentActionSchema asSOLICITAR_DIETA = (AgentActionSchema) getSchema(SOLICITAR_DIETA);
            asSOLICITAR_DIETA.add(SOLICITAR_DIETA_PACIENTESD, (ConceptSchema) getSchema(PACIENTE));

            // Estructura del esquema para la acción SOLICITAR_HISTORIA_CLINICA
            AgentActionSchema asSOLICITAR_HISTORIA_CLINICA = (AgentActionSchema) getSchema(SOLICITAR_HISTORIA_CLINICA);
            asSOLICITAR_HISTORIA_CLINICA.add(SOLICITAR_HISTORIA_CLINICA_PACIENTESHC, (ConceptSchema) getSchema(PACIENTE));

            // Estructura del esquema para la acción SOLICITAR_INFO_CITA
            AgentActionSchema asSOLICITAR_INFO_CITA = (AgentActionSchema) getSchema(SOLICITAR_INFO_CITA);
            asSOLICITAR_INFO_CITA.add(SOLICITAR_INFO_CITA_PACIENTESIC, (ConceptSchema) getSchema(PACIENTE));

            // Estructura del esquema para la acción SOLICITAR_POSIBLES_ENFERMEDADES
            AgentActionSchema asSOLICITAR_POSIBLES_ENFERMEDADES = (AgentActionSchema) getSchema(SOLICITAR_POSIBLES_ENFERMEDADES);
            asSOLICITAR_POSIBLES_ENFERMEDADES.add(SOLICITAR_POSIBLES_ENFERMEDADES_PACIENTESPE, (ConceptSchema) getSchema(PACIENTE));

            // Estructura del esquema para la acción SOLICITAR_PACIENTE
            AgentActionSchema asSOLICITAR_PACIENTE = (AgentActionSchema) getSchema(SOLICITAR_PACIENTE);
            asSOLICITAR_PACIENTE.add(SOLICITAR_PACIENTE_CEDULASP, (PrimitiveSchema) getSchema(BasicOntology.STRING));


        } catch (OntologyException oe) {
            oe.printStackTrace();
        }

    }


}
