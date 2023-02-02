package juegocartas;

public class Main {
	public static final int REPARTE_PRIMERA_MANO = 5;
	public static final int REPARTE_CARTA = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Partida nuevaPartida = new Partida();

		nuevaPartida.start(); // Empieza la partida

		nuevaPartida.listaBaraja();
		nuevaPartida.listaJugadores();
		nuevaPartida.reparteCartas(REPARTE_PRIMERA_MANO);
		nuevaPartida.imprimeEstadoPartida();
	}

}
