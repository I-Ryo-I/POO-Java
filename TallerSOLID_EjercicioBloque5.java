// Java
public enum EstadoTarea {
    PENDIENTE, EN_PROGRESO, TERMINADA, BLOQUEADA, EN_REVISION;
}

public class Tarea {
    private EstadoTarea estado = EstadoTarea.PENDIENTE;

    public void setEstado(EstadoTarea e) {
        this.estado = e;
    }

    public EstadoTarea getEstado() {
        return estado;
    }
}
