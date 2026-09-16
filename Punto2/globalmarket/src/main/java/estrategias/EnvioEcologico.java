package estrategias;

import modelo.Paquete;
import modelo.ResultadoEnvio;

public class EnvioEcologico implements EstrategiaEnvio {

    @Override
    public ResultadoEnvio calcular(Paquete paquete) {
        double costo = paquete.getPeso() * 3 + paquete.getDistanciaKm() * 0.05;
        int dias = 8;
        return new ResultadoEnvio("envio ecologico (carbono neutral)", costo, dias);
    }
}
