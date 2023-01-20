package herencia.ejercicio02;

/**
 * La clase abstracta Pcongelado
 * @author e.a.martin.muriel
 *
 */
public abstract class Pcongelado extends Producto {
	private int tempCongelacion;

	// Constructores
	protected Pcongelado() {
		super();
	}

	protected Pcongelado(int temperatura) {
		super();
		super.setTipo("Congelado");
		this.tempCongelacion = temperatura;

	}

	// Getters & setters
	public int getTempCongelacion() {
		return tempCongelacion;
	}

	public void setTempCongelacion(int tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}

	// Este metodo lo implementarán las subclases de Pcongelado
	protected abstract void mostrarInfo();

}
