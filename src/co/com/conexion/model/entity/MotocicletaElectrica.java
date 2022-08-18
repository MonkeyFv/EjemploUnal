package co.com.conexion.model.entity;

public class MotocicletaElectrica {
    private String fabriNombreElec;
    private String fabriPrecioElec;
    private String fabriAutonomiaElec;
    private String fabriProveedorElec;

    public MotocicletaElectrica(String fabriNombreElec, String fabriPrecioElec, String fabriAutonomiaElec, String fabriProveedorElec) {
        this.fabriNombreElec = fabriNombreElec;
        this.fabriPrecioElec = fabriPrecioElec;
        this.fabriAutonomiaElec = fabriAutonomiaElec;
        this.fabriProveedorElec = fabriProveedorElec;
    }

    public String getFabriNombreElec() {
        return fabriNombreElec;
    }

    public void setFabriNombreElec(String fabriNombreElec) {
        this.fabriNombreElec = fabriNombreElec;
    }

    public String getFabriPrecioElec() {
        return fabriPrecioElec;
    }

    public void setFabriPrecioElec(String fabriPrecioElec) {
        this.fabriPrecioElec = fabriPrecioElec;
    }

    public String getFabriAutonomiaElec() {
        return fabriAutonomiaElec;
    }

    public void setFabriAutonomiaElec(String fabriAutonomiaElec) {
        this.fabriAutonomiaElec = fabriAutonomiaElec;
    }

    public String getFabriProveedorElec() {
        return fabriProveedorElec;
    }

    public void setFabriProveedorElec(String fabriProveedorElec) {
        this.fabriProveedorElec = fabriProveedorElec;
    }

    @Override
    public String toString() {
        return "MotocicletasElectricas{" +
                "fabriNombreElec='" + fabriNombreElec + '\'' +
                ", fabriPrecioElec='" + fabriPrecioElec + '\'' +
                ", fabriAutonomiaElec='" + fabriAutonomiaElec + '\'' +
                ", fabriProveedorElec='" + fabriProveedorElec + '\'' +
                '}';
    }
}
