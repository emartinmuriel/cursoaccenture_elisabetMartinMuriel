package herencia.ejericicio03;
/**
 * Ejercicio 3: Herencia 
 * 
 * @author e.a.martin.muriel
 *
 */
public class TestFiguras {

	public static void main(String[] args) {
		Triangulo tri =new Triangulo(4,5);
		Circulo cir = new Circulo(12);
		Cuadrado cua = new Cuadrado(12);
		
		
		//Calcular las areas
		
		tri.calcularArea();
		cir.calcularArea();
		cua.calcularArea();
		
		tri.dibujar();
		cir.dibujar();
		cua.dibujar();

	}

}
