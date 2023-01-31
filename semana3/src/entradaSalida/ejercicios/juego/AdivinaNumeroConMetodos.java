package entradaSalida.ejercicios.juego;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeroConMetodos {
	static boolean finJuego = false;
	static Random aleatorio = new Random();
	static int num = aleatorio.nextInt(100);
	static int min = 0;
	static int max = 100;

	static Scanner entrada = new Scanner(System.in); // preparamos la entrada

	public static void main(String[] args) {

		System.out.println("Vamos a jugar a un juego..Tienes que adivinar un numero entre 1 y 99.");

		do {
			turnoUsuario();
			if (!finJuego) {
				turnoMaquina();
			}
		} while (!finJuego);

		entrada.close(); // Cerrar Scanner
	}

	/**
	 * EL metodo turnoUsuario
	 */
	static void turnoUsuario() {
		int resUsu;
		System.out.print("\nTe toca..¿cual es mi numero? >> ");
		resUsu = entrada.nextInt();
		entrada.nextLine();
		if (resUsu == num) {
			System.out.println("oleeeee! has acertado");
			finJuego = true; // Termina el juego
		} else {

			// Respuesta al usuario
			if (resUsu < num) {
				System.out.println("no no.. un pokito más arriba");
			} else {
				System.out.println("no no.. un pokito más abajo");
			}
		}

	}

	/**
	 * El método turnoMaquina para adivinar el numero del usuario
	 */
	static void turnoMaquina() {
		int resMaq;
		String res;
		resMaq = (min+max)/2;

		do {
			System.out.print("\nAhora me toca mi!! .. mmm ..Tu numero es " + resMaq + "??(Respuesta: [S]i  [M]ayor  meno[R]) >> ");
			res = entrada.next();
			entrada.nextLine();

			switch (res) {
			case "S":
				finJuego = true; // Termina juego
				System.out.println("ole!ole!ole! He acertado");
				break;
			case "M":
				min = resMaq;
				detectorDeMentiras(resMaq);
				break;
			case "R":
				max = resMaq;
				detectorDeMentiras(resMaq);
				break;
			}
		} while (!res.equals("S") && !res.equals("M") && !res.equals("R"));
	}

	static void detectorDeMentiras(int resMaq) {
		if (min==max||min>max||max<min || max==(min+1)) {
			finJuego = true; // Termina juego
			System.out.println("Ehhh! no hagas trampa!! segun lo que has dicho no hay otra posibilidad!! Tu número es " + resMaq);
		}

	}
}