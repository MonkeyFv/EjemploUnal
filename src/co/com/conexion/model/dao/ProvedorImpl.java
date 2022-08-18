package co.com.conexion.model.dao;

import co.com.conexion.model.Conexion;
import co.com.conexion.model.entity.Bicicleta;
import co.com.conexion.model.entity.Proveedor;
import co.com.conexion.model.repository.ProveedorRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProvedorImpl implements ProveedorRepository {
    @Override
    public void crear(Proveedor proveedor) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String sql="insert into proveedor values(?,?,?);";
        try{
            connection= Conexion.getConexion();
            ps=connection.prepareStatement(sql);
            ps.setString(valores++, proveedor.getProvNombre());
            ps.setString(valores++, proveedor.getProvDireccion());
            ps.setString(valores++,proveedor.getProvTelefono());
            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
    }

    @Override
    public List<Proveedor> listar() throws SQLException {
        List<Proveedor> proveedores=new ArrayList<>();
        Proveedor proveedor= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from proveedor;";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String provNombre = rs.getString("provNombre");
                String provDireccion = rs.getString("provDireccion");
                String provTelefono = rs.getString("provTelefono");
                proveedor = new Proveedor(provNombre,provDireccion,provTelefono);
                proveedores.add(proveedor);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return proveedores;
    }

    @Override
    public Proveedor buscarPorNombre(String nombre) throws SQLException {
        Proveedor proveedor= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from proveedor where provNombre='" + nombre + "';";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String provNombre = rs.getString("provNombre");
                String provDireccion = rs.getString("provDireccion");
                String provTelefono = rs.getString("provTelefono");
                 proveedor = new Proveedor(provNombre,provDireccion,provTelefono);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return proveedor;
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String actualizar = "update proveedor set provDireccion=?,provTelefono=? " +
                "where provNombre='" + proveedor.getProvNombre() +"';";

        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(actualizar);
            ps.setString(valores++, proveedor.getProvDireccion());
            ps.setString(valores++,proveedor.getProvTelefono());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return buscarPorNombre(proveedor.getProvNombre());
    }

    @Override
    public void eliminar(String nombre) throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
        String eliminar="Delete from proveedor where provNombre='"+nombre+"';";
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
    public void crearLista() throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
        String sql="create table proveedor(\n" +
                "\tprovNombre varchar(20),\n" +
                "    provDireccion varchar(20),\n" +
                "    provTelefono varchar(20)\n" +
                ")";
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

