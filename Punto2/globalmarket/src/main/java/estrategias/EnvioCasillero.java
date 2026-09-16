package estrategias;

import modelo.Paquete;
import modelo.ResultadoEnvio;

public class EnvioCasillero implements EstrategiaEnvio {

    @Override
    public ResultadoEnvio calcular(Paquete paquete) {
        double costo;
        if (paquete.getDistanciaKm() <= 10) {
            costo = 5000;
        } else if (paquete.getDistanciaKm() <= 30) {
            costo = 9000;
        } else {
            costo = 15000;
        }
        int dias = 5;
        return new ResultadoEnvio("envio por casillero", costo, dias);
    }
}
