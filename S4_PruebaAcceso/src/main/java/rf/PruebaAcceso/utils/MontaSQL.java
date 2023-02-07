package rf.PruebaAcceso.utils;

public class MontaSQL {

	public String MontaConsulta(String[][] valores) {
		String cadQuery = "";
		
		return cadQuery;
	}

	public String claveValor(String cadena,String nombreCampo, int valor, String separador) {
		Integer val = valor;
		if (cadena!=null) {
			cadena += separador+"nombreCampo=" + val.toString() ;
		}
		
		return cadena;

	}

	public String claveValor(String cadena,String nombreCampo, double valor, String separador) {
		Double val = valor;
		if (cadena!=null) {
			cadena += separador+"nombreCampo=" + val.toString() ;
		}
		return cadena;
	}

	public String claveValor(String cadena,String nombreCampo, float valor, String separador) {
		Float val = valor;
		if (cadena!=null) {
			cadena += separador+"nombreCampo=" + val.toString() ;
		}
		return cadena;
	}
	


	public String claveValor(String cadena,String nombreCampo, String valor, String separador) {
		String cadQuery = "";
		cadQuery += separador + "nombreCampo=\'" + valor + "\'";
		return cadQuery;

	}
}
