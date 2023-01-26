package com.banco.filtros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
		return fecha.isBefore(fMax);
	}

	/**
	 * Metodo fechaMinima. Devuelve false si la fecha es posterior a la fecha mínima
	 * 
	 * @param fecha
	 * @param fMin
	 * @return booleano
	 */
	public static boolean fechaMinima(LocalDate fecha, LocalDate fMin) {
		return fecha.isAfter(fMin);

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
		boolean valida = false;
		if ((fecha.isAfter(fMin) || fecha.isEqual(fMin)) && (fecha.isBefore(fMax) || fecha.isEqual(fMax))) {
			valida = true;
		}
		return valida;
	}
	/**
	 * Comprueba si el formato entrada de fecha es correcto
	 * Se puede no indicar el formato y asumirá "dd-mm-YYYY"
	 * @param fecha
	 * @param String (formato)
	 * @return : LocalDate con la Fecha o null
	 */
	public static LocalDate validaFormatoFecha (LocalDate fecha, String formato) {
		
		fecha.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(formato);
		//
		String cadFecha = fecha.format(formatoFecha);
		LocalDate fvalida = LocalDate.parse(cadFecha);
		return fvalida;
	}
	public static LocalDate validaFormatoFecha (LocalDate fecha) {
		return validaFormatoFecha ( fecha, "dd-mm-YYYY");
	}

}
