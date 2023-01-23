package herencia.ejercicio03;

public abstract class Figura {
	private int base;
	private double area;
	private String tipo;
	private Punto puntoOrigen; // composicion
	private Metadato infoFigura;

	// constructores
	protected Figura() {
		super();
	}

	protected Figura(int base) {
		super();
		this.base = base;
	}

	protected Figura(int base, Punto punto) {
		super();
		this.base = base;
		this.puntoOrigen = punto;
	}

	// get-set
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

	public Punto getPuntoOrigen() {
		return puntoOrigen;
	}

	public void setPuntoOrigen(Punto puntoOrigen) {
		this.puntoOrigen = puntoOrigen;
	}

	public Metadato getInfoFigura() {
		return infoFigura;
	}

	public void setInfoFigura(Metadato infoFigura) {
		this.infoFigura = infoFigura;
	}

	/**
	 * el metodo abstracto
	 */
	protected abstract void calcularArea();

	/**
	 * 
	 */
	public void dibujar() {
		System.out.println("Dibujando un " + getTipo() + " de tamaño :" + getArea());
	}

}
