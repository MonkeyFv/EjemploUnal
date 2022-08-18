package co.com.conexion.model;

import java.sql.*;

public class Conexion {
    private static String drive="com.mysql.cj.jdbc.Drive";

    private static String url="jdbc:mysql://localhost:3306/reto5?useSSL=false&serverTimezone=America/Bogota";
    private static String usuario="root";
    private static String contrasena="root";

    //private static String url="jdbc:mysql://localhost:3306/grupo24?useSSL=false&serverTimezone=America/Bogota";
    //private static String usuario="grupo24";
    //private static String contrasena="Grupo24Ciclo2*";



    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(url,usuario,contrasena);
    }

    public static void cerrar(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }
    public static void cerrar(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }
    public static void cerrar(Connection connection) throws SQLException {
        connection.close();
    }
}
