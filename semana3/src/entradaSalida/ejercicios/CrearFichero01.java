package entradaSalida.ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Ejercicio: Programa que pide por teclado los datos: Nombre, Apellido1.
 * 
 * Grabar un fichero con la estructura:
 * 
 * NOMBRE: XXXXXXXXXXXX APELLIDO: yyyyyyyyyyyyy
 * 
 * Otra clase leerá estefichero eimprimirá por pantalla el contenido.
 * 
 * @author e.a.martin.muriel
 *
 */
public class CrearFichero01 {

	public static void main(String[] args) {

		// Leer datos de teclado
		Scanner entradaConsola = new Scanner(System.in);
		String nombre, apellido1;

		System.out.println("Nombre >> ");
		nombre = entradaConsola.next();
		entradaConsola.nextLine();

		System.out.println("Primer Apellido >> ");
		apellido1 = entradaConsola.next();
		entradaConsola.nextLine();

		// Crear fichero

		FileWriter fichero = null;
		PrintWriter pw = null;
		String path = "C:\\Users\\e.a.martin.muriel\\Desktop\\FicherosJava1\\";

		try {
			fichero = new FileWriter(path + "NombreApellidos.txt"); // Abro el fichero para Escritura, si no existe lo
																	// crea.

			pw = new PrintWriter(fichero); // Escribe en el fichero

			pw.println("NOMBRE=" + nombre + "\n");
			pw.println("APELLIDO=" + apellido1);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fichero != null) { // se controla el error
					fichero.close(); // Cerramso fichero
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

		// Lectura de fichero

		LeerFichero01 miLector = new LeerFichero01();
		miLector.imprimeFichero();
	}

}
