package curso.g05.condicionales;

/**
 * La Clase Cuadrado.
 * Ejercicion 5. De una colección de números introducidos por teclado
 * 				Calcular sus cuadrados y mostrarlo pro pantalla.
 * @author e.a.martin.muriel
 *
 */
public class Cuadrado {
	/**
	 * El método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int cuadrado;
		System.out.println("*** Calcula los cuadrados de una colleción de números pasados como argumentos a main***");
		for (int i=0; i<= args.length-1; i++) {  //Recorre el array de los argumentos de entrada a Main
			numero= Integer.parseInt(args[i]) ;
			cuadrado = calCuadrado(numero);
			System.out.println("El cuadrado del número " + numero + " es "+ cuadrado);
		}	
	}
	/**
	 * El método calCuadrado:
	 * Calcula el cuadrado de un número entero
	 * @param num
	 * @return num al cuadrado
	 */
	public static int calCuadrado (int num) {
		return (num*num);
	}
}
