package co.com.conexion.model.repository;

import co.com.conexion.model.entity.Fabricante;

import java.sql.SQLException;
import java.util.List;

public interface FabricanteRepository {
    void crear(Fabricante fabricante) throws SQLException;
    List<Fabricante> listar() throws SQLException;
    Fabricante buscarPorNombre(String nombre) throws SQLException;
    void eliminar(String nombre) throws SQLException;
    void crearLista() throws SQLException;
}
