package co.com.conexion.model.dao;

import co.com.conexion.model.Conexion;
import co.com.conexion.model.entity.Cliente;
import co.com.conexion.model.entity.Fabricante;
import co.com.conexion.model.repository.FabricanteRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FabricanteImpl implements FabricanteRepository {
    @Override
    public void crear(Fabricante fabricante) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String sql="insert into Fabricante values(?);";
        try{
            connection= Conexion.getConexion();
            ps=connection.prepareStatement(sql);
            ps.setString(valores++, fabricante.getFabriNombre());
            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
    }

    @Override
    public List<Fabricante> listar() throws SQLException {
        List<Fabricante> fabricantes=new ArrayList<>();
        Fabricante fabricante= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from fabricante;";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String fabriNombre = rs.getString("fabriNombre");
                fabricante = new Fabricante(fabriNombre);
                fabricantes.add(fabricante);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return fabricantes;
    }

    @Override
    public Fabricante buscarPorNombre(String nombre) throws SQLException {
        List<Fabricante> fabricantes=new ArrayList<>();
        Fabricante fabricante= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from fabricante;";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String fabriNombre = rs.getString("fabriNombre");
                fabricante = new Fabricante(fabriNombre);
                fabricantes.add(fabricante);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return fabricante;
    }

    @Override
    public void eliminar(String nombre) throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
        String eliminar="Delete from Fabricante where fabriNombre='"+nombre+"';";
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
        String sql="create table Fabricante(\n" +
                "\tFabriNombre varchar(50)\n" +
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

