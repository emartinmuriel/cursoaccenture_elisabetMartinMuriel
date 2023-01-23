package herencia.ejercicio03;
/**
 * 
 * @author e.a.martin.muriel
 *
 */
public class Metadato {
	private String titulo;
	private String descripcion;
	
	public Metadato() {
		super();
	}
	public Metadato(String titulo, String descripcion) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
	}
	
	//Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
