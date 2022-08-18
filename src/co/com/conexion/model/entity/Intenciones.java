package co.com.conexion.model.entity;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.sql.Timestamp;

public class Intenciones {
    private String intAlias;
    private String intMarca;
    private String intHora;

    public Intenciones(String intAlias, String intMarca, String intHora) {
        this.intAlias = intAlias;
        this.intMarca = intMarca;
        this.intHora = intHora;
    }

    public String getIntAlias() {
        return intAlias;
    }

    public void setIntAlias(String intAlias) {
        this.intAlias = intAlias;
    }

    public String getIntMarca() {
        return intMarca;
    }

    public void setIntMarca(String intMarca) {
        this.intMarca = intMarca;
    }

    public String getIntHora() {
        return intHora;
    }

    public void setIntHora(String intHora) {
        this.intHora = intHora;
    }

    @Override
    public String toString() {
        return "Intenciones{" +
                "intAlias='" + intAlias + '\'' +
                ", intMarca='" + intMarca + '\'' +
                ", intHora=" + intHora +
                '}';
    }
}
