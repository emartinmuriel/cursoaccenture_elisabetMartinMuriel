package herencia.ejercicio06;

/**
 * Ejercicio herencia: Polimorfismo: Persona-profesor-alumno
 * 
 * @author e.a.martin.muriel
 *
 */
public abstract class Persona {
	private int codPersona;
	private String nombre;
	private int edad;
	private String numTelefono;

	// constructores
	protected Persona() {
		super();
	}

	protected Persona(int codPersona, String nombre, int edad, String numTelefono) {
		super();
		this.codPersona = codPersona;
		this.nombre = nombre;
		this.edad = edad;
		this.numTelefono = numTelefono;
	}

	// getters&setters

	public int getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(int codPersona) {
		this.codPersona = codPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	abstract void mostrar();

}
