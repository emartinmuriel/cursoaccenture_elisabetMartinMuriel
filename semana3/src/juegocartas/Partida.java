package juegocartas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Partida {
	public final static int NUM_JUG_POKER = 4;
	private final String[] NOMBRES_JUGADORES = { "Miguel", "Andrea", "Dacil", "Yuqian", "Daniela", "Elisabet", "Laura",
			"Angelica", "Eva", "Lucia", "Helena", "Lorena" };
	private Baraja mazoPartida = new Baraja();
	private List<Jugador> jugadores = new ArrayList<Jugador>();
	private Jugador ganador;

	/**
	 * Metodo start: Inicia la partida barajando el mazo
	 */
	public void start() {
		this.cargarJugadoresAleatorios(NUM_JUG_POKER);
		this.mazoPartida.barajarMazo();
	}
	
	public void listaBaraja() {
		for (Carta carta : this.mazoPartida.mazo) {
			System.out.println( ">> " + carta.toString());
		}
	}
	
	public void listaJugadores() {
		System.out.println( "JUGADORES en PARTIDA");
		for (Jugador jug : this.jugadores) {
			System.out.println( ">> Nombre: " + jug.getNombre() + ", Edad: "+ jug.getEdad());
		}
	}
	public void reparteCartas() {

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
		ArrayList<String> nomJug = new ArrayList<String>(Arrays.asList(NOMBRES_JUGADORES)); // COnversion para facilitar																				// la eliminacion
		Random aleatorio = new Random();
		int index;
		for (int i = 0; i < numJugadores; i++) { // Este bucle controla el número de jugadores a cargar
			index = aleatorio.nextInt(0, nomJug.size());

			
			Jugador jugador = new Jugador();	// Crear el objeto jugador
			jugador.setNombre(nomJug.get(index)); 
			jugador.setEdad(aleatorio.nextInt(18, 100)); 
			this.jugadores.add(jugador);		//Añadir jugador a la partida
			
			nomJug.remove(index); // Eliminar el nombre del jugador cargado del arrayList
		}
	}

}
