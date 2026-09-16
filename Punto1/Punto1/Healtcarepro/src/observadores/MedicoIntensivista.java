package observadores;

import modelo.EventoMedico;
import modelo.TipoEvento;

public class MedicoIntensivista implements Observer2 {

    private String nombre;

    public MedicoIntensivista(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(EventoMedico evento) {
        if (evento.getTipo() == TipoEvento.Signo_vital_critico) {
            System.out.println("[DRA. " + nombre + "] Alerta critica del paciente "
                    + evento.getPaciente() + ": " + evento.getDescripcion()
                    + ". Voy a intervenir de inmediato.");
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
