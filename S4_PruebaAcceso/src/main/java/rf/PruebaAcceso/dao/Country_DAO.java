package rf.PruebaAcceso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rf.PruebaAcceso.models.Country;
import rf.PruebaAcceso.utils.OracleJDBC;

public class Country_DAO implements Country_DAOI {
	// Consultas

	public static final String SQL_LEER_TODOS_COUNTRY = "SELECT * FROM COUNTRIES_EMM";
	public static final String SQL_UPDATE_COUNTRY = "UPDATE COUNTRIES_EMM SET COUNTRY_NAME=? WHERE COUNTRY_ID = ?";
	public static final String SQL_DELETE_COUNTRY = "DELETE FROM COUNTRIES_EMM  WHERE COUNTRY_ID = ?";

	@Override
	public Country LeerUno(String country_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> leerTodos() throws SQLException {
		// TODO Auto-generated method stub
		ResultSet resultado = null;
		List<Country> salida = null;
		new ArrayList<Country>();
		OracleJDBC conexion = new OracleJDBC();
		try {

			Connection conn = conexion.abrirConexion();

			Statement stm = conn.createStatement();
			resultado = stm.executeQuery(SQL_LEER_TODOS_COUNTRY);
			if (conexion != null) {
				salida = new ArrayList<Country>();
			}
			salida.addAll(convertAListaCountries(resultado));

		} catch (SQLException e) {
			throw new SQLException();
		} finally {
			if (conexion != null)
				conexion.cerrarConexion();
		}

		return salida;
	}

	@Override
	public int actualizar(Country country) throws SQLException {
		ResultSet resultado = null;
		int error = 0;
		OracleJDBC conexion = new OracleJDBC();
		try {

			Connection conn = conexion.abrirConexion();

			PreparedStatement pStm = conn.prepareStatement(SQL_UPDATE_COUNTRY);
			pStm.setString(1, country.getCountry_name());
			pStm.setString(2, country.getCountry_id());
			resultado = pStm.executeQuery();

			error = 1;

		} catch (SQLException e) {
			throw new SQLException();
		} finally {
			if (conexion != null)
				conexion.cerrarConexion();
		}

		return error;

	}

	@Override
	public int delete(Country country) throws SQLException {
		// TODO Auto-generated method stub

		int error = 0;
		try {
			error = this.delete(country.getCountry_id());

		} catch (SQLException e) {
			throw new SQLException();
		}

		return error;

	}

	@Override
	public int delete(String country_id) throws SQLException {
		// TODO Auto-generated method stub

		OracleJDBC conexion = new OracleJDBC();
		int regAfectados = 0;
		try {
			ResultSet resultado = null;
			Connection conn = conexion.abrirConexion();

			PreparedStatement pStm = conn.prepareStatement(SQL_DELETE_COUNTRY);
			pStm.setString(1, country_id);
			resultado = pStm.executeQuery();

			regAfectados = 1;

		} catch (SQLException e) {
			throw new SQLException();
		} finally {
			if (conexion != null)
				conexion.cerrarConexion();
		}

		return regAfectados;

	}

	@Override
	public Country nuevoCountry(Country pais) {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<Country> convertAListaCountries(ResultSet resultado) throws SQLException {
		ArrayList<Country> listaPaises = new ArrayList<Country>();

		while (resultado.next()) {
			Country datosPais = new Country();
			datosPais.setCountry_id(resultado.getNString("COUNTRY_ID"));
			datosPais.setCountry_name(resultado.getNString("COUNTRY_NAME"));
			listaPaises.add(datosPais);

		}
		return listaPaises;
	}

}
