package estrategias;

import modelo.Paquete;
import modelo.ResultadoEnvio;

public interface EstrategiaEnvio {
    ResultadoEnvio calcular(Paquete paquete);
}
