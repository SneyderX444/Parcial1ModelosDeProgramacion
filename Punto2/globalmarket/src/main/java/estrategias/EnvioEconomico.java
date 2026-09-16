package estrategias;

import modelo.Paquete;
import modelo.ResultadoEnvio;

public class EnvioEconomico implements EstrategiaEnvio {

    @Override
    public ResultadoEnvio calcular(Paquete paquete) {
        double costo = paquete.getPeso() * 1.5;
        int dias = 25;
        return new ResultadoEnvio("envio economico (maritimo)", costo, dias);
    }
}
