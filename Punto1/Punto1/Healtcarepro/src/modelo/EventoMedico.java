package modelo;

public class EventoMedico {

    private TipoEvento tipo;
    private String paciente;
    private String descripcion;

    public EventoMedico(TipoEvento tipo, String paciente, String descripcion) {
        this.tipo = tipo;
        this.paciente = paciente;
        this.descripcion = descripcion;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
