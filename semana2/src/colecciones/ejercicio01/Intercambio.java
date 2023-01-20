package colecciones.ejercicio01;

/**
 * Ejercicio 1: Ejercicio para intercambiar 2 objetos genéricos
 * 
 * @author e.a.martin.muriel
 *
 */
public class Intercambio <T> {

	private T ob1;
	private T ob2;

	/**
	 * Constructores
	 */
	public Intercambio() {
		super();
	}

	/*public Intercambio(T o1, T o2) {
		super();
		this.ob1 = o1;
		this.ob2 = o2;
	}*/
	public Intercambio(T o1, T o2) {
		super();
		setObj1(o1);
		setObj2(o2);
	}
	
	
	
	/**
	 * Setters
	 */
	public void setObj1(T o1) {
		this.ob1=o1;
	}

	public void setObj2(T o2) {
		this.ob2=o2;
	}
	/**
	 * Getters
	 */
	public T getObj1() {
		return this.ob1;
	}

	public T getObj2() {
		return this.ob2;
	}

	/**
	 * El método intercambia.
	 * 
	 * @param o1
	 * @param o2
	 */
	public void intercambia() {
		T aux= this.ob1;
		this.ob1 = ob2;
		this.ob2 = aux;
	}

}
