package co.com.conexion.model.entity;

import java.util.List;

public class Cliente{
    private String clieAlias;
    private String clieNombre;
    private String clieApellido;
    private String clieTelefono;

    public Cliente(String clieAlias, String clieNombre, String clieApellido, String clieTelefono) {
        this.clieAlias = clieAlias;
        this.clieNombre = clieNombre;
        this.clieApellido = clieApellido;
        this.clieTelefono = clieTelefono;
    }

    public String getClieAlias() {
        return clieAlias;
    }

    public void setClieAlias(String clieAlias) {
        this.clieAlias = clieAlias;
    }

    public String getClieNombre() {
        return clieNombre;
    }

    public void setClieNombre(String clieNombre) {
        this.clieNombre = clieNombre;
    }

    public String getClieApellido() {
        return clieApellido;
    }

    public void setClieApellido(String clieApellido) {
        this.clieApellido = clieApellido;
    }

    public String getClieTelefono() {
        return clieTelefono;
    }

    public void setClieTelefono(String clieTelefono) {
        this.clieTelefono = clieTelefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clieAlias='" + clieAlias + '\'' +
                ", clieNombre='" + clieNombre + '\'' +
                ", clieApellido='" + clieApellido + '\'' +
                ", clieTelefono='" + clieTelefono + '\'' +
                '}';
    }
}
