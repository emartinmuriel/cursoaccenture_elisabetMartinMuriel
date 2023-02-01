package multitarea.ejercicio03b;
/**
 * Versión del ejercicio Anterior donde la clase Buffer maneja la sincronía del hilo
 * @author e.a.martin.muriel
 *
 */
public class Buffer {
	private boolean disponible;
	private int num;

	public boolean esDisponible() {
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = false;
	}

	public synchronized int getNum() {  //Sincronizando el método
		
		while (!this.disponible) {
			System.out.println("Esperando numero");
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		this.setDisponible(false);
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
