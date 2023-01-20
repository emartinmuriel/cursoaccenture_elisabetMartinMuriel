package herencia.ejercicio01;

public class Persona {
	private String nombre;
	private String direccion;
	private String correoElectronico;
	
	
	/**
	 * Constructores de clase
	 * 
	 */
	public Persona() {
		super();
	}
	
	/**
	 * Setters
	 */
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	public void setCorreoElectronico(String correo) {
		this.correoElectronico=correo;
	}
	
	/**
	 * Getters
	 */
	public String getNombre() {
		return this.nombre;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	
}

