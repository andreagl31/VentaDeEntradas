package modelo;

public class Butaca {
    private String id;
    private TipoEstado estado;

    public Butaca(String id, boolean estaBloqueada) {
        this.id = id;
        this.estaBloqueada = estaBloqueada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Butaca{" +
                "id='" + id + '\'' +
                ", estaBloqueada=" + estaBloqueada +
                '}';
    }
}
