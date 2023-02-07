package rf.PruebaAcceso.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
	private static Connection conn = null;
	public static final String USUARIO = "hr";
	public static final String PWD = "hr";
	public static final String DATABASE = "";
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL_LOCAL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";



	public Connection abrirConexion() throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName(JDBC_DRIVER);

		} catch (ClassNotFoundException e) {
			System.out.println("Driver JDBC no encontrado");
			return null;
		}
		try {
			conn = DriverManager.getConnection(URL + DATABASE, USUARIO, PWD);
			conn.setAutoCommit(false);
			return conn;

		} catch (SQLException e) {
			System.out.println("Fallo al abrir conexion");
			e.getStackTrace();
			return conn;
		}
	}

	public void cerrarConexion() throws SQLException{
		try {
		if (conn!=null) {
			conn.rollback(); //Desacer cambios -> (Autocommit = false)
			conn.close();
		}
		}
		catch (SQLException e) {
			throw new SQLException();
		}
	}

}
