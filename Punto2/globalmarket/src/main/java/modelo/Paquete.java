package modelo;

public class Paquete {

    private String destino;
    private double peso;
    private double distanciaKm;

    public Paquete(String destino, double peso, double distanciaKm) {
        this.destino = destino;
        this.peso = peso;
        this.distanciaKm = distanciaKm;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}
