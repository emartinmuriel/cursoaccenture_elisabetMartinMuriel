package herencia.ejercicio03;

public abstract class Figura {
	private int base;
	private double area;
	private String tipo;
	

	//constructores
	protected Figura() {
		super();
	}
	protected Figura(int base) {
		super();
		this.base=base;
	}
	
	//get-set
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	/**
	 * el metodo abstracto
	 */
	protected abstract void calcularArea();
	/**
	 * 
	 */
	public void dibujar() {
		System.out.println("Dibujando un "+ getTipo() +" de tamaño :" + getArea() );
	}
	
	

}
