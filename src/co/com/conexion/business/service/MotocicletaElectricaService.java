package co.com.conexion.business.service;
import co.com.conexion.model.entity.MotocicletaElectrica;
import co.com.conexion.model.repository.MotocicletaElectricaRepository;
import java.sql.SQLException;
import java.util.List;

public class MotocicletaElectricaService {
    private final MotocicletaElectricaRepository motocicletaElectricaRepository;

    public MotocicletaElectricaService(MotocicletaElectricaRepository motocicletaElectricaRepository) {
        this.motocicletaElectricaRepository = motocicletaElectricaRepository;
    }
    public void crear(MotocicletaElectrica motocicletaElectrica) throws SQLException {
        motocicletaElectricaRepository.crear(motocicletaElectrica);
    }
    public void actualizar(MotocicletaElectrica motocicletaElectrica)throws SQLException{
        motocicletaElectricaRepository.actualizar(motocicletaElectrica);
    }
    public List<MotocicletaElectrica> listar()throws SQLException{
        return motocicletaElectricaRepository.listar();
    }
    public void eliminar(String nombre) throws SQLException{
        motocicletaElectricaRepository.eliminar(nombre);
    }
    public MotocicletaElectrica buscarPorNombre(String nombre) throws SQLException{
        return motocicletaElectricaRepository.buscarPorNombre(nombre);
    }
    public void crearLista() throws SQLException{
        motocicletaElectricaRepository.crearLista();
    }
}
