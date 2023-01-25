package com.banco.filtros;

import com.banco.constans.FiltrosConstants;
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
	public boolean longitudTitular(String titular) {
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
	public boolean longitudConcepto(String concepto) {
		boolean valido = false;
		if (Filtro.maxLength(concepto, FiltrosConstants.MIN_CHAR_CONCEPTO)
				&& Filtro.maxLength(concepto, FiltrosConstants.MAX_CHAR_CONCEPTO)) {
			valido = true;
		}

		return valido;
	}
	
	
}
