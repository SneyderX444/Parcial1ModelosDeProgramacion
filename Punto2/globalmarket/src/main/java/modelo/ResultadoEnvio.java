package modelo;

public class ResultadoEnvio {

    private String metodo;
    private double costo;
    private int diasEntrega;

    public ResultadoEnvio(String metodo, double costo, int diasEntrega) {
        this.metodo = metodo;
        this.costo = costo;
        this.diasEntrega = diasEntrega;
    }

    public String getMetodo() {
        return metodo;
    }

    public double getCosto() {
        return costo;
    }

    public int getDiasEntrega() {
        return diasEntrega;
    }
}
