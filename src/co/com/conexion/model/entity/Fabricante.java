package co.com.conexion.model.entity;

public class Fabricante {
    public Fabricante(String fabriNombre) {
        this.fabriNombre = fabriNombre;
    }

    private String fabriNombre;

    public String getFabriNombre() {
        return fabriNombre;
    }

    public void setFabriNombre(String fabriNombre) {
        this.fabriNombre = fabriNombre;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "fabriNombre='" + fabriNombre + '\'' +
                '}';
    }
}
