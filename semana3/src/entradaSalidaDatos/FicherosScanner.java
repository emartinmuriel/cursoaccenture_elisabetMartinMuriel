package entradaSalidaDatos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FicherosScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("C:\\Users\\e.a.martin.muriel\\Desktop\\pruebaJava.txt");
		try (Scanner lectorFichero = new Scanner(fichero)) { // Try con resultados automaticamente cierra el fichero
																// cuando sale del try
			lectorFichero.useDelimiter("\n"); // usa de delimitador el salto de línea

			while (lectorFichero.hasNext()) {
				String textoFichero = lectorFichero.nextLine(); // Lee el fichero especificado (En este caso es fichero
																// de texto)
				System.out.println(textoFichero);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
