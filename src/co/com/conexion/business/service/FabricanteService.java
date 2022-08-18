package co.com.conexion.business.service;

import co.com.conexion.model.entity.Fabricante;
import co.com.conexion.model.repository.FabricanteRepository;

import java.sql.SQLException;
import java.util.List;

public class FabricanteService {
    private final FabricanteRepository fabricanteRepository ;

    public FabricanteService(FabricanteRepository fabricanteRepository) {
        this.fabricanteRepository = fabricanteRepository;
    }
    public void crear(Fabricante fabricante) throws SQLException {
        fabricanteRepository.crear(fabricante);
    }

    public List<Fabricante> listar() throws SQLException {
        return fabricanteRepository.listar();
    }
    public void eliminar(String nombre) throws SQLException {
        fabricanteRepository.eliminar(nombre);
    }
    public Fabricante buscarPorNombre(String nombre) throws SQLException {
        return fabricanteRepository.buscarPorNombre(nombre);
    }
    public void crearLista() throws SQLException {
        fabricanteRepository.crearLista();
    }
}
