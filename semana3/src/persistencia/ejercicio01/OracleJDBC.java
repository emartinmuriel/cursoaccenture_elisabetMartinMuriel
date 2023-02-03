package persistencia.ejercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
	private static Connection conn;
	public static final String USUARIO = "hr";
	public static final String PWD = "hr";
	public static final String DATABASE = "";
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL_LOCAL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";

	// Consultas
	public static final String SQL_LEER_TODOS = "SELECT FIRST_NAME FROM EMPLOYEES_EMM";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName(JDBC_DRIVER);

		} catch (ClassNotFoundException e) {
			System.out.println("Driver JDBC no encontrado");
			return;
		}

		conn = null;
		try {
			conn = DriverManager.getConnection(URL + DATABASE, USUARIO, PWD);

		} catch (SQLException e) {
			System.out.println("Fallo al abrir conexion");
			e.getStackTrace();
			return;
		}

		lectura();

		if (conn != null) {
			System.out.println("Has conectado con la BBDD");
			conn.close();
		} else {
			System.out.println("Fallo al realizar la conexión");
		}
	}

	// Metodos

	public static void lectura() throws SQLException {

		ResultSet rs = null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS);

			while (rs.next()) {
				System.out.print("Numfila ->" + rs.getRow() + "  Contenido -> "); // Empieza en 1. decuelve el numero de fila del resultset. a la que
													// apunta el Iterator del resultset
				System.out.println(rs.getString("FIRST_NAME"));

			}
		} catch (SQLException e) {
			System.out.println(SQL_LEER_TODOS + " " + e.getMessage());
		} finally { // Controlamos el cierre ya que la excepcion puede ser dada por el RS o el
					// Stament
			if (rs != null)
				rs.close();
		}
	}

}
