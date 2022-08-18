package co.com.conexion.model.repository;

import co.com.conexion.model.entity.Intenciones;

import java.sql.SQLException;
import java.util.List;

public interface IntecionesRepository {
    void crear(Intenciones intenciones) throws SQLException;
    List<Intenciones> listar() throws SQLException;
    Intenciones buscarPorNombre(String nombre) throws SQLException;
    Intenciones actualizar(Intenciones intenciones) throws SQLException;
    void eliminar(String nombre) throws SQLException;
    void crearLista() throws SQLException;
}
