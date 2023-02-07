package rf.S4_miniApi2;

import java.sql.SQLException;
import java.util.List;


import rf.S4_miniApi2.controller.CountryController;
import rf.S4_miniApi2.modelos.Country;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        CountryController cController = new CountryController();
        Country datos = new Country();
        datos.setCountry_id("DE");
        datos.setCountry_name("Alemania");
        datos.setRegion_id(3);

     
        
        cController.guardar(datos); //Insertar un registro
        
       System.out.println(cController.leerUno("AU").toString());  //Listar uno
  //     cController.eliminar("DE"); //Elimina a  Alemania de la BBDD
        
    }
    
	public static void imprimeListaPaises(List<Country> lista) {
		for (Country pais : lista) {
			System.out.println("Id pais: " + pais.getCountry_id() + " ,Nombre: " + pais.getCountry_name());

		}
	}
}
