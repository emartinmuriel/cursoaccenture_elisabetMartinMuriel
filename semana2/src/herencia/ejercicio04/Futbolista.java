package herencia.ejercicio04;

/**
 * La clase Futbolista (subclase de Persona)
 * 
 * @author e.a.martin.muriel
 *
 */
public class Futbolista extends Persona {

	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int dorsal, String demarcacion) {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;

	}

	// Getters-Setters
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	// métodos
	public void jugarPartido() {
		System.out.println("El dorsal " + this.getDorsal() + "juega partido");
	}

	public void entrenar() {
		System.out.println("El dorsal " + this.getDorsal() + "Está entrenando");
	}

}
