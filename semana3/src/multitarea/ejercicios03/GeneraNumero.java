package multitarea.ejercicios03;

import java.util.Random;

public class GeneraNumero implements Runnable {

	Buffer miBuffer;

	public void setBuffer(Buffer bf) {
		this.miBuffer = bf;
	}

	@Override
	public void run() {
		Random aleatorio = new Random();
		while (true) {
			synchronized (miBuffer) {

				while (!miBuffer.esDisponible()) { // Mientras el número no es consumido por el otro objeto.
					try {
						System.out.println("Esperando a que se imprima el numero");
						miBuffer.wait(); // Espera
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				miBuffer.setNum(aleatorio.nextInt()); // Establece los valores
				miBuffer.setDisponible(true);
				miBuffer.notifyAll();

			}
		}
	}
}
