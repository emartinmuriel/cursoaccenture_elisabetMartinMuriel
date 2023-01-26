package interfaces.ejercicio07;

/**
 * Ejercicio para ver el funcionamiento de Interfaces funcionales y expresiones
 * Lambda
 * 
 * @author e.a.martin.muriel
 *
 */
public class Main {

	public static void main(String[] args) {
		InterFuncional miInterfaz = (a, b) -> (a + b); // Expresión Lamda que implementa el método abstracto de la
														// interfaz funcional automáticamente

		System.out.println(miInterfaz.suma(3, 2));  

	}

}
