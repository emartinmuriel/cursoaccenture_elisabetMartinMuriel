package entradaSalidaDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CrearMoverFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Copiando archivos de un directorio a otro, seguidamente lo vamos a mover a
		// otro directorio
		try {
			Path rutaFichero = Paths.get("C:\\Users\\e.a.martin.muriel\\Desktop\\", "nuevo.txt"); // Archivo a copiar
			Path nuevaRuta = Paths.get("C:\\Users\\e.a.martin.muriel\\Desktop\\FicherosJava1", "copiaNuevo.txt");
			Path ruta1 = Paths.get("C:\\Users\\e.a.martin.muriel\\Desktop\\FicherosJava1\\copiaNuevo.txt");
			Path ruta2 = Paths.get("C:\\Users\\e.a.martin.muriel\\Desktop\\FicherosJava2");
			Path copia = Files.copy(rutaFichero, nuevaRuta, StandardCopyOption.REPLACE_EXISTING);

			// Ahora movemos el fichero al otro directorio
			Path mov = Files.move(ruta1, ruta2, StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			e.printStackTrace();   
		}

	}

}
