package central;

import modelo.EventoMedico;

import java.util.ArrayList;
import java.util.List;
import observadores.Observer2;

public class CentralMonitoreo implements Observer {

    private List<Observer2> suscriptores = new ArrayList<>();

    @Override
    public void suscribir(Observer2 observer) {
        suscriptores.add(observer);
        System.out.println(observer.getNombre() + " se suscribio a la central de monitoreo.");
    }

    @Override
    public void desuscribir(Observer2 observer) {
        suscriptores.remove(observer);
        System.out.println(observer.getNombre() + " se desuscribio de la central de monitoreo.");
    }

    @Override
    public void notificar(EventoMedico evento) {
        for (Observer2 observer : suscriptores) {
            observer.actualizar(evento);
        }
    }

    public void registrarEvento(EventoMedico evento) {
        System.out.println("\n[La central dice] nuevo evento registrado: " + evento.getTipo()
                + " - paciente: " + evento.getPaciente());
        notificar(evento);
    }
}
