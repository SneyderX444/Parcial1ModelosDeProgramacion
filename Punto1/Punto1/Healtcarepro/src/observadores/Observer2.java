package observadores;

import modelo.EventoMedico;

public interface Observer2 {
    void actualizar(EventoMedico evento);
    String getNombre();
}
