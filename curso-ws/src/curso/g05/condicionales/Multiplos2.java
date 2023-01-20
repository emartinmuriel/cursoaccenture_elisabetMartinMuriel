package curso.g05.condicionales;

/**
 * Ejericio 7. Calcular la suma de los 10 primero número múltiplos de 5
 * 
 * @author e.a.martin.muriel
 *
 */
public class Multiplos2 {
	/**
	 * El método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		int num = 5;
		for (int i = 1; i <= 10; i++) { // Considerando que el 5 sea el primer múltiplo de 5
			suma += (i * num);
		}
		System.out.println("Suma de los primeros 10 múltiplos de " + num + ": " + suma);
	}
}
