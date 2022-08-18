package co.com.conexion.model.repository;

import co.com.conexion.model.entity.MotocicletaElectrica;

import java.sql.SQLException;
import java.util.List;

public interface MotocicletaElectricaRepository {
    void crear(MotocicletaElectrica motocicletaElectrica) throws SQLException;
    List<MotocicletaElectrica> listar() throws SQLException;
    MotocicletaElectrica buscarPorNombre(String nombre) throws SQLException;
    MotocicletaElectrica actualizar(MotocicletaElectrica motocicletaElectrica) throws SQLException;
    void eliminar(String nombre) throws SQLException;
    void crearLista() throws SQLException;
}
