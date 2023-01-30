package entradaSalida.ejercicios;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class LeerFichero01 {

	public void imprimeFichero()
	{	
		File fichero = new File("C:\\Users\\e.a.martin.muriel\\Desktop\\FicherosJava1\\NombreApellidos.txt");
		try (Scanner lectorFichero = new Scanner(fichero)) { // Try con resultados automaticamente cierra el fichero
																// cuando sale del try
			lectorFichero.useDelimiter("\n"); 
			String textoFichero="";
			while (lectorFichero.hasNext()) {
				textoFichero += lectorFichero.nextLine() + " ";
			
			}
			System.out.println(textoFichero);

		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
