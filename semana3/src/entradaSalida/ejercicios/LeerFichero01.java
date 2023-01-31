package entradaSalida.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerFichero01 {

	public void imprimeFichero() {
		File fichero = new File("C:\\Users\\e.a.martin.muriel\\Desktop\\FicherosJava1\\NombreApellidos.txt");
		try (FileReader lector = new FileReader(fichero); BufferedReader bf = new BufferedReader(lector)) { // Try con
																											// resultados
																											// automaticamente
																											// cierra el
																											// fichero
			; // cuando sale del try
			String textoFichero = "";
			int numcar;
			while ((numcar = lector.read()) != -1) { // Hasta fin de archivo
				if ((char) numcar != '\n' && (char) numcar != '\r') {
					textoFichero += (char) numcar;

				} else if ((char) numcar == '\r') {
					textoFichero += ("|");
				}

			}
			String texto = textoFichero.substring(0, textoFichero.length() - 1);
			// Doble split
			String[] arrClaves = texto.split("\\|");
			for (String claveValor : arrClaves) {

				String[] cVal = claveValor.split("=");
				System.out.print(cVal[1] + " ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
