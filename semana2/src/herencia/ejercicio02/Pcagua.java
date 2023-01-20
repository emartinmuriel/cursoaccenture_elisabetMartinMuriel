package herencia.ejercicio02;

/**
 * La clase Pcagua
 * @author e.a.martin.muriel
 *
 */
public class Pcagua extends Pcongelado {
	private int salinidad; // gramos por litro de sal

	// Contructores
	public Pcagua() {
		super();
		super.setTipo("Congelado por agua");
	}

	public Pcagua(int sal) {
		super();
		super.setTipo("Congelado por agua");
		this.salinidad = sal;
	}

	// getters y setters
	public int getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}

	// Implementacion del método abstracto de la superclase
	public void mostrarInfo() {
		System.out.println("\n**************************************************************");
		System.out.println("TIPO PRODUCTO :" + super.getTipo() + " \nLote: " + super.getNumLote()
				+ ", Fecha de caducidad: " + super.getFechaCaducidad());
		System.out.print(", Temperatura de congelacion: " + super.getTempCongelacion() + "\nComposicion:\n Salinidad: "
				+ this.getSalinidad() + " gramos/litro ");
		System.out.println("\n**************************************************************");
	}

}
