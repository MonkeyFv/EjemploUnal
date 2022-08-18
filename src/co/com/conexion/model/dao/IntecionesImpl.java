package co.com.conexion.model.dao;

import co.com.conexion.model.Conexion;
import co.com.conexion.model.entity.Bicicleta;
import co.com.conexion.model.entity.Intenciones;
import co.com.conexion.model.repository.IntecionesRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntecionesImpl implements IntecionesRepository {
    @Override
    public void crear(Intenciones intenciones) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String sql="insert into intenciones values(?,?,?);";
        try{
            connection= Conexion.getConexion();
            ps=connection.prepareStatement(sql);
            ps.setString(valores++,intenciones.getIntAlias());
            ps.setString(valores++,intenciones.getIntMarca());
            ps.setString(valores++,intenciones.getIntHora());
            ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
    }

    @Override
    public List<Intenciones> listar() throws SQLException {
        List<Intenciones> inteciones=new ArrayList<>();
        Intenciones intecion= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from intenciones;";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String intAlias = rs.getString("intAlias");
                String intMarca = rs.getString("intMarca");
                String intHora = rs.getString("intHora");
                intecion = new Intenciones(intAlias,intMarca,intHora);
                inteciones.add(intecion);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return inteciones;
    }

    @Override
    public Intenciones buscarPorNombre(String nombre) throws SQLException {
        Intenciones intenciones= null ;
        Connection connection=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String listar="Select * from intenciones where intAlias='" + nombre + "';";
        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(listar);
            rs= ps.executeQuery();
            while (rs.next()){
                String intAlias = rs.getString("intAlias");
                String intMarca = rs.getString("intMarca");
                String intHora = rs.getString("intHora");
                intenciones = new Intenciones(intAlias,intMarca,intHora);
            }
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return intenciones;
    }

    @Override
    public Intenciones actualizar(Intenciones intenciones) throws SQLException {
        int valores=1;
        Connection connection=null;
        PreparedStatement ps=null;
        String actualizar = "update intenciones set intMarca=?,intHora=? " +
                "where intAlias='" + intenciones.getIntAlias() +"';";

        try {
            connection = Conexion.getConexion();
            ps=connection.prepareStatement(actualizar);
            ps.setString(valores++,intenciones.getIntMarca());
            ps.setString(valores++,intenciones.getIntHora());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace(System.err);
        }finally {
            Conexion.cerrar(ps);
            Conexion.cerrar(connection);
        }
        return buscarPorNombre(intenciones.getIntAlias());
    }

    @Override
    public void eliminar(String nombre) throws SQLException {
        Connection connection=null;
        PreparedStatement ps=null;
        String eliminar="Delete from intenciones where intAlias='"+nombre+"';";
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
        String sql="create table intenciones(\n" +
                "\tintAlias varchar(20),\n" +
                "    intMarca varchar(20),\n" +
                "    intHora varchar(20)\n" +
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
