package herencia.ejercicio02;
/**
 * La clase Prefrigerado. 
 * @author e.a.martin.muriel
 *
 */
public class Prefrigerado extends Producto {
	private String CodOrgControl;

	// constructor
	public Prefrigerado() {
		super();
		super.setTipo("Refrigerado");
	}

	public Prefrigerado(String CodOrgControl) {
		super();
		super.setTipo("Refrigerado");
		this.CodOrgControl = CodOrgControl;
	}

	public String getCodOrgControl() {
		return CodOrgControl;
	}

	public void setCodOrgControl(String codOrgControl) {
		CodOrgControl = codOrgControl;
	}

	// Implemnetacion del método abstracto
	public void mostrarInfo() {
		System.out.println("\n**************************************************************");
		System.out.println("TIPO PRODUCTO :" + super.getTipo() + " \nLote: " + super.getNumLote()
				+ ", Fecha de caducidad: " + super.getFechaCaducidad());
		System.out.print(" \"Organismo de Control Alimentario: " + this.getCodOrgControl());
		System.out.println("\n**************************************************************");
	}
}
