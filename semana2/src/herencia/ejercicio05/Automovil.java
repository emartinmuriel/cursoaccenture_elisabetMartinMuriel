package herencia.ejercicio05;

/**
 * La clase automovil
 * 
 * @author e.a.martin.muriel
 *
 */
public class Automovil {
	private int numBastidor;
	private int numMarchas;
	private int velocidadMax;
	private int numRuedas;

	// Constructores

	public Automovil() {
		super();
	}

	public Automovil(int numBastidor, int numMarchas, int numRuedas, int velocidadMax) {
		super();
		this.numBastidor = numBastidor;
		this.numMarchas = numMarchas;
		this.numRuedas = numRuedas;
		this.velocidadMax = velocidadMax;
	}

	// Setters&Getters
	public int getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(int numBastidor) {
		this.numBastidor = numBastidor;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

}
