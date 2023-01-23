package herencia.ejercicio05;
/**
 * La clase Coche (Subclase de Automovil)
 * @author e.a.martin.muriel
 *
 */
public class Coche extends Automovil implements TodoTerreno {
	private String color;
	private int numPuertas;
	private String modelo;
	private boolean es4X4;

	public Coche() {
		super();
	}

	public Coche(String color, int numPuertas, String modelo) {
		super();
		this.color = color;
		this.numPuertas = numPuertas;
		this.modelo = modelo;
	}

	public Coche(int numBastidor, int numMarchas, int velocidadMax, String color, int numPuertas, String modelo) {
		super(numBastidor, numMarchas, 4, velocidadMax);
		this.color = color;
		this.numPuertas = numPuertas;
		this.modelo = modelo;
	}

	// Getters & Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Implementar el método de la interfaz
	public void activarReductora(boolean activado) {
		this.es4X4=activado;
	}

	@Override
	public boolean activarReductora() {
		return false;
	}

}
