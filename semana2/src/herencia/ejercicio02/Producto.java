package herencia.ejercicio02;

/**
 * La clase Producto
 * @author e.a.martin.muriel
 *
 */
public abstract class Producto {
	private String numLote;
	private String fechaCaducidad;
	private String tipo;

	protected Producto() {
		super();
	}

	protected Producto(String nLote, String fCad) {
		this.fechaCaducidad = fCad;
		this.numLote = nLote;
	}

	public String getNumLote() {
		return numLote;
	}

	public void setNumLote(String numLote) {
		this.numLote = numLote;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaEnvasado) {
		this.fechaCaducidad = fechaEnvasado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// metodo abstracto
	protected abstract void mostrarInfo();

}
