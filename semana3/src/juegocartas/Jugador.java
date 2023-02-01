package juegocartas;

import java.util.HashSet;
import java.util.Set;

public class Jugador {
	private String nombre;
	private String edad;
	private Set<Carta> misCartas = new HashSet<Carta>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @param carta
	 */
	public void addCarta (Carta carta) {
		this.misCartas.add(carta);
	}
	/**
	 * 
	 */
	public void descarte () {
		
	}
}
