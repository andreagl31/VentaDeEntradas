package modelo;

import java.util.List;

public class Zona {
    private String nombre;
    private List<Butaca> listaButacas;

    public Zona(String nombre, List<Butaca> listaButacas) {
        this.nombre = nombre;
        this.listaButacas = listaButacas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Butaca> getListaButacas() {
        return listaButacas;
    }

    public void setListaButacas(List<Butaca> listaButacas) {
        this.listaButacas = listaButacas;
    }

    @Override
    public String toString() {
        return "Zona{" +
                "nombre='" + nombre + '\'' +
                ", listaButacas=" + listaButacas +
                '}';
    }
}
