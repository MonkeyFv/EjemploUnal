package co.com.conexion.model.repository;

import co.com.conexion.model.entity.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface ClienteRepocitory {
    void crear(Cliente cliente) throws SQLException;
    List<Cliente> listar() throws SQLException;
    Cliente buscarPorNombre(String nombre) throws SQLException;
    Cliente actualizar(Cliente cliente) throws SQLException;
    void eliminar(String nombre) throws SQLException;
    void crearLista() throws SQLException;
}
