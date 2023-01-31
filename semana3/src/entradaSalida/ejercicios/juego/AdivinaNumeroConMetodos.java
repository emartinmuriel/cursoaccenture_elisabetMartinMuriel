package entradaSalida.ejercicios.juego;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeroConMetodos {
	static boolean aciertoMaquina = false;
	static boolean aciertoUsuario = false;
	static Random aleatorio = new Random();
	static int num = aleatorio.nextInt(100);
	static int min = 1;
	static int max = 100;

	static Scanner entrada = new Scanner(System.in); // preparamos la entrada

	public static void main(String[] args) {

		System.out.println("Vamos a jugar a un juego..Tienes que adivinar un numero entre 1 y 100.");

		do {
			turnoUsuario();
			if (!aciertoUsuario) {
				turnoMaquina();
			}
		} while (!aciertoUsuario && !aciertoMaquina);

		entrada.close(); // Cerrar Scanner
	}

	/**
	 * EL metodo turnoUsuario
	 */
	static void turnoUsuario() {
		int resUsu;
		System.out.print("\n ¿que numero es el mio? >> ");
		resUsu = entrada.nextInt();
		entrada.nextLine();
		if (resUsu == num) {
			System.out.println("oleeeee! has acertado");
			aciertoUsuario = true; // Termina el juego
		} else {

			// Respuesta al usuario
			if (resUsu < num) {
				System.out.println("Tira más arriba");
			} else {
				System.out.println("Tira más abajo");
			}
		}

	}

	/**
	 * El método turnoMaquina para adivinar el numero del usuario
	 */
	static void turnoMaquina() {
		int resMaq;
		String res;
		resMaq = aleatorio.nextInt(min + 1, max);

		do {
			System.out.print("\nTu numero es " + resMaq + "?? [S]i  [M]ayor  meno[R]  >> ");
			res = entrada.next();
			entrada.nextLine();

			switch (res) {
			case "S":
				aciertoUsuario = true; // Termina juego
				System.out.println("ole!ole!ole! He acertado");
				break;
			case "M":
				min = resMaq;
				break;
			case "R":
				max = resMaq;
				break;
			}
		} while (!res.equals("S") && !res.equals("M") && !res.equals("R"));
	}

}