package co.com.conexion.model.repository;

import co.com.conexion.model.entity.Bicicleta;

import java.sql.SQLException;
import java.util.List;

public interface BicicletaRepocitory {
    void crear(Bicicleta bicicleta) throws SQLException;
    List<Bicicleta> listar() throws SQLException;
    Bicicleta buscarPorNombre(String nombre) throws SQLException;
    Bicicleta actualizar(Bicicleta bicicleta) throws SQLException;
    void eliminar(String nombre) throws SQLException;
    void crearLista() throws SQLException;

}
