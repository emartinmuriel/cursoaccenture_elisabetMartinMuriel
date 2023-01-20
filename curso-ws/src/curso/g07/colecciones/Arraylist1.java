package curso.g07.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Ejercicio: Crear e insertar elementos en un ArrayList
 * @author e.a.martin.muriel
 *
 */
public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] miArray= {"cad", "cad2", "cad3"};
		List<String> miListaCadenas = new ArrayList <String>();
		List<Integer> miListaEnteros = new ArrayList<Integer>() {{ add(3); add(1); add(4); }};
		//Añadir los elementos al ArrayList a mano
		
		/*miLista.add("uno");
		miLista.add("dos");
		miLista.add("tres");
		miLista.add("cuatro");*/
		
		miListaCadenas.addAll(Arrays.asList(miArray));
		//Imprimir en pantalla
		for (String elemento : miListaCadenas)
			System.out.println(elemento);


	
	//Otra forma de inicializar el ArrayList -- siempre a través de un array parseado a Lista
	List<String> miOtraLista = new ArrayList<String>(Arrays.asList("más","y más", "y más más"));
	//Imprimir en pantalla
	for (String elemento : miOtraLista)
		System.out.println(elemento);
	}
}
