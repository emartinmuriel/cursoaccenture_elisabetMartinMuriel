package herencia.ejercicio04;
/**
 * La clase Masajista (Subclase de Persona)
 * @author e.a.martin.muriel
 *
 */
public class Masajista extends Persona{
	private String titulacion;
	private int aniosExperiencia;
	
	public Masajista() {
		super();
	}
	public Masajista(String titulacion, int aExperiencia) {
		super();
		this.titulacion=titulacion;
		this.aniosExperiencia=aExperiencia;
	}
	public Masajista(int id, String nombre, String apellidos, int edad,String titulacion, int aExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion=titulacion;
		this.aniosExperiencia=aExperiencia;
	}
	
	public void darMasaje() {
		System.out.println("Está dando masaje");
	}
}
