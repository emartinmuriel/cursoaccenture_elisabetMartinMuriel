package rf.PruebaAcceso.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rf.PruebaAcceso.dao.Country_DAO;
import rf.PruebaAcceso.models.Country;

public class CountryController {
	Country_DAO cd = new Country_DAO();

	public void ListarTodosPaises() {
		ArrayList<Country> listaPaises = new ArrayList<Country>();
		try {
			listaPaises.addAll(cd.leerTodos());

			this.imprimeListaPaises(listaPaises);
		} catch (SQLException e) {
			e.getMessage();
		}
	}

	public void imprimeListaPaises(ArrayList<Country> lista) {
		for (Country pais : lista) {
			System.out.println("Id pais: " + pais.getCountry_id() + " ,Nombre: " + pais.getCountry_name());

		}
	}

	public int eliminarPais(Country pais) {
		int regAfect = 0;
		try {
			regAfect = cd.delete(pais);

		} catch (SQLException e) {
			e.getMessage();
		}

		return regAfect;
	}

	public int actualizarPais(Country pais) {
		int regAfect = 0;
		try {
			regAfect = cd.actualizar(pais);

		} catch (SQLException e) {
			e.getMessage();
		}

		return regAfect;
	}

}
