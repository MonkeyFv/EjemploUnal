package co.com.conexion.model.repository;

import co.com.conexion.model.entity.Bicicleta;
import co.com.conexion.model.entity.Proveedor;

import java.sql.SQLException;
import java.util.List;

public interface ProveedorRepository {
    void crear(Proveedor proveedor) throws SQLException;
    List<Proveedor> listar() throws SQLException;
    Proveedor buscarPorNombre(String nombre) throws SQLException;
    Proveedor actualizar(Proveedor proveedor) throws SQLException;
    void eliminar(String nombre) throws SQLException;
    void crearLista() throws SQLException;
}
