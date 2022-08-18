package co.com.conexion.model.entity;

public class Bicicleta {
    private String fabriNombre;
    private String fabriPrecio;
    private int FabriAnio;

    public Bicicleta(String fabriNombre, String fabriPrecio, int fabriAnio) {
        this.fabriNombre = fabriNombre;
        this.fabriPrecio = fabriPrecio;
        this.FabriAnio = fabriAnio;
    }

    public String getFabriNombre() {
        return fabriNombre;
    }

    public void setFabriNombre(String fabriNombre) {
        this.fabriNombre = fabriNombre;
    }

    public String getFabriPrecio() {
        return fabriPrecio;
    }

    public void setFabriPrecio(String fabriPrecio) {
        this.fabriPrecio = fabriPrecio;
    }

    public int getFabriAnio() {
        return FabriAnio;
    }

    public void setFabriAnio(int fabriAnio) {
        this.FabriAnio = fabriAnio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "nombre='" + fabriNombre + '\'' +
                ", precio='" + fabriPrecio + '\'' +
                ", anio=" + FabriAnio +
                '}';
    }
}

