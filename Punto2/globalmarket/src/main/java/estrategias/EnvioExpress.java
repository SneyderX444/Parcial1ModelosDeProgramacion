package estrategias;

import modelo.Paquete;
import modelo.ResultadoEnvio;

public class EnvioExpress implements EstrategiaEnvio {

    @Override
    public ResultadoEnvio calcular(Paquete paquete) {
        double costo = paquete.getPeso() * 8 + 50;
        int dias = 2;
        return new ResultadoEnvio("envio express (aereo)", costo, dias);
    }
}
