package co.com.conexion.business.service;

import co.com.conexion.model.entity.Cliente;
import co.com.conexion.model.repository.ClienteRepocitory;

import java.sql.SQLException;
import java.util.List;

public class ClienteService {
    public final ClienteRepocitory clienteRepocitory;

    public ClienteService(ClienteRepocitory clienteRepocitory) {
        this.clienteRepocitory = clienteRepocitory;
    }
    public void crear(Cliente cliente) throws SQLException{
        clienteRepocitory.crear(cliente);
    }
    public void actualizar(Cliente cliente) throws SQLException{
        clienteRepocitory.actualizar(cliente);
    }
    public List<Cliente> listar() throws SQLException{
        return clienteRepocitory.listar();
    }
    public void eliminar(String nombre) throws SQLException{
        clienteRepocitory.eliminar(nombre);
    }
    public Cliente buscarPorNombre(String nombre) throws SQLException{
        return clienteRepocitory.buscarPorNombre(nombre);
    }
    public void crearLista() throws SQLException{
        clienteRepocitory.crearLista();
    }
}
