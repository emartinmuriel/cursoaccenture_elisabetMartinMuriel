package herencia.ejercicio06;

import java.util.ArrayList;

/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class Alumno extends Persona {
	private int curso;
	private ArrayList<String> asignaturas;

	// constructores
	public Alumno() {
		super();

	}

	public Alumno(int codPersona, String nombre, int edad, String numTelefono) {
		super(codPersona, nombre, edad, numTelefono);

	}

	public Alumno(int curso, ArrayList<String> asignaturas) {
		super();
		this.curso = curso;
		this.asignaturas.addAll(asignaturas);
	}

	// Setters & Getters

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public ArrayList<String> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<String> asignaturas) {
		this.asignaturas.addAll(asignaturas);
	}

	public void addAsignatura(String asignatura) {
		this.asignaturas.add(asignatura);
	}

	@Override
	void mostrar() {
		System.out.println("El curso del alumno es: " + this.getCurso());
		System.out.println("LISTA DE ASIGNATURAS");
		for (String asig : this.getAsignaturas()) {
			if (asig != null) {
				System.out.println(asig);
			}
		}
	}

}
