package juegocartas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Partida nuevaPartida = new Partida();

		nuevaPartida.start(); // Empieza la partida

		nuevaPartida.listaBaraja();
		nuevaPartida.listaJugadores();
		nuevaPartida.reparteCartas(5);
		nuevaPartida.imprimeEstadoPartida();

	}

}
