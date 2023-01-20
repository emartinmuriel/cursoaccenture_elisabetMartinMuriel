package herencia.ejericicio03;

public class Triangulo extends Figura{
	
	private int h;
	
	public  Triangulo () {
		super();
		super.setTipo("Triangulo");
	}
	

	
	public  Triangulo (int b,int h) {
		super();
		super.setBase(b);
		super.setTipo("Triangulo");
		this.h=h;
	}
	
	//getters-setters
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	@Override
	public void calcularArea() {
		
		super.setArea((double)(super.getBase() * this.h)/2); //A= (pi +r)^2
	}
}
