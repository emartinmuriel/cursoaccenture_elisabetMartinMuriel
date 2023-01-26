package streams.ejemplo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Ejercicio 01: Streams. Filtrar un ArrayList de 1-10 para obtener los pares.
 * 
 * @author e.a.martin.muriel
 *
 */
public class Streams01 {

	public static void main(String[] args) {
		List<Integer> entrada = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Integer[] listaPares = entrada.stream().filter(e -> e % 2 == 0).toArray(Integer[]::new);

		Arrays.stream(listaPares).forEach(System.out::println);

		// Ahora cuéntamelos **Recordar que un streams solo puede usarse una vez
		Long cuantosPares = entrada.stream().filter(e -> e % 2 == 0).count();
		System.out.println("Total Pares en la coleccion: " + cuantosPares);

		// Streams con iterate
		entrada.stream();
		Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::println);

		// Usando rand tiene que instanciar el objeto random para usarlo
		System.out.println(" ***************************************** Usando rand. Sácame 20 aleatorios ");
		Random numRand = new Random();
		Stream.generate(() -> numRand.nextInt(1000)).limit(20).forEach(System.out::println);

		// Ejemplo de peek. **NOTA: Los métodos intermedios necesitan tener un método
		// final que cierre la cadena
		System.out.println(" ***************************************** Usando peek con rand. Sácame 20 aleatorios.  ");
		Stream.generate(() -> numRand.nextInt(1000)).peek(e -> System.out.println(e+" -- peek")).limit(20)
				.forEach(System.out::println);
		
		
		//Ejemplo de Streams con Range
		IntStream numeros = IntStream.range(3, 15);
			
		
	}

}
