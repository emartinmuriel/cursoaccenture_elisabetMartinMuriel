package curso.g06.buclesanidados;

/**
 * Ejercicio 11: Calcular cuántos num primos hay entre 1 y 100
 * 
 * @author e.a.martin.muriel
 *
 */
public class NumPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean esPrimo = true;
		int totalPrimos = 0;
		for (int i = 1; i <= 100; i++) {
			if (i >1) {	// Todos los numeros que no sean 1
				for (int j = 2; j < i && esPrimo == true; j++) { // Este bucle se usa para realizar las divisiones
					if (i % j == 0) {
						esPrimo = false;
					}
				}
			}
			// Comparamos resultados y reasignamos
			if (esPrimo == false) {
				esPrimo = true;
			} else {
				System.out.println(i + " es primo,");
				totalPrimos++;
			}
		}
		System.out.println("Total numeros primos :" + totalPrimos);

	}
}
