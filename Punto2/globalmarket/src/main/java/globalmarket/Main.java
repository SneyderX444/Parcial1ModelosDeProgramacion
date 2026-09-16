package globalmarket;

import estrategias.EnvioCasillero;
import estrategias.EnvioEcologico;
import estrategias.EnvioEconomico;
import estrategias.EnvioExpress;
import modelo.Paquete;
import orden.OrdenCompra;

public class Main {

    public static void main(String[] args) {
        Paquete paquete = new Paquete("Medellin", 4.5, 18);

        OrdenCompra orden = new OrdenCompra("Sneyder mendez", paquete, new EnvioEconomico());

        orden.confirmarCompra();

        System.out.println("\n el cliente lo pienss mejor y necesita el paquete rapido ");
        orden.cambiarEstrategiaEnvio(new EnvioExpress());
        orden.confirmarCompra();

        System.out.println("\n el cliente prefiere una opcion mas sostenible ");
        orden.cambiarEstrategiaEnvio(new EnvioEcologico());
        orden.confirmarCompra();

        System.out.println("\n el cliente decide recoger en el punto mas cercano ");
        orden.cambiarEstrategiaEnvio(new EnvioCasillero());
        orden.confirmarCompra();
    }
}
