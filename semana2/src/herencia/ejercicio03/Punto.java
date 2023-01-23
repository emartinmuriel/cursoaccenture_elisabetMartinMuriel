package herencia.ejercicio03;
/**
 * Añadido al ejerccicio: Composición en Objetos
 * @author e.a.martin.muriel
 *
 */
public class Punto {
	private int coordenadaX;
	private int coordenadaY;

	// COnstructores
	public Punto() {
		super();
	}

	public Punto(int coordenadaX, int coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	// getters y setters
	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

}
