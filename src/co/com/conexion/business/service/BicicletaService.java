package co.com.conexion.business.service;
import co.com.conexion.model.repository.BicicletaRepocitory;
import co.com.conexion.model.entity.Bicicleta;
import java.sql.SQLException;
import java.util.List;

public class BicicletaService {
    public final BicicletaRepocitory bicicletaRepocitory;

    public BicicletaService(BicicletaRepocitory bicicletaRepocitory) {
        this.bicicletaRepocitory = bicicletaRepocitory;
    }
    public void crear(Bicicleta bicicleta) throws SQLException {
        bicicletaRepocitory.crear(bicicleta);
    }
    public void actualizar(Bicicleta bicicleta)throws SQLException{
        bicicletaRepocitory.actualizar(bicicleta);
    }
    public List<Bicicleta> listar() throws SQLException {
        return bicicletaRepocitory.listar();
    }
    public void eliminar(String nombre) throws SQLException {
        bicicletaRepocitory.eliminar(nombre);
    }
    public Bicicleta buscarPorNombre(String nombre) throws SQLException {
        return bicicletaRepocitory.buscarPorNombre(nombre);
    }
    public void crearLista() throws SQLException {
        bicicletaRepocitory.crearLista();
    }
}
