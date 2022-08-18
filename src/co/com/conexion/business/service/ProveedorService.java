package co.com.conexion.business.service;

import co.com.conexion.model.entity.Bicicleta;
import co.com.conexion.model.entity.Proveedor;
import co.com.conexion.model.repository.ProveedorRepository;

import java.sql.SQLException;
import java.util.List;

public class ProveedorService {
    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }
    public void crear(Proveedor proveedor) throws SQLException {
        proveedorRepository.crear(proveedor);
    }
    public void actualizar(Proveedor proveedor)throws SQLException{
        proveedorRepository.actualizar(proveedor);
    }
    public List<Proveedor> listar() throws SQLException {
        return proveedorRepository.listar();
    }
    public void eliminar(String nombre) throws SQLException {
        proveedorRepository.eliminar(nombre);
    }
    public Proveedor buscarPorNombre(String nombre) throws SQLException {
        return proveedorRepository.buscarPorNombre(nombre);
    }
    public void crearLista() throws SQLException {
        proveedorRepository.crearLista();
    }
}
