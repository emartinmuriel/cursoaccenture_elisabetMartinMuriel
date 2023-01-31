package entradaSalida.ejercicios.juego;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {

		boolean aciertoMaquina = false;
		boolean aciertoUsuario = false;
		Random aleatorio = new Random();
		int num = aleatorio.nextInt(100);
		int resUsu, min = 0, max = 100;
		int resMaq = -1;
		String res;

		Scanner entrada = new Scanner(System.in); // preparamos la entrada

		System.out.println("Tienes que adivinar un numero entre 0 y 100 ");

		do {

			System.out.print("\n ¿que numero es ? >> ");
			resUsu = entrada.nextInt();
			entrada.nextLine();
			if (resUsu == num) {
				System.out.println("oleeeee! has acertado");
				aciertoUsuario = true;  //Termina el juego
			} else {

				// Respuesta al usuario
				if (resUsu < num) {

					System.out.println("Tira más arriba");
				}else {
					System.out.println("Tira más abajo");
				}
		

				// turno para adivinar el numero del usuario
				if (resMaq < 0) {
					resMaq = aleatorio.nextInt(100);
				} else {
					resMaq = aleatorio.nextInt(min+1, max);
				}

			

				do {
					System.out.print("\nTu numero es " + resMaq + "?? [S]i  [M]ayor  meno[R]  >> ");
					res = entrada.next();
					entrada.nextLine();
					
					System.out.println(res);
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
		} while (aciertoUsuario == false && aciertoMaquina == false);

	}

}
