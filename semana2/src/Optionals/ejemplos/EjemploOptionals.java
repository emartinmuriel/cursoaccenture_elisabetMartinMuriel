package Optionals.ejemplos;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Optional;

/**
 * Ejemplos de clase de uso de Optional
 * 
 * @author e.a.martin.muriel
 *
 */
public class EjemploOptionals {

	public static void main(String[] args) {

		String cad = null;
		Optional<String> opcional = Optional.ofNullable(cad); // Carga el objeto en un optional

		opcional.ifPresent(cadena -> System.out.println(cad.length())); // Si no es nulo que imprima la longitud de la
																		// cadena

		// SI es nulo, asignar por defecto
		System.out.println(Optional.ofNullable(cad).orElse("Como es cad es nulo,Pues entonces este valor"));
		
		
		//Jugando con fechas
		LocalDate fecha = LocalDate.of(2001, 9, 1);
		System.out.println(fecha.getDayOfWeek());
		System.out.println(fecha.getMonthValue());
		System.out.println(fecha.toString());
		System.out.println(fecha.range(ChronoField.DAY_OF_MONTH));
		System.out.println(fecha.toEpochDay()+" dias han pasado desde entonces");
		}

}
