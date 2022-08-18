package co.com.conexion.model.dao;

import co.com.conexion.model.Conexion;
import co.com.conexion.model.entity.Cliente;
import co.com.conexion.model.repository.ClienteRepocitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteImpl implements ClienteRepocitory {
    @Override
    public void crear(Cliente cliente) throws SQLException {
        int valores = 1;
        Connection connection = null;
        PreparedStatement ps = null;
        String sql = "insert into Cliente values(?,?,?,?);";
        try {
            connection = Conexion.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setString(valores++, cliente.getClieAlias());
            ps.setString(valores++, cliente.getClieNombre());
            ps.setString(valores++, cliente.getClieApellido());
            ps.setString(valores++, cliente.getClieTelefono());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        } finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
    }

    @Override
    public List<Cliente> listar() throws SQLException {
        List<Cliente> clientes=new ArrayList<>();
        Cliente cliente= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from cliente;";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String clieAlias = rs.getString("clieAlias");
                String clieNombre = rs.getString("clieNombre");
                String clieApellido = rs.getString("clieApellido");
                String clieTelefono = rs.getString("clieTelefono");
                cliente = new Cliente(clieAlias,clieNombre,clieApellido,clieTelefono);
                clientes.add(cliente);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return clientes;
    }

    @Override
    public Cliente buscarPorNombre(String nombre) throws SQLException {
        Cliente cliente= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from cliente where clieAlias='" + nombre + "';";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String clieAlias = rs.getString("clieAlias");
                String clieNombre = rs.getString("clieNombre");
                String clieApellido = rs.getString("clieApellido");
                String clieTelefono = rs.getString("clieTelefono");
                cliente = new Cliente(clieAlias,clieNombre,clieApellido,clieTelefono);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return cliente;
    }

    @Override
    public Cliente actualizar(Cliente cliente) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String actualizar = "update Cliente set clieNombre=?,clieApellido=?,clieTelefono=? " +
                "where clieAlias='" + cliente.getClieAlias() +"';";

        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(actualizar);
            ps.setString(valores++, cliente.getClieNombre());
            ps.setString(valores++,cliente.getClieApellido());
            ps.setString(valores++,cliente.getClieTelefono());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return buscarPorNombre(cliente.getClieAlias());
    }

    @Override
    public void eliminar(String nombre) throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
        String eliminar="Delete from cliente where clieAlias='"+nombre+"';";
        try {
            connection=Conexion.getConexion();
            ps=connection.prepareStatement(eliminar);
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
    }

    @Override
    public void crearLista() throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
        String sql="create table cliente(\n" +
                "\tclieAlias varchar(20),\n" +
                "    clieNombre varchar(20),\n" +
                "    clieApellido varchar(20),\n" +
                "    clieTelefono varchar(20)\n" +
                ");";
        try{
            connection= Conexion.getConexion();
            ps=connection.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
    }
}


