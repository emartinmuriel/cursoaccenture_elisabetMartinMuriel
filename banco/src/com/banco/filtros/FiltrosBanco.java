package com.banco.filtros;

import com.banco.constans.FiltrosConstants;
import com.banco.excepciones.ValidationException;

/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class FiltrosBanco {
	/**
	 * 
	 * @param titular
	 * @return
	 */
	public static boolean longitudTitular(String titular) {
		boolean valido = false;
		if (Filtro.maxLength(titular, FiltrosConstants.MIN_CHAR_TITULAR)
				&& Filtro.maxLength(titular, FiltrosConstants.MAX_CHAR_TITULAR)) {
			valido = true;
		}

		return valido;
	}

	/**
	 * 
	 * @param concepto
	 * @return
	 */
	public static boolean longitudConcepto(String concepto) {
		boolean valido = false;
		if (Filtro.maxLength(concepto, FiltrosConstants.MIN_CHAR_CONCEPTO)
				&& Filtro.maxLength(concepto, FiltrosConstants.MAX_CHAR_CONCEPTO)) {
			valido = true;
		}

		return valido;
	}

	/**
	 * Metodo: cantidadPositiva. Lanza una excepcion de tipo ValidationException al
	 * introducir un valor menor que 0
	 * 
	 * @param cantidad
	 * @throws ValidationException
	 */
	public static void cantidadPositiva(double cantidad) throws ValidationException {
		if (cantidad < 0) {
			throw new ValidationException("No se puede ingresar una cantidad negativa");
		}
	}

}
