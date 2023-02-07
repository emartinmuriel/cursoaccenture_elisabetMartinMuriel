package rf.PruebaAcceso.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rf.PruebaAcceso.models.Country;
import rf.PruebaAcceso.models.Employee;
import rf.PruebaAcceso.utils.OracleJDBC;

public class Employees_DAO implements Employee_DAOI{

	@Override
	public Employee LeerUno(int employee_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> leerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int actualizar(Employee empleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Employee empleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int employee_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee nuevoEmployee(Employee Empleado) {
		return null;
	}
	
	public void nuevoEmployee() throws SQLException{

		String query = "INSERT INTO EMPLOYEES_EMM VALUES (300,Elisabet,Martin,EMM,650.124.1214,16-JUL-05,ST_CLERK,3200,null,120,50,null)";
		ResultSet resultado = null;
		List<Country> salida = null;
		new ArrayList<Country>();
		OracleJDBC conexion = new OracleJDBC();
		try {

			Connection conn = conexion.abrirConexion();

			Statement stm = conn.createStatement();
			resultado = stm.executeQuery(query);
			if (conexion != null) {
				System.out.println("conexion = null");
			}

		} catch (SQLException e) {
			throw new SQLException();
		} finally {
			if (conexion != null)
				conexion.cerrarConexion();
		}

	}

}
