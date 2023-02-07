package rf.PruebaAcceso.dao;

import java.sql.SQLException;
import java.util.List;

import rf.PruebaAcceso.models.Country;


public interface Country_DAOI {
	public Country LeerUno(String country_id);

	public List<Country> leerTodos() throws SQLException;

	public int actualizar(Country country) throws SQLException;

	public int delete(Country country) throws SQLException ;

	public int delete(String country_id) throws SQLException;

	public Country nuevoCountry(Country pais)throws SQLException ;
}
