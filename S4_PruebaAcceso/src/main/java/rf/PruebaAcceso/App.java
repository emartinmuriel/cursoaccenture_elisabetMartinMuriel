package rf.PruebaAcceso;

import rf.PruebaAcceso.controller.CountryController;
import rf.PruebaAcceso.models.Country;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Llamamos al controlador a ver que dice!");

		CountryController cc = new CountryController();
		// cc.ListarTodosPaises();

		Country pais = new Country();
		pais.setCountry_id("DE");
		pais.setCountry_name("Alemania");
		System.out.println("Numero de filas afectadas: " + cc.actualizarPais(pais));
		
		//  
		pais.setCountry_id("No_existe");
		
		System.out.println("Numero de filas afectadas: " + cc.eliminarPais(pais));

		
	
		
		
	}
	
	
}
