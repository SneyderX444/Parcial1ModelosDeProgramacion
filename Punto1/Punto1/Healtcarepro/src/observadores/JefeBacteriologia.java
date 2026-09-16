package observadores;

import modelo.EventoMedico;
import modelo.TipoEvento;

public class JefeBacteriologia implements Observer2 {

    private String nombre;

    public JefeBacteriologia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(EventoMedico evento) {
        if (evento.getTipo() == TipoEvento. examen_urgente) {
            System.out.println(  nombre + "] examen urgente solicitado para el paciente "
                    + evento.getPaciente() + ": " + evento.getDescripcion()
                    + ". cordino la toma de muestras.");
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
