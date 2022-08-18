package co.com.conexion.model.entity;

public class Proveedor {
    private String provNombre;
    private String provDireccion;

    private String provTelefono;

    public Proveedor(String nombre, String provDireccion, String provTelefono) {
        this.provNombre = nombre;
        this.provDireccion = provDireccion;
        this.provTelefono = provTelefono;
    }



    public String getProvNombre() {
        return provNombre;
    }

    public void setProvNombre(String provNombre) {
        this.provNombre = provNombre;
    }

    public String getProvDireccion() {
        return provDireccion;
    }

    public void setProvDireccion(String provDireccion) {
        this.provDireccion = provDireccion;
    }

    public String getProvTelefono() {
        return provTelefono;
    }

    public void setProvTelefono(String provTelefono) {
        this.provTelefono = provTelefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + provNombre + '\'' +
                ", provDireccion='" + provDireccion + '\'' +
                ", provTelefono='" + provTelefono + '\'' +
                '}';
    }
}
