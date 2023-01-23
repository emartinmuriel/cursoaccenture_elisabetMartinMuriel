package herencia.ejercicio04;

/**
 * Ejercicio III : Equipo de futbol
 * 
 * La clase Persona (clase padre)
 * 
 * @author e.a.martin.muriel
 *
 */
public class Persona {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;

	// Constructores
	public Persona() {
	}

	public Persona(int id, String nombre, String apellidos, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.apellidos = apellidos;
	}

	// Getters -Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Métodos de la clase

	public void concentrarse() {
		System.out.println(this.getNombre() + " " + this.getApellidos() + ("está en concentración"));
	}

	public void viajar() {
		System.out.println(this.nombre + ("está de viaje"));
	}

}
