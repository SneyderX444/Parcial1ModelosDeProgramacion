package healthcarepro;

import central.CentralMonitoreo;
import modelo.EventoMedico;
import modelo.TipoEvento;
import observadores.JefeBacteriologia;
import observadores.JefeEnfermeria;
import observadores.MedicoIntensivista;
import observadores.Observer2;

public class Main {

    public static void main(String[] args) {
        CentralMonitoreo central = new CentralMonitoreo();

        Observer2 elena = new MedicoIntensivista("elena ramos");
        Observer2 andres = new JefeEnfermeria("andres suarez");
        Observer2 marta = new JefeBacteriologia("marta gomez");

        central.suscribir(elena);
        central.suscribir(andres);
        central.suscribir(marta);

        central.registrarEvento(new EventoMedico(TipoEvento.Signo_vital_critico,
                "juan peres", "Saturacion de oxigeno bajo el 85%"));

        central.registrarEvento(new EventoMedico(TipoEvento.cambio_prioriodad,
                "camila torres", "Se activa codigo azul en habitacion 302"));

        central.registrarEvento(new EventoMedico(TipoEvento. examen_urgente,
                "luis herrera", "Se requiere hemograma urgente"));

        System.out.println("\n andres sale de turno y se desuscribe");
        central.desuscribir(andres);

        central.registrarEvento(new EventoMedico(TipoEvento.cambio_prioriodad,
                "spfia lozano", "Se activa codigo rojo en urgencias"));
    }
}
