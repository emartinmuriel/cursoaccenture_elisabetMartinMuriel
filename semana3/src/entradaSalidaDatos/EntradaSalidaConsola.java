package entradaSalidaDatos;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class EntradaSalidaConsola {

	public static void main(String[] args) {

//		try {

			Scanner entradaConsola = new Scanner(System.in);
			int num1, num2;

			System.out.println("Introduce un numero >> ");
			num1 = entradaConsola.nextInt();
			entradaConsola.nextLine(); // Si no pongo el nextLine para limpiar el buffer, usa el delimitador de espacio
										// comiendose el siguiente entero en la misma lines, lo deja en buffer

			System.out.println("Introduce otro numero >> ");
			num2 = entradaConsola.nextInt();
			entradaConsola.nextLine();

			System.out.format("Primer numero %d , segundo numero es %d", num1, num2);
//		} catch (IOException e) {}   // No se pueden capturar excepciones de system.in
	}

}
