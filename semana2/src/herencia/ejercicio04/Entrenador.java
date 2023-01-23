package herencia.ejercicio04;
/**
 * La clase Entrenador (Subclase de Persona)
 * @author e.a.martin.muriel
 *
 */
public class Entrenador  extends Persona {
	private int idFederacion;
	
	//Constructores
	public Entrenador() {
		super();
	}
	public Entrenador(int idFede) {
		super();
		this.idFederacion=idFede;
	}
	public Entrenador(int id, String nombre, String apellidos, int edad,int idFederacion ) {
		super(id, nombre, apellidos, edad);
		this.idFederacion=idFederacion;
	}

	
	//Getters-Setters
	public int getIdFederacion() {
		return idFederacion;
	}
	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	//metodos
	public void dirigirPartido() {
		System.out.println("El entrenador" + super.getNombre()+ " " +super.getApellidos()+ "Está dirigiendo el partido");
	}
	public void dirigirEntrenamiento() {
		System.out.println("El entrenador" + super.getNombre()+ " " +super.getApellidos()+ "Está dirigiendo el entrenamiento");
		
	}
	
}
