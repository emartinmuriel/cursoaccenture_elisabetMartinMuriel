package multitarea.ejercicios03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buffer bf = new Buffer();
		bf.setDisponible(false); // Inicializa el buffer

		GeneraNumero genNum = new GeneraNumero();
		genNum.setBuffer(bf);

		PresentaNumero presNum = new PresentaNumero();
		presNum.setBuffer(bf);

		/*
		 * Añadimos las clases sincronizadas a los hilos creados (pq implemnetan la
		 * interfaz Runnable)
		 */
		Thread hilo1 = new Thread(genNum);
		Thread hilo2 = new Thread(presNum);

		hilo1.start(); // Lanzamos cada uno de los hilos
		hilo2.start();
	}

}
