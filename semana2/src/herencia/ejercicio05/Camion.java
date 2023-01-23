package herencia.ejercicio05;
/**
 * La clase Camion 
 * @author e.a.martin.muriel
 *
 */
public class Camion extends Automovil {
	int pesoMax;
	int precio;

	// Cosntructores
	public Camion() {
		super();
	}

	public Camion(int pesoMax, int precio) {
		super();
		this.pesoMax = pesoMax;
		this.precio = precio;
	}

	public Camion(int numBastidor, int numMarchas, int numRuedas, int velocidadMax, int pesoMax, int precio) {
		super(numBastidor, numMarchas, 4, velocidadMax);
		this.pesoMax = pesoMax;
		this.precio = precio;

	}

	// getters &setters
	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
