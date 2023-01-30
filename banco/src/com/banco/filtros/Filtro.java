package com.banco.filtros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * La clase Filtro. Esta clase provee varios métodos para validar entradas de
 * datos.
 * 
 * @author e.a.martin.muriel
 *
 */
public class Filtro {
	/**
	 * El método minLength. Determina si un texto tiene una longitud superior a la
	 * pasada por parámetro.
	 * 
	 * @param cad
	 * @param min
	 * @return booleano
	 */
	public static boolean minLength(String cad, int min) {
		boolean valido = true;
		if (cad.length() < min) {
			valido = false;
		}
		return valido;

	}

	/**
	 * Metodo longitudValida. Devuelve true si la longitud de la cadena pasado por
	 * parámetro está comprendida entre los valores minimo y máximo (ambos
	 * inclusive) pasados por parámetro.
	 * 
	 * @param cad
	 * @param min
	 * @param max
	 * @return booleano
	 */
	public static boolean longitudValida(String cad, int min, int max) {

		return minLength(cad, min) && maxLength(cad, max);

	}

	/**
	 * Método maxLength. Determina si un texto tiene una longitud es inferior a la
	 * pasada por parámetro.
	 * 
	 * @param cad
	 * @param max
	 * @return booleano
	 */
	public static boolean maxLength(String cad, int max) {
		boolean valido = true;
		if (cad.length() > max) {
			valido = false;
		}
		return valido;

	}

	/**
	 * Metodo fechaMaxima. Devuelve true si la fecha es inferior a la fecha máxima
	 * 
	 * @param fecha
	 * @param fMax
	 * @return booleano
	 */
	public static boolean fechaMaxima(LocalDate fecha, LocalDate fMax) {
		return fecha.isBefore(fMax) || fecha.isEqual(fMax);
	}

	/**
	 * Metodo fechaMinima. Devuelve false si la fecha es posterior a la fecha mínima
	 * 
	 * @param fecha
	 * @param fMin
	 * @return booleano
	 */
	public static boolean fechaMinima(LocalDate fecha, LocalDate fMin) {
		return fecha.isAfter(fMin) || fecha.isEqual(fMin);

	}

	/**
	 * Metodo fechaValida. Devuelve true si la fecha pasada está comprendida entre
	 * las otras dos( ambas inclusive).
	 * 
	 * @param fecha
	 * @param fMin
	 * @param fMax
	 * @return
	 */
	public static boolean fechaValida(LocalDate fecha, LocalDate fMin, LocalDate fMax) {

		return fechaMinima(fecha, fMin) && fechaMaxima(fecha, fMax);
	}

	/**
	 * Comprueba si el formato entrada de fecha es correcto Se puede no indicar el
	 * formato y asumirá "dd-mm-YYYY"
	 * 
	 * @param String fecha
	 * @param String (formato)
	 * @return : LocalDate con la Fecha o null
	 */
	public static LocalDate validaFormatoFecha(String fecha, String formato) {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(formato);
		try {
			return LocalDate.parse(fecha, formatoFecha);
		} catch (DateTimeParseException e) {
			return null;
		}

	}

	public static LocalDate validaFormatoFecha(String fecha) {
		return validaFormatoFecha(fecha, "dd-mm-YYYY");
	}

}
