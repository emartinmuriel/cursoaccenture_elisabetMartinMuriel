package multitarea.ejercicio03b;

/**
 * Versión del ejercicio Anterior donde la clase Buffer maneja la sincronía del
 * hilo
 * 
 * @author e.a.martin.muriel
 *
 */
public class PresentaNumero implements Runnable {

	Buffer miBuffer;

	public void setBuffer(Buffer bf) {
		this.miBuffer = bf;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (miBuffer) {

				while (miBuffer.esDisponible()) { // Mientras el número no haya sido generado por el otro objeto.
					try {
						System.out.println("Esperando a que se genere el numero");
						miBuffer.wait(); // Espera
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("El número generado es " + miBuffer.getNum()); // Establece los valores
				miBuffer.setDisponible(false);
				miBuffer.notifyAll();
			}
		}
	}
}
