package herencia.ejercicio06;

/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class Profesor extends Persona {
	private float salario;
	private String fecContratacion;

	// Constructores
	public Profesor() {
		super();
	}

	public Profesor(float salario, String fecContratacion) {
		super();
		this.salario = salario;
		this.fecContratacion = fecContratacion;
	}
	// Getters & setters

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFecContratacion() {
		return fecContratacion;
	}

	public void setFecContratacion(String fecContratacion) {
		this.fecContratacion = fecContratacion;
	}

	// Implemetacion del metodo abstracto
	@Override
	public void mostrar() {
		System.out.println("El salario dle profesor es: " + this.getSalario());
		System.out.println("Fecha de contratacion: " + this.getFecContratacion());
	}
}
