package herencia.ejercicio04;

/**
 * La clase Masajista (Subclase de Persona)
 * 
 * @author e.a.martin.muriel
 *
 */
public class Masajista extends Persona {
	private String titulacion;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(String titulacion, int aExperiencia) {
		super();
		this.titulacion = titulacion;
		this.aniosExperiencia = aExperiencia;
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aExperiencia;
	}

	// Getters-setters
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	// Métodos
	public void darMasaje() {
		System.out.println("Dando masaje");
	}

}
