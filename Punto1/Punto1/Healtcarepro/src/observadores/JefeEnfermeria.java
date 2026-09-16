package observadores;

import modelo.EventoMedico;
import modelo.TipoEvento;

public class JefeEnfermeria implements Observer2 {

    private String nombre;

    public JefeEnfermeria(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(EventoMedico evento) {
        if (evento.getTipo() == TipoEvento.cambio_prioriodad) {
            System.out.println("[ENF. " + nombre + "] Cambio de prioridad del paciente "
                    + evento.getPaciente() + ": " + evento.getDescripcion()
                    + ". Voy a reorganizar turnos y camas.");
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
