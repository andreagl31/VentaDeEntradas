package modelo;

import java.util.List;

public class Pabellon {
    private List<Zona> zonas;

    public Pabellon(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    @Override
    public String toString() {
        return "Pabellon{" +
                "zonas=" + zonas +
                '}';
    }
}
