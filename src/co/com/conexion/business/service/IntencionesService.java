package co.com.conexion.business.service;

import co.com.conexion.model.entity.Intenciones;
import co.com.conexion.model.repository.IntecionesRepository;

import java.sql.SQLException;
import java.util.List;

public class IntencionesService {
    public final IntecionesRepository intecionesRepository;

    public IntencionesService(IntecionesRepository intecionesRepository) {
        this.intecionesRepository = intecionesRepository;
    }
    public void crear(Intenciones intenciones) throws SQLException {
        intecionesRepository.crear(intenciones);
    }
    public void actualizar(Intenciones intenciones)throws SQLException{
        intecionesRepository.actualizar(intenciones);
    }
    public List<Intenciones> listar() throws SQLException {
        return intecionesRepository.listar();
    }
    public void eliminar(String nombre) throws SQLException {
        intecionesRepository.eliminar(nombre);
    }
    public Intenciones buscarPorNombre(String nombre) throws SQLException {
        return intecionesRepository.buscarPorNombre(nombre);
    }
    public void crearLista() throws SQLException {
        intecionesRepository.crearLista();
    }
}
