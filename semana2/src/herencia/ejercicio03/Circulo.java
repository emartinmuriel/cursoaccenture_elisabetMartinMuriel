package herencia.ejercicio03;

public class Circulo extends Figura {
	
	
	public  Circulo () {
		super();
		super.setTipo("Circulo");
	}
	public Circulo (int radio) {
		super();
		super.setTipo("Circulo");
		super.setBase(radio *2);
	}
	
	
	@Override
	public void calcularArea() {
		
		super.setArea((Math.PI *((double) super.getBase()/2)) * 2); //A= (pi +r)^2
	}

}
