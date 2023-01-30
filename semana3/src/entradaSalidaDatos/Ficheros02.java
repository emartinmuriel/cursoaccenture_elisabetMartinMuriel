package entradaSalidaDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ficheros02 {

	public static void main(String[] args) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		String path = "C:\\Users\\e.a.martin.muriel\\Desktop\\";

		try {
			fichero = new FileWriter(path + "nuevo.txt"); // Abro el fichero para Escritura, si no existe lo crea.
			
			pw = new PrintWriter (fichero);  //Escribe en el fichero
			
			for (int i=0; i<10; i++) {
				pw.println ("linea "+i);    //Este println es una escritura en el fichero.
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fichero != null) {	//se controla el error
					fichero.close();	//Cerramso fichero
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}

}
