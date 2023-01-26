package streams.ejemplo01;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Ejemplo de clase: Manejo de streams con ficheros.
 * @author e.a.martin.muriel
 *
 */
public class Streams02 {

	public static void main(String[] args) {
		String path= "C:\\Users\\e.a.martin.muriel\\eclipse-workspace\\cursoJava";
		
		//Buscar todos los ficheros que terminen en .java
		try {
			Stream ficheros = Files.walk(Paths.get(path));
			ficheros
					.filter(s->s.toString().contains(".java"))
					.forEach(System.out::println);	
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
