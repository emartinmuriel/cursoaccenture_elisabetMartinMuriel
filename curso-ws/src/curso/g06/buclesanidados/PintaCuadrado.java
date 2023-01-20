package curso.g06.buclesanidados;

/**
 * Ejercicio 10: Dibuja cuadrado
 * 
 * @author e.a.martin.muriel
 *
 */
public class PintaCuadrado {
	/**
	 * El metodo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int h = 8; h >= 1; h--) {
			for (int base = 8; base >= 1; base--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
