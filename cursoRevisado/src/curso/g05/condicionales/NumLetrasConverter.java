package curso.g05.condicionales;

/**
 * Ejercicio 4. Conversor de números a texto
 * 
 * @author e.a.martin.muriel
 *
 */
public class NumLetrasConverter {

	/**
	 * El metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) { // Imprime del 0 al 99
			System.out.println(convierteATexto(i));
		}
	}

	/**
	 * El método convierteATexto
	 * 
	 * @param num
	 * @return string
	 */
	public static String convierteATexto(int num) {
		String texto = "";
		int dec = num / 10;
		int und = num % 10;
		String[] arrNum = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
		String[] arrDieci = { "Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete",
				"Dieciocho", "Diecinueve" };
		String[] arrDecenas = { "Treinta", "Cuarenta", "Ciencuenta", "Sesenta", "Setenta", "Ochenta", "Noventa" };

		switch (dec) {
		case 0:
			texto += arrNum[und];
			break;
		case 1:
			texto += arrDieci[und];
			break;
		case 2:
			if (und == 0) {
				texto += "Veinte";
			} else {
				texto += "Veinti";
				texto += arrNum[und];
			}
			break;
		default:
			texto += arrDecenas[dec - 3];
			texto += " y ";
			texto += arrNum[und];
			break;
		}
		return texto;
	}
}
