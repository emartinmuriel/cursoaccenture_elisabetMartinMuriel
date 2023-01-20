package curso.g06.buclesanidados;

/**
 * Ejercicio 9 : Tablas de multiplicar del 1 a 10
 * 
 * @author e.a.martin.muriel
 *
 */
public class TablasMultiplicar {
	/**
	 * El método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {					//Estos bucles anidados muestran por pantalla las tablas de multiplicar
			System.out.println("\nTabla del " + i);
			System.out.println("********************");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}

}
