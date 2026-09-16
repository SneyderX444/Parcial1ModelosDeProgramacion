package central;

import observadores.Observer2;

public interface Observer {
    void suscribir(Observer2 observer);
    void desuscribir(Observer2 observer);
    void notificar(modelo.EventoMedico evento);
}
