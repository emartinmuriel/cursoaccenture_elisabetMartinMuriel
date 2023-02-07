package rf.S4_miniApi2.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import rf.S4_miniApi2.modelos.Country;
import rf.S4_miniApi2.service.JPAUtil;

public class CountryDao {
	EntityManager manager = JPAUtil.getEntityManager();
	
	
	// guardar Country
	public void guardar(Country Country) {
		manager.getTransaction().begin();
		manager.persist(Country);
		manager.getTransaction().commit();		
	}

	// editar Country
	public void editar(Country Country) {
		manager.getTransaction().begin();
		manager.merge(Country);
		manager.getTransaction().commit();
	}

	// buscar Country
	public Country buscar(String id) {
		
		Country c = manager.find(Country.class, id);
		return c;
	}

	/// eliminar Country
	public void eliminar(String id) {
		Country c = manager.find(Country.class, id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}
	
	/// eliminar Country
	public void eliminar(Country pais) {
		Country c = manager.find(Country.class, pais.getCountry_id());
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}

	// obtener todos los Country
//	public List<Country> obtenerCountries() {
//		List<Country> listaCountries = new ArrayList<>();
//		Query q = manager.createQuery("SELECT c FROM Countries_emm c");
//		listaCountries = (List<Country>) q.getResultList();
//		return listaCountries;
//	}
}
