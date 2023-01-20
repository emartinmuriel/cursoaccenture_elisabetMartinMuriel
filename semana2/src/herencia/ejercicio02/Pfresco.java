package herencia.ejercicio02;

/**
 * La clase Pfresco. 
 * @author e.a.martin.muriel
 *
 */
public class Pfresco extends Producto {
	private String fechaEnvasado;
	private String paisOrigen;

	public Pfresco() {
		super();
		super.setTipo("Fresco");
	}

	public Pfresco(String fEnv, String pOrig) {
		super();
		super.setTipo("Fresco");
		this.fechaEnvasado = fEnv;
		this.paisOrigen = pOrig;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	// metodo abstracto
	public void mostrarInfo() {
		System.out.println("\n**************************************************************");
		System.out.println("TIPO PRODUCTO :" + super.getTipo() + " \nLote: " + super.getNumLote()
		+ ", Fecha de caducidad: " + super.getFechaCaducidad());
		System.out.print(" \"Fecha de envasado: " + this.getFechaEnvasado() + "\nPais de Origen: " + this.getPaisOrigen());
		System.out.println("\n**************************************************************");
	}
}
