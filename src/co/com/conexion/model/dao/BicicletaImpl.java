package co.com.conexion.model.dao;
import co.com.conexion.model.Conexion;
import co.com.conexion.model.repository.BicicletaRepocitory;
import co.com.conexion.model.entity.Bicicleta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BicicletaImpl implements BicicletaRepocitory {

    @Override
    public void crear(Bicicleta bicicleta) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String sql="insert into Bicicleta values(?,?,?);";
        try{
            connection= Conexion.getConexion();
            ps=connection.prepareStatement(sql);
            ps.setString(valores++,bicicleta.getFabriNombre());
            ps.setString(valores++,bicicleta.getFabriPrecio());
            ps.setInt(valores++,bicicleta.getFabriAnio());
            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
    }

    @Override
    public List<Bicicleta> listar() throws SQLException {
        List<Bicicleta> bicicletas=new ArrayList<>();
        Bicicleta bicicleta= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from bicicleta;";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String fabriNombre = rs.getString("fabriNombre");
                String fabriPrecio = rs.getString("fabriPrecio");
                int fabriAnio = rs.getInt("fabriAnio");
                bicicleta = new Bicicleta(fabriNombre,fabriPrecio,fabriAnio);
                bicicletas.add(bicicleta);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return bicicletas;
    }

    @Override
    public Bicicleta buscarPorNombre(String nombre) throws SQLException {
        Bicicleta bicicleta= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from bicicleta where fabriNombre='" + nombre + "';";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String fabriNombre = rs.getString("fabriNombre");
                String fabriPrecio = rs.getString("fabriPrecio");
                int fabriAnio = rs.getInt("fabriAnio");
                bicicleta = new Bicicleta(fabriNombre,fabriPrecio,fabriAnio);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return bicicleta;
    }

    @Override
    public Bicicleta actualizar(Bicicleta bicicleta) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String actualizar = "update Bicicleta set fabriPrecio=?,fabriAnio=? " +
                "where fabriNombre='" + bicicleta.getFabriNombre() +"';";

        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(actualizar);
            ps.setString(valores++, bicicleta.getFabriPrecio());
            ps.setInt(valores++,bicicleta.getFabriAnio());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return buscarPorNombre(bicicleta.getFabriNombre());
    }

    @Override
    public void eliminar(String nombre) throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
        String eliminar="Delete from bicicleta where fabriNombre='"+nombre+"';";
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
        String sql="create table Bicicleta(\n" +
                "\tFabriNombre varchar(45) primary key,\n" +
                "    FabriPrecio varchar(45),\n" +
                "    FabriAnio int\n" +
                "); ";
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