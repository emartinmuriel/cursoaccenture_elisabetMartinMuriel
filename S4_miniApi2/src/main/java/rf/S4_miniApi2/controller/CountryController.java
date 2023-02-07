package rf.S4_miniApi2.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import rf.S4_miniApi2.dao.CountryDao;
import rf.S4_miniApi2.modelos.Country;

public class CountryController {
	CountryDao cd = new CountryDao();

//	public List<Country> leerTodos() throws SQLException {
//		return cd.obtenerCountries();
//	}

	public Country leerUno(String id) {
		return cd.buscar(id);
	}

	public void eliminar(Country pais) throws SQLException {
		cd.eliminar(pais);
	}

	public void eliminar(String id_pais) throws SQLException {
		cd.eliminar(id_pais);
	}

	public void actualizar(Country pais) throws SQLException {
		cd.eliminar(pais);
	}

	public void guardar(Country pais) throws SQLException {
		cd.editar(pais);
	}

}
