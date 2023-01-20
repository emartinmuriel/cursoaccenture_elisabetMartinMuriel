package herencia.ejercicio02;
/**
 * La clase PcNitro 
 * @author e.a.martin.muriel
 *
 */
public class PcNitro extends Pcongelado {

	private String metodoCongelacion;
	private int totalSeg;

	// constructores
	public PcNitro() {
		super();
		super.setTipo("Congelado por nitrogeno");
	}

	// constructores
	public PcNitro(String metodo, int totalSeg) {
		super();
		super.setTipo("Congelado por nitrogeno");
		this.totalSeg = totalSeg;
		this.metodoCongelacion = metodo;
	}

	// Getters y setters
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public int getTotalSeg() {
		return totalSeg;
	}

	public void setTotalSeg(int totalSeg) {
		this.totalSeg = totalSeg;
	}

	// Implementacion del método abstracto de la superclase
	public void mostrarInfo() {
		System.out.println("\n**************************************************************");
		System.out.println("TIPO PRODUCTO :" + super.getTipo() + " \nLote: " + super.getNumLote()
				+ ", Fecha de caducidad: " + super.getFechaCaducidad());
		System.out.print(
				", Temperatura de congelacion: " + super.getTempCongelacion() + "\nMétodo de cogelacion empleado: "
						+ this.metodoCongelacion + ", Total segundos: " + this.getTotalSeg());
		System.out.println("\n**************************************************************");
	}
}
