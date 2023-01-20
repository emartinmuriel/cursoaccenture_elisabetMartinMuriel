package curso.g05.condicionales;

/**
 * Ejericicio 8. Calcular factorial.
 * 
 * @author e.a.martin.muriel
 *
 */
public class Factorial {
	/**
	 * EL método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		int factorial = 0;
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

	/**
	 * Metodo factorial: Calcula el factorial de manera recursiva
	 * 
	 * @param num
	 * @return factorial del número
	 */
	public static int factorial(int num) {
		int fact;
		if (num == 0) { // Caso base
			fact = 1;
		} else {
			fact = num * factorial(num - 1); // Llamada a un caso más simple
		}
		return fact;
	}
}
