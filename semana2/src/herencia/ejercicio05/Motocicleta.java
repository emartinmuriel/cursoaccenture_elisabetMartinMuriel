package herencia.ejercicio05;
/**
 * La clase Motocicleta (subclase de Automovil)
 * @author e.a.martin.muriel
 *
 */
public class Motocicleta extends Automovil {
	int capacidadDeposito;

	// Constructores

	public Motocicleta() {
		super();

	}

	public Motocicleta(int capacidadDeposito) {
		super();
		this.capacidadDeposito = capacidadDeposito;
	}

	public Motocicleta(int numBastidor, int numMarchas, int numRuedas, int velocidadMax, int capacidadDeposito) {
		super(numBastidor, numMarchas, 2, velocidadMax);
		this.capacidadDeposito = capacidadDeposito;

	}

	// getters & setters
	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

}
