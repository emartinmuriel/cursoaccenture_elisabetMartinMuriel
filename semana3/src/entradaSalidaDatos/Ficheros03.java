package entradaSalidaDatos;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ficheros03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path rutaActual = Paths.get("."); // apunta a al directorio padre de este mismo ficero que estamos escribiendo
											// .java, la ruta padre es la ruta del proyecto
		Path rutaFichero = Paths.get("C:\\Users\\e.a.martin.muriel\\Desktop\\nuevo.txt"); // Apunta a un fichero

		System.out.println("rutaActual es >>" + rutaActual);
		System.out.println("La ruta absoluta de rutaActual es >> " + rutaActual.toAbsolutePath().normalize());

		System.out.println("La raiz de nuevo.txt es >> " + rutaFichero.getRoot());
		System.out.println("getNameCount() de semana3. Numero de paquetes que tiene  >> " + rutaActual.getNameCount());
		System.out.println("FileName de rutaFichero es >> " + rutaFichero.getFileName());
		System.out.println("La raiz de rutaActual es >> " + rutaActual.getRoot());
	}

}
