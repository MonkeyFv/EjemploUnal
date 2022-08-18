package co.com.conexion.model.dao;

import co.com.conexion.model.Conexion;
import co.com.conexion.model.entity.MotocicletaElectrica;
import co.com.conexion.model.repository.MotocicletaElectricaRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MotocicletaElectricaImpl implements MotocicletaElectricaRepository {
    public void crear(MotocicletaElectrica motocicletaElectrica) throws SQLException {
        int valores=1;
        Connection connection = null;
        PreparedStatement ps = null;
        String sql = "insert into MotocicletaElectrica values(?,?,?,?);";
        try {
            connection=Conexion.getConexion();
            ps=connection.prepareStatement(sql);
            ps.setString(valores++,motocicletaElectrica.getFabriNombreElec());
            ps.setString(valores++,motocicletaElectrica.getFabriPrecioElec());
            ps.setString(valores++,motocicletaElectrica.getFabriAutonomiaElec());
            ps.setString(valores++,motocicletaElectrica.getFabriProveedorElec());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
    }

    @Override
    public List<MotocicletaElectrica> listar() throws SQLException {
        List<MotocicletaElectrica> motocicletaElectricas=new ArrayList<>();
        MotocicletaElectrica motocicletaElectrica= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from motocicletaElectrica;";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String fabriNombreElec = rs.getString("fabriNombreElec");
                String fabriPrecioElec = rs.getString("fabriPrecioElec");
                String fabriAutonomiaElec=rs.getString("fabriAutonomiaElec");
                String fabriProveedorElec= rs.getString("fabriProveedorElec");
                motocicletaElectrica = new MotocicletaElectrica(fabriNombreElec,fabriPrecioElec,fabriAutonomiaElec,fabriProveedorElec);
                motocicletaElectricas.add(motocicletaElectrica);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return motocicletaElectricas;
    }

    @Override
    public MotocicletaElectrica buscarPorNombre(String nombre) throws SQLException {
        MotocicletaElectrica motocicletaElectrica=null;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from motocicletaElectrica where fabriNombreElec='" + nombre + "';";
        try {
            connection =Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs=ps.executeQuery();
            while (rs.next()){
                String fabriNombreElec =rs.getString("fabriNombreElec");
                String fabrifabriPrecioElec= rs.getString("fabriPrecioElec");
                String fabriAutonomiaElec= rs.getString("fabriAutonomiaElec");
                String fabriProveedorElec=rs.getString("fabriProveedorElec");
                motocicletaElectrica=new MotocicletaElectrica(fabriNombreElec,fabrifabriPrecioElec,fabriAutonomiaElec,fabriProveedorElec);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return motocicletaElectrica;
    }

    @Override
    public MotocicletaElectrica actualizar(MotocicletaElectrica motocicletaElectrica) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String actualizar ="update motocicletaElectrica set fabriPrecioElec=?,fabriAutonomiaElec=?,fabriProveedorElec=? " +
                "where fabriNombreElec='"+motocicletaElectrica.getFabriNombreElec()+"';";
        try {
            connection=Conexion.getConexion();
            ps=connection.prepareStatement((actualizar));
            ps.setString(valores++,motocicletaElectrica.getFabriPrecioElec());
            ps.setString(valores++,motocicletaElectrica.getFabriAutonomiaElec());
            ps.setString(valores++, motocicletaElectrica.getFabriProveedorElec());
            ps.executeUpdate();
       }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return buscarPorNombre(motocicletaElectrica.getFabriNombreElec());

    }

    @Override
    public void eliminar(String nombre) throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
        String eliminar="Delete from motocicletaElectrica where fabriNombreElec='"+nombre+"';";
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
        String sql="create table MotocicletaElectrica(\n" +
                "\tfabriNombreElec varchar(20),\n" +
                "    fabriPrecioElec varchar(20),\n" +
                "    fabriAutonomiaElec varchar(20),\n" +
                "    fabriProveedorElec varchar(20)\n" +
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

