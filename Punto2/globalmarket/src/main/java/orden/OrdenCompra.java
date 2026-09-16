package orden;

import estrategias.EstrategiaEnvio;
import modelo.Paquete;
import modelo.ResultadoEnvio;

public class OrdenCompra {

    private String cliente;
    private Paquete paquete;
    private EstrategiaEnvio estrategiaEnvio;

    public OrdenCompra(String cliente, Paquete paquete, EstrategiaEnvio estrategiaEnvio) {
        this.cliente = cliente;
        this.paquete = paquete;
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public void cambiarEstrategiaEnvio(EstrategiaEnvio nuevaEstrategia) {
        this.estrategiaEnvio = nuevaEstrategia;
        System.out.println(cliente + " cambio la modalidad de envio.");
    }

    public ResultadoEnvio confirmarCompra() {
        ResultadoEnvio resultado = estrategiaEnvio.calcular(paquete);
        System.out.println("\n[ORDEN] Cliente: " + cliente
                + " | Destino: " + paquete.getDestino()
                + " | Metodo: " + resultado.getMetodo()
                + " | Costo: $" + resultado.getCosto()
                + " | Entrega en " + resultado.getDiasEntrega() + " dias");
        return resultado;
    }
}
