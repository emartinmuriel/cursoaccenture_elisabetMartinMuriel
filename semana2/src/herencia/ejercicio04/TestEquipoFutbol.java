package herencia.ejercicio04;

import java.util.ArrayList;

/**
 * Ejercicio III: Equipo de futbol
 * 
 * @author e.a.martin.muriel
 *
 */
public class TestEquipoFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Persona> equipoFutbol = new ArrayList<Persona>(); //Se puede declarar como List para castear diferentes tipos de colleciones si necesito

		// Instanciacion de objetos e inclusión en array list
		Futbolista p1 = new Futbolista(1, "Chimy", "Avila", 32, 9, "Delantero");
		Futbolista p2 = new Futbolista(2, "Sergio", "Canales", 33, 10, "Centrocampista");
		Entrenador p3 = new Entrenador(3, "Don Manuel", "Pelegrinni", 71, 107);
		Masajista p4 = new Masajista(3, "Kiko", "Flores", 71, "Diplomado Fisiterapeuta", 13);

		equipoFutbol.add(p1);
		equipoFutbol.add(p2);
		equipoFutbol.add(p3);
		equipoFutbol.add(p4);

		for (Persona miembro : equipoFutbol) {
			miembro.concentrarse();

			if (miembro instanceof Masajista) {
				((Masajista) miembro).darMasaje(); // Casteamos de nuevo a la subclase para acceder a sus métodos

			}
			if (miembro instanceof Futbolista) {
				((Futbolista) miembro).entrenar();

			}
			if (miembro instanceof Entrenador) {
				((Entrenador) miembro).dirigirEntrenamiento();

			}
		}

	}

}
