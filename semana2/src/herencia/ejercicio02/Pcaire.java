package herencia.ejercicio02;
/**
 * La clase Pcongelado. 
 * @author e.a.martin.muriel
 *
 */
public class Pcaire extends Pcongelado {
	private double nitrogeno;
	private double oxigeno;
	private double co2;
	private double h2oVapor;

	// constructores
	public Pcaire() {
		super();
		super.setTipo("Congelado por aire");
	}

	public Pcaire(double n, double o, double co, double vapor) {
		super();
		super.setTipo("Congelado por nitrogeno");
		this.nitrogeno = n;
		this.oxigeno = o;
		this.co2 = co;
		this.h2oVapor = vapor;
	}

	// getters y setters
	public double getNitrogeno() {
		return nitrogeno;
	}

	public void setNitrogeno(double nitrogeno) {
		this.nitrogeno = nitrogeno;
	}

	public double getOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}

	public double getCo2() {
		return co2;
	}

	public void setCo2(double co2) {
		this.co2 = co2;
	}

	public double getH2oVapor() {
		return h2oVapor;
	}

	public void setH2oVapor(double h2oVapor) {
		this.h2oVapor = h2oVapor;
	}

	// Implementacion del método abstracto de la superclase
	public void mostrarInfo() {
		System.out.println("\n**************************************************************");
		System.out.println("TIPO PRODUCTO :" + super.getTipo() + " \nLote: " + super.getNumLote()
				+ ", Fecha de caducidad: " + super.getFechaCaducidad());
		System.out.print("Temperatura de congelacion: " + super.getTempCongelacion() + "\nComposicion:\n Oxigeno: "
				+ getOxigeno() + "%, Nitrogeno: " + getNitrogeno() + "%CO2:" + getCo2() + "%, Vapor de Agua: "
				+ getH2oVapor());
		System.out.println("\n**************************************************************");
	}
}
