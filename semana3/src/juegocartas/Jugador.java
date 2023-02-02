package juegocartas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Jugador {
	private String nombre;
	private int edad;
	private ArrayList<Carta> misCartas = new ArrayList<Carta>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @param carta
	 */
	public void addCarta(Carta carta) {
		this.misCartas.add(carta);
	}
	/**
	 * Metodo: ejecutarJugada;
	 */
	public void ejecutarJugada () {
		
	}
	/**
	 * Metodo: ejecutarJugada;
	 */
	public void descartarCarta () {
		
	}
	/**
	 * Metodo : listarJugador. Imprime por pantalla Los datos del jugador y sus
	 * cartas
	 */
	public void listarJugador() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("***************************************************************");
		System.out.println("Jugador: " + this.getNombre());
		System.out.println("Cartas: ");
		for (Carta carta : this.misCartas) {
			carta.pintaCarta();
		}
//		System.out.println(this.misCartas.isEmpty());
		System.out.println("***************************************************************");
	}
}
