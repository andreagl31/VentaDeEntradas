package modelo;

public class Butaca {
    private String id;
    private boolean estaBloqueada;

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

    public boolean isEstaBloqueada() {
        return estaBloqueada;
    }

    public void setEstaBloqueada(boolean estaBloqueada) {
        this.estaBloqueada = estaBloqueada;
    }

    @Override
    public String toString() {
        return "Butaca{" +
                "id='" + id + '\'' +
                ", estaBloqueada=" + estaBloqueada +
                '}';
    }
}
