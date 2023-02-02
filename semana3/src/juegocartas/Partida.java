package juegocartas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Partida {
	public final static int NUM_JUG_POKER = 4;
	private final String[] NOMBRES_JUGADORES = { "Miguel", "Andrea", "Dacil", "Yuqian", "Daniela", "Elisabet", "Laura",
			"Angelica", "Eva", "Lucia", "Helena", "Lorena", "Miriam" };
	private Baraja mazoPartida = new Baraja();
	private List<Jugador> jugadores = new ArrayList<Jugador>();
	private Jugador ganador;

	/**
	 * Metodo start: Inicia la partida barajando el mazo y añadiendo a los Jugadores
	 */
	public void start() {
		this.cargarJugadoresAleatorios(NUM_JUG_POKER);
		this.mazoPartida.barajarMazo();
	}

	/**
	 * Metodo ListaBaraja: Imprime por consola el mazo de cartas que aún no se ha
	 * reapartido a los jugadores
	 */
	public void listaBaraja() {
		for (Carta carta : this.mazoPartida.mazo) {
			System.out.println(">> " + carta.toString());
		}
	}

	/**
	 * Metodo: ListarJugadores. Imprime por consola los datos de los jugadores que
	 * componen la partida
	 * 
	 */
	public void listaJugadores() {
		System.out.println("--------------------- JUGADORES en PARTIDA --------------------");
		for (Jugador jug : this.jugadores) {
			System.out.println(">> Nombre: " + jug.getNombre() + ", Edad: " + jug.getEdad());
		}
		System.out.println("---------------------------------------------------------------");
	}

	/**
	 * Metodo: imprimeEstadoPartida. Imprime por consola los datos de los jugadores que
	 * componen la partida y sus cartas asociadas.
	 */
	public void imprimeEstadoPartida() {
		System.out.println("--------------------- Estado de la mano --------------------");
		for (Jugador jug : this.jugadores) {
			jug.listarJugador();
		}
		System.out.println("---------------------------------------------------------------");
	}

	/**
	 * Método: reparteCartas. Saca tantos elementos de la baraja como los indicados
	 * por parámetros y los añade a las cartas (mano) de cada jugador. Lo hace en
	 * orden secuencial.
	 * 
	 * @param cartasXJugador
	 */
	public void reparteCartas(int cartasXJugador) {
		for (int i = 0; i < cartasXJugador; i++) { // Numero de cartas que recibirá cada jugador

			for (Jugador jug : this.jugadores) { // Para cada jugador en orden secuencial

				Iterator<Carta> it = this.mazoPartida.mazo.iterator();
				if (it.hasNext()) {

					jug.addCarta(it.next()); // asigna y elimina la primera carta del mazo por repartir
					it.remove();
				}
			}
		}

	}

	public void rondaDescartes() {

	}

	/**
	 * Metodo cargarJugadores
	 * 
	 * @param numJugadores
	 * 
	 */
	public void cargarJugadoresAleatorios(int numJugadores) {
		ArrayList<String> nomJug = new ArrayList<String>(Arrays.asList(NOMBRES_JUGADORES)); // COnversion para facilitar
																							// // la eliminacion
		Random aleatorio = new Random();
		int index;
		for (int i = 0; i < numJugadores; i++) { // Este bucle controla el número de jugadores a cargar
			index = aleatorio.nextInt(0, nomJug.size());

			Jugador jugador = new Jugador(); // Crear el objeto jugador
			jugador.setNombre(nomJug.get(index));
			jugador.setEdad(aleatorio.nextInt(18, 100));
			this.jugadores.add(jugador); // Añadir jugador a la partida

			nomJug.remove(index); // Eliminar el nombre del jugador cargado del arrayList
		}
	}

}
