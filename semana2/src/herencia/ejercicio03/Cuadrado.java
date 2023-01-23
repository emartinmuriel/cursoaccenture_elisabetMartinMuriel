package herencia.ejercicio03;

public class Cuadrado extends Figura{
	
	
	public  Cuadrado () {
		super();
		super.setTipo("Cuadrado");
	}
	
	public Cuadrado (int lado) {
		super();
		super.setTipo("Cuadrado");
		super.setBase(lado *2);
	}
	
	@Override
	public void calcularArea() {
		
		super.setArea(2* (double) super.getBase());
	}

	
	
	
	
	

}
