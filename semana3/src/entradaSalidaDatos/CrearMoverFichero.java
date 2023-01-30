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

		

		// Copiando archivos de un directorio a otro, seguidamente lo vamos a mover a otro directorio
		try {
			Path rutaFichero = Paths.get("C:\\Users\\e.a.martin.muriel\\Desktop\\", "nuevo.txt"); // Archivo a copiar
			Path nuevaRuta = Paths.get("C:\\Users\\e.a.martin.muriel\\Desktop\\FicherosJava1", "copiaNuevo.txt");
	
			Path copia = Files.copy(rutaFichero, nuevaRuta, StandardCopyOption.REPLACE_EXISTING);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		

	}

}
